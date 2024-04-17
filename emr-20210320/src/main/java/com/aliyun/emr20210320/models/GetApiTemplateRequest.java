// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetApiTemplateRequest extends TeaModel {
    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>集群模板id。</p>
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
