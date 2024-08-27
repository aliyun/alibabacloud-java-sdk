// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeHistoryApisResponseBody extends TeaModel {
    /**
     * <p>The returned API information. It is an array consisting of ApiHisItems.</p>
     */
    @NameInMap("ApiHisItems")
    public DescribeHistoryApisResponseBodyApiHisItems apiHisItems;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6C87A26A-6A18-4B8E-8099-705278381A2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHistoryApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryApisResponseBody self = new DescribeHistoryApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryApisResponseBody setApiHisItems(DescribeHistoryApisResponseBodyApiHisItems apiHisItems) {
        this.apiHisItems = apiHisItems;
        return this;
    }
    public DescribeHistoryApisResponseBodyApiHisItems getApiHisItems() {
        return this.apiHisItems;
    }

    public DescribeHistoryApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHistoryApisResponseBodyApiHisItemsApiHisItem extends TeaModel {
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5af418828f0344a3b588c0cc1331a3bc</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>v2_role_assign</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The time when the API was published. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-20T08:28:48Z</p>
         */
        @NameInMap("DeployedTime")
        public String deployedTime;

        /**
         * <p>The API description.</p>
         * 
         * <strong>example:</strong>
         * <p>Creates an object</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The API group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1084f9034c744137901057206b39d2b6</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>myGroup2</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The historical version of the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>20210915101416294</p>
         */
        @NameInMap("HistoryVersion")
        public String historyVersion;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The environment alias.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("StageAlias")
        public String stageAlias;

        /**
         * <p>The environment name. Valid values:</p>
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
         * <p>Indicates whether an API version is effective. Valid values: ONLINE and OFFLINE.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeHistoryApisResponseBodyApiHisItemsApiHisItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApisResponseBodyApiHisItemsApiHisItem self = new DescribeHistoryApisResponseBodyApiHisItemsApiHisItem();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setHistoryVersion(String historyVersion) {
            this.historyVersion = historyVersion;
            return this;
        }
        public String getHistoryVersion() {
            return this.historyVersion;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setStageAlias(String stageAlias) {
            this.stageAlias = stageAlias;
            return this;
        }
        public String getStageAlias() {
            return this.stageAlias;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeHistoryApisResponseBodyApiHisItemsApiHisItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHistoryApisResponseBodyApiHisItems extends TeaModel {
        @NameInMap("ApiHisItem")
        public java.util.List<DescribeHistoryApisResponseBodyApiHisItemsApiHisItem> apiHisItem;

        public static DescribeHistoryApisResponseBodyApiHisItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApisResponseBodyApiHisItems self = new DescribeHistoryApisResponseBodyApiHisItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApisResponseBodyApiHisItems setApiHisItem(java.util.List<DescribeHistoryApisResponseBodyApiHisItemsApiHisItem> apiHisItem) {
            this.apiHisItem = apiHisItem;
            return this;
        }
        public java.util.List<DescribeHistoryApisResponseBodyApiHisItemsApiHisItem> getApiHisItem() {
            return this.apiHisItem;
        }

    }

}
