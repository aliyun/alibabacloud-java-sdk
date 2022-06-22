// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryNamespaceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryNamespaceListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryNamespaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNamespaceListResponseBody self = new QueryNamespaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNamespaceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryNamespaceListResponseBody setData(java.util.List<QueryNamespaceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryNamespaceListResponseBodyData> getData() {
        return this.data;
    }

    public QueryNamespaceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryNamespaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryNamespaceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryNamespaceListResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("regionId")
        public String regionId;

        public static QueryNamespaceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryNamespaceListResponseBodyData self = new QueryNamespaceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryNamespaceListResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryNamespaceListResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryNamespaceListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryNamespaceListResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryNamespaceListResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
