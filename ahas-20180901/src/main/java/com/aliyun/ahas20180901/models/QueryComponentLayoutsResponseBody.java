// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryComponentLayoutsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryComponentLayoutsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryComponentLayoutsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryComponentLayoutsResponseBody self = new QueryComponentLayoutsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryComponentLayoutsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryComponentLayoutsResponseBody setData(java.util.List<QueryComponentLayoutsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryComponentLayoutsResponseBodyData> getData() {
        return this.data;
    }

    public QueryComponentLayoutsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryComponentLayoutsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryComponentLayoutsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryComponentLayoutsResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("description")
        public String description;

        @NameInMap("hidden")
        public Boolean hidden;

        @NameInMap("layoutOrder")
        public Integer layoutOrder;

        @NameInMap("layoutWidth")
        public Integer layoutWidth;

        @NameInMap("name")
        public String name;

        @NameInMap("required")
        public Boolean required;

        public static QueryComponentLayoutsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryComponentLayoutsResponseBodyData self = new QueryComponentLayoutsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryComponentLayoutsResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryComponentLayoutsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryComponentLayoutsResponseBodyData setHidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }
        public Boolean getHidden() {
            return this.hidden;
        }

        public QueryComponentLayoutsResponseBodyData setLayoutOrder(Integer layoutOrder) {
            this.layoutOrder = layoutOrder;
            return this;
        }
        public Integer getLayoutOrder() {
            return this.layoutOrder;
        }

        public QueryComponentLayoutsResponseBodyData setLayoutWidth(Integer layoutWidth) {
            this.layoutWidth = layoutWidth;
            return this;
        }
        public Integer getLayoutWidth() {
            return this.layoutWidth;
        }

        public QueryComponentLayoutsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryComponentLayoutsResponseBodyData setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

}
