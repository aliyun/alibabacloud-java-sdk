// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingTemplateRequest extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("CategoryKey")
    public String categoryKey;

    /**
     * <p>The identifier of the category that you want to query.</p>
     * <br>
     * <p>You can call the [ListThingTemplates](~~150316~~) operation and view all category keys in the response.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static GetThingTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThingTemplateRequest self = new GetThingTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetThingTemplateRequest setCategoryKey(String categoryKey) {
        this.categoryKey = categoryKey;
        return this;
    }
    public String getCategoryKey() {
        return this.categoryKey;
    }

    public GetThingTemplateRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetThingTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
