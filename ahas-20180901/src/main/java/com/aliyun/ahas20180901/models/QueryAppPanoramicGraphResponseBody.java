// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppPanoramicGraphResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAppPanoramicGraphResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAppPanoramicGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppPanoramicGraphResponseBody self = new QueryAppPanoramicGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppPanoramicGraphResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppPanoramicGraphResponseBody setData(QueryAppPanoramicGraphResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAppPanoramicGraphResponseBodyData getData() {
        return this.data;
    }

    public QueryAppPanoramicGraphResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppPanoramicGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppPanoramicGraphResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAppPanoramicGraphResponseBodyDataEdges extends TeaModel {
        @NameInMap("source")
        public String source;

        @NameInMap("target")
        public String target;

        public static QueryAppPanoramicGraphResponseBodyDataEdges build(java.util.Map<String, ?> map) throws Exception {
            QueryAppPanoramicGraphResponseBodyDataEdges self = new QueryAppPanoramicGraphResponseBodyDataEdges();
            return TeaModel.build(map, self);
        }

        public QueryAppPanoramicGraphResponseBodyDataEdges setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryAppPanoramicGraphResponseBodyDataEdges setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryAppPanoramicGraphResponseBodyDataNodes extends TeaModel {
        @NameInMap("comboId")
        public String comboId;

        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("deviceName")
        public String deviceName;

        @NameInMap("icon")
        public String icon;

        @NameInMap("id")
        public String id;

        public static QueryAppPanoramicGraphResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            QueryAppPanoramicGraphResponseBodyDataNodes self = new QueryAppPanoramicGraphResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public QueryAppPanoramicGraphResponseBodyDataNodes setComboId(String comboId) {
            this.comboId = comboId;
            return this;
        }
        public String getComboId() {
            return this.comboId;
        }

        public QueryAppPanoramicGraphResponseBodyDataNodes setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryAppPanoramicGraphResponseBodyDataNodes setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryAppPanoramicGraphResponseBodyDataNodes setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryAppPanoramicGraphResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryAppPanoramicGraphResponseBodyDataTypes extends TeaModel {
        @NameInMap("extInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("nodeCount")
        public Integer nodeCount;

        @NameInMap("sort")
        public Integer sort;

        @NameInMap("type")
        public String type;

        public static QueryAppPanoramicGraphResponseBodyDataTypes build(java.util.Map<String, ?> map) throws Exception {
            QueryAppPanoramicGraphResponseBodyDataTypes self = new QueryAppPanoramicGraphResponseBodyDataTypes();
            return TeaModel.build(map, self);
        }

        public QueryAppPanoramicGraphResponseBodyDataTypes setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryAppPanoramicGraphResponseBodyDataTypes setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public QueryAppPanoramicGraphResponseBodyDataTypes setSort(Integer sort) {
            this.sort = sort;
            return this;
        }
        public Integer getSort() {
            return this.sort;
        }

        public QueryAppPanoramicGraphResponseBodyDataTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryAppPanoramicGraphResponseBodyData extends TeaModel {
        @NameInMap("edges")
        public java.util.List<QueryAppPanoramicGraphResponseBodyDataEdges> edges;

        @NameInMap("nodes")
        public java.util.List<QueryAppPanoramicGraphResponseBodyDataNodes> nodes;

        @NameInMap("types")
        public java.util.List<QueryAppPanoramicGraphResponseBodyDataTypes> types;

        public static QueryAppPanoramicGraphResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppPanoramicGraphResponseBodyData self = new QueryAppPanoramicGraphResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppPanoramicGraphResponseBodyData setEdges(java.util.List<QueryAppPanoramicGraphResponseBodyDataEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<QueryAppPanoramicGraphResponseBodyDataEdges> getEdges() {
            return this.edges;
        }

        public QueryAppPanoramicGraphResponseBodyData setNodes(java.util.List<QueryAppPanoramicGraphResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<QueryAppPanoramicGraphResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public QueryAppPanoramicGraphResponseBodyData setTypes(java.util.List<QueryAppPanoramicGraphResponseBodyDataTypes> types) {
            this.types = types;
            return this;
        }
        public java.util.List<QueryAppPanoramicGraphResponseBodyDataTypes> getTypes() {
            return this.types;
        }

    }

}
