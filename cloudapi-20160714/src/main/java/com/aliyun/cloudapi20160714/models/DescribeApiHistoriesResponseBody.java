// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiHistoriesResponseBody extends TeaModel {
    /**
     * <p>The returned API information. It is an array consisting of ApiHisItem data.</p>
     */
    @NameInMap("ApiHisItems")
    public DescribeApiHistoriesResponseBodyApiHisItems apiHisItems;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiHistoriesResponseBody self = new DescribeApiHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiHistoriesResponseBody setApiHisItems(DescribeApiHistoriesResponseBodyApiHisItems apiHisItems) {
        this.apiHisItems = apiHisItems;
        return this;
    }
    public DescribeApiHistoriesResponseBodyApiHisItems getApiHisItems() {
        return this.apiHisItems;
    }

    public DescribeApiHistoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiHistoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The name of the API.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The publishing time (UTC) of the API.</p>
         */
        @NameInMap("DeployedTime")
        public String deployedTime;

        /**
         * <p>The description of the API.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The historical version of the API.</p>
         */
        @NameInMap("HistoryVersion")
        public String historyVersion;

        /**
         * <p>The region in which the API is located.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the runtime environment. Valid values:</p>
         * <br>
         * <p>*   **RELEASE**</p>
         * <p>*   **TEST**</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>Indicates whether an API version is effective. Valid values: **ONLINE** and **OFFLINE**.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem self = new DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setHistoryVersion(String historyVersion) {
            this.historyVersion = historyVersion;
            return this;
        }
        public String getHistoryVersion() {
            return this.historyVersion;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeApiHistoriesResponseBodyApiHisItems extends TeaModel {
        @NameInMap("ApiHisItem")
        public java.util.List<DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem> apiHisItem;

        public static DescribeApiHistoriesResponseBodyApiHisItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoriesResponseBodyApiHisItems self = new DescribeApiHistoriesResponseBodyApiHisItems();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoriesResponseBodyApiHisItems setApiHisItem(java.util.List<DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem> apiHisItem) {
            this.apiHisItem = apiHisItem;
            return this;
        }
        public java.util.List<DescribeApiHistoriesResponseBodyApiHisItemsApiHisItem> getApiHisItem() {
            return this.apiHisItem;
        }

    }

}
