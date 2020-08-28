// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateRuleResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateRuleResponseData data;

    public static CreateRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleResponse self = new CreateRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRuleResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRuleResponse setData(CreateRuleResponseData data) {
        this.data = data;
        return this;
    }
    public CreateRuleResponseData getData() {
        return this.data;
    }

    public static class CreateRuleResponseData extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static CreateRuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleResponseData self = new CreateRuleResponseData();
            return TeaModel.build(map, self);
        }

        public CreateRuleResponseData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRuleResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateRuleResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
