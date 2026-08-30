// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDlpOutboundLogsResponseBody extends TeaModel {
    /**
     * <p>The log objects.</p>
     */
    @NameInMap("Logs")
    public java.util.List<ListDlpOutboundLogsResponseBodyLogs> logs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9350F06D-80FB-5B8B-983A-0E25CBD08479</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("TotalNumber")
    public Integer totalNumber;

    public static ListDlpOutboundLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDlpOutboundLogsResponseBody self = new ListDlpOutboundLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDlpOutboundLogsResponseBody setLogs(java.util.List<ListDlpOutboundLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListDlpOutboundLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListDlpOutboundLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDlpOutboundLogsResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static class ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts extends TeaModel {
        /**
         * <p>The number of matches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The dictionary name.</p>
         * 
         * <strong>example:</strong>
         * <p>Identify Number</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts build(java.util.Map<String, ?> map) throws Exception {
            ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts self = new ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts();
            return TeaModel.build(map, self);
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords extends TeaModel {
        /**
         * <p>The number of matches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The keyword name.</p>
         * 
         * <strong>example:</strong>
         * <p>Report</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords build(java.util.Map<String, ?> map) throws Exception {
            ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords self = new ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords();
            return TeaModel.build(map, self);
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts extends TeaModel {
        /**
         * <p>The number of matches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The dictionary name.</p>
         * 
         * <strong>example:</strong>
         * <p>Work Number</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts build(java.util.Map<String, ?> map) throws Exception {
            ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts self = new ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts();
            return TeaModel.build(map, self);
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDlpOutboundLogsResponseBodyLogsMatchedDicts extends TeaModel {
        /**
         * <p>The matched built-in dictionaries.</p>
         */
        @NameInMap("InnerDicts")
        public java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts> innerDicts;

        /**
         * <p>The matched keywords.</p>
         */
        @NameInMap("Keywords")
        public java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords> keywords;

        /**
         * <p>The matched built-in dictionaries.</p>
         */
        @NameInMap("UserDicts")
        public java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts> userDicts;

        public static ListDlpOutboundLogsResponseBodyLogsMatchedDicts build(java.util.Map<String, ?> map) throws Exception {
            ListDlpOutboundLogsResponseBodyLogsMatchedDicts self = new ListDlpOutboundLogsResponseBodyLogsMatchedDicts();
            return TeaModel.build(map, self);
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDicts setInnerDicts(java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts> innerDicts) {
            this.innerDicts = innerDicts;
            return this;
        }
        public java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsInnerDicts> getInnerDicts() {
            return this.innerDicts;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDicts setKeywords(java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsKeywords> getKeywords() {
            return this.keywords;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedDicts setUserDicts(java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts> userDicts) {
            this.userDicts = userDicts;
            return this;
        }
        public java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedDictsUserDicts> getUserDicts() {
            return this.userDicts;
        }

    }

    public static class ListDlpOutboundLogsResponseBodyLogsMatchedPolicies extends TeaModel {
        /**
         * <p>The corresponding data level.</p>
         * 
         * <strong>example:</strong>
         * <p>L3</p>
         */
        @NameInMap("EngineDataLevel")
        public String engineDataLevel;

        /**
         * <p>The corresponding data type.</p>
         * 
         * <strong>example:</strong>
         * <p>Company Data</p>
         */
        @NameInMap("EngineDataType")
        public String engineDataType;

        /**
         * <p>The matched detection rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>ID No</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>gitlab-tag-policy</p>
         */
        @NameInMap("PolicyDesc")
        public String policyDesc;

        /**
         * <p>The matched policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        public static ListDlpOutboundLogsResponseBodyLogsMatchedPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListDlpOutboundLogsResponseBodyLogsMatchedPolicies self = new ListDlpOutboundLogsResponseBodyLogsMatchedPolicies();
            return TeaModel.build(map, self);
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedPolicies setEngineDataLevel(String engineDataLevel) {
            this.engineDataLevel = engineDataLevel;
            return this;
        }
        public String getEngineDataLevel() {
            return this.engineDataLevel;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedPolicies setEngineDataType(String engineDataType) {
            this.engineDataType = engineDataType;
            return this;
        }
        public String getEngineDataType() {
            return this.engineDataType;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedPolicies setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedPolicies setPolicyDesc(String policyDesc) {
            this.policyDesc = policyDesc;
            return this;
        }
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        public ListDlpOutboundLogsResponseBodyLogsMatchedPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class ListDlpOutboundLogsResponseBodyLogs extends TeaModel {
        /**
         * <p>The file category.</p>
         * 
         * <strong>example:</strong>
         * <p>Document</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The primary channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The primary channel.</p>
         * 
         * <strong>example:</strong>
         * <p>Web Upload</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <p>The department.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The local path of the file on the device.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Users\a\Desktop\x.xlsx</p>
         */
        @NameInMap("DevFilePath")
        public String devFilePath;

        /**
         * <p>The unique identifier of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>69FFB8EB-3E5E-5F11-A9D3-59ED8CBB345D</p>
         */
        @NameInMap("DeviceTag")
        public String deviceTag;

        /**
         * <p>The device type.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The storage policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DlpStorageConfigId")
        public String dlpStorageConfigId;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("DlpStorageType")
        public String dlpStorageType;

        /**
         * <p>The outbound destination address or URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mail.example.com">https://mail.example.com</a></p>
         */
        @NameInMap("DstAddr")
        public String dstAddr;

        /**
         * <p>The file source.</p>
         * 
         * <strong>example:</strong>
         * <p>download</p>
         */
        @NameInMap("FileOrigin")
        public String fileOrigin;

        /**
         * <p>The host of the file source.</p>
         * 
         * <strong>example:</strong>
         * <p>drive.example.com</p>
         */
        @NameInMap("FileOriginHost")
        public String fileOriginHost;

        /**
         * <p>The referrer of the file source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://drive.example.com/">https://drive.example.com/</a></p>
         */
        @NameInMap("FileOriginReferrer")
        public String fileOriginReferrer;

        /**
         * <p>The file content preview snippet.</p>
         * 
         * <strong>example:</strong>
         * <p>preview</p>
         */
        @NameInMap("FilePreview")
        public String filePreview;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>xlsx</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The organizational structure path.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Center-Data Platform Team</p>
         */
        @NameInMap("GroupInfo")
        public String groupInfo;

        /**
         * <p>The hostname of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>MacBook-Pro</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>LogId</p>
         * 
         * <strong>example:</strong>
         * <p>da817m4mfrcs6xxxx3hg</p>
         */
        @NameInMap("LogId")
        public String logId;

        /**
         * <p>The matched dictionary statistics.</p>
         */
        @NameInMap("MatchedDicts")
        public ListDlpOutboundLogsResponseBodyLogsMatchedDicts matchedDicts;

        /**
         * <p>The list of matched policy details.</p>
         */
        @NameInMap("MatchedPolicies")
        public java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedPolicies> matchedPolicies;

        /**
         * <p>The object path of the sensitive file in the storage bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>dlp/2026/08/10/xxx.xlsx</p>
         */
        @NameInMap("OssFileName")
        public String ossFileName;

        /**
         * <p>The policy action.</p>
         * 
         * <strong>example:</strong>
         * <p>block_and_hint</p>
         */
        @NameInMap("PolicyAction")
        public String policyAction;

        /**
         * <p>The list of matched policy names.</p>
         */
        @NameInMap("PolicyName")
        public java.util.List<String> policyName;

        /**
         * <p>The outbound process name.</p>
         * 
         * <strong>example:</strong>
         * <p>chrome.exe</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The secondary channel description.</p>
         * 
         * <strong>example:</strong>
         * <p>WeCom-FileSend</p>
         */
        @NameInMap("ProcessNameDesc")
        public String processNameDesc;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The matched risk scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The storage path of the screenshot file.</p>
         * 
         * <strong>example:</strong>
         * <p>dlp/screen/xxx.png</p>
         */
        @NameInMap("ScreenFilePath")
        public String screenFilePath;

        /**
         * <p>The file size.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The original file name.</p>
         * 
         * <strong>example:</strong>
         * <p>2026Q2FinancialReport.xlsx</p>
         */
        @NameInMap("SrcFileName")
        public String srcFileName;

        /**
         * <p>The source IP address of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.5</p>
         */
        @NameInMap("SrcIp")
        public String srcIp;

        /**
         * <p>The time when the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10 14:03:22</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when the log was reported.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10 14:03:25</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("User")
        public String user;

        public static ListDlpOutboundLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListDlpOutboundLogsResponseBodyLogs self = new ListDlpOutboundLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListDlpOutboundLogsResponseBodyLogs setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListDlpOutboundLogsResponseBodyLogs setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ListDlpOutboundLogsResponseBodyLogs setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public ListDlpOutboundLogsResponseBodyLogs setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListDlpOutboundLogsResponseBodyLogs setDevFilePath(String devFilePath) {
            this.devFilePath = devFilePath;
            return this;
        }
        public String getDevFilePath() {
            return this.devFilePath;
        }

        public ListDlpOutboundLogsResponseBodyLogs setDeviceTag(String deviceTag) {
            this.deviceTag = deviceTag;
            return this;
        }
        public String getDeviceTag() {
            return this.deviceTag;
        }

        public ListDlpOutboundLogsResponseBodyLogs setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDlpOutboundLogsResponseBodyLogs setDlpStorageConfigId(String dlpStorageConfigId) {
            this.dlpStorageConfigId = dlpStorageConfigId;
            return this;
        }
        public String getDlpStorageConfigId() {
            return this.dlpStorageConfigId;
        }

        public ListDlpOutboundLogsResponseBodyLogs setDlpStorageType(String dlpStorageType) {
            this.dlpStorageType = dlpStorageType;
            return this;
        }
        public String getDlpStorageType() {
            return this.dlpStorageType;
        }

        public ListDlpOutboundLogsResponseBodyLogs setDstAddr(String dstAddr) {
            this.dstAddr = dstAddr;
            return this;
        }
        public String getDstAddr() {
            return this.dstAddr;
        }

        public ListDlpOutboundLogsResponseBodyLogs setFileOrigin(String fileOrigin) {
            this.fileOrigin = fileOrigin;
            return this;
        }
        public String getFileOrigin() {
            return this.fileOrigin;
        }

        public ListDlpOutboundLogsResponseBodyLogs setFileOriginHost(String fileOriginHost) {
            this.fileOriginHost = fileOriginHost;
            return this;
        }
        public String getFileOriginHost() {
            return this.fileOriginHost;
        }

        public ListDlpOutboundLogsResponseBodyLogs setFileOriginReferrer(String fileOriginReferrer) {
            this.fileOriginReferrer = fileOriginReferrer;
            return this;
        }
        public String getFileOriginReferrer() {
            return this.fileOriginReferrer;
        }

        public ListDlpOutboundLogsResponseBodyLogs setFilePreview(String filePreview) {
            this.filePreview = filePreview;
            return this;
        }
        public String getFilePreview() {
            return this.filePreview;
        }

        public ListDlpOutboundLogsResponseBodyLogs setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListDlpOutboundLogsResponseBodyLogs setGroupInfo(String groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public String getGroupInfo() {
            return this.groupInfo;
        }

        public ListDlpOutboundLogsResponseBodyLogs setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListDlpOutboundLogsResponseBodyLogs setLogId(String logId) {
            this.logId = logId;
            return this;
        }
        public String getLogId() {
            return this.logId;
        }

        public ListDlpOutboundLogsResponseBodyLogs setMatchedDicts(ListDlpOutboundLogsResponseBodyLogsMatchedDicts matchedDicts) {
            this.matchedDicts = matchedDicts;
            return this;
        }
        public ListDlpOutboundLogsResponseBodyLogsMatchedDicts getMatchedDicts() {
            return this.matchedDicts;
        }

        public ListDlpOutboundLogsResponseBodyLogs setMatchedPolicies(java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedPolicies> matchedPolicies) {
            this.matchedPolicies = matchedPolicies;
            return this;
        }
        public java.util.List<ListDlpOutboundLogsResponseBodyLogsMatchedPolicies> getMatchedPolicies() {
            return this.matchedPolicies;
        }

        public ListDlpOutboundLogsResponseBodyLogs setOssFileName(String ossFileName) {
            this.ossFileName = ossFileName;
            return this;
        }
        public String getOssFileName() {
            return this.ossFileName;
        }

        public ListDlpOutboundLogsResponseBodyLogs setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

        public ListDlpOutboundLogsResponseBodyLogs setPolicyName(java.util.List<String> policyName) {
            this.policyName = policyName;
            return this;
        }
        public java.util.List<String> getPolicyName() {
            return this.policyName;
        }

        public ListDlpOutboundLogsResponseBodyLogs setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ListDlpOutboundLogsResponseBodyLogs setProcessNameDesc(String processNameDesc) {
            this.processNameDesc = processNameDesc;
            return this;
        }
        public String getProcessNameDesc() {
            return this.processNameDesc;
        }

        public ListDlpOutboundLogsResponseBodyLogs setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListDlpOutboundLogsResponseBodyLogs setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListDlpOutboundLogsResponseBodyLogs setScreenFilePath(String screenFilePath) {
            this.screenFilePath = screenFilePath;
            return this;
        }
        public String getScreenFilePath() {
            return this.screenFilePath;
        }

        public ListDlpOutboundLogsResponseBodyLogs setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListDlpOutboundLogsResponseBodyLogs setSrcFileName(String srcFileName) {
            this.srcFileName = srcFileName;
            return this;
        }
        public String getSrcFileName() {
            return this.srcFileName;
        }

        public ListDlpOutboundLogsResponseBodyLogs setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

        public ListDlpOutboundLogsResponseBodyLogs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDlpOutboundLogsResponseBodyLogs setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public ListDlpOutboundLogsResponseBodyLogs setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
