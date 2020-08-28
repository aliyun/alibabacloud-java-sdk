// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Resource")
    @Validation(required = true)
    public DeleteMetricRuleTemplateResponseResource resource;

    public static DeleteMetricRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTemplateResponse self = new DeleteMetricRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteMetricRuleTemplateResponseResource extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        public static DeleteMetricRuleTemplateResponseResource build(java.util.Map<String, ?> map) throws Exception {
            DeleteMetricRuleTemplateResponseResource self = new DeleteMetricRuleTemplateResponseResource();
            return TeaModel.build(map, self);
        }

    }

}
