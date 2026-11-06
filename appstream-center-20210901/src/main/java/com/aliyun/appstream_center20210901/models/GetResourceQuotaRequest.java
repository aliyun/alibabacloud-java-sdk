// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceQuotaRequest extends TeaModel {
    /**
     * <p>The business region ID. If this parameter is omitted, the general quota that is not limited by region is queried. The quotas of different regions are not added together. This parameter must be consistent with the business region for What to do next.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method query condition. If this parameter is omitted, the general quota that is not limited by billing method is queried. The quotas of different billing methods are not added together. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The product type. Set this parameter to the following value when you call the operation:</p>
     * <ul>
     * <li>CloudApp: WUYING Cloud App.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The business resource type to query. Valid values:</p>
     * <ul>
     * <li>AppInstanceGroup: the quantity quota for delivery groups. Unit: count.</li>
     * <li>AppAuthUser: the quantity quota for authorized users. Unit: users.</li>
     * <li>PoolNodeAmount: the quantity quota for purchased resource nodes. Unit: count.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroup</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetResourceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceQuotaRequest self = new GetResourceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceQuotaRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetResourceQuotaRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public GetResourceQuotaRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetResourceQuotaRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
