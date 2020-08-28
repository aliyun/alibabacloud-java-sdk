// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteRuleResponse extends TeaModel {
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
    public DeleteRuleResponseData data;

    public static DeleteRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleResponse self = new DeleteRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteRuleResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRuleResponse setData(DeleteRuleResponseData data) {
        this.data = data;
        return this;
    }
    public DeleteRuleResponseData getData() {
        return this.data;
    }

    public static class DeleteRuleResponseData extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DeleteRuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            DeleteRuleResponseData self = new DeleteRuleResponseData();
            return TeaModel.build(map, self);
        }

        public DeleteRuleResponseData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteRuleResponseData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteRuleResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteRuleResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
