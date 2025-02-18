// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageFromAppInstanceGroupRequest extends TeaModel {
    /**
     * <p>The image name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("AppCenterImageName")
    public String appCenterImageName;

    /**
     * <p>The ID of the delivery group. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The product type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static CreateImageFromAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageFromAppInstanceGroupRequest self = new CreateImageFromAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageFromAppInstanceGroupRequest setAppCenterImageName(String appCenterImageName) {
        this.appCenterImageName = appCenterImageName;
        return this;
    }
    public String getAppCenterImageName() {
        return this.appCenterImageName;
    }

    public CreateImageFromAppInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public CreateImageFromAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
