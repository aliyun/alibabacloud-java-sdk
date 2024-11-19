// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingTemplateRequest extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Lighting</p>
     */
    @NameInMap("CategoryKey")
    public String categoryKey;

    /**
     * <p>The identifier of the category that you want to query.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/150316.html">ListThingTemplates</a> operation and view all category keys in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4l5tcwd****</p>
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
