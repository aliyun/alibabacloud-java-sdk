// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribePurchasedApisResponseBody extends TeaModel {
    @NameInMap("ApiInfos")
    public DescribePurchasedApisResponseBodyApiInfos apiInfos;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePurchasedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApisResponseBody self = new DescribePurchasedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApisResponseBody setApiInfos(DescribePurchasedApisResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribePurchasedApisResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public DescribePurchasedApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePurchasedApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePurchasedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePurchasedApisResponseBodyApiInfosApiInfo extends TeaModel {
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

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Visibility")
        public String visibility;

        public static DescribePurchasedApisResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApisResponseBodyApiInfosApiInfo self = new DescribePurchasedApisResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribePurchasedApisResponseBodyApiInfosApiInfo setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribePurchasedApisResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribePurchasedApisResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribePurchasedApisResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApisResponseBodyApiInfos self = new DescribePurchasedApisResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApisResponseBodyApiInfos setApiInfo(java.util.List<DescribePurchasedApisResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribePurchasedApisResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
