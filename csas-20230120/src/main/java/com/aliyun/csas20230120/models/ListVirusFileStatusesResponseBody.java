// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusFileStatusesResponseBody extends TeaModel {
    /**
     * <p>The list of virus files.</p>
     */
    @NameInMap("FileStatuses")
    public java.util.List<ListVirusFileStatusesResponseBodyFileStatuses> fileStatuses;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of virus files that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>37</p>
     */
    @NameInMap("TotalNum")
    public String totalNum;

    public static ListVirusFileStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusFileStatusesResponseBody self = new ListVirusFileStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusFileStatusesResponseBody setFileStatuses(java.util.List<ListVirusFileStatusesResponseBodyFileStatuses> fileStatuses) {
        this.fileStatuses = fileStatuses;
        return this;
    }
    public java.util.List<ListVirusFileStatusesResponseBodyFileStatuses> getFileStatuses() {
        return this.fileStatuses;
    }

    public ListVirusFileStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirusFileStatusesResponseBody setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public static class ListVirusFileStatusesResponseBodyFileStatuses extends TeaModel {
        /**
         * <p>The time when the administrator initiated the disposition, in the format yyyy-MM-dd HH:mm:ss (UTC+8). An empty string is returned when the disposition was not initiated by an administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21 09:30:12</p>
         */
        @NameInMap("ConsoleOperationTime")
        public String consoleOperationTime;

        /**
         * <p>The name of the department to which the user belongs. Multiple departments are separated by commas (,). The nearest department name in the organizational structure is returned, not the full path.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department,Security Team</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The unique identifier of the user\&quot;s endpoint device that detected this virus file.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>The operating system type of the user terminal device. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows.</li>
         * <li><strong>macOS</strong>: macOS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("DevType")
        public String devType;

        /**
         * <p>The time when the virus file was discovered, in the format yyyy-MM-dd HH:mm:ss (UTC+8). A hyphen (-) is returned when no record exists.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21 03:12:07</p>
         */
        @NameInMap("DiscoveryTime")
        public String discoveryTime;

        /**
         * <p>The MD5 hash of the virus file.</p>
         * 
         * <strong>example:</strong>
         * <p>d41d8cd98f00b204e9800998ecf8427e</p>
         */
        @NameInMap("FileMd5")
        public String fileMd5;

        /**
         * <p>The absolute path of the virus file on the user\&quot;s endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Users\Public\Downloads\setup.exe</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The disposition status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: Pending disposition.</li>
         * <li><strong>Processed</strong>: Disposed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("FileProcessStatus")
        public String fileProcessStatus;

        /**
         * <p>The size of the virus file, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>20480</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>The hostname of the user\&quot;s endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP-8A3F</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The disposition action that has been performed. An empty string is returned when no disposition has been performed. Valid values:</p>
         * <ul>
         * <li><strong>AdminQuarantine</strong>: Quarantined by administrator.</li>
         * <li><strong>AdminTrust</strong>: Trusted by administrator.</li>
         * <li><strong>UserQuarantine</strong>: Quarantined by endpoint user.</li>
         * <li><strong>UserTrust</strong>: Trusted by endpoint user.</li>
         * <li><strong>AutoQuarantine</strong>: Automatically quarantined based on policy.</li>
         * <li><strong>Fail</strong>: Disposition failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AdminQuarantine</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The effective period of the disposition, in the format yyyy-MM-dd HH:mm:ss (UTC+8). The later of the actual disposition time on the user\&quot;s endpoint device and the time when the administrator initiated the disposition is used. A hyphen (-) is returned when no disposition has been performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21 09:31:45</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>High</strong>: High risk.</li>
         * <li><strong>Mid</strong>: Medium risk.</li>
         * <li><strong>Low</strong>: Low risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The ID of the virus scan task that detected this virus file. An empty string is returned when the file is detected by real-time protection.</p>
         * 
         * <strong>example:</strong>
         * <p>v1:1024772</p>
         */
        @NameInMap("ScanTaskId")
        public String scanTaskId;

        /**
         * <p>The execution result description of the disposition or scan, reported by the user\&quot;s endpoint device. If a disposition record exists, the execution result of the disposition task is returned. Otherwise, the execution result of the scan task is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>quarantine success</p>
         */
        @NameInMap("TaskExecutionInfo")
        public String taskExecutionInfo;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The detection source of the virus file. Valid values:</p>
         * <ul>
         * <li><strong>Task</strong>: Detected by a virus scan task.</li>
         * <li><strong>Download</strong>: Detected by real-time protection during file download.</li>
         * <li><strong>Process</strong>: Detected by real-time protection during process execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Task</p>
         */
        @NameInMap("VirusFileSource")
        public String virusFileSource;

        /**
         * <p>The virus type. Valid values:</p>
         * <ul>
         * <li><strong>Backdoor</strong>: Backdoor program.</li>
         * <li><strong>DDoS</strong>: DDoS Trojan.</li>
         * <li><strong>Downloader</strong>: Downloader Trojan.</li>
         * <li><strong>Engtest</strong>: DPI engine test program.</li>
         * <li><strong>Hacktool</strong>: Hacking tool.</li>
         * <li><strong>Trojan</strong>: Self-mutating Trojan.</li>
         * <li><strong>Malbaseware</strong>: Contaminated base software.</li>
         * <li><strong>MalScript</strong>: Malicious script.</li>
         * <li><strong>Malware</strong>: Malicious program.</li>
         * <li><strong>Miner</strong>: Mining programs.</li>
         * <li><strong>Proxytool</strong>: Proxy tool.</li>
         * <li><strong>RansomWare</strong>: Ransomware.</li>
         * <li><strong>RiskWare</strong>: Risky software.</li>
         * <li><strong>Rootkit</strong>: Kernel-hidden program.</li>
         * <li><strong>Stealer</strong>: Credential-stealing tool.</li>
         * <li><strong>Scanner</strong>: Scanner.</li>
         * <li><strong>Suspicious</strong>: Suspicious program.</li>
         * <li><strong>Virus</strong>: File-infecting virus.</li>
         * <li><strong>WebShell</strong>: Web shell.</li>
         * <li><strong>Worm</strong>: Worms.</li>
         * <li><strong>BlackList</strong>: File that hit the blacklist.</li>
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

        public static ListVirusFileStatusesResponseBodyFileStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListVirusFileStatusesResponseBodyFileStatuses self = new ListVirusFileStatusesResponseBodyFileStatuses();
            return TeaModel.build(map, self);
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setConsoleOperationTime(String consoleOperationTime) {
            this.consoleOperationTime = consoleOperationTime;
            return this;
        }
        public String getConsoleOperationTime() {
            return this.consoleOperationTime;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setDevType(String devType) {
            this.devType = devType;
            return this;
        }
        public String getDevType() {
            return this.devType;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setDiscoveryTime(String discoveryTime) {
            this.discoveryTime = discoveryTime;
            return this;
        }
        public String getDiscoveryTime() {
            return this.discoveryTime;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setFileProcessStatus(String fileProcessStatus) {
            this.fileProcessStatus = fileProcessStatus;
            return this;
        }
        public String getFileProcessStatus() {
            return this.fileProcessStatus;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setScanTaskId(String scanTaskId) {
            this.scanTaskId = scanTaskId;
            return this;
        }
        public String getScanTaskId() {
            return this.scanTaskId;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setTaskExecutionInfo(String taskExecutionInfo) {
            this.taskExecutionInfo = taskExecutionInfo;
            return this;
        }
        public String getTaskExecutionInfo() {
            return this.taskExecutionInfo;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setVirusFileSource(String virusFileSource) {
            this.virusFileSource = virusFileSource;
            return this;
        }
        public String getVirusFileSource() {
            return this.virusFileSource;
        }

        public ListVirusFileStatusesResponseBodyFileStatuses setVirusType(String virusType) {
            this.virusType = virusType;
            return this;
        }
        public String getVirusType() {
            return this.virusType;
        }

    }

}
