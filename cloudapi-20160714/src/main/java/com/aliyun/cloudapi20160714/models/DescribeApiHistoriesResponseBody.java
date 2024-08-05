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
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ003</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
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
         * 
         * <strong>example:</strong>
         * <p>5af418828f0344a3b588c0cc1331a3bc</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateObject</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The publishing time (UTC) of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-20T08:28:48Z</p>
         */
        @NameInMap("DeployedTime")
        public String deployedTime;

        /**
         * <p>The description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Creates an object</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>1084f9034c744137901057206b39d2b6</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>myGroup2</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The historical version of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>20160705104552393</p>
         */
        @NameInMap("HistoryVersion")
        public String historyVersion;

        /**
         * <p>The region in which the API is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the runtime environment. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong></li>
         * <li><strong>TEST</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>Indicates whether an API version is effective. Valid values: <strong>ONLINE</strong> and <strong>OFFLINE</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
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
