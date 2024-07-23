// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppPolicyShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-ee2znjktwgxu2****</p>
     */
    @NameInMap("AppPolicyId")
    public String appPolicyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("VideoPolicy")
    public String videoPolicyShrink;

    public static ModifyAppPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppPolicyShrinkRequest self = new ModifyAppPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppPolicyShrinkRequest setAppPolicyId(String appPolicyId) {
        this.appPolicyId = appPolicyId;
        return this;
    }
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    public ModifyAppPolicyShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyAppPolicyShrinkRequest setVideoPolicyShrink(String videoPolicyShrink) {
        this.videoPolicyShrink = videoPolicyShrink;
        return this;
    }
    public String getVideoPolicyShrink() {
        return this.videoPolicyShrink;
    }

}
