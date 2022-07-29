// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskRequest extends TeaModel {
    @NameInMap("CommonParam")
    public CreateSyntheticTaskRequestCommonParam commonParam;

    @NameInMap("ExtendInterval")
    public CreateSyntheticTaskRequestExtendInterval extendInterval;

    @NameInMap("IntervalTime")
    public String intervalTime;

    @NameInMap("IntervalType")
    public String intervalType;

    @NameInMap("IpType")
    public Long ipType;

    @NameInMap("MonitorList")
    public java.util.List<CreateSyntheticTaskRequestMonitorList> monitorList;

    @NameInMap("Net")
    public CreateSyntheticTaskRequestNet net;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskType")
    public Long taskType;

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

    public CreateSyntheticTaskRequest setNet(CreateSyntheticTaskRequestNet net) {
        this.net = net;
        return this;
    }
    public CreateSyntheticTaskRequestNet getNet() {
        return this.net;
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

    public CreateSyntheticTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class CreateSyntheticTaskRequestCommonParamAlertList extends TeaModel {
        @NameInMap("IsCritical")
        public Long isCritical;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("AlarmFlag")
        public String alarmFlag;

        @NameInMap("AlertList")
        public java.util.List<CreateSyntheticTaskRequestCommonParamAlertList> alertList;

        @NameInMap("AlertNotifierId")
        public String alertNotifierId;

        @NameInMap("AlertPolicyId")
        public String alertPolicyId;

        @NameInMap("MonitorSamples")
        public Long monitorSamples;

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

    public static class CreateSyntheticTaskRequestExtendInterval extends TeaModel {
        @NameInMap("Days")
        public java.util.List<Long> days;

        @NameInMap("EndHour")
        public Long endHour;

        @NameInMap("EndMinute")
        public Long endMinute;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartHour")
        public Long startHour;

        @NameInMap("StartMinute")
        public Long startMinute;

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
        @NameInMap("CityCode")
        public Long cityCode;

        @NameInMap("MonitorType")
        public Long monitorType;

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

    public static class CreateSyntheticTaskRequestNet extends TeaModel {
        @NameInMap("NetDNSNs")
        public String netDNSNs;

        @NameInMap("NetDNSQueryMethod")
        public Long netDNSQueryMethod;

        @NameInMap("NetDNSServer")
        public Long netDNSServer;

        @NameInMap("NetDNSSwitch")
        public Long netDNSSwitch;

        @NameInMap("NetDNSTimeout")
        public Long netDNSTimeout;

        @NameInMap("NetDigSwitch")
        public Long netDigSwitch;

        @NameInMap("NetICMPActive")
        public Long netICMPActive;

        @NameInMap("NetICMPInterval")
        public Long netICMPInterval;

        @NameInMap("NetICMPNum")
        public Long netICMPNum;

        @NameInMap("NetICMPSize")
        public Long netICMPSize;

        @NameInMap("NetICMPSwitch")
        public Long netICMPSwitch;

        @NameInMap("NetTraceRouteNum")
        public Long netTraceRouteNum;

        @NameInMap("NetTraceRouteSwitch")
        public Long netTraceRouteSwitch;

        @NameInMap("NetTraceRouteTimeout")
        public Long netTraceRouteTimeout;

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

}
