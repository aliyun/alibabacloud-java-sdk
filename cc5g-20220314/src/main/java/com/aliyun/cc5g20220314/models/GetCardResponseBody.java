// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zjalyjs01s.5gjs.njiot</p>
     */
    @NameInMap("APN")
    public String APN;

    /**
     * <strong>example:</strong>
     * <p>2022-08-25 17:34:57</p>
     */
    @NameInMap("ActivatedTime")
    public String activatedTime;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("AlarmThreshold")
    public Long alarmThreshold;

    /**
     * <strong>example:</strong>
     * <p>iotcc-xxxxxxxx</p>
     */
    @NameInMap("CloudConnectorId")
    public String cloudConnectorId;

    /**
     * <strong>example:</strong>
     * <p>task-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>Unicom</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("Iccid")
    public String iccid;

    /**
     * <strong>example:</strong>
     * <p>23412313513512</p>
     */
    @NameInMap("Imei")
    public String imei;

    /**
     * <strong>example:</strong>
     * <p>12123123</p>
     */
    @NameInMap("Imsi")
    public String imsi;

    /**
     * <strong>example:</strong>
     * <p>172.24.2.121</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LimitThreshold")
    public Long limitThreshold;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Lock")
    public String lock;

    /**
     * <strong>example:</strong>
     * <p>2312341231235</p>
     */
    @NameInMap("Msisdn")
    public String msisdn;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>5G</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <strong>example:</strong>
     * <p>12312341234124</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>0B28B72A-BD16-51F7-AAEE-55247FE02729</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Deactivated</p>
     */
    @NameInMap("SimStatus")
    public String simStatus;

    /**
     * <strong>example:</strong>
     * <p>CONSUMER_THREE_IN_ONE</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("StopThreshold")
    public Long stopThreshold;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("UsageDataMonth")
    public Integer usageDataMonth;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("UsageDataTotal")
    public Long usageDataTotal;

    /**
     * <strong>example:</strong>
     * <p>cc5g-xxxxxxx</p>
     */
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
