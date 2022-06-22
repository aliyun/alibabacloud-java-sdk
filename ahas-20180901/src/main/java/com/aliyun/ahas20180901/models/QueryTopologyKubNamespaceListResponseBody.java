// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubNamespaceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryTopologyKubNamespaceListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyKubNamespaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubNamespaceListResponseBody self = new QueryTopologyKubNamespaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubNamespaceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyKubNamespaceListResponseBody setData(java.util.List<QueryTopologyKubNamespaceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTopologyKubNamespaceListResponseBodyData> getData() {
        return this.data;
    }

    public QueryTopologyKubNamespaceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyKubNamespaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyKubNamespaceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster self = new QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryTopologyKubNamespaceListResponseBodyData extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("kubNamespaces")
        public java.util.List<String> kubNamespaces;

        @NameInMap("name")
        public String name;

        @NameInMap("topologyCluster")
        public QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster topologyCluster;

        public static QueryTopologyKubNamespaceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubNamespaceListResponseBodyData self = new QueryTopologyKubNamespaceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubNamespaceListResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubNamespaceListResponseBodyData setKubNamespaces(java.util.List<String> kubNamespaces) {
            this.kubNamespaces = kubNamespaces;
            return this;
        }
        public java.util.List<String> getKubNamespaces() {
            return this.kubNamespaces;
        }

        public QueryTopologyKubNamespaceListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyKubNamespaceListResponseBodyData setTopologyCluster(QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster topologyCluster) {
            this.topologyCluster = topologyCluster;
            return this;
        }
        public QueryTopologyKubNamespaceListResponseBodyDataTopologyCluster getTopologyCluster() {
            return this.topologyCluster;
        }

    }

}
