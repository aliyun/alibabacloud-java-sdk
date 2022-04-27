// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListDataPackagesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("DataPackages")
    public java.util.List<ListDataPackagesResponseBodyDataPackages> dataPackages;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CardCount")
        public String cardCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataPackageId")
        public String dataPackageId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ISP")
        public String ISP;

        // 创建时间
        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public String size;

        // 资源名称
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
