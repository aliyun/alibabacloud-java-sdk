// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolBasicConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>pool-89528023225442**16</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AddressPoolName")
    public String addressPoolName;

    /**
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
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
