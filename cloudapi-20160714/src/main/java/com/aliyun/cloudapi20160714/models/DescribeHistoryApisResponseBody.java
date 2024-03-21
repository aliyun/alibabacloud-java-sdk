// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeHistoryApisResponseBody extends TeaModel {
    @NameInMap("ApiHisItems")
    public DescribeHistoryApisResponseBodyApiHisItems apiHisItems;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("DeployedTime")
        public String deployedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("HistoryVersion")
        public String historyVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StageAlias")
        public String stageAlias;

        @NameInMap("StageName")
        public String stageName;

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
