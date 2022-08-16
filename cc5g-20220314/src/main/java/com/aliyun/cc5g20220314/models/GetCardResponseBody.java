// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCardResponseBody extends TeaModel {
    @NameInMap("APN")
    public String APN;

    @NameInMap("ActivatedTime")
    public String activatedTime;

    @NameInMap("AlarmThreshold")
    public Long alarmThreshold;

    @NameInMap("CloudConnectorId")
    public String cloudConnectorId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("Imei")
    public String imei;

    @NameInMap("Imsi")
    public String imsi;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("LimitThreshold")
    public Long limitThreshold;

    @NameInMap("Lock")
    public String lock;

    @NameInMap("Msisdn")
    public String msisdn;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SimStatus")
    public String simStatus;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Status")
    public String status;

    @NameInMap("StopThreshold")
    public Long stopThreshold;

    @NameInMap("UsageDataMonth")
    public Integer usageDataMonth;

    @NameInMap("UsageDataTotal")
    public Long usageDataTotal;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static GetCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardResponseBody self = new GetCardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardResponseBody setAPN(String APN) {
        this.APN = APN;
        return this;
    }
    public String getAPN() {
        return this.APN;
    }

    public GetCardResponseBody setActivatedTime(String activatedTime) {
        this.activatedTime = activatedTime;
        return this;
    }
    public String getActivatedTime() {
        return this.activatedTime;
    }

    public GetCardResponseBody setAlarmThreshold(Long alarmThreshold) {
        this.alarmThreshold = alarmThreshold;
        return this;
    }
    public Long getAlarmThreshold() {
        return this.alarmThreshold;
    }

    public GetCardResponseBody setCloudConnectorId(String cloudConnectorId) {
        this.cloudConnectorId = cloudConnectorId;
        return this;
    }
    public String getCloudConnectorId() {
        return this.cloudConnectorId;
    }

    public GetCardResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetCardResponseBody setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public GetCardResponseBody setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public GetCardResponseBody setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public GetCardResponseBody setImsi(String imsi) {
        this.imsi = imsi;
        return this;
    }
    public String getImsi() {
        return this.imsi;
    }

    public GetCardResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public GetCardResponseBody setLimitThreshold(Long limitThreshold) {
        this.limitThreshold = limitThreshold;
        return this;
    }
    public Long getLimitThreshold() {
        return this.limitThreshold;
    }

    public GetCardResponseBody setLock(String lock) {
        this.lock = lock;
        return this;
    }
    public String getLock() {
        return this.lock;
    }

    public GetCardResponseBody setMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }
    public String getMsisdn() {
        return this.msisdn;
    }

    public GetCardResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetCardResponseBody setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public GetCardResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCardResponseBody setSimStatus(String simStatus) {
        this.simStatus = simStatus;
        return this;
    }
    public String getSimStatus() {
        return this.simStatus;
    }

    public GetCardResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public GetCardResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetCardResponseBody setStopThreshold(Long stopThreshold) {
        this.stopThreshold = stopThreshold;
        return this;
    }
    public Long getStopThreshold() {
        return this.stopThreshold;
    }

    public GetCardResponseBody setUsageDataMonth(Integer usageDataMonth) {
        this.usageDataMonth = usageDataMonth;
        return this;
    }
    public Integer getUsageDataMonth() {
        return this.usageDataMonth;
    }

    public GetCardResponseBody setUsageDataTotal(Long usageDataTotal) {
        this.usageDataTotal = usageDataTotal;
        return this;
    }
    public Long getUsageDataTotal() {
        return this.usageDataTotal;
    }

    public GetCardResponseBody setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
