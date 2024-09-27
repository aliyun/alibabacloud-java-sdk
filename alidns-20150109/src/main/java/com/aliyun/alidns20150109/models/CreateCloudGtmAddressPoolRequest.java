// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Address pool name, helping users distinguish the purpose of address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>Address pool-1</p>
     */
    @NameInMap("AddressPoolName")
    public String addressPoolName;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <ul>
     * <li>IPv4: IPv4 addresses are returned for Domain Name System (DNS) resolution.</li>
     * <li>IPv6: IPv6 addresses are returned for DNS resolution.</li>
     * <li>domain: Domain names are returned for DNS resolution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressPoolType")
    public String addressPoolType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The enabling state of the address pool. Valid values:</p>
     * <ul>
     * <li>enable: The address pool is enabled, and the addresses in the address pool are returned for DNS resolution when the health check results are normal.</li>
     * <li>disable: The address pool is disabled, and the addresses in the address pool are not returned for DNS resolution regardless of whether the health check results are normal or not.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The condition for determining the health status of the address pool. Valid values:</p>
     * <ul>
     * <li>any_ok: At least one address in the address pool is available.</li>
     * <li>p30_ok: At least 30% of the addresses in the address pool are available.</li>
     * <li>p50_ok: At least 50% of the addresses in the address pool are available.</li>
     * <li>p70_ok: At least 70% of the addresses in the address pool are available.</li>
     * <li>all_ok: All addresses in the address pool are available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>any_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    /**
     * <p>Remarks for the address pool, helping users distinguish the usage scenarios of different address pools.</p>
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
