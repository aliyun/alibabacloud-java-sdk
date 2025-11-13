// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmInstanceConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>postpay/prepay</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The enabling state of the access domain name. Valid values:</p>
     * <ul>
     * <li>enable: The access domain name is enabled and the intelligent scheduling policy of the corresponding GTM instance takes effect.</li>
     * <li>disable: The access domain name is disabled and the intelligent scheduling policy of the corresponding GTM instance is unavailable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance. This ID uniquely identifies a GTM 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-jmp3qnw**03</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The description of the access domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The hostname of the access domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("ScheduleHostname")
    public String scheduleHostname;

    /**
     * <p>The type of the Domain Name System (DNS) record configured for the access domain name. Valid values:</p>
     * <ul>
     * <li>A: IPv4 address</li>
     * <li>AAAA: IPv6 address</li>
     * <li>CNAME: domain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("ScheduleRrType")
    public String scheduleRrType;

    /**
     * <p>The configuration mode of the access domain name. Valid values:</p>
     * <ul>
     * <li>sys_assign: system allocation. This mode is not supported.</li>
     * <li>custom: custom allocation. You must select a zone within the account to which the instance belongs and enter a hostname to generate an access domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ScheduleZoneMode")
    public String scheduleZoneMode;

    /**
     * <p>The name of the parent zone for the access domain name configured in GTM. In most cases, the value of this parameter is the name of a zone hosted by Alibaba Cloud DNS. This zone belongs to the account to which the GTM instance belongs. You can specify the name of a zone or subzone.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ScheduleZoneName")
    public String scheduleZoneName;

    /**
     * <p>The global time to live (TTL) period. Unit: seconds. The global TTL period affects how long the DNS records that map the access domain name to the addresses in the address pools are cached in the local DNS servers of Internet service providers (ISPs). You can specify a custom value.</p>
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
