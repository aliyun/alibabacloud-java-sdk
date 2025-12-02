// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetFeatureConfigRequest extends TeaModel {
    /**
     * <p>Query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Lang\&quot;:\&quot;zh\&quot;,\&quot;CategoryType\&quot;:1,\&quot;Default\&quot;:false,\&quot;ParentCategoryId\&quot;:1720}</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Service code.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_query_moderation</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Type</p>
     * 
     * <strong>example:</strong>
     * <p>custom_llm_template</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetFeatureConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConfigRequest self = new GetFeatureConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetFeatureConfigRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetFeatureConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetFeatureConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetFeatureConfigRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetFeatureConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
