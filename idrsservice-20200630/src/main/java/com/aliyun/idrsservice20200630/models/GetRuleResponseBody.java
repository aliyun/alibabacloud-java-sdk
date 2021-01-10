// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleResponseBody self = new GetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleResponseBody setData(GetRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuleResponseBodyData getData() {
        return this.data;
    }

    public GetRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetRuleResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static GetRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyData self = new GetRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRuleResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetRuleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
