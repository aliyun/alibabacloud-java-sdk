// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleResponseBody self = new GetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleResponseBody setData(GetRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuleResponseBodyData getData() {
        return this.data;
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

    public static class GetRuleResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyData self = new GetRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetRuleResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRuleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
