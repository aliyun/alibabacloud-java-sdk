// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ReleaseInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance. Separate multiple IDs with commas (,). A maximum of 100 IDs can be specified.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region in which the instance resides.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The method that is used to renew the instance. Valid values:</p>
     * <br>
     * <p>AutoRenewal: automatically renews the instance.</p>
     * <br>
     * <p>ManualRenewal: manually renews the instance.</p>
     * <br>
     * <p>NotRenewal: does not renew the instance.</p>
     */
    @NameInMap("RenewStatus")
    public String renewStatus;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>Subscription: the subscription billing method.</p>
     * <br>
     * <p>PayAsYouGo: the pay-as-you-go billing method.</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static ReleaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceRequest self = new ReleaseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ReleaseInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReleaseInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ReleaseInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ReleaseInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ReleaseInstanceRequest setRenewStatus(String renewStatus) {
        this.renewStatus = renewStatus;
        return this;
    }
    public String getRenewStatus() {
        return this.renewStatus;
    }

    public ReleaseInstanceRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
