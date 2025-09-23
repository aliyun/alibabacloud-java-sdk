// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListAINodePoolsResponseBody extends TeaModel {
    @NameInMap("AINodePoolInfos")
    public java.util.List<ListAINodePoolsResponseBodyAINodePoolInfos> AINodePoolInfos;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAINodePoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAINodePoolsResponseBody self = new ListAINodePoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAINodePoolsResponseBody setAINodePoolInfos(java.util.List<ListAINodePoolsResponseBodyAINodePoolInfos> AINodePoolInfos) {
        this.AINodePoolInfos = AINodePoolInfos;
        return this;
    }
    public java.util.List<ListAINodePoolsResponseBodyAINodePoolInfos> getAINodePoolInfos() {
        return this.AINodePoolInfos;
    }

    public ListAINodePoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>model_serving</p>
         */
        @NameInMap("BindObject")
        public String bindObject;

        @NameInMap("BindStatus")
        public String bindStatus;

        /**
         * <strong>example:</strong>
         * <p>2024-10-09T02:07:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>adbpg-ainode</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>ai-xxxxxxxxx</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>ADB.AIStandard.1</p>
         */
        @NameInMap("NodeSpec")
        public String nodeSpec;

        /**
         * <strong>example:</strong>
         * <p>2025-06-16T02:04:42Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos self = new ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos();
            return TeaModel.build(map, self);
        }

        public ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos setBindObject(String bindObject) {
            this.bindObject = bindObject;
            return this;
        }
        public String getBindObject() {
            return this.bindObject;
        }

        public ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos setBindStatus(String bindStatus) {
            this.bindStatus = bindStatus;
            return this;
        }
        public String getBindStatus() {
            return this.bindStatus;
        }

        public ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos setNodeSpec(String nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        public ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListAINodePoolsResponseBodyAINodePoolInfos extends TeaModel {
        @NameInMap("AINodeInfos")
        public java.util.List<ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos> AINodeInfos;

        /**
         * <strong>example:</strong>
         * <p>aipool-xxxxxxxxx</p>
         */
        @NameInMap("AINodePoolId")
        public String AINodePoolId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeNum")
        public String nodeNum;

        public static ListAINodePoolsResponseBodyAINodePoolInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAINodePoolsResponseBodyAINodePoolInfos self = new ListAINodePoolsResponseBodyAINodePoolInfos();
            return TeaModel.build(map, self);
        }

        public ListAINodePoolsResponseBodyAINodePoolInfos setAINodeInfos(java.util.List<ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos> AINodeInfos) {
            this.AINodeInfos = AINodeInfos;
            return this;
        }
        public java.util.List<ListAINodePoolsResponseBodyAINodePoolInfosAINodeInfos> getAINodeInfos() {
            return this.AINodeInfos;
        }

        public ListAINodePoolsResponseBodyAINodePoolInfos setAINodePoolId(String AINodePoolId) {
            this.AINodePoolId = AINodePoolId;
            return this;
        }
        public String getAINodePoolId() {
            return this.AINodePoolId;
        }

        public ListAINodePoolsResponseBodyAINodePoolInfos setNodeNum(String nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public String getNodeNum() {
            return this.nodeNum;
        }

    }

}
