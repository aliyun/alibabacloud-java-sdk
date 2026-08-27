// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListK8sClusterSourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListK8sClusterSourcesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>043360DA-ED3B-5386-9B7A-D94DECF99A30</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListK8sClusterSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8sClusterSourcesResponseBody self = new ListK8sClusterSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListK8sClusterSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListK8sClusterSourcesResponseBody setData(ListK8sClusterSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListK8sClusterSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListK8sClusterSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListK8sClusterSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListK8sClusterSourcesResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c4a21b3560fad4ec***</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>itemcenter-dev-cluster</p>
         */
        @NameInMap("name")
        public String name;

        public static ListK8sClusterSourcesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListK8sClusterSourcesResponseBodyDataItems self = new ListK8sClusterSourcesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListK8sClusterSourcesResponseBodyDataItems setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListK8sClusterSourcesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListK8sClusterSourcesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListK8sClusterSourcesResponseBodyDataItems> items;

        public static ListK8sClusterSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListK8sClusterSourcesResponseBodyData self = new ListK8sClusterSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListK8sClusterSourcesResponseBodyData setItems(java.util.List<ListK8sClusterSourcesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListK8sClusterSourcesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
