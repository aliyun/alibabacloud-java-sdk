// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US (default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The updated IP address or domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The unique ID of the address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89518218114368****</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>The attribution information of the address.</p>
     * 
     * <strong>example:</strong>
     * <p>当前版本不支持此参数，不需要传入此参数。</p>
     */
    @NameInMap("AttributeInfo")
    public String attributeInfo;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the value is unique among different requests. The value can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The updated condition for determining the health status of the address:</p>
     * <ul>
     * <li><p>any_ok: At least one probe is normal for all health check templates.</p>
     * </li>
     * <li><p>p30_ok: At least 30% of the probes are normal for all health check templates.</p>
     * </li>
     * <li><p>p50_ok: At least 50% of the probes are normal for all health check templates.</p>
     * </li>
     * <li><p>p70_ok: At least 70% of the probes are normal for all health check templates.</p>
     * </li>
     * <li><p>all_ok: All probes are normal for all health check templates.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>p50_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    /**
     * <p>The list of health check tasks.</p>
     */
    @NameInMap("HealthTasks")
    public String healthTasksShrink;

    /**
     * <p>The updated name of the address.</p>
     * 
     * <strong>example:</strong>
     * <p>Address-1</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateCloudGtmAddressShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressShrinkRequest self = new UpdateCloudGtmAddressShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateCloudGtmAddressShrinkRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public UpdateCloudGtmAddressShrinkRequest setAttributeInfo(String attributeInfo) {
        this.attributeInfo = attributeInfo;
        return this;
    }
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    public UpdateCloudGtmAddressShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressShrinkRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public UpdateCloudGtmAddressShrinkRequest setHealthTasksShrink(String healthTasksShrink) {
        this.healthTasksShrink = healthTasksShrink;
        return this;
    }
    public String getHealthTasksShrink() {
        return this.healthTasksShrink;
    }

    public UpdateCloudGtmAddressShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
