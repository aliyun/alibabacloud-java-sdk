// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailTopoResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetAiAppDetailTopoResponseBodyData> data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAiAppDetailTopoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailTopoResponseBody self = new GetAiAppDetailTopoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailTopoResponseBody setData(java.util.List<GetAiAppDetailTopoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAiAppDetailTopoResponseBodyData> getData() {
        return this.data;
    }

    public GetAiAppDetailTopoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAiAppDetailTopoResponseBodyData extends TeaModel {
        /**
         * <p>The node category.</p>
         * <ul>
         * <li><p>LLM</p>
         * </li>
         * <li><p>Knowledge</p>
         * </li>
         * <li><p>Tools</p>
         * </li>
         * <li><p>Others</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        @NameInMap("NodeCategory")
        public String nodeCategory;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>idxxx</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>namexxx</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>APP</strong>: end-to-end agent.</li>
         * <li><strong>MODEL</strong>: large language model.</li>
         * <li><strong>TOOL</strong>: tool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TOOL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The request count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RequestCount")
        public Long requestCount;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WarningCount")
        public Integer warningCount;

        public static GetAiAppDetailTopoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppDetailTopoResponseBodyData self = new GetAiAppDetailTopoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiAppDetailTopoResponseBodyData setNodeCategory(String nodeCategory) {
            this.nodeCategory = nodeCategory;
            return this;
        }
        public String getNodeCategory() {
            return this.nodeCategory;
        }

        public GetAiAppDetailTopoResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetAiAppDetailTopoResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetAiAppDetailTopoResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetAiAppDetailTopoResponseBodyData setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public GetAiAppDetailTopoResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetAiAppDetailTopoResponseBodyData setWarningCount(Integer warningCount) {
            this.warningCount = warningCount;
            return this;
        }
        public Integer getWarningCount() {
            return this.warningCount;
        }

    }

}
