// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class GetWhitelistTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>98a6d3db05984dca</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetWhitelistTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWhitelistTemplateRequest self = new GetWhitelistTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetWhitelistTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetWhitelistTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
