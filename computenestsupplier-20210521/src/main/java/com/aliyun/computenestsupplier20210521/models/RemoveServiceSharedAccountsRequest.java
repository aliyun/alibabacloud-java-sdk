// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RemoveServiceSharedAccountsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a54420****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The share type of the service. Default value: SharedAccount. Valid values:</p>
     * <ul>
     * <li>SharedAccount: The service is shared by multiple accounts.</li>
     * <li>Reseller: The service is distributed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SharedAccount</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Whitelist accounts for service sharing.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserAliUids")
    public java.util.List<Long> userAliUids;

    public static RemoveServiceSharedAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveServiceSharedAccountsRequest self = new RemoveServiceSharedAccountsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveServiceSharedAccountsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveServiceSharedAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveServiceSharedAccountsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RemoveServiceSharedAccountsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RemoveServiceSharedAccountsRequest setUserAliUids(java.util.List<Long> userAliUids) {
        this.userAliUids = userAliUids;
        return this;
    }
    public java.util.List<Long> getUserAliUids() {
        return this.userAliUids;
    }

}
