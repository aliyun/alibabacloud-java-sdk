// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataQualityRuleTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityRuleTemplateResponseBody self = new CreateDataQualityRuleTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityRuleTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDataQualityRuleTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
