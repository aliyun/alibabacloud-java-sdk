// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTemplateRequest self = new DeleteMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteMetricRuleTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
