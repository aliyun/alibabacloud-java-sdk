// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryMallCategoryListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryMallCategoryListResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMallCategoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMallCategoryListResponseBody self = new QueryMallCategoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMallCategoryListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMallCategoryListResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMallCategoryListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMallCategoryListResponseBody setModel(java.util.List<QueryMallCategoryListResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryMallCategoryListResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryMallCategoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMallCategoryListResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMallCategoryListResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMallCategoryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMallCategoryListResponseBodyModel extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Leaf")
        public Boolean leaf;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        public static QueryMallCategoryListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryMallCategoryListResponseBodyModel self = new QueryMallCategoryListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryMallCategoryListResponseBodyModel setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryMallCategoryListResponseBodyModel setLeaf(Boolean leaf) {
            this.leaf = leaf;
            return this;
        }
        public Boolean getLeaf() {
            return this.leaf;
        }

        public QueryMallCategoryListResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMallCategoryListResponseBodyModel setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

}
