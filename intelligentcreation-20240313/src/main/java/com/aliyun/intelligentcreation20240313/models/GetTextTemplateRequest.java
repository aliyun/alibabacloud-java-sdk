// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetTextTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Car</p>
     */
    @NameInMap("industry")
    public String industry;

    public static GetTextTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTextTemplateRequest self = new GetTextTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTextTemplateRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

}
