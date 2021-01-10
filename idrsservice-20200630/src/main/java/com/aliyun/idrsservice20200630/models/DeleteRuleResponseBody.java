// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static DeleteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleResponseBody self = new DeleteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRuleResponseBody setData(DeleteRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteRuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DeleteRuleResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static DeleteRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteRuleResponseBodyData self = new DeleteRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteRuleResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteRuleResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteRuleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
