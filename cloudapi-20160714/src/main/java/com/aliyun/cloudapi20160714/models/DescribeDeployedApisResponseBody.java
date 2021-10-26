// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployedApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("DeployedApis")
    public DescribeDeployedApisResponseBodyDeployedApis deployedApis;

    public static DescribeDeployedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployedApisResponseBody self = new DescribeDeployedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeployedApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeployedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeployedApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeployedApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDeployedApisResponseBody setDeployedApis(DescribeDeployedApisResponseBodyDeployedApis deployedApis) {
        this.deployedApis = deployedApis;
        return this;
    }
    public DescribeDeployedApisResponseBodyDeployedApis getDeployedApis() {
        return this.deployedApis;
    }

    public static class DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem extends TeaModel {
        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("DeployedTime")
        public String deployedTime;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem self = new DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDeployedApisResponseBodyDeployedApis extends TeaModel {
        @NameInMap("DeployedApiItem")
        public java.util.List<DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem> deployedApiItem;

        public static DescribeDeployedApisResponseBodyDeployedApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApisResponseBodyDeployedApis self = new DescribeDeployedApisResponseBodyDeployedApis();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApisResponseBodyDeployedApis setDeployedApiItem(java.util.List<DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem> deployedApiItem) {
            this.deployedApiItem = deployedApiItem;
            return this;
        }
        public java.util.List<DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem> getDeployedApiItem() {
            return this.deployedApiItem;
        }

    }

}
