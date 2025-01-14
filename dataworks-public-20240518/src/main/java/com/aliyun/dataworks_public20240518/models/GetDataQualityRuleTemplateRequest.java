// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleTemplateRequest extends TeaModel {
    /**
     * <p>The code for the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINED:123</p>
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
