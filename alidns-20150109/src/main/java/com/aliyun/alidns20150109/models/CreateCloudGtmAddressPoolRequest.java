// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US: English. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the address pool. The name helps you identify the purpose of the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>Address pool-1</p>
     */
    @NameInMap("AddressPoolName")
    public String addressPoolName;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <ul>
     * <li><p>IPv4: The endpoint is an IPv4 address.</p>
     * </li>
     * <li><p>IPv6: The endpoint is an IPv6 address.</p>
     * </li>
     * <li><p>domain: The endpoint is a domain name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressPoolType")
    public String addressPoolType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a unique token for each request. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The status of the address pool. Valid values:</p>
     * <ul>
     * <li><p>enable: The address pool is enabled and can be used for DNS resolution if it passes health checks.</p>
     * </li>
     * <li><p>disable: The address pool is disabled and cannot be used for DNS resolution, regardless of its health check status.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The health status condition of the address pool. Valid values:</p>
     * <ul>
     * <li><p>any_ok: At least one address in the address pool is active.</p>
     * </li>
     * <li><p>p30_ok: At least 30% of the addresses in the address pool are active.</p>
     * </li>
     * <li><p>p50_ok: At least 50% of the addresses in the address pool are active.</p>
     * </li>
     * <li><p>p70_ok: At least 70% of the addresses in the address pool are active.</p>
     * </li>
     * <li><p>all_ok: All addresses in the address pool are active.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>any_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    /**
     * <p>Remarks about the address pool. The remarks help you identify the scenario in which the address pool is used.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static CreateCloudGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmAddressPoolRequest self = new CreateCloudGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmAddressPoolRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmAddressPoolRequest setAddressPoolName(String addressPoolName) {
        this.addressPoolName = addressPoolName;
        return this;
    }
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    public CreateCloudGtmAddressPoolRequest setAddressPoolType(String addressPoolType) {
        this.addressPoolType = addressPoolType;
        return this;
    }
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    public CreateCloudGtmAddressPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmAddressPoolRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public CreateCloudGtmAddressPoolRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public CreateCloudGtmAddressPoolRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
