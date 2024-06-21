// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskDetailResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>4D6C358A-A58B-4F4B-94CE-F5AAF023****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>任务详情。</p>
     */
    @NameInMap("TaskDetail")
    public GetSyntheticTaskDetailResponseBodyTaskDetail taskDetail;

    public static GetSyntheticTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskDetailResponseBody self = new GetSyntheticTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSyntheticTaskDetailResponseBody setTaskDetail(GetSyntheticTaskDetailResponseBodyTaskDetail taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public GetSyntheticTaskDetailResponseBodyTaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GeneralAlert")
        public String generalAlert;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsCritical")
        public String isCritical;

        /**
         * <strong>example:</strong>
         * <p>alert-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeriousAlert")
        public String seriousAlert;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Symbols")
        public String symbols;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList self = new GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList setGeneralAlert(String generalAlert) {
            this.generalAlert = generalAlert;
            return this;
        }
        public String getGeneralAlert() {
            return this.generalAlert;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList setIsCritical(String isCritical) {
            this.isCritical = isCritical;
            return this;
        }
        public String getIsCritical() {
            return this.isCritical;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList setSeriousAlert(String seriousAlert) {
            this.seriousAlert = seriousAlert;
            return this;
        }
        public String getSeriousAlert() {
            return this.seriousAlert;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList setSymbols(String symbols) {
            this.symbols = symbols;
            return this;
        }
        public String getSymbols() {
            return this.symbols;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmFlag")
        public Long alarmFlag;

        @NameInMap("AlertList")
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList> alertList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertNotifierId")
        public String alertNotifierId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertPolicyId")
        public String alertPolicyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorSamples")
        public String monitorSamples;

        /**
         * <strong>example:</strong>
         * <p>1664427128</p>
         */
        @NameInMap("StartExecutionTime")
        public String startExecutionTime;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam self = new GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam setAlarmFlag(Long alarmFlag) {
            this.alarmFlag = alarmFlag;
            return this;
        }
        public Long getAlarmFlag() {
            return this.alarmFlag;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam setAlertList(java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList> alertList) {
            this.alertList = alertList;
            return this;
        }
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList> getAlertList() {
            return this.alertList;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam setAlertNotifierId(String alertNotifierId) {
            this.alertNotifierId = alertNotifierId;
            return this;
        }
        public String getAlertNotifierId() {
            return this.alertNotifierId;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam setAlertPolicyId(String alertPolicyId) {
            this.alertPolicyId = alertPolicyId;
            return this;
        }
        public String getAlertPolicyId() {
            return this.alertPolicyId;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam setMonitorSamples(String monitorSamples) {
            this.monitorSamples = monitorSamples;
            return this;
        }
        public String getMonitorSamples() {
            return this.monitorSamples;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam setStartExecutionTime(String startExecutionTime) {
            this.startExecutionTime = startExecutionTime;
            return this;
        }
        public String getStartExecutionTime() {
            return this.startExecutionTime;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailDownload extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ConnectionTimeout")
        public Long connectionTimeout;

        /**
         * <strong>example:</strong>
         * <p>char</p>
         */
        @NameInMap("DownloadCustomHeaderContent")
        public String downloadCustomHeaderContent;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownloadCustomHost")
        public Long downloadCustomHost;

        /**
         * <strong>example:</strong>
         * <p>168.23.45.1</p>
         */
        @NameInMap("DownloadCustomHostIp")
        public String downloadCustomHostIp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadKernel")
        public Long downloadKernel;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadRedirect")
        public Long downloadRedirect;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DownloadTransmissionSize")
        public Long downloadTransmissionSize;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QuickProtocol")
        public String quickProtocol;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
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

        public static GetSyntheticTaskDetailResponseBodyTaskDetailDownload build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailDownload self = new GetSyntheticTaskDetailResponseBodyTaskDetailDownload();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setConnectionTimeout(Long connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
        public Long getConnectionTimeout() {
            return this.connectionTimeout;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setDownloadCustomHeaderContent(String downloadCustomHeaderContent) {
            this.downloadCustomHeaderContent = downloadCustomHeaderContent;
            return this;
        }
        public String getDownloadCustomHeaderContent() {
            return this.downloadCustomHeaderContent;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setDownloadCustomHost(Long downloadCustomHost) {
            this.downloadCustomHost = downloadCustomHost;
            return this;
        }
        public Long getDownloadCustomHost() {
            return this.downloadCustomHost;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setDownloadCustomHostIp(String downloadCustomHostIp) {
            this.downloadCustomHostIp = downloadCustomHostIp;
            return this;
        }
        public String getDownloadCustomHostIp() {
            return this.downloadCustomHostIp;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setDownloadKernel(Long downloadKernel) {
            this.downloadKernel = downloadKernel;
            return this;
        }
        public Long getDownloadKernel() {
            return this.downloadKernel;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setDownloadRedirect(Long downloadRedirect) {
            this.downloadRedirect = downloadRedirect;
            return this;
        }
        public Long getDownloadRedirect() {
            return this.downloadRedirect;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setDownloadTransmissionSize(Long downloadTransmissionSize) {
            this.downloadTransmissionSize = downloadTransmissionSize;
            return this;
        }
        public Long getDownloadTransmissionSize() {
            return this.downloadTransmissionSize;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setMonitorTimeout(Long monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setQuickProtocol(String quickProtocol) {
            this.quickProtocol = quickProtocol;
            return this;
        }
        public String getQuickProtocol() {
            return this.quickProtocol;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setValidateKeywords(String validateKeywords) {
            this.validateKeywords = validateKeywords;
            return this;
        }
        public String getValidateKeywords() {
            return this.validateKeywords;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setVerifyWay(Long verifyWay) {
            this.verifyWay = verifyWay;
            return this;
        }
        public Long getVerifyWay() {
            return this.verifyWay;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval extends TeaModel {
        /**
         * <p>拨测执行周期。</p>
         * <ul>
         * <li>-1：每天</li>
         * <li>0：周日</li>
         * <li>1：周一</li>
         * <li>2：周二</li>
         * <li>3：周三</li>
         * <li>4：周四</li>
         * <li>5：周五</li>
         * <li>6：周六</li>
         * </ul>
         */
        @NameInMap("Days")
        public java.util.List<Long> days;

        /**
         * <p>当天结束分钟数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EndMinute")
        public Long endMinute;

        /**
         * <strong>example:</strong>
         * <p>2022-05-03 11:40</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>当天结束小时数。</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Endhour")
        public Long endhour;

        /**
         * <p>当天开始拨测时间的小时数。</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("StartHour")
        public Long startHour;

        /**
         * <p>当天开始拨测时间的分钟数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("StartMinute")
        public Long startMinute;

        /**
         * <strong>example:</strong>
         * <p>2022-02-26 11:40</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval self = new GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval setDays(java.util.List<Long> days) {
            this.days = days;
            return this;
        }
        public java.util.List<Long> getDays() {
            return this.days;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval setEndMinute(Long endMinute) {
            this.endMinute = endMinute;
            return this;
        }
        public Long getEndMinute() {
            return this.endMinute;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval setEndhour(Long endhour) {
            this.endhour = endhour;
            return this;
        }
        public Long getEndhour() {
            return this.endhour;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval setStartHour(Long startHour) {
            this.startHour = startHour;
            return this;
        }
        public Long getStartHour() {
            return this.startHour;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval setStartMinute(Long startMinute) {
            this.startMinute = startMinute;
            return this;
        }
        public Long getStartMinute() {
            return this.startMinute;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList extends TeaModel {
        /**
         * <p>城市编码。</p>
         */
        @NameInMap("CityCode")
        public Long cityCode;

        @NameInMap("MonitorType")
        public Long monitorType;

        @NameInMap("NetServiceId")
        public Long netServiceId;

        @NameInMap("SendCount")
        public Long sendCount;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList self = new GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList setCityCode(Long cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Long getCityCode() {
            return this.cityCode;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList setMonitorType(Long monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public Long getMonitorType() {
            return this.monitorType;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList setNetServiceId(Long netServiceId) {
            this.netServiceId = netServiceId;
            return this;
        }
        public Long getNetServiceId() {
            return this.netServiceId;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList setSendCount(Long sendCount) {
            this.sendCount = sendCount;
            return this;
        }
        public Long getSendCount() {
            return this.sendCount;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailNav extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>119.119.53.156</p>
         */
        @NameInMap("DnsHijackWhitelist")
        public String dnsHijackWhitelist;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        @NameInMap("ExecuteApplet")
        public Long executeApplet;

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

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("FlowHijackJumpTimes")
        public Long flowHijackJumpTimes;

        /**
         * <strong>example:</strong>
         * <p>target</p>
         */
        @NameInMap("FlowHijackLogo")
        public String flowHijackLogo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavAutomaticScrolling")
        public Long navAutomaticScrolling;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NavCustomHeader")
        public String navCustomHeader;

        /**
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("NavCustomHeaderContent")
        public String navCustomHeaderContent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavCustomHost")
        public Long navCustomHost;

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
         * <p>0</p>
         */
        @NameInMap("NavDisableCompression")
        public Long navDisableCompression;

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
        @NameInMap("NavRedirect")
        public Long navRedirect;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavReturnElement")
        public Long navReturnElement;

        /**
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("PageTampering")
        public String pageTampering;

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
        @NameInMap("QuicDomain")
        public String quicDomain;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QuicVersion")
        public Long quicVersion;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RequestHeader")
        public Long requestHeader;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SlowElementThreshold")
        public Long slowElementThreshold;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VerifyStringBlacklist")
        public String verifyStringBlacklist;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VerifyStringWhitelist")
        public String verifyStringWhitelist;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WaitCompletionTime")
        public Long waitCompletionTime;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailNav build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailNav self = new GetSyntheticTaskDetailResponseBodyTaskDetailNav();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setDnsHijackWhitelist(String dnsHijackWhitelist) {
            this.dnsHijackWhitelist = dnsHijackWhitelist;
            return this;
        }
        public String getDnsHijackWhitelist() {
            return this.dnsHijackWhitelist;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setElementBlacklist(String elementBlacklist) {
            this.elementBlacklist = elementBlacklist;
            return this;
        }
        public String getElementBlacklist() {
            return this.elementBlacklist;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setExecuteActiveX(Long executeActiveX) {
            this.executeActiveX = executeActiveX;
            return this;
        }
        public Long getExecuteActiveX() {
            return this.executeActiveX;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setExecuteApplet(Long executeApplet) {
            this.executeApplet = executeApplet;
            return this;
        }
        public Long getExecuteApplet() {
            return this.executeApplet;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setExecuteScript(Long executeScript) {
            this.executeScript = executeScript;
            return this;
        }
        public Long getExecuteScript() {
            return this.executeScript;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setFilterInvalidIP(Long filterInvalidIP) {
            this.filterInvalidIP = filterInvalidIP;
            return this;
        }
        public Long getFilterInvalidIP() {
            return this.filterInvalidIP;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setFlowHijackJumpTimes(Long flowHijackJumpTimes) {
            this.flowHijackJumpTimes = flowHijackJumpTimes;
            return this;
        }
        public Long getFlowHijackJumpTimes() {
            return this.flowHijackJumpTimes;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setFlowHijackLogo(String flowHijackLogo) {
            this.flowHijackLogo = flowHijackLogo;
            return this;
        }
        public String getFlowHijackLogo() {
            return this.flowHijackLogo;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setMonitorTimeout(Long monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavAutomaticScrolling(Long navAutomaticScrolling) {
            this.navAutomaticScrolling = navAutomaticScrolling;
            return this;
        }
        public Long getNavAutomaticScrolling() {
            return this.navAutomaticScrolling;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavCustomHeader(String navCustomHeader) {
            this.navCustomHeader = navCustomHeader;
            return this;
        }
        public String getNavCustomHeader() {
            return this.navCustomHeader;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavCustomHeaderContent(String navCustomHeaderContent) {
            this.navCustomHeaderContent = navCustomHeaderContent;
            return this;
        }
        public String getNavCustomHeaderContent() {
            return this.navCustomHeaderContent;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavCustomHost(Long navCustomHost) {
            this.navCustomHost = navCustomHost;
            return this;
        }
        public Long getNavCustomHost() {
            return this.navCustomHost;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavCustomHostIp(String navCustomHostIp) {
            this.navCustomHostIp = navCustomHostIp;
            return this;
        }
        public String getNavCustomHostIp() {
            return this.navCustomHostIp;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavDisableCache(Long navDisableCache) {
            this.navDisableCache = navDisableCache;
            return this;
        }
        public Long getNavDisableCache() {
            return this.navDisableCache;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavDisableCompression(Long navDisableCompression) {
            this.navDisableCompression = navDisableCompression;
            return this;
        }
        public Long getNavDisableCompression() {
            return this.navDisableCompression;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavIgnoreCertificateError(Long navIgnoreCertificateError) {
            this.navIgnoreCertificateError = navIgnoreCertificateError;
            return this;
        }
        public Long getNavIgnoreCertificateError() {
            return this.navIgnoreCertificateError;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavRedirect(Long navRedirect) {
            this.navRedirect = navRedirect;
            return this;
        }
        public Long getNavRedirect() {
            return this.navRedirect;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setNavReturnElement(Long navReturnElement) {
            this.navReturnElement = navReturnElement;
            return this;
        }
        public Long getNavReturnElement() {
            return this.navReturnElement;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setPageTampering(String pageTampering) {
            this.pageTampering = pageTampering;
            return this;
        }
        public String getPageTampering() {
            return this.pageTampering;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setQuicDomain(String quicDomain) {
            this.quicDomain = quicDomain;
            return this;
        }
        public String getQuicDomain() {
            return this.quicDomain;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setQuicVersion(Long quicVersion) {
            this.quicVersion = quicVersion;
            return this;
        }
        public Long getQuicVersion() {
            return this.quicVersion;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setRequestHeader(Long requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }
        public Long getRequestHeader() {
            return this.requestHeader;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setSlowElementThreshold(Long slowElementThreshold) {
            this.slowElementThreshold = slowElementThreshold;
            return this;
        }
        public Long getSlowElementThreshold() {
            return this.slowElementThreshold;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setVerifyStringBlacklist(String verifyStringBlacklist) {
            this.verifyStringBlacklist = verifyStringBlacklist;
            return this;
        }
        public String getVerifyStringBlacklist() {
            return this.verifyStringBlacklist;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setVerifyStringWhitelist(String verifyStringWhitelist) {
            this.verifyStringWhitelist = verifyStringWhitelist;
            return this;
        }
        public String getVerifyStringWhitelist() {
            return this.verifyStringWhitelist;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNav setWaitCompletionTime(Long waitCompletionTime) {
            this.waitCompletionTime = waitCompletionTime;
            return this;
        }
        public Long getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailNet extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDigSwitch")
        public Long netDigSwitch;

        /**
         * <strong>example:</strong>
         * <p>189.12.32.124</p>
         */
        @NameInMap("NetDnsNs")
        public String netDnsNs;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetDnsQueryMethod")
        public String netDnsQueryMethod;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDnsServer")
        public Long netDnsServer;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDnsSwitch")
        public Long netDnsSwitch;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NetDnsTimeout")
        public String netDnsTimeout;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetIcmpActive")
        public Long netIcmpActive;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetIcmpDataCut")
        public Long netIcmpDataCut;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NetIcmpInterval")
        public Long netIcmpInterval;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NetIcmpNum")
        public Long netIcmpNum;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("NetIcmpSize")
        public Long netIcmpSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetIcmpSwitch")
        public Long netIcmpSwitch;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NetIcmpTimeout")
        public Long netIcmpTimeout;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("NetTraceRouteNum")
        public Long netTraceRouteNum;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetTraceRouteSwitch")
        public Long netTraceRouteSwitch;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NetTraceRouteTimeout")
        public Long netTraceRouteTimeout;

        /**
         * <strong>example:</strong>
         * <p>119.119.53.156/32</p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailNet build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailNet self = new GetSyntheticTaskDetailResponseBodyTaskDetailNet();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetDigSwitch(Long netDigSwitch) {
            this.netDigSwitch = netDigSwitch;
            return this;
        }
        public Long getNetDigSwitch() {
            return this.netDigSwitch;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetDnsNs(String netDnsNs) {
            this.netDnsNs = netDnsNs;
            return this;
        }
        public String getNetDnsNs() {
            return this.netDnsNs;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetDnsQueryMethod(String netDnsQueryMethod) {
            this.netDnsQueryMethod = netDnsQueryMethod;
            return this;
        }
        public String getNetDnsQueryMethod() {
            return this.netDnsQueryMethod;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetDnsServer(Long netDnsServer) {
            this.netDnsServer = netDnsServer;
            return this;
        }
        public Long getNetDnsServer() {
            return this.netDnsServer;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetDnsSwitch(Long netDnsSwitch) {
            this.netDnsSwitch = netDnsSwitch;
            return this;
        }
        public Long getNetDnsSwitch() {
            return this.netDnsSwitch;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetDnsTimeout(String netDnsTimeout) {
            this.netDnsTimeout = netDnsTimeout;
            return this;
        }
        public String getNetDnsTimeout() {
            return this.netDnsTimeout;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetIcmpActive(Long netIcmpActive) {
            this.netIcmpActive = netIcmpActive;
            return this;
        }
        public Long getNetIcmpActive() {
            return this.netIcmpActive;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetIcmpDataCut(Long netIcmpDataCut) {
            this.netIcmpDataCut = netIcmpDataCut;
            return this;
        }
        public Long getNetIcmpDataCut() {
            return this.netIcmpDataCut;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetIcmpInterval(Long netIcmpInterval) {
            this.netIcmpInterval = netIcmpInterval;
            return this;
        }
        public Long getNetIcmpInterval() {
            return this.netIcmpInterval;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetIcmpNum(Long netIcmpNum) {
            this.netIcmpNum = netIcmpNum;
            return this;
        }
        public Long getNetIcmpNum() {
            return this.netIcmpNum;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetIcmpSize(Long netIcmpSize) {
            this.netIcmpSize = netIcmpSize;
            return this;
        }
        public Long getNetIcmpSize() {
            return this.netIcmpSize;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetIcmpSwitch(Long netIcmpSwitch) {
            this.netIcmpSwitch = netIcmpSwitch;
            return this;
        }
        public Long getNetIcmpSwitch() {
            return this.netIcmpSwitch;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetIcmpTimeout(Long netIcmpTimeout) {
            this.netIcmpTimeout = netIcmpTimeout;
            return this;
        }
        public Long getNetIcmpTimeout() {
            return this.netIcmpTimeout;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetTraceRouteNum(Long netTraceRouteNum) {
            this.netTraceRouteNum = netTraceRouteNum;
            return this;
        }
        public Long getNetTraceRouteNum() {
            return this.netTraceRouteNum;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetTraceRouteSwitch(Long netTraceRouteSwitch) {
            this.netTraceRouteSwitch = netTraceRouteSwitch;
            return this;
        }
        public Long getNetTraceRouteSwitch() {
            return this.netTraceRouteSwitch;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setNetTraceRouteTimeout(Long netTraceRouteTimeout) {
            this.netTraceRouteTimeout = netTraceRouteTimeout;
            return this;
        }
        public Long getNetTraceRouteTimeout() {
            return this.netTraceRouteTimeout;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailNet setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata extends TeaModel {
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

        public static GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata self = new GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded extends TeaModel {
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

        public static GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded self = new GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody extends TeaModel {
        @NameInMap("Formdata")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata formdata;

        /**
         * <strong>example:</strong>
         * <p>xml</p>
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

        @NameInMap("Urlencoded")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded urlencoded;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody self = new GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody setFormdata(GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata formdata) {
            this.formdata = formdata;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata getFormdata() {
            return this.formdata;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody setUrlencoded(GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded urlencoded) {
            this.urlencoded = urlencoded;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyUrlencoded getUrlencoded() {
            return this.urlencoded;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader extends TeaModel {
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

        public static GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader self = new GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent extends TeaModel {
        @NameInMap("Body")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody body;

        @NameInMap("Header")
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader> header;

        /**
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent self = new GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent setBody(GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody body) {
            this.body = body;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody getBody() {
            return this.body;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent setHeader(java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader> header) {
            this.header = header;
            return this;
        }
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader> getHeader() {
            return this.header;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetailProtocol extends TeaModel {
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
         * <p>119.119.53.156</p>
         */
        @NameInMap("CustomHostIp")
        public String customHostIp;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ProtocolConnectionTimeout")
        public Long protocolConnectionTimeout;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ProtocolMonitorTimeout")
        public Long protocolMonitorTimeout;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ReceivedDataSize")
        public Long receivedDataSize;

        @NameInMap("RequestContent")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent requestContent;

        /**
         * <strong>example:</strong>
         * <p>list</p>
         */
        @NameInMap("VerifyContent")
        public String verifyContent;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VerifyWay")
        public Long verifyWay;

        public static GetSyntheticTaskDetailResponseBodyTaskDetailProtocol build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetailProtocol self = new GetSyntheticTaskDetailResponseBodyTaskDetailProtocol();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setCharacterEncoding(Long characterEncoding) {
            this.characterEncoding = characterEncoding;
            return this;
        }
        public Long getCharacterEncoding() {
            return this.characterEncoding;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setCustomHost(Long customHost) {
            this.customHost = customHost;
            return this;
        }
        public Long getCustomHost() {
            return this.customHost;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setCustomHostIp(String customHostIp) {
            this.customHostIp = customHostIp;
            return this;
        }
        public String getCustomHostIp() {
            return this.customHostIp;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setProtocolConnectionTimeout(Long protocolConnectionTimeout) {
            this.protocolConnectionTimeout = protocolConnectionTimeout;
            return this;
        }
        public Long getProtocolConnectionTimeout() {
            return this.protocolConnectionTimeout;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setProtocolMonitorTimeout(Long protocolMonitorTimeout) {
            this.protocolMonitorTimeout = protocolMonitorTimeout;
            return this;
        }
        public Long getProtocolMonitorTimeout() {
            return this.protocolMonitorTimeout;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setReceivedDataSize(Long receivedDataSize) {
            this.receivedDataSize = receivedDataSize;
            return this;
        }
        public Long getReceivedDataSize() {
            return this.receivedDataSize;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setRequestContent(GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent getRequestContent() {
            return this.requestContent;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setVerifyContent(String verifyContent) {
            this.verifyContent = verifyContent;
            return this;
        }
        public String getVerifyContent() {
            return this.verifyContent;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol setVerifyWay(Long verifyWay) {
            this.verifyWay = verifyWay;
            return this;
        }
        public Long getVerifyWay() {
            return this.verifyWay;
        }

    }

    public static class GetSyntheticTaskDetailResponseBodyTaskDetail extends TeaModel {
        @NameInMap("CommonParam")
        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam commonParam;

        /**
         * <p>文件下载任务。</p>
         */
        @NameInMap("Download")
        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload download;

        /**
         * <p>自定义扩展频率。</p>
         */
        @NameInMap("ExtendInterval")
        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval extendInterval;

        /**
         * <p>拨测频率，单位为分钟。可选频率如下：</p>
         * <ul>
         * <li>1</li>
         * <li>5</li>
         * <li>10</li>
         * <li>15</li>
         * <li>20</li>
         * <li>30</li>
         * <li>60</li>
         * <li>120</li>
         * <li>180</li>
         * <li>240</li>
         * <li>360</li>
         * <li>480</li>
         * <li>720</li>
         * <li>1440</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IntervalTime")
        public Long intervalTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IntervalType")
        public Long intervalType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpType")
        public Long ipType;

        @NameInMap("MonitorList")
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList> monitorList;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MonitorListString")
        public String monitorListString;

        @NameInMap("Nav")
        public GetSyntheticTaskDetailResponseBodyTaskDetailNav nav;

        @NameInMap("Net")
        public GetSyntheticTaskDetailResponseBodyTaskDetailNet net;

        @NameInMap("Protocol")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol protocol;

        /**
         * <p>云拨测任务ID。</p>
         * 
         * <strong>example:</strong>
         * <p>19584</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>任务名称。</p>
         * 
         * <strong>example:</strong>
         * <p>net-test</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskType")
        public Long taskType;

        /**
         * <p>拨测地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetSyntheticTaskDetailResponseBodyTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskDetailResponseBodyTaskDetail self = new GetSyntheticTaskDetailResponseBodyTaskDetail();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setCommonParam(GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam commonParam) {
            this.commonParam = commonParam;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam getCommonParam() {
            return this.commonParam;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setDownload(GetSyntheticTaskDetailResponseBodyTaskDetailDownload download) {
            this.download = download;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload getDownload() {
            return this.download;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setExtendInterval(GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval extendInterval) {
            this.extendInterval = extendInterval;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval getExtendInterval() {
            return this.extendInterval;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setIntervalTime(Long intervalTime) {
            this.intervalTime = intervalTime;
            return this;
        }
        public Long getIntervalTime() {
            return this.intervalTime;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setIntervalType(Long intervalType) {
            this.intervalType = intervalType;
            return this;
        }
        public Long getIntervalType() {
            return this.intervalType;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setIpType(Long ipType) {
            this.ipType = ipType;
            return this;
        }
        public Long getIpType() {
            return this.ipType;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setMonitorList(java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList> monitorList) {
            this.monitorList = monitorList;
            return this;
        }
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList> getMonitorList() {
            return this.monitorList;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setMonitorListString(String monitorListString) {
            this.monitorListString = monitorListString;
            return this;
        }
        public String getMonitorListString() {
            return this.monitorListString;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setNav(GetSyntheticTaskDetailResponseBodyTaskDetailNav nav) {
            this.nav = nav;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailNav getNav() {
            return this.nav;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setNet(GetSyntheticTaskDetailResponseBodyTaskDetailNet net) {
            this.net = net;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailNet getNet() {
            return this.net;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setProtocol(GetSyntheticTaskDetailResponseBodyTaskDetailProtocol protocol) {
            this.protocol = protocol;
            return this;
        }
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol getProtocol() {
            return this.protocol;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setTaskType(Long taskType) {
            this.taskType = taskType;
            return this;
        }
        public Long getTaskType() {
            return this.taskType;
        }

        public GetSyntheticTaskDetailResponseBodyTaskDetail setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
