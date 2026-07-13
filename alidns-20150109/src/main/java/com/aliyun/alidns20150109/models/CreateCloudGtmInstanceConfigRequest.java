// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmInstanceConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The billing method for the instance configuration:</p>
     * <ul>
     * <li><p>prepay: Subscription. This is the default value.</p>
     * </li>
     * <li><p>postpay: Pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>postpay</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value, but you must make sure that the value is unique among different requests. The token can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The status of the domain name instance:</p>
     * <ul>
     * <li><p>enable: Enabled. The intelligent scheduling policy of the GTM instance is active.</p>
     * </li>
     * <li><p>disable: Disabled. The intelligent scheduling policy of the GTM instance is unavailable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The unique ID of the GTM 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-jmp3qnw**03</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The remark.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The host record of the GTM access domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("ScheduleHostname")
    public String scheduleHostname;

    /**
     * <p>The DNS record type of the access domain name:</p>
     * <ul>
     * <li><p>A: IPv4 address</p>
     * </li>
     * <li><p>AAAA: IPv6 address</p>
     * </li>
     * <li><p>CNAME: Canonical name</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("ScheduleRrType")
    public String scheduleRrType;

    /**
     * <p>The configuration mode for the access domain name:</p>
     * <ul>
     * <li><p>sys_assign: The system assigns a domain name. This mode is no longer supported.</p>
     * </li>
     * <li><p>custom: Custom mode. Select a domain name under the account that owns the instance and enter a host record to generate the access domain name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ScheduleZoneMode")
    public String scheduleZoneMode;

    /**
     * <p>The zone name, which is the parent zone of the GTM access domain name. This is typically a domain name hosted in the Alibaba Cloud DNS console under the account that owns the GTM instance. Primary domains and subdomains are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ScheduleZoneName")
    public String scheduleZoneName;

    /**
     * <p>The global Time to Live (TTL) in seconds. This is the TTL for the access domain name that resolves to an address in an address pool. This value affects how long the DNS record is cached on a carrier\&quot;s local DNS server. You can specify a custom TTL.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static CreateCloudGtmInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmInstanceConfigRequest self = new CreateCloudGtmInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmInstanceConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmInstanceConfigRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateCloudGtmInstanceConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmInstanceConfigRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public CreateCloudGtmInstanceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCloudGtmInstanceConfigRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateCloudGtmInstanceConfigRequest setScheduleHostname(String scheduleHostname) {
        this.scheduleHostname = scheduleHostname;
        return this;
    }
    public String getScheduleHostname() {
        return this.scheduleHostname;
    }

    public CreateCloudGtmInstanceConfigRequest setScheduleRrType(String scheduleRrType) {
        this.scheduleRrType = scheduleRrType;
        return this;
    }
    public String getScheduleRrType() {
        return this.scheduleRrType;
    }

    public CreateCloudGtmInstanceConfigRequest setScheduleZoneMode(String scheduleZoneMode) {
        this.scheduleZoneMode = scheduleZoneMode;
        return this;
    }
    public String getScheduleZoneMode() {
        return this.scheduleZoneMode;
    }

    public CreateCloudGtmInstanceConfigRequest setScheduleZoneName(String scheduleZoneName) {
        this.scheduleZoneName = scheduleZoneName;
        return this;
    }
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

    public CreateCloudGtmInstanceConfigRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
