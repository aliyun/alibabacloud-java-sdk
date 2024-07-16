// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListDataPackagesResponseBody extends TeaModel {
    @NameInMap("DataPackages")
    public java.util.List<ListDataPackagesResponseBodyDataPackages> dataPackages;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>iou001238joojjaere</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>8734B5B2-FC84-54C4-8038-D40228CF01FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListDataPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataPackagesResponseBody self = new ListDataPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataPackagesResponseBody setDataPackages(java.util.List<ListDataPackagesResponseBodyDataPackages> dataPackages) {
        this.dataPackages = dataPackages;
        return this;
    }
    public java.util.List<ListDataPackagesResponseBodyDataPackages> getDataPackages() {
        return this.dataPackages;
    }

    public ListDataPackagesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListDataPackagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataPackagesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataPackagesResponseBodyDataPackages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("CardCount")
        public String cardCount;

        /**
         * <strong>example:</strong>
         * <p>2022-3-15 22:20:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>dp-xxxx</p>
         */
        @NameInMap("DataPackageId")
        public String dataPackageId;

        /**
         * <strong>example:</strong>
         * <p>2099-3-15 22:20:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>Telecom</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>代表创建时间的资源属性字段</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDataPackagesResponseBodyDataPackages build(java.util.Map<String, ?> map) throws Exception {
            ListDataPackagesResponseBodyDataPackages self = new ListDataPackagesResponseBodyDataPackages();
            return TeaModel.build(map, self);
        }

        public ListDataPackagesResponseBodyDataPackages setCardCount(String cardCount) {
            this.cardCount = cardCount;
            return this;
        }
        public String getCardCount() {
            return this.cardCount;
        }

        public ListDataPackagesResponseBodyDataPackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataPackagesResponseBodyDataPackages setDataPackageId(String dataPackageId) {
            this.dataPackageId = dataPackageId;
            return this;
        }
        public String getDataPackageId() {
            return this.dataPackageId;
        }

        public ListDataPackagesResponseBodyDataPackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListDataPackagesResponseBodyDataPackages setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public ListDataPackagesResponseBodyDataPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataPackagesResponseBodyDataPackages setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListDataPackagesResponseBodyDataPackages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
