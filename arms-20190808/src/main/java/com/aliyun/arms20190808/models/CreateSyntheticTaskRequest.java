// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskRequest extends TeaModel {
    @NameInMap("CommonParam")
    public CreateSyntheticTaskRequestCommonParam commonParam;

    @NameInMap("Download")
    public CreateSyntheticTaskRequestDownload download;

    @NameInMap("ExtendInterval")
    public CreateSyntheticTaskRequestExtendInterval extendInterval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("IntervalTime")
    public String intervalTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntervalType")
    public String intervalType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IpType")
    public Long ipType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MonitorList")
    public java.util.List<CreateSyntheticTaskRequestMonitorList> monitorList;

    @NameInMap("Navigation")
    public CreateSyntheticTaskRequestNavigation navigation;

    @NameInMap("Net")
    public CreateSyntheticTaskRequestNet net;

    @NameInMap("Protocol")
    public CreateSyntheticTaskRequestProtocol protocol;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskType")
    public Long taskType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpdateTask")
    public Boolean updateTask;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateSyntheticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSyntheticTaskRequest self = new CreateSyntheticTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSyntheticTaskRequest setCommonParam(CreateSyntheticTaskRequestCommonParam commonParam) {
        this.commonParam = commonParam;
        return this;
    }
    public CreateSyntheticTaskRequestCommonParam getCommonParam() {
        return this.commonParam;
    }

    public CreateSyntheticTaskRequest setDownload(CreateSyntheticTaskRequestDownload download) {
        this.download = download;
        return this;
    }
    public CreateSyntheticTaskRequestDownload getDownload() {
        return this.download;
    }

    public CreateSyntheticTaskRequest setExtendInterval(CreateSyntheticTaskRequestExtendInterval extendInterval) {
        this.extendInterval = extendInterval;
        return this;
    }
    public CreateSyntheticTaskRequestExtendInterval getExtendInterval() {
        return this.extendInterval;
    }

    public CreateSyntheticTaskRequest setIntervalTime(String intervalTime) {
        this.intervalTime = intervalTime;
        return this;
    }
    public String getIntervalTime() {
        return this.intervalTime;
    }

    public CreateSyntheticTaskRequest setIntervalType(String intervalType) {
        this.intervalType = intervalType;
        return this;
    }
    public String getIntervalType() {
        return this.intervalType;
    }

    public CreateSyntheticTaskRequest setIpType(Long ipType) {
        this.ipType = ipType;
        return this;
    }
    public Long getIpType() {
        return this.ipType;
    }

    public CreateSyntheticTaskRequest setMonitorList(java.util.List<CreateSyntheticTaskRequestMonitorList> monitorList) {
        this.monitorList = monitorList;
        return this;
    }
    public java.util.List<CreateSyntheticTaskRequestMonitorList> getMonitorList() {
        return this.monitorList;
    }

    public CreateSyntheticTaskRequest setNavigation(CreateSyntheticTaskRequestNavigation navigation) {
        this.navigation = navigation;
        return this;
    }
    public CreateSyntheticTaskRequestNavigation getNavigation() {
        return this.navigation;
    }

    public CreateSyntheticTaskRequest setNet(CreateSyntheticTaskRequestNet net) {
        this.net = net;
        return this;
    }
    public CreateSyntheticTaskRequestNet getNet() {
        return this.net;
    }

    public CreateSyntheticTaskRequest setProtocol(CreateSyntheticTaskRequestProtocol protocol) {
        this.protocol = protocol;
        return this;
    }
    public CreateSyntheticTaskRequestProtocol getProtocol() {
        return this.protocol;
    }

    public CreateSyntheticTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSyntheticTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateSyntheticTaskRequest setTaskType(Long taskType) {
        this.taskType = taskType;
        return this;
    }
    public Long getTaskType() {
        return this.taskType;
    }

    public CreateSyntheticTaskRequest setUpdateTask(Boolean updateTask) {
        this.updateTask = updateTask;
        return this;
    }
    public Boolean getUpdateTask() {
        return this.updateTask;
    }

    public CreateSyntheticTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class CreateSyntheticTaskRequestCommonParamAlertList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCritical")
        public Long isCritical;

        /**
         * <strong>example:</strong>
         * <p>PING_SET</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Symbols")
        public Long symbols;

        public static CreateSyntheticTaskRequestCommonParamAlertList build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestCommonParamAlertList self = new CreateSyntheticTaskRequestCommonParamAlertList();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestCommonParamAlertList setIsCritical(Long isCritical) {
            this.isCritical = isCritical;
            return this;
        }
        public Long getIsCritical() {
            return this.isCritical;
        }

        public CreateSyntheticTaskRequestCommonParamAlertList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSyntheticTaskRequestCommonParamAlertList setSymbols(Long symbols) {
            this.symbols = symbols;
            return this;
        }
        public Long getSymbols() {
            return this.symbols;
        }

    }

    public static class CreateSyntheticTaskRequestCommonParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmFlag")
        public String alarmFlag;

        @NameInMap("AlertList")
        public java.util.List<CreateSyntheticTaskRequestCommonParamAlertList> alertList;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AlertNotifierId")
        public String alertNotifierId;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("AlertPolicyId")
        public String alertPolicyId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonitorSamples")
        public Long monitorSamples;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20 10</p>
         */
        @NameInMap("StartExecutionTime")
        public Long startExecutionTime;

        public static CreateSyntheticTaskRequestCommonParam build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestCommonParam self = new CreateSyntheticTaskRequestCommonParam();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestCommonParam setAlarmFlag(String alarmFlag) {
            this.alarmFlag = alarmFlag;
            return this;
        }
        public String getAlarmFlag() {
            return this.alarmFlag;
        }

        public CreateSyntheticTaskRequestCommonParam setAlertList(java.util.List<CreateSyntheticTaskRequestCommonParamAlertList> alertList) {
            this.alertList = alertList;
            return this;
        }
        public java.util.List<CreateSyntheticTaskRequestCommonParamAlertList> getAlertList() {
            return this.alertList;
        }

        public CreateSyntheticTaskRequestCommonParam setAlertNotifierId(String alertNotifierId) {
            this.alertNotifierId = alertNotifierId;
            return this;
        }
        public String getAlertNotifierId() {
            return this.alertNotifierId;
        }

        public CreateSyntheticTaskRequestCommonParam setAlertPolicyId(String alertPolicyId) {
            this.alertPolicyId = alertPolicyId;
            return this;
        }
        public String getAlertPolicyId() {
            return this.alertPolicyId;
        }

        public CreateSyntheticTaskRequestCommonParam setMonitorSamples(Long monitorSamples) {
            this.monitorSamples = monitorSamples;
            return this;
        }
        public Long getMonitorSamples() {
            return this.monitorSamples;
        }

        public CreateSyntheticTaskRequestCommonParam setStartExecutionTime(Long startExecutionTime) {
            this.startExecutionTime = startExecutionTime;
            return this;
        }
        public Long getStartExecutionTime() {
            return this.startExecutionTime;
        }

    }

    public static class CreateSyntheticTaskRequestDownload extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ConnectionTimeout")
        public Double connectionTimeout;

        @NameInMap("DownloadCustomHeaderContent")
        public String downloadCustomHeaderContent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadCustomHost")
        public Long downloadCustomHost;

        /**
         * <strong>example:</strong>
         * <p>ipv4:192.168.2.1,192.168.2.5:img.a.com|192.168.2.1[8080]:img.a.com</p>
         */
        @NameInMap("DownloadCustomHostIp")
        public String downloadCustomHostIp;

        @NameInMap("DownloadIgnoreCertificateError")
        public String downloadIgnoreCertificateError;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadKernel")
        public Long downloadKernel;

        @NameInMap("DownloadRedirection")
        public Long downloadRedirection;

        @NameInMap("DownloadTransmissionSize")
        public Long downloadTransmissionSize;

        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QuickProtocol")
        public String quickProtocol;

        @NameInMap("ValidateKeywords")
        public String validateKeywords;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VerifyWay")
        public Long verifyWay;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;src\&quot;:\&quot;211.154.166.174\&quot;}]</p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static CreateSyntheticTaskRequestDownload build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestDownload self = new CreateSyntheticTaskRequestDownload();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestDownload setConnectionTimeout(Double connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
        public Double getConnectionTimeout() {
            return this.connectionTimeout;
        }

        public CreateSyntheticTaskRequestDownload setDownloadCustomHeaderContent(String downloadCustomHeaderContent) {
            this.downloadCustomHeaderContent = downloadCustomHeaderContent;
            return this;
        }
        public String getDownloadCustomHeaderContent() {
            return this.downloadCustomHeaderContent;
        }

        public CreateSyntheticTaskRequestDownload setDownloadCustomHost(Long downloadCustomHost) {
            this.downloadCustomHost = downloadCustomHost;
            return this;
        }
        public Long getDownloadCustomHost() {
            return this.downloadCustomHost;
        }

        public CreateSyntheticTaskRequestDownload setDownloadCustomHostIp(String downloadCustomHostIp) {
            this.downloadCustomHostIp = downloadCustomHostIp;
            return this;
        }
        public String getDownloadCustomHostIp() {
            return this.downloadCustomHostIp;
        }

        public CreateSyntheticTaskRequestDownload setDownloadIgnoreCertificateError(String downloadIgnoreCertificateError) {
            this.downloadIgnoreCertificateError = downloadIgnoreCertificateError;
            return this;
        }
        public String getDownloadIgnoreCertificateError() {
            return this.downloadIgnoreCertificateError;
        }

        public CreateSyntheticTaskRequestDownload setDownloadKernel(Long downloadKernel) {
            this.downloadKernel = downloadKernel;
            return this;
        }
        public Long getDownloadKernel() {
            return this.downloadKernel;
        }

        public CreateSyntheticTaskRequestDownload setDownloadRedirection(Long downloadRedirection) {
            this.downloadRedirection = downloadRedirection;
            return this;
        }
        public Long getDownloadRedirection() {
            return this.downloadRedirection;
        }

        public CreateSyntheticTaskRequestDownload setDownloadTransmissionSize(Long downloadTransmissionSize) {
            this.downloadTransmissionSize = downloadTransmissionSize;
            return this;
        }
        public Long getDownloadTransmissionSize() {
            return this.downloadTransmissionSize;
        }

        public CreateSyntheticTaskRequestDownload setMonitorTimeout(Long monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public CreateSyntheticTaskRequestDownload setQuickProtocol(String quickProtocol) {
            this.quickProtocol = quickProtocol;
            return this;
        }
        public String getQuickProtocol() {
            return this.quickProtocol;
        }

        public CreateSyntheticTaskRequestDownload setValidateKeywords(String validateKeywords) {
            this.validateKeywords = validateKeywords;
            return this;
        }
        public String getValidateKeywords() {
            return this.validateKeywords;
        }

        public CreateSyntheticTaskRequestDownload setVerifyWay(Long verifyWay) {
            this.verifyWay = verifyWay;
            return this;
        }
        public Long getVerifyWay() {
            return this.verifyWay;
        }

        public CreateSyntheticTaskRequestDownload setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class CreateSyntheticTaskRequestExtendInterval extends TeaModel {
        @NameInMap("Days")
        public java.util.List<Long> days;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("EndHour")
        public Long endHour;

        /**
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("EndMinute")
        public Long endMinute;

        /**
         * <strong>example:</strong>
         * <p>2022-08-20 10</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("StartHour")
        public Long startHour;

        /**
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("StartMinute")
        public Long startMinute;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20 10</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static CreateSyntheticTaskRequestExtendInterval build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestExtendInterval self = new CreateSyntheticTaskRequestExtendInterval();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestExtendInterval setDays(java.util.List<Long> days) {
            this.days = days;
            return this;
        }
        public java.util.List<Long> getDays() {
            return this.days;
        }

        public CreateSyntheticTaskRequestExtendInterval setEndHour(Long endHour) {
            this.endHour = endHour;
            return this;
        }
        public Long getEndHour() {
            return this.endHour;
        }

        public CreateSyntheticTaskRequestExtendInterval setEndMinute(Long endMinute) {
            this.endMinute = endMinute;
            return this;
        }
        public Long getEndMinute() {
            return this.endMinute;
        }

        public CreateSyntheticTaskRequestExtendInterval setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateSyntheticTaskRequestExtendInterval setStartHour(Long startHour) {
            this.startHour = startHour;
            return this;
        }
        public Long getStartHour() {
            return this.startHour;
        }

        public CreateSyntheticTaskRequestExtendInterval setStartMinute(Long startMinute) {
            this.startMinute = startMinute;
            return this;
        }
        public Long getStartMinute() {
            return this.startMinute;
        }

        public CreateSyntheticTaskRequestExtendInterval setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateSyntheticTaskRequestMonitorList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1100101</p>
         */
        @NameInMap("CityCode")
        public Long cityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IDC</p>
         */
        @NameInMap("MonitorType")
        public Long monitorType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("NetServiceId")
        public Long netServiceId;

        public static CreateSyntheticTaskRequestMonitorList build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestMonitorList self = new CreateSyntheticTaskRequestMonitorList();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestMonitorList setCityCode(Long cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Long getCityCode() {
            return this.cityCode;
        }

        public CreateSyntheticTaskRequestMonitorList setMonitorType(Long monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public Long getMonitorType() {
            return this.monitorType;
        }

        public CreateSyntheticTaskRequestMonitorList setNetServiceId(Long netServiceId) {
            this.netServiceId = netServiceId;
            return this;
        }
        public Long getNetServiceId() {
            return this.netServiceId;
        }

    }

    public static class CreateSyntheticTaskRequestNavigation extends TeaModel {
        @NameInMap("DNSHijackWhiteList")
        public String DNSHijackWhiteList;

        @NameInMap("ElementBlacklist")
        public String elementBlacklist;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ExecuteActiveX")
        public Long executeActiveX;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteApplication")
        public Long executeApplication;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteScript")
        public Long executeScript;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FilterInvalidIP")
        public Long filterInvalidIP;

        @NameInMap("FlowHijackJumpTimes")
        public Long flowHijackJumpTimes;

        @NameInMap("FlowHijackLogo")
        public String flowHijackLogo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MonitorTimeout")
        public String monitorTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavAutomaticScrolling")
        public String navAutomaticScrolling;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NavCustomHeader")
        public String navCustomHeader;

        /**
         * <strong>example:</strong>
         * <p>Host:<a href="http://www.example.com%7CReferer:www.example.com">www.example.com|Referer:www.example.com</a></p>
         */
        @NameInMap("NavCustomHeaderContent")
        public String navCustomHeaderContent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavCustomHost")
        public Long navCustomHost;

        /**
         * <strong>example:</strong>
         * <p>ipv4:192.168.2.1,192.168.2.5:img.a.com|192.168.2.1[8080]:img.a.com</p>
         */
        @NameInMap("NavCustomHostIp")
        public String navCustomHostIp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavDisableCache")
        public Long navDisableCache;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavDisableCompression")
        public String navDisableCompression;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavIgnoreCertificateError")
        public Long navIgnoreCertificateError;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavRedirection")
        public Long navRedirection;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NavReturnElement")
        public Long navReturnElement;

        @NameInMap("PageTamper")
        public String pageTamper;

        /**
         * <strong>example:</strong>
         * <p>ssh</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("QUICDomain")
        public String QUICDomain;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QUICVersion")
        public Long QUICVersion;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RequestHeader")
        public Long requestHeader;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResponseHeader")
        public Long responseHeader;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SlowElementThreshold")
        public Double slowElementThreshold;

        @NameInMap("VerifyStringBlacklist")
        public String verifyStringBlacklist;

        @NameInMap("VerifyStringWhiteList")
        public String verifyStringWhiteList;

        @NameInMap("WaitCompletionTime")
        public Double waitCompletionTime;

        public static CreateSyntheticTaskRequestNavigation build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestNavigation self = new CreateSyntheticTaskRequestNavigation();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestNavigation setDNSHijackWhiteList(String DNSHijackWhiteList) {
            this.DNSHijackWhiteList = DNSHijackWhiteList;
            return this;
        }
        public String getDNSHijackWhiteList() {
            return this.DNSHijackWhiteList;
        }

        public CreateSyntheticTaskRequestNavigation setElementBlacklist(String elementBlacklist) {
            this.elementBlacklist = elementBlacklist;
            return this;
        }
        public String getElementBlacklist() {
            return this.elementBlacklist;
        }

        public CreateSyntheticTaskRequestNavigation setExecuteActiveX(Long executeActiveX) {
            this.executeActiveX = executeActiveX;
            return this;
        }
        public Long getExecuteActiveX() {
            return this.executeActiveX;
        }

        public CreateSyntheticTaskRequestNavigation setExecuteApplication(Long executeApplication) {
            this.executeApplication = executeApplication;
            return this;
        }
        public Long getExecuteApplication() {
            return this.executeApplication;
        }

        public CreateSyntheticTaskRequestNavigation setExecuteScript(Long executeScript) {
            this.executeScript = executeScript;
            return this;
        }
        public Long getExecuteScript() {
            return this.executeScript;
        }

        public CreateSyntheticTaskRequestNavigation setFilterInvalidIP(Long filterInvalidIP) {
            this.filterInvalidIP = filterInvalidIP;
            return this;
        }
        public Long getFilterInvalidIP() {
            return this.filterInvalidIP;
        }

        public CreateSyntheticTaskRequestNavigation setFlowHijackJumpTimes(Long flowHijackJumpTimes) {
            this.flowHijackJumpTimes = flowHijackJumpTimes;
            return this;
        }
        public Long getFlowHijackJumpTimes() {
            return this.flowHijackJumpTimes;
        }

        public CreateSyntheticTaskRequestNavigation setFlowHijackLogo(String flowHijackLogo) {
            this.flowHijackLogo = flowHijackLogo;
            return this;
        }
        public String getFlowHijackLogo() {
            return this.flowHijackLogo;
        }

        public CreateSyntheticTaskRequestNavigation setMonitorTimeout(String monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public String getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public CreateSyntheticTaskRequestNavigation setNavAutomaticScrolling(String navAutomaticScrolling) {
            this.navAutomaticScrolling = navAutomaticScrolling;
            return this;
        }
        public String getNavAutomaticScrolling() {
            return this.navAutomaticScrolling;
        }

        public CreateSyntheticTaskRequestNavigation setNavCustomHeader(String navCustomHeader) {
            this.navCustomHeader = navCustomHeader;
            return this;
        }
        public String getNavCustomHeader() {
            return this.navCustomHeader;
        }

        public CreateSyntheticTaskRequestNavigation setNavCustomHeaderContent(String navCustomHeaderContent) {
            this.navCustomHeaderContent = navCustomHeaderContent;
            return this;
        }
        public String getNavCustomHeaderContent() {
            return this.navCustomHeaderContent;
        }

        public CreateSyntheticTaskRequestNavigation setNavCustomHost(Long navCustomHost) {
            this.navCustomHost = navCustomHost;
            return this;
        }
        public Long getNavCustomHost() {
            return this.navCustomHost;
        }

        public CreateSyntheticTaskRequestNavigation setNavCustomHostIp(String navCustomHostIp) {
            this.navCustomHostIp = navCustomHostIp;
            return this;
        }
        public String getNavCustomHostIp() {
            return this.navCustomHostIp;
        }

        public CreateSyntheticTaskRequestNavigation setNavDisableCache(Long navDisableCache) {
            this.navDisableCache = navDisableCache;
            return this;
        }
        public Long getNavDisableCache() {
            return this.navDisableCache;
        }

        public CreateSyntheticTaskRequestNavigation setNavDisableCompression(String navDisableCompression) {
            this.navDisableCompression = navDisableCompression;
            return this;
        }
        public String getNavDisableCompression() {
            return this.navDisableCompression;
        }

        public CreateSyntheticTaskRequestNavigation setNavIgnoreCertificateError(Long navIgnoreCertificateError) {
            this.navIgnoreCertificateError = navIgnoreCertificateError;
            return this;
        }
        public Long getNavIgnoreCertificateError() {
            return this.navIgnoreCertificateError;
        }

        public CreateSyntheticTaskRequestNavigation setNavRedirection(Long navRedirection) {
            this.navRedirection = navRedirection;
            return this;
        }
        public Long getNavRedirection() {
            return this.navRedirection;
        }

        public CreateSyntheticTaskRequestNavigation setNavReturnElement(Long navReturnElement) {
            this.navReturnElement = navReturnElement;
            return this;
        }
        public Long getNavReturnElement() {
            return this.navReturnElement;
        }

        public CreateSyntheticTaskRequestNavigation setPageTamper(String pageTamper) {
            this.pageTamper = pageTamper;
            return this;
        }
        public String getPageTamper() {
            return this.pageTamper;
        }

        public CreateSyntheticTaskRequestNavigation setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public CreateSyntheticTaskRequestNavigation setQUICDomain(String QUICDomain) {
            this.QUICDomain = QUICDomain;
            return this;
        }
        public String getQUICDomain() {
            return this.QUICDomain;
        }

        public CreateSyntheticTaskRequestNavigation setQUICVersion(Long QUICVersion) {
            this.QUICVersion = QUICVersion;
            return this;
        }
        public Long getQUICVersion() {
            return this.QUICVersion;
        }

        public CreateSyntheticTaskRequestNavigation setRequestHeader(Long requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }
        public Long getRequestHeader() {
            return this.requestHeader;
        }

        public CreateSyntheticTaskRequestNavigation setResponseHeader(Long responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }
        public Long getResponseHeader() {
            return this.responseHeader;
        }

        public CreateSyntheticTaskRequestNavigation setSlowElementThreshold(Double slowElementThreshold) {
            this.slowElementThreshold = slowElementThreshold;
            return this;
        }
        public Double getSlowElementThreshold() {
            return this.slowElementThreshold;
        }

        public CreateSyntheticTaskRequestNavigation setVerifyStringBlacklist(String verifyStringBlacklist) {
            this.verifyStringBlacklist = verifyStringBlacklist;
            return this;
        }
        public String getVerifyStringBlacklist() {
            return this.verifyStringBlacklist;
        }

        public CreateSyntheticTaskRequestNavigation setVerifyStringWhiteList(String verifyStringWhiteList) {
            this.verifyStringWhiteList = verifyStringWhiteList;
            return this;
        }
        public String getVerifyStringWhiteList() {
            return this.verifyStringWhiteList;
        }

        public CreateSyntheticTaskRequestNavigation setWaitCompletionTime(Double waitCompletionTime) {
            this.waitCompletionTime = waitCompletionTime;
            return this;
        }
        public Double getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

    }

    public static class CreateSyntheticTaskRequestNet extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>114.114.XX.XX</p>
         */
        @NameInMap("NetDNSNs")
        public String netDNSNs;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetDNSQueryMethod")
        public Long netDNSQueryMethod;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDNSServer")
        public Long netDNSServer;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetDNSSwitch")
        public Long netDNSSwitch;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NetDNSTimeout")
        public Long netDNSTimeout;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDigSwitch")
        public Long netDigSwitch;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetICMPActive")
        public Long netICMPActive;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetICMPDataCut")
        public Long netICMPDataCut;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetICMPInterval")
        public Long netICMPInterval;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NetICMPNum")
        public Long netICMPNum;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("NetICMPSize")
        public Long netICMPSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetICMPSwitch")
        public Long netICMPSwitch;

        @NameInMap("NetICMPTimeout")
        public Long netICMPTimeout;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NetTraceRouteNum")
        public Long netTraceRouteNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetTraceRouteSwitch")
        public Long netTraceRouteSwitch;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("NetTraceRouteTimeout")
        public Long netTraceRouteTimeout;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:202.0.3.55%7C203.3.44.67">www.aliyun.com:202.0.3.55|203.3.44.67</a></p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static CreateSyntheticTaskRequestNet build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestNet self = new CreateSyntheticTaskRequestNet();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestNet setNetDNSNs(String netDNSNs) {
            this.netDNSNs = netDNSNs;
            return this;
        }
        public String getNetDNSNs() {
            return this.netDNSNs;
        }

        public CreateSyntheticTaskRequestNet setNetDNSQueryMethod(Long netDNSQueryMethod) {
            this.netDNSQueryMethod = netDNSQueryMethod;
            return this;
        }
        public Long getNetDNSQueryMethod() {
            return this.netDNSQueryMethod;
        }

        public CreateSyntheticTaskRequestNet setNetDNSServer(Long netDNSServer) {
            this.netDNSServer = netDNSServer;
            return this;
        }
        public Long getNetDNSServer() {
            return this.netDNSServer;
        }

        public CreateSyntheticTaskRequestNet setNetDNSSwitch(Long netDNSSwitch) {
            this.netDNSSwitch = netDNSSwitch;
            return this;
        }
        public Long getNetDNSSwitch() {
            return this.netDNSSwitch;
        }

        public CreateSyntheticTaskRequestNet setNetDNSTimeout(Long netDNSTimeout) {
            this.netDNSTimeout = netDNSTimeout;
            return this;
        }
        public Long getNetDNSTimeout() {
            return this.netDNSTimeout;
        }

        public CreateSyntheticTaskRequestNet setNetDigSwitch(Long netDigSwitch) {
            this.netDigSwitch = netDigSwitch;
            return this;
        }
        public Long getNetDigSwitch() {
            return this.netDigSwitch;
        }

        public CreateSyntheticTaskRequestNet setNetICMPActive(Long netICMPActive) {
            this.netICMPActive = netICMPActive;
            return this;
        }
        public Long getNetICMPActive() {
            return this.netICMPActive;
        }

        public CreateSyntheticTaskRequestNet setNetICMPDataCut(Long netICMPDataCut) {
            this.netICMPDataCut = netICMPDataCut;
            return this;
        }
        public Long getNetICMPDataCut() {
            return this.netICMPDataCut;
        }

        public CreateSyntheticTaskRequestNet setNetICMPInterval(Long netICMPInterval) {
            this.netICMPInterval = netICMPInterval;
            return this;
        }
        public Long getNetICMPInterval() {
            return this.netICMPInterval;
        }

        public CreateSyntheticTaskRequestNet setNetICMPNum(Long netICMPNum) {
            this.netICMPNum = netICMPNum;
            return this;
        }
        public Long getNetICMPNum() {
            return this.netICMPNum;
        }

        public CreateSyntheticTaskRequestNet setNetICMPSize(Long netICMPSize) {
            this.netICMPSize = netICMPSize;
            return this;
        }
        public Long getNetICMPSize() {
            return this.netICMPSize;
        }

        public CreateSyntheticTaskRequestNet setNetICMPSwitch(Long netICMPSwitch) {
            this.netICMPSwitch = netICMPSwitch;
            return this;
        }
        public Long getNetICMPSwitch() {
            return this.netICMPSwitch;
        }

        public CreateSyntheticTaskRequestNet setNetICMPTimeout(Long netICMPTimeout) {
            this.netICMPTimeout = netICMPTimeout;
            return this;
        }
        public Long getNetICMPTimeout() {
            return this.netICMPTimeout;
        }

        public CreateSyntheticTaskRequestNet setNetTraceRouteNum(Long netTraceRouteNum) {
            this.netTraceRouteNum = netTraceRouteNum;
            return this;
        }
        public Long getNetTraceRouteNum() {
            return this.netTraceRouteNum;
        }

        public CreateSyntheticTaskRequestNet setNetTraceRouteSwitch(Long netTraceRouteSwitch) {
            this.netTraceRouteSwitch = netTraceRouteSwitch;
            return this;
        }
        public Long getNetTraceRouteSwitch() {
            return this.netTraceRouteSwitch;
        }

        public CreateSyntheticTaskRequestNet setNetTraceRouteTimeout(Long netTraceRouteTimeout) {
            this.netTraceRouteTimeout = netTraceRouteTimeout;
            return this;
        }
        public Long getNetTraceRouteTimeout() {
            return this.netTraceRouteTimeout;
        }

        public CreateSyntheticTaskRequestNet setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class CreateSyntheticTaskRequestProtocolRequestContentBodyFormData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>appId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>3425</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSyntheticTaskRequestProtocolRequestContentBodyFormData build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestProtocolRequestContentBodyFormData self = new CreateSyntheticTaskRequestProtocolRequestContentBodyFormData();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBodyFormData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBodyFormData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>appId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>11080</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding self = new CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSyntheticTaskRequestProtocolRequestContentBody extends TeaModel {
        @NameInMap("FormData")
        public java.util.List<CreateSyntheticTaskRequestProtocolRequestContentBodyFormData> formData;

        /**
         * <strong>example:</strong>
         * <p>json</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>form-data</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("Raw")
        public String raw;

        @NameInMap("UrlEncoding")
        public java.util.List<CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding> urlEncoding;

        public static CreateSyntheticTaskRequestProtocolRequestContentBody build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestProtocolRequestContentBody self = new CreateSyntheticTaskRequestProtocolRequestContentBody();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBody setFormData(java.util.List<CreateSyntheticTaskRequestProtocolRequestContentBodyFormData> formData) {
            this.formData = formData;
            return this;
        }
        public java.util.List<CreateSyntheticTaskRequestProtocolRequestContentBodyFormData> getFormData() {
            return this.formData;
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBody setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBody setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBody setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public CreateSyntheticTaskRequestProtocolRequestContentBody setUrlEncoding(java.util.List<CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding> urlEncoding) {
            this.urlEncoding = urlEncoding;
            return this;
        }
        public java.util.List<CreateSyntheticTaskRequestProtocolRequestContentBodyUrlEncoding> getUrlEncoding() {
            return this.urlEncoding;
        }

    }

    public static class CreateSyntheticTaskRequestProtocolRequestContentHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSyntheticTaskRequestProtocolRequestContentHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestProtocolRequestContentHeader self = new CreateSyntheticTaskRequestProtocolRequestContentHeader();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestProtocolRequestContentHeader setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSyntheticTaskRequestProtocolRequestContentHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSyntheticTaskRequestProtocolRequestContent extends TeaModel {
        @NameInMap("Body")
        public CreateSyntheticTaskRequestProtocolRequestContentBody body;

        @NameInMap("Header")
        public java.util.List<CreateSyntheticTaskRequestProtocolRequestContentHeader> header;

        /**
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        public static CreateSyntheticTaskRequestProtocolRequestContent build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestProtocolRequestContent self = new CreateSyntheticTaskRequestProtocolRequestContent();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestProtocolRequestContent setBody(CreateSyntheticTaskRequestProtocolRequestContentBody body) {
            this.body = body;
            return this;
        }
        public CreateSyntheticTaskRequestProtocolRequestContentBody getBody() {
            return this.body;
        }

        public CreateSyntheticTaskRequestProtocolRequestContent setHeader(java.util.List<CreateSyntheticTaskRequestProtocolRequestContentHeader> header) {
            this.header = header;
            return this;
        }
        public java.util.List<CreateSyntheticTaskRequestProtocolRequestContentHeader> getHeader() {
            return this.header;
        }

        public CreateSyntheticTaskRequestProtocolRequestContent setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class CreateSyntheticTaskRequestProtocol extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CharacterEncoding")
        public Long characterEncoding;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomHost")
        public Long customHost;

        /**
         * <strong>example:</strong>
         * <p>ipv4:192.168.2.1,192.168.2.5:img.a.com|192.168.2.1[8080]:img.a.com</p>
         */
        @NameInMap("CustomHostIp")
        public String customHostIp;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProtocolConnectionTime")
        public Long protocolConnectionTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ProtocolMonitorTimeout")
        public String protocolMonitorTimeout;

        @NameInMap("ReceivedDataSize")
        public Long receivedDataSize;

        @NameInMap("RequestContent")
        public CreateSyntheticTaskRequestProtocolRequestContent requestContent;

        @NameInMap("VerifyContent")
        public String verifyContent;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VerifyWay")
        public Long verifyWay;

        public static CreateSyntheticTaskRequestProtocol build(java.util.Map<String, ?> map) throws Exception {
            CreateSyntheticTaskRequestProtocol self = new CreateSyntheticTaskRequestProtocol();
            return TeaModel.build(map, self);
        }

        public CreateSyntheticTaskRequestProtocol setCharacterEncoding(Long characterEncoding) {
            this.characterEncoding = characterEncoding;
            return this;
        }
        public Long getCharacterEncoding() {
            return this.characterEncoding;
        }

        public CreateSyntheticTaskRequestProtocol setCustomHost(Long customHost) {
            this.customHost = customHost;
            return this;
        }
        public Long getCustomHost() {
            return this.customHost;
        }

        public CreateSyntheticTaskRequestProtocol setCustomHostIp(String customHostIp) {
            this.customHostIp = customHostIp;
            return this;
        }
        public String getCustomHostIp() {
            return this.customHostIp;
        }

        public CreateSyntheticTaskRequestProtocol setProtocolConnectionTime(Long protocolConnectionTime) {
            this.protocolConnectionTime = protocolConnectionTime;
            return this;
        }
        public Long getProtocolConnectionTime() {
            return this.protocolConnectionTime;
        }

        public CreateSyntheticTaskRequestProtocol setProtocolMonitorTimeout(String protocolMonitorTimeout) {
            this.protocolMonitorTimeout = protocolMonitorTimeout;
            return this;
        }
        public String getProtocolMonitorTimeout() {
            return this.protocolMonitorTimeout;
        }

        public CreateSyntheticTaskRequestProtocol setReceivedDataSize(Long receivedDataSize) {
            this.receivedDataSize = receivedDataSize;
            return this;
        }
        public Long getReceivedDataSize() {
            return this.receivedDataSize;
        }

        public CreateSyntheticTaskRequestProtocol setRequestContent(CreateSyntheticTaskRequestProtocolRequestContent requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public CreateSyntheticTaskRequestProtocolRequestContent getRequestContent() {
            return this.requestContent;
        }

        public CreateSyntheticTaskRequestProtocol setVerifyContent(String verifyContent) {
            this.verifyContent = verifyContent;
            return this;
        }
        public String getVerifyContent() {
            return this.verifyContent;
        }

        public CreateSyntheticTaskRequestProtocol setVerifyWay(Long verifyWay) {
            this.verifyWay = verifyWay;
            return this;
        }
        public Long getVerifyWay() {
            return this.verifyWay;
        }

    }

}
