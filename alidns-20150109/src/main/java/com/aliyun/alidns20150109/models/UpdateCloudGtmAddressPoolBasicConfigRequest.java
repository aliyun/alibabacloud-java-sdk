// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolBasicConfigRequest extends TeaModel {
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
     * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-89528023225442**16</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <p>Address pool name, helping users distinguish the purpose of address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AddressPoolName")
    public String addressPoolName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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

    public static UpdateCloudGtmAddressPoolBasicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolBasicConfigRequest self = new UpdateCloudGtmAddressPoolBasicConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setAddressPoolName(String addressPoolName) {
        this.addressPoolName = addressPoolName;
        return this;
    }
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

}
