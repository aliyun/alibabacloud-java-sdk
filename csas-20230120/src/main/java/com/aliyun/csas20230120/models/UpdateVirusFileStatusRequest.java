// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVirusFileStatusRequest extends TeaModel {
    /**
     * <p>The unique identifier of the user terminal device where the virus file is located. The value can be up to 64 characters in length. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>The MD5 value of the virus file. The value must be a 32-character hexadecimal string. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d41d8cd98f00b204e9800998ecf8427e</p>
     */
    @NameInMap("FileMd5")
    public String fileMd5;

    /**
     * <p>The absolute path of the virus file on the user terminal device. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Users\Public\Downloads\setup.exe</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The disposal action. Valid values:</p>
     * <ul>
     * <li><strong>AdminQuarantine</strong>: quarantines the virus file. The server creates a disposal task and returns a TaskId. The user terminal device pulls and executes the quarantine.</li>
     * <li><strong>AdminTrust</strong>: trusts the virus file. Only the disposal status is updated. No disposal task is created, and TaskId returns an empty string.</li>
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
     * <li><strong>Backdoor</strong>: backdoor program.</li>
     * <li><strong>DDoS</strong>: DDoS Trojan.</li>
     * <li><strong>Downloader</strong>: downloader Trojan.</li>
     * <li><strong>Engtest</strong>: DPI engine test program.</li>
     * <li><strong>Hacktool</strong>: hacker tool.</li>
     * <li><strong>Trojan</strong>: self-mutating Trojan.</li>
     * <li><strong>Malbaseware</strong>: contaminated base software.</li>
     * <li><strong>MalScript</strong>: malicious script.</li>
     * <li><strong>Malware</strong>: malicious program.</li>
     * <li><strong>Miner</strong>: mining programs.</li>
     * <li><strong>Proxytool</strong>: proxy tool.</li>
     * <li><strong>RansomWare</strong>: ransomware.</li>
     * <li><strong>RiskWare</strong>: riskware.</li>
     * <li><strong>Rootkit</strong>: kernel-hidden program.</li>
     * <li><strong>Stealer</strong>: credential stealer.</li>
     * <li><strong>Scanner</strong>: scanner.</li>
     * <li><strong>Suspicious</strong>: suspicious program.</li>
     * <li><strong>Virus</strong>: file-infecting virus.</li>
     * <li><strong>WebShell</strong>: webshell.</li>
     * <li><strong>Worm</strong>: worms.</li>
     * <li><strong>BlackList</strong>: file that hit a blacklist entry.</li>
     * <li><strong>Exp</strong>: vulnerability exploits program.</li>
     * <li><strong>Patcher</strong>: cracking program.</li>
     * <li><strong>Gametool</strong>: private server tool.</li>
     * <li><strong>AdWare</strong>: adware.</li>
     * <li><strong>Maldoc</strong>: malicious document.</li>
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
