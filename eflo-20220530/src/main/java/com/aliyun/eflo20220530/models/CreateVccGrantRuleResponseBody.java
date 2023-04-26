// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccGrantRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public CreateVccGrantRuleResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVccGrantRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVccGrantRuleResponseBody self = new CreateVccGrantRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVccGrantRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVccGrantRuleResponseBody setContent(CreateVccGrantRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVccGrantRuleResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVccGrantRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVccGrantRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVccGrantRuleResponseBodyContent extends TeaModel {
        @NameInMap("GrantRuleId")
        public String grantRuleId;

        public static CreateVccGrantRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVccGrantRuleResponseBodyContent self = new CreateVccGrantRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVccGrantRuleResponseBodyContent setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

    }

}
