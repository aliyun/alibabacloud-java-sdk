// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdGrantRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public CreateVpdGrantRuleResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVpdGrantRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdGrantRuleResponseBody self = new CreateVpdGrantRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpdGrantRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVpdGrantRuleResponseBody setContent(CreateVpdGrantRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVpdGrantRuleResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVpdGrantRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVpdGrantRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVpdGrantRuleResponseBodyContent extends TeaModel {
        @NameInMap("GrantRuleId")
        public String grantRuleId;

        public static CreateVpdGrantRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVpdGrantRuleResponseBodyContent self = new CreateVpdGrantRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVpdGrantRuleResponseBodyContent setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

    }

}
