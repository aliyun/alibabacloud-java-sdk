// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Code")
    public String code;

    public static GetDataQualityRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityRuleTemplateRequest self = new GetDataQualityRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityRuleTemplateRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
