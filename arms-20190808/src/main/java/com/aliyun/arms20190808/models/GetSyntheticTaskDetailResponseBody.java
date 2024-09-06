// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4D6C358A-A58B-4F4B-94CE-F5AAF023****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the task.</p>
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
         * <p>The low-risk alert.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GeneralAlert")
        public String generalAlert;

        /**
         * <p>Indicates whether the condition is essential.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsCritical")
        public String isCritical;

        /**
         * <p>The alert name.</p>
         * 
         * <strong>example:</strong>
         * <p>alert-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Critical-level alert.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeriousAlert")
        public String seriousAlert;

        /**
         * <p>Greater than or less than.</p>
         * 
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
         * <p>The identifier of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmFlag")
        public Long alarmFlag;

        /**
         * <p>The list of alerts.</p>
         */
        @NameInMap("AlertList")
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailCommonParamAlertList> alertList;

        /**
         * <p>The ID of the alert identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertNotifierId")
        public String alertNotifierId;

        /**
         * <p>The ID of the alert policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertPolicyId")
        public String alertPolicyId;

        /**
         * <p>The monitoring samples.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorSamples")
        public String monitorSamples;

        /**
         * <p>The start time of the execution.</p>
         * 
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
         * <p>The timeout period of the file download task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ConnectionTimeout")
        public Long connectionTimeout;

        /**
         * <p>The items to be ignored in a certificate error. Multiple values are concatenated with vertical bars (|).</p>
         * 
         * <strong>example:</strong>
         * <p>char</p>
         */
        @NameInMap("DownloadCustomHeaderContent")
        public String downloadCustomHeaderContent;

        /**
         * <p>The custom host. Valid values:</p>
         * <ul>
         * <li>1: round robin</li>
         * <li>0: random</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownloadCustomHost")
        public Long downloadCustomHost;

        /**
         * <p>The custom IP address of the host. Multiple IP addresses are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>168.23.45.1</p>
         */
        @NameInMap("DownloadCustomHostIp")
        public String downloadCustomHostIp;

        /**
         * <p>The kernel type. Valid values:</p>
         * <ul>
         * <li>1: curl</li>
         * <li>0: WinInet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadKernel")
        public Long downloadKernel;

        /**
         * <p>Indicates whether redirection is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadRedirect")
        public Long downloadRedirect;

        /**
         * <p>The file size. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DownloadTransmissionSize")
        public Long downloadTransmissionSize;

        /**
         * <p>The monitoring duration.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>The QUIC protocol type. Valid values:</p>
         * <ul>
         * <li>1: HTTP/1</li>
         * <li>2: HTTP/2</li>
         * <li>3: http3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QuickProtocol")
        public String quickProtocol;

        /**
         * <p>The keyword that is used in verification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ValidateKeywords")
        public String validateKeywords;

        /**
         * <p>The method that is used to verify the response content. Valid values:</p>
         * <ul>
         * <li>0: no verification.</li>
         * <li>1: exact match with the verification string.</li>
         * <li>2: partial match with the verification string.</li>
         * <li>3: MD5 verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VerifyWay")
        public Long verifyWay;

        /**
         * <p>The whitelisted objects that are used to avoid DNS hijacking. Format: <code>&lt;domain name&gt;:&lt;objects&gt;</code>.</p>
         * <blockquote>
         * <p> WAP networks do not support hijacking.</p>
         * </blockquote>
         * 
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
         * <p>The day on which synthetic monitoring is performed. Valid values:</p>
         * <ul>
         * <li>\-1: every day</li>
         * <li>0: Sunday</li>
         * <li>1: Monday</li>
         * <li>2: Tuesday</li>
         * <li>3: Wednesday</li>
         * <li>4: Thursday</li>
         * <li>5: Friday</li>
         * <li>6: Saturday</li>
         * </ul>
         */
        @NameInMap("Days")
        public java.util.List<Long> days;

        /**
         * <p>The minute at which synthetic monitoring ends.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EndMinute")
        public Long endMinute;

        /**
         * <p>The time when synthetic monitoring ends. Format: <code>yyyy-MM-dd HH</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-03 11:40</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The hour at which synthetic monitoring ends.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Endhour")
        public Long endhour;

        /**
         * <p>The hour at which synthetic monitoring starts.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("StartHour")
        public Long startHour;

        /**
         * <p>The minute at which synthetic monitoring starts.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("StartMinute")
        public Long startMinute;

        /**
         * <p>The time when synthetic monitoring starts. Format: yyyy-MM-dd HH.</p>
         * 
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
         * <p>The city code.</p>
         * 
         * <strong>example:</strong>
         * <p>110100</p>
         */
        @NameInMap("CityCode")
        public Long cityCode;

        /**
         * <p>The type of the detection point.</p>
         * 
         * <strong>example:</strong>
         * <p>IDC</p>
         */
        @NameInMap("MonitorType")
        public Long monitorType;

        /**
         * <p>The ID of the network service.</p>
         * 
         * <strong>example:</strong>
         * <p>12001</p>
         */
        @NameInMap("NetServiceId")
        public Long netServiceId;

        /**
         * <p>The number of times that the system sends detection requests.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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
         * <p>The DNS whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>119.119.53.156</p>
         */
        @NameInMap("DnsHijackWhitelist")
        public String dnsHijackWhitelist;

        /**
         * <p>The element blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ElementBlacklist")
        public String elementBlacklist;

        /**
         * <p>Indicates whether ActiveX is executed. Valid values:</p>
         * <ul>
         * <li>3: yes</li>
         * <li>0: no</li>
         * </ul>
         * <blockquote>
         * <p> Only IE elements support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ExecuteActiveX")
        public Long executeActiveX;

        /**
         * <p>Indicates whether the applet is executed. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteApplet")
        public Long executeApplet;

        /**
         * <p>Indicates whether scripts are executed. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * <blockquote>
         * <p> Only IE elements support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteScript")
        public Long executeScript;

        /**
         * <p>Indicates whether invalid IP addresses are excluded. Valid values:</p>
         * <ul>
         * <li>1: no</li>
         * <li>0: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FilterInvalidIP")
        public Long filterInvalidIP;

        /**
         * <p>The element that is used in DNS hijacking.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("FlowHijackJumpTimes")
        public Long flowHijackJumpTimes;

        /**
         * <p>The tag that is used in DNS hijacking.</p>
         * 
         * <strong>example:</strong>
         * <p>target</p>
         */
        @NameInMap("FlowHijackLogo")
        public String flowHijackLogo;

        /**
         * <p>The monitoring timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>Indicates whether the screen is automatically scrolled up and down to load a page. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavAutomaticScrolling")
        public Long navAutomaticScrolling;

        /**
         * <p>Indicates whether a custom header is created. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: A custom header is created for the first packet.</li>
         * <li>2: A custom header is created for all packets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NavCustomHeader")
        public String navCustomHeader;

        /**
         * <p>The format of the custom header. Multiple fields are separated with vertical bars (|).</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("NavCustomHeaderContent")
        public String navCustomHeaderContent;

        /**
         * <p>The custom host mode. Valid values:</p>
         * <ul>
         * <li>1: round robin</li>
         * <li>0: random</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavCustomHost")
        public Long navCustomHost;

        /**
         * <p>The custom IP address of the host. Multiple IP addresses are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>119.119.53.156/32</p>
         */
        @NameInMap("NavCustomHostIp")
        public String navCustomHostIp;

        /**
         * <p>Indicates whether caching is disabled. Valid values:</p>
         * <ul>
         * <li>1: Caching is disabled.</li>
         * <li>0: Caching is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavDisableCache")
        public Long navDisableCache;

        /**
         * <p>Indicates whether compression is disabled. Valid values:</p>
         * <ul>
         * <li>0: Compression is enabled.</li>
         * <li>1: Compression is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NavDisableCompression")
        public Long navDisableCompression;

        /**
         * <p>Indicates whether certificate errors are ignored during certificate verification in the SSL handshake. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavIgnoreCertificateError")
        public Long navIgnoreCertificateError;

        /**
         * <p>Indicates whether redirection is enabled. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavRedirect")
        public Long navRedirect;

        /**
         * <p>Indicates whether the elements on the page are returned.</p>
         * <ul>
         * <li>1: no. The basic document data is returned.</li>
         * <li>2: yes. All document data is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavReturnElement")
        public Long navReturnElement;

        /**
         * <p>The page tampering.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("PageTampering")
        public String pageTampering;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The domain name of the QUIC request element.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("QuicDomain")
        public String quicDomain;

        /**
         * <p>The QUIC version. Default value: 0. Valid values:</p>
         * <ul>
         * <li>35</li>
         * <li>39</li>
         * <li>43</li>
         * <li>44</li>
         * </ul>
         * <blockquote>
         * <p> Only Chrome elements support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QuicVersion")
        public Long quicVersion;

        /**
         * <p>Indicates whether request headers are returned. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: The headers of base documents are returned.</li>
         * <li>2: All headers are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RequestHeader")
        public Long requestHeader;

        /**
         * <p>The time threshold that is used to define a slow element. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SlowElementThreshold")
        public Long slowElementThreshold;

        /**
         * <p>The blacklist for string verification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VerifyStringBlacklist")
        public String verifyStringBlacklist;

        /**
         * <p>The whitelist for string verification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VerifyStringWhitelist")
        public String verifyStringWhitelist;

        /**
         * <p>The timeout period of waiting for the monitoring to complete.</p>
         * 
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
         * <p>Indicates whether the data is displayed in the DIG format. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDigSwitch")
        public Long netDigSwitch;

        /**
         * <p>The NS server.</p>
         * 
         * <strong>example:</strong>
         * <p>189.12.32.124</p>
         */
        @NameInMap("NetDnsNs")
        public String netDnsNs;

        /**
         * <p>The DNS query method. Valid values:</p>
         * <ul>
         * <li>1: recursive</li>
         * <li>2: iterative</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetDnsQueryMethod")
        public String netDnsQueryMethod;

        /**
         * <p>The type of the DNS server. Valid values:</p>
         * <ul>
         * <li>0: ipv4</li>
         * <li>1: ipv6</li>
         * <li>2: A version is automatically selected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDnsServer")
        public Long netDnsServer;

        /**
         * <p>Indicates whether DNS test is enabled. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDnsSwitch")
        public Long netDnsSwitch;

        /**
         * <p>The timeout period of DNS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NetDnsTimeout")
        public String netDnsTimeout;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>0 : ICMP</li>
         * <li>1 : TCP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetIcmpActive")
        public Long netIcmpActive;

        /**
         * <p>Indicates whether packets are split. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetIcmpDataCut")
        public Long netIcmpDataCut;

        /**
         * <p>The interval at which the synthetic monitoring task is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NetIcmpInterval")
        public Long netIcmpInterval;

        /**
         * <p>The number of packets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NetIcmpNum")
        public Long netIcmpNum;

        /**
         * <p>The packet size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("NetIcmpSize")
        public Long netIcmpSize;

        /**
         * <p>Indicates whether ICMP test is enabled. Valid values:</p>
         * <ul>
         * <li>0: no.</li>
         * <li>1: yes. If you set this parameter to 1, you must also set the Icmp parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetIcmpSwitch")
        public Long netIcmpSwitch;

        /**
         * <p>The monitoring timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NetIcmpTimeout")
        public Long netIcmpTimeout;

        /**
         * <p>The maximum number of active detection points.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("NetTraceRouteNum")
        public Long netTraceRouteNum;

        /**
         * <p>Indicates whether Tracert test is enabled. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes. If you set this parameter to 1, you must also set the Tracert parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetTraceRouteSwitch")
        public Long netTraceRouteSwitch;

        /**
         * <p>The monitoring timeout period. Valid values: 0 to 300. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NetTraceRouteTimeout")
        public Long netTraceRouteTimeout;

        /**
         * <p>The whitelisted objects that are used to avoid DNS hijacking. Format: <code>&lt;domain name&gt;:&lt;objects&gt;</code>.</p>
         * <blockquote>
         * <p> WAP networks do not support hijacking.</p>
         * </blockquote>
         * 
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
         * <p>The key of the <strong>form-data</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>appId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the form-data.</p>
         * 
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>appId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
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
        /**
         * <p>The data content. This parameter is returned when Mode is set to form-data.</p>
         */
        @NameInMap("Formdata")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBodyFormdata formdata;

        /**
         * <p>The language used when Mode is set to raw. Valid values:</p>
         * <ul>
         * <li>json</li>
         * <li>xml</li>
         * <li>javascript</li>
         * <li>html</li>
         * <li>text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>xml</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The type of the content. Valid values:</p>
         * <ul>
         * <li>form-data</li>
         * <li>x-www-form-urlencoded</li>
         * <li>raw</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>form-data</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The data content. This parameter is returned when <strong>Mode</strong> is set to <strong>raw</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The URL of the body content.</p>
         */
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
         * <p>The key of the header in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header in the request parameters.</p>
         * 
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
        /**
         * <p>The content of the request body.</p>
         */
        @NameInMap("Body")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentBody body;

        /**
         * <p>The request header.</p>
         */
        @NameInMap("Header")
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContentHeader> header;

        /**
         * <p>The request method. Valid values:</p>
         * <ul>
         * <li>POST</li>
         * <li>GET</li>
         * </ul>
         * 
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
         * <p>The encoding format. Valid values:</p>
         * <ul>
         * <li>0: UTF-8</li>
         * <li>1: GBK</li>
         * <li>2: GB2312</li>
         * <li>3: Unicode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CharacterEncoding")
        public Long characterEncoding;

        /**
         * <p>The custom host. Valid values:</p>
         * <ul>
         * <li>1: round robin</li>
         * <li>0: random</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomHost")
        public Long customHost;

        /**
         * <p>The custom IP address of the host. Multiple IP addresses are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>119.119.53.156</p>
         */
        @NameInMap("CustomHostIp")
        public String customHostIp;

        /**
         * <p>The timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ProtocolConnectionTimeout")
        public Long protocolConnectionTimeout;

        /**
         * <p>The timeout period of API performance monitoring. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ProtocolMonitorTimeout")
        public Long protocolMonitorTimeout;

        /**
         * <p>The size of the received data. This parameter is returned when <strong>VerifyWay</strong> is set to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ReceivedDataSize")
        public Long receivedDataSize;

        /**
         * <p>The request content, including the header and body.</p>
         */
        @NameInMap("RequestContent")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocolRequestContent requestContent;

        /**
         * <p>The verification string.</p>
         * 
         * <strong>example:</strong>
         * <p>list</p>
         */
        @NameInMap("VerifyContent")
        public String verifyContent;

        /**
         * <p>The method that is used to verify the response content. Valid values:</p>
         * <ul>
         * <li>0: no verification.</li>
         * <li>1: exact match with the verification string.</li>
         * <li>2: partial match with the verification string.</li>
         * <li>3: MD5 verification.</li>
         * </ul>
         * 
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
        /**
         * <p>The list of common parameters.</p>
         */
        @NameInMap("CommonParam")
        public GetSyntheticTaskDetailResponseBodyTaskDetailCommonParam commonParam;

        /**
         * <p>The file download task.</p>
         */
        @NameInMap("Download")
        public GetSyntheticTaskDetailResponseBodyTaskDetailDownload download;

        /**
         * <p>The frequency.</p>
         */
        @NameInMap("ExtendInterval")
        public GetSyntheticTaskDetailResponseBodyTaskDetailExtendInterval extendInterval;

        /**
         * <p>The interval at which synthetic monitoring is performed. Unit: minutes. Valid values:</p>
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
         * <p>The interval type. Valid values:</p>
         * <ul>
         * <li>0: daily</li>
         * <li>1: custom frequency</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IntervalType")
        public Long intervalType;

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li>0: A version is automatically selected.</li>
         * <li>1: IPv4.</li>
         * <li>2: IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpType")
        public Long ipType;

        /**
         * <p>The detection points.</p>
         */
        @NameInMap("MonitorList")
        public java.util.List<GetSyntheticTaskDetailResponseBodyTaskDetailMonitorList> monitorList;

        /**
         * <p>The detection points.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MonitorListString")
        public String monitorListString;

        /**
         * <p>The browser test task.</p>
         */
        @NameInMap("Nav")
        public GetSyntheticTaskDetailResponseBodyTaskDetailNav nav;

        /**
         * <p>The network synthetic monitoring task.</p>
         */
        @NameInMap("Net")
        public GetSyntheticTaskDetailResponseBodyTaskDetailNet net;

        /**
         * <p>The synthetic monitoring task of the API performance type.</p>
         */
        @NameInMap("Protocol")
        public GetSyntheticTaskDetailResponseBodyTaskDetailProtocol protocol;

        /**
         * <p>The ID of the synthetic monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>19584</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>net-test</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the task. Valid values:</p>
         * <ol>
         * <li>3: web page performance - IE</li>
         * <li>34: web page performance - Chrome</li>
         * <li>0: network quality</li>
         * <li>40: file download</li>
         * <li>7: API performance</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskType")
        public Long taskType;

        /**
         * <p>The URL for synthetic monitoring.</p>
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
