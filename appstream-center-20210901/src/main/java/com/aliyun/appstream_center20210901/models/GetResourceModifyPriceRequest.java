// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceModifyPriceRequest extends TeaModel {
    /**
     * <p>The total number of subscription resource nodes after the scale-out. Unit: nodes.</p>
     * <p><strong>The value must be greater than the current number of purchased nodes in the delivery group and cannot exceed the node quota of the account.</strong> This parameter is not the number of added nodes or the number of sessions.</p>
     * <p>For example, if there is currently 1 node and you want to scale out to 2 nodes, specify 2 to indicate a final total of 2 nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Amount")
    public Long amount;

    /**
     * <p>The ID of the delivery group to be scaled out. You can query only one delivery group at a time.</p>
     * <p>The delivery group must belong to the current account and match ProductType. It must be billed by node on a subscription basis, have a normal order status, and be associated with a resource node pool.</p>
     * <p>You can obtain the cloud app delivery group ID by calling <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListAppInstanceGroup">ListAppInstanceGroup</a>. You can call <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetAppInstanceGroup">GetAppInstanceGroup</a> to further verify the current configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The product type, which must match the product to which the target delivery group belongs. Valid values:</p>
     * <ul>
     * <li>CloudApp: WUYING Cloud App. Queries the resource scale-out price of a cloud app delivery group.</li>
     * <li>CloudBrowser: Cloud Browser. Applies only to subscription browser delivery groups that are billed by node.</li>
     * </ul>
     * <p>This operation does not apply to pay-as-you-go or browser groups billed by monthly active user (MAU).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static GetResourceModifyPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceModifyPriceRequest self = new GetResourceModifyPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceModifyPriceRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public GetResourceModifyPriceRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public GetResourceModifyPriceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
