// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVirusFileStatusRequest extends TeaModel {
    /**
     * <p>The unique identifier of the user terminal device where the virus file is located. The value can be up to 64 characters in length. You can obtain the value from the following source:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: Queries the statuses of virus files in batches.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>The MD5 hash value of the virus file. The value must be a 32-character hexadecimal string. You can obtain the value from the following source:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: Queries the statuses of virus files in batches.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d41d8cd98f00b204e9800998ecf8427e</p>
     */
    @NameInMap("FileMd5")
    public String fileMd5;

    /**
     * <p>The absolute path of the virus file on the user terminal device. You can obtain the value from the following source:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: Queries the statuses of virus files in batches.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Users\Public\Downloads\setup.exe</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The processing action. Valid values:</p>
     * <ul>
     * <li><strong>AdminQuarantine</strong>: Quarantines the virus file. The server creates a processing task and returns a TaskId. The user terminal device pulls and executes the quarantine task.</li>
     * <li><strong>AdminTrust</strong>: Marks the virus file as trusted. This action only updates the processing status and does not create a processing task. An empty string is returned for TaskId.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AdminQuarantine</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The virus type. This parameter is used for synchronization to update the virus type of the file. Valid values:</p>
     * <ul>
     * <li><strong>Backdoor</strong>: Backdoor program.</li>
     * <li><strong>DDoS</strong>: DDoS trojan.</li>
     * <li><strong>Downloader</strong>: Downloader trojan.</li>
     * <li><strong>Engtest</strong>: DPI engine test program.</li>
     * <li><strong>Hacktool</strong>: Hacker tool.</li>
     * <li><strong>Trojan</strong>: Self-mutating trojan.</li>
     * <li><strong>Malbaseware</strong>: Contaminated basic software.</li>
     * <li><strong>MalScript</strong>: Malicious script.</li>
     * <li><strong>Malware</strong>: Malicious program.</li>
     * <li><strong>Miner</strong>: Mining programs.</li>
     * <li><strong>Proxytool</strong>: Proxy tool.</li>
     * <li><strong>RansomWare</strong>: Ransomware.</li>
     * <li><strong>RiskWare</strong>: Riskware.</li>
     * <li><strong>Rootkit</strong>: Kernel hiding program.</li>
     * <li><strong>Stealer</strong>: Stealer tool.</li>
     * <li><strong>Scanner</strong>: Scanner.</li>
     * <li><strong>Suspicious</strong>: Suspicious program.</li>
     * <li><strong>Virus</strong>: Infectious virus.</li>
     * <li><strong>WebShell</strong>: Web shell.</li>
     * <li><strong>Worm</strong>: Worms.</li>
     * <li><strong>BlackList</strong>: Files that hit the blacklist.</li>
     * <li><strong>Exp</strong>: Vulnerability exploits program.</li>
     * <li><strong>Patcher</strong>: Cracking program.</li>
     * <li><strong>Gametool</strong>: Private server tool.</li>
     * <li><strong>AdWare</strong>: Adware.</li>
     * <li><strong>Maldoc</strong>: Malicious document.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Virus</p>
     */
    @NameInMap("VirusType")
    public String virusType;

    public static UpdateVirusFileStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirusFileStatusRequest self = new UpdateVirusFileStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVirusFileStatusRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public UpdateVirusFileStatusRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public UpdateVirusFileStatusRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UpdateVirusFileStatusRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateVirusFileStatusRequest setVirusType(String virusType) {
        this.virusType = virusType;
        return this;
    }
    public String getVirusType() {
        return this.virusType;
    }

}
