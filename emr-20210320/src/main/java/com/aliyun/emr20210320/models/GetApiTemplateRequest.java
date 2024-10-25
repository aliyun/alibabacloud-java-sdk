// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetApiTemplateRequest extends TeaModel {
    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Cluster template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-41b4c6a0fc63****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetApiTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiTemplateRequest self = new GetApiTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetApiTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetApiTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
