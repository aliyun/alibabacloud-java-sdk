// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetLoginRedirectApplicationForBrandRequest extends TeaModel {
    /**
     * <p>应用ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_xxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>品牌化Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>brand_xxxx</p>
     */
    @NameInMap("BrandId")
    public String brandId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SetLoginRedirectApplicationForBrandRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoginRedirectApplicationForBrandRequest self = new SetLoginRedirectApplicationForBrandRequest();
        return TeaModel.build(map, self);
    }

    public SetLoginRedirectApplicationForBrandRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetLoginRedirectApplicationForBrandRequest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public SetLoginRedirectApplicationForBrandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
