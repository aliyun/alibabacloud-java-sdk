// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskRequest extends TeaModel {
    /**
     * <p>The common parameters.</p>
     */
    @NameInMap("CommonParam")
    public CreateSyntheticTaskRequestCommonParam commonParam;

    /**
     * <p>The file download task.</p>
     */
    @NameInMap("Download")
    public CreateSyntheticTaskRequestDownload download;

    /**
     * <p>The frequency.</p>
     */
    @NameInMap("ExtendInterval")
    public CreateSyntheticTaskRequestExtendInterval extendInterval;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("IntervalTime")
    public String intervalTime;

    /**
     * <p>The interval type.</p>
     * <ul>
     * <li>0: daily</li>
     * <li>1: custom frequency</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntervalType")
    public String intervalType;

    /**
     * <p>The IP address type:</p>
     * <ul>
     * <li>0: an automatic IP address</li>
     * <li>1: IPv4</li>
     * <li>2: IPv6</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IpType")
    public Long ipType;

    /**
     * <p>The list of monitoring points.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MonitorList")
    public java.util.List<CreateSyntheticTaskRequestMonitorList> monitorList;

    /**
     * <p>The monitoring items that are associated with the browse tasks.</p>
     */
    @NameInMap("Navigation")
    public CreateSyntheticTaskRequestNavigation navigation;

    /**
     * <p>The network synthetic monitoring task.</p>
     */
    @NameInMap("Net")
    public CreateSyntheticTaskRequestNet net;

    /**
     * <p>The API performance synthetic monitoring task.</p>
     */
    @NameInMap("Protocol")
    public CreateSyntheticTaskRequestProtocol protocol;

    /**
     * <p>The ID of the region in which the application is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the task. To update a synthetic monitoring task, enter the task name and set the <strong>UpdateTask</strong> parameter to <strong>true</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Network synthetic monitoring task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the monitoring task. Valid values:</p>
     * <ol>
     * <li>3: web page performance - IE</li>
     * <li>34: web Page Performance - Chrome</li>
     * <li>0: network quality</li>
     * <li>40: file download</li>
     * <li>7:API performance</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskType")
    public Long taskType;

    /**
     * <p>Specifies whether to update existing synthetic monitoring tasks.</p>
     * <ul>
     * <li>true: updates existing synthetic monitoring tasks.</li>
     * <li>false: creates new synthetic monitoring tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpdateTask")
    public Boolean updateTask;

    /**
     * <p>The URL for synthetic monitoring.</p>
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
         * <p>Specifies whether the condition must be met.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCritical")
        public Long isCritical;

        /**
         * <p>The name of the alert rule.</p>
         * <p>For network synthetic monitoring, use the following names:</p>
         * <ul>
         * <li>Latency: PING_SET</li>
         * <li>Packet loss rate: PING_LOST_RATE</li>
         * <li>Hijacking: HIJACKPER</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PING_SET</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies how the condition is evaluated. Valid values:</p>
         * <ul>
         * <li>1: greater than</li>
         * <li>0: less than</li>
         * </ul>
         * 
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
         * <p>Specifies whether to create an alert rule.</p>
         * <ul>
         * <li>1: creates an alert.</li>
         * <li>0: does not create an alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmFlag")
        public String alarmFlag;

        /**
         * <p>The alert parameters.</p>
         */
        @NameInMap("AlertList")
        public java.util.List<CreateSyntheticTaskRequestCommonParamAlertList> alertList;

        /**
         * <p>The ID of the alert recipient. Separate multiple recipients with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AlertNotifierId")
        public String alertNotifierId;

        /**
         * <p>The ID of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("AlertPolicyId")
        public String alertPolicyId;

        /**
         * <p>Specifies whether to evenly distribute monitoring samples. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonitorSamples")
        public Long monitorSamples;

        /**
         * <p>The time when execution starts.</p>
         * 
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
         * <p>The connection timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ConnectionTimeout")
        public Double connectionTimeout;

        /**
         * <p>The items to be ignored in a certificate error. Pass the values of the check boxes that are separated with vertical bars (|).</p>
         * 
         * <strong>example:</strong>
         * <p>Host:<a href="http://www.example.com%7CReferer:www.example.com">www.example.com|Referer:www.example.com</a></p>
         */
        @NameInMap("DownloadCustomHeaderContent")
        public String downloadCustomHeaderContent;

        /**
         * <p>The custom host mode.</p>
         * <ul>
         * <li>1: round robin</li>
         * <li>0: random</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadCustomHost")
        public Long downloadCustomHost;

        /**
         * <p>The custom host IP address. You can enter multiple IP addresses. Separate the IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4:192.168.2.1,192.168.2.5:img.a.com|192.168.2.1[8080]:img.a.com</p>
         */
        @NameInMap("DownloadCustomHostIp")
        public String downloadCustomHostIp;

        /**
         * <p>The items to be ignored in a certificate error. Pass the values of the check boxes that are separated with vertical bars (|).</p>
         * 
         * <strong>example:</strong>
         * <p>1|2|4</p>
         */
        @NameInMap("DownloadIgnoreCertificateError")
        public String downloadIgnoreCertificateError;

        /**
         * <p>The kernel type.</p>
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
         * <p>Specifies whether to support redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownloadRedirection")
        public Long downloadRedirection;

        /**
         * <p>The size of the download file. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("DownloadTransmissionSize")
        public Long downloadTransmissionSize;

        /**
         * <p>The monitoring duration.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>The QUIC protocol type.</p>
         * <ul>
         * <li>1: http1</li>
         * <li>2: http2</li>
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
         * <p>keyword</p>
         */
        @NameInMap("ValidateKeywords")
        public String validateKeywords;

        /**
         * <p>The verification method.</p>
         * <ul>
         * <li>0: no verification</li>
         * <li>1: string verification</li>
         * <li>2: MD5 verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VerifyWay")
        public Long verifyWay;

        /**
         * <p>The whitelist for DNS hijacking.</p>
         * 
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
        /**
         * <p>The day on which synthetic monitoring is performed.</p>
         */
        @NameInMap("Days")
        public java.util.List<Long> days;

        /**
         * <p>The hour at which synthetic monitoring ends.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("EndHour")
        public Long endHour;

        /**
         * <p>The minute at which synthetic monitoring ends.</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("EndMinute")
        public Long endMinute;

        /**
         * <p>The time when synthetic monitoring ends. The format is <code>yyyy-MM-dd HH</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-20 10</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The hour at which synthetic monitoring starts.</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("StartHour")
        public Long startHour;

        /**
         * <p>The minute at which synthetic monitoring starts.</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("StartMinute")
        public Long startMinute;

        /**
         * <p>The time when synthetic monitoring starts. The format is <code>yyyy-MM-dd HH</code>.</p>
         * 
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
         * <p>The ID of the city to which the monitoring point belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1100101</p>
         */
        @NameInMap("CityCode")
        public Long cityCode;

        /**
         * <p>The carrier type:</p>
         * <ul>
         * <li>IDC</li>
         * <li>LastMilie</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IDC</p>
         */
        @NameInMap("MonitorType")
        public Long monitorType;

        /**
         * <p>The ID of the carrier.</p>
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
        /**
         * <p>The whitelist for DNS hijacking.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:202.0.3.55%7C203.3.44.67">www.aliyun.com:202.0.3.55|203.3.44.67</a></p>
         */
        @NameInMap("DNSHijackWhiteList")
        public String DNSHijackWhiteList;

        /**
         * <p>The element blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>*.a.com</p>
         */
        @NameInMap("ElementBlacklist")
        public String elementBlacklist;

        /**
         * <p>Specifies whether to execute ActiveX.</p>
         * <ul>
         * <li>3: yes</li>
         * <li>0: no</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported only by IE Full Elements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ExecuteActiveX")
        public Long executeActiveX;

        /**
         * <p>Specifies whether to run applets.</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported only by IE Full Elements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteApplication")
        public Long executeApplication;

        /**
         * <p>Specifies whether to execute scripts.</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported only by IE Full Elements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteScript")
        public Long executeScript;

        /**
         * <p>Specifies whether to filter invalid IP addresses.</p>
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
         * <p>50</p>
         */
        @NameInMap("FlowHijackJumpTimes")
        public Long flowHijackJumpTimes;

        /**
         * <p>The tag that is used in DNS hijacking.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FlowHijackLogo")
        public String flowHijackLogo;

        /**
         * <p>The timeout period of monitoring. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MonitorTimeout")
        public String monitorTimeout;

        /**
         * <p>Specifies whether to automatically scroll up and down the screen to load a page.</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavAutomaticScrolling")
        public String navAutomaticScrolling;

        /**
         * <p>The method that is used to customize the header. Valid values:</p>
         * <ul>
         * <li>0: disables the customer header.</li>
         * <li>1: modifies the first package.</li>
         * <li>2: modifies all packages.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NavCustomHeader")
        public String navCustomHeader;

        /**
         * <p>The format of the custom header. You can specify multiple fields. Separate the fields with vertical bars (|).</p>
         * 
         * <strong>example:</strong>
         * <p>Host:<a href="http://www.example.com%7CReferer:www.example.com">www.example.com|Referer:www.example.com</a></p>
         */
        @NameInMap("NavCustomHeaderContent")
        public String navCustomHeaderContent;

        /**
         * <p>The custom host mode.</p>
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
         * <p>The custom host IP address. You can enter multiple IP addresses. Separate the IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4:192.168.2.1,192.168.2.5:img.a.com|192.168.2.1[8080]:img.a.com</p>
         */
        @NameInMap("NavCustomHostIp")
        public String navCustomHostIp;

        /**
         * <p>Specifies whether to disable caching.</p>
         * <ul>
         * <li>1: disable</li>
         * <li>0: enable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavDisableCache")
        public Long navDisableCache;

        /**
         * <p>Specifies whether to enable the feature of using the Accept-Encoding field to determine whether to accept compressed files.</p>
         * <ul>
         * <li>1: disable</li>
         * <li>0: enable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavDisableCompression")
        public String navDisableCompression;

        /**
         * <p>Specifies whether to ignore certificate errors during certificate verification in the SSL handshake and continue browsing.</p>
         * <ul>
         * <li>1: ignore</li>
         * <li>0: does not ignore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavIgnoreCertificateError")
        public Long navIgnoreCertificateError;

        /**
         * <p>Specifies whether to continue browsing after a redirection occurs.</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavRedirection")
        public Long navRedirection;

        /**
         * <p>Specifies whether to return the elements on the page.</p>
         * <ul>
         * <li>1: no. Returns the basic document data.</li>
         * <li>2: yes. Returns all document data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NavReturnElement")
        public Long navReturnElement;

        /**
         * <p>The web page defacement.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com:202.0.3.55%7C203.3.44.67">www.example.com:202.0.3.55|203.3.44.67</a></p>
         */
        @NameInMap("PageTamper")
        public String pageTamper;

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
         * <blockquote>
         * <p> This parameter is supported by all elements of only Chrome</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("QUICDomain")
        public String QUICDomain;

        /**
         * <p>The Quick UDP Internet Connections (QUIC) protocol version. Default value: 0. Valid values:</p>
         * <ul>
         * <li></li>
         * <li>35</li>
         * <li>39</li>
         * <li>43</li>
         * <li>44</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported by all elements of only Chrome</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QUICVersion")
        public Long QUICVersion;

        /**
         * <p>Specifies whether to return the request header.</p>
         * <ul>
         * <li>0: does not return the response header.</li>
         * <li>1: returns the basic document header.</li>
         * <li>2: returns all headers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RequestHeader")
        public Long requestHeader;

        /**
         * <p>The method that is used to return the response header. Valid values:</p>
         * <ul>
         * <li>0: does not return the response header.</li>
         * <li>1: returns the basic document header.</li>
         * <li>2: returns all headers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResponseHeader")
        public Long responseHeader;

        /**
         * <p>The time threshold that is used to define a slow element. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SlowElementThreshold")
        public Double slowElementThreshold;

        /**
         * <p>The blacklist for string verification.</p>
         * 
         * <strong>example:</strong>
         * <p>Regex:*.example|expalme|</p>
         */
        @NameInMap("VerifyStringBlacklist")
        public String verifyStringBlacklist;

        /**
         * <p>The whitelist for string verification.</p>
         * 
         * <strong>example:</strong>
         * <p>Regex:*.example|expalme|</p>
         */
        @NameInMap("VerifyStringWhiteList")
        public String verifyStringWhiteList;

        /**
         * <p>The timeout period of waiting for the monitoring to complete.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
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
         * <p>The DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>114.114.XX.XX</p>
         */
        @NameInMap("NetDNSNs")
        public String netDNSNs;

        /**
         * <p>The DNS query method. Valid values:</p>
         * <ul>
         * <li>1: recursion</li>
         * <li>2: iteration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetDNSQueryMethod")
        public Long netDNSQueryMethod;

        /**
         * <p>The IP address type of the DNS server.</p>
         * <ul>
         * <li>0: IPv4</li>
         * <li>1: IPv6</li>
         * <li>2: an automatic IP address</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetDNSServer")
        public Long netDNSServer;

        /**
         * <p>Specifies whether to enable domain name system (DNS) monitoring.</p>
         * <ul>
         * <li>0: Off.</li>
         * <li>1: On. You must set DNS parameters if you want to enable DNS monitoring.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetDNSSwitch")
        public Long netDNSSwitch;

        /**
         * <p>The timeout period of DNS monitoring. Default value: 5 seconds. Valid values: 0 to 45 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NetDNSTimeout")
        public Long netDNSTimeout;

        /**
         * <p>Specifies whether to display the data in the DIG format. Valid values:</p>
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
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>0: ICMP</li>
         * <li>1: TCP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetICMPActive")
        public Long netICMPActive;

        /**
         * <p>Specifies whether to split packages.</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetICMPDataCut")
        public Long netICMPDataCut;

        /**
         * <p>The interval at which the network synthetic monitoring task is executed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetICMPInterval")
        public Long netICMPInterval;

        /**
         * <p>The number of packages.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NetICMPNum")
        public Long netICMPNum;

        /**
         * <p>The package size.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("NetICMPSize")
        public Long netICMPSize;

        /**
         * <p>Specifies whether to enable ping monitoring.</p>
         * <ul>
         * <li>0: Off.</li>
         * <li>1: On. You must set Internet control message protocol (ICMP) parameters if you want to enable ping monitoring.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetICMPSwitch")
        public Long netICMPSwitch;

        /**
         * <p>The timeout period of Ping monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NetICMPTimeout")
        public Long netICMPTimeout;

        /**
         * <p>The maximum number of active monitoring points.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NetTraceRouteNum")
        public Long netTraceRouteNum;

        /**
         * <p>Specifies whether to enable tracert monitoring.</p>
         * <ul>
         * <li>0: Off.</li>
         * <li>1: On. You must set the tracert parameters if you want to enable tracert monitoring.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetTraceRouteSwitch")
        public Long netTraceRouteSwitch;

        /**
         * <p>The timeout period of tracert monitoring. Valid values: 0 to 300 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("NetTraceRouteTimeout")
        public Long netTraceRouteTimeout;

        /**
         * <p>The whitelist for DNS hijacking. The format is <code>Domain name: Matching rule</code>.</p>
         * <blockquote>
         * <p> Wireless application protocol (WAP) networks do not support DNS hijacking.</p>
         * </blockquote>
         * 
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
         * <p>The key of <strong>form-data</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>appId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of <strong>form-data</strong>.</p>
         * 
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
         * <p>The key of <strong>x-www-form-urlencoded</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>appId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of <strong>x-www-form-urlencoded</strong>.</p>
         * 
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
        /**
         * <p>The data that is passed when the <strong>Mode</strong> parameter is set to <strong>form-data</strong>.</p>
         */
        @NameInMap("FormData")
        public java.util.List<CreateSyntheticTaskRequestProtocolRequestContentBodyFormData> formData;

        /**
         * <p>The language that is selected when the Mode parameter is set to raw.</p>
         * <ul>
         * <li>json</li>
         * <li>xml</li>
         * <li>javascript</li>
         * <li>html</li>
         * <li>text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>json</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The data type of the content.</p>
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
         * <p>The data that is passed when the <strong>Mode</strong> parameter is set to <strong>raw</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The data that is passed when the <strong>Mode</strong> parameter is set to <strong>x-www-form-urlencoded</strong>.</p>
         */
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
         * <p>The key of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the request header.</p>
         * 
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
        /**
         * <p>The custom body of a request to initiate an API performance synthetic monitoring task.</p>
         */
        @NameInMap("Body")
        public CreateSyntheticTaskRequestProtocolRequestContentBody body;

        /**
         * <p>The custom header of a request to initiate an API performance synthetic monitoring task.</p>
         */
        @NameInMap("Header")
        public java.util.List<CreateSyntheticTaskRequestProtocolRequestContentHeader> header;

        /**
         * <p>The request method.</p>
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
         * <p>The encoding format.</p>
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
         * <p>The custom host mode.</p>
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
         * <p>The custom host IP address. You can enter multiple IP addresses. Separate the IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4:192.168.2.1,192.168.2.5:img.a.com|192.168.2.1[8080]:img.a.com</p>
         */
        @NameInMap("CustomHostIp")
        public String customHostIp;

        /**
         * <p>The connection timeout period of the protocol. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProtocolConnectionTime")
        public Long protocolConnectionTime;

        /**
         * <p>The timeout period of API performance synthetic monitoring. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ProtocolMonitorTimeout")
        public String protocolMonitorTimeout;

        /**
         * <p>The size of the received data. This parameter is required when you set the value of the VerifyWay parameter to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ReceivedDataSize")
        public Long receivedDataSize;

        /**
         * <p>The request content, including the request header and request body.</p>
         */
        @NameInMap("RequestContent")
        public CreateSyntheticTaskRequestProtocolRequestContent requestContent;

        /**
         * <p>The verification string.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;code&quot;:200</p>
         */
        @NameInMap("VerifyContent")
        public String verifyContent;

        /**
         * <p>The method that is used to verify the response content.</p>
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
