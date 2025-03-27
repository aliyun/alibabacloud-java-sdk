// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The resource nodes.</p>
     */
    @NameInMap("NodeModels")
    public java.util.List<ListNodesResponseBodyNodeModels> nodeModels;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PerPageSize")
    public Integer perPageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ToPage")
    public Integer toPage;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListNodesResponseBody setNodeModels(java.util.List<ListNodesResponseBodyNodeModels> nodeModels) {
        this.nodeModels = nodeModels;
        return this;
    }
    public java.util.List<ListNodesResponseBodyNodeModels> getNodeModels() {
        return this.nodeModels;
    }

    public ListNodesResponseBody setPerPageSize(Integer perPageSize) {
        this.perPageSize = perPageSize;
        return this;
    }
    public Integer getPerPageSize() {
        return this.perPageSize;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setToPage(Integer toPage) {
        this.toPage = toPage;
        return this;
    }
    public Integer getToPage() {
        return this.toPage;
    }

    public static class ListNodesResponseBodyNodeModels extends TeaModel {
        /**
         * <p>The billing method of the resource node.</p>
         * <blockquote>
         * <p> This parameter is returned only if the ChargeResourceMode parameter of the delivery group to which the resource node belongs is set to Node.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>Prepaid: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The ID of the resource node.</p>
         * <blockquote>
         * <p> This parameter is returned only if the ChargeResourceMode parameter of the delivery group to which the resource node belongs is set to Node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-bp13********</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static ListNodesResponseBodyNodeModels build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodeModels self = new ListNodesResponseBodyNodeModels();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodeModels setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListNodesResponseBodyNodeModels setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
