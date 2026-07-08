// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWarehouseResponseBody extends TeaModel {
    /**
     * <p>A list of warehouse objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListWarehouseResponseBodyData> data;

    /**
     * <p>The maximum number of entries returned on each page. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If this parameter is not returned, all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the result set.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWarehouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseResponseBody self = new ListWarehouseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWarehouseResponseBody setData(java.util.List<ListWarehouseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWarehouseResponseBodyData> getData() {
        return this.data;
    }

    public ListWarehouseResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWarehouseResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWarehouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWarehouseResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWarehouseResponseBodyData extends TeaModel {
        /**
         * <p>The warehouse instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-wh-Q7ID6V</p>
         */
        @NameInMap("WarehouseInstanceId")
        public String warehouseInstanceId;

        /**
         * <p>The warehouse name.</p>
         * 
         * <strong>example:</strong>
         * <p>default_warehouse</p>
         */
        @NameInMap("WarehouseName")
        public String warehouseName;

        /**
         * <p>The warehouse type.</p>
         * 
         * <strong>example:</strong>
         * <p>pcaCaCert</p>
         */
        @NameInMap("WarehouseType")
        public String warehouseType;

        public static ListWarehouseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWarehouseResponseBodyData self = new ListWarehouseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWarehouseResponseBodyData setWarehouseInstanceId(String warehouseInstanceId) {
            this.warehouseInstanceId = warehouseInstanceId;
            return this;
        }
        public String getWarehouseInstanceId() {
            return this.warehouseInstanceId;
        }

        public ListWarehouseResponseBodyData setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
            return this;
        }
        public String getWarehouseName() {
            return this.warehouseName;
        }

        public ListWarehouseResponseBodyData setWarehouseType(String warehouseType) {
            this.warehouseType = warehouseType;
            return this;
        }
        public String getWarehouseType() {
            return this.warehouseType;
        }

    }

}
