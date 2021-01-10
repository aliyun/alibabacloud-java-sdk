// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static UpdateRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleResponseBody self = new UpdateRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRuleResponseBody setData(UpdateRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class UpdateRuleResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static UpdateRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleResponseBodyData self = new UpdateRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRuleResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRuleResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateRuleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
