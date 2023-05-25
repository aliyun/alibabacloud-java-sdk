// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PurchasedApis")
    public DescribePurchasedApisResponseBodyPurchasedApis purchasedApis;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePurchasedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApisResponseBody self = new DescribePurchasedApisResponseBody();
        return TeaModel.build(map, self);
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

    public DescribePurchasedApisResponseBody setPurchasedApis(DescribePurchasedApisResponseBodyPurchasedApis purchasedApis) {
        this.purchasedApis = purchasedApis;
        return this;
    }
    public DescribePurchasedApisResponseBodyPurchasedApis getPurchasedApis() {
        return this.purchasedApis;
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

    public static class DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi extends TeaModel {
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

        @NameInMap("PurchasedTime")
        public String purchasedTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Visibility")
        public String visibility;

        public static DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi self = new DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setPurchasedTime(String purchasedTime) {
            this.purchasedTime = purchasedTime;
            return this;
        }
        public String getPurchasedTime() {
            return this.purchasedTime;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribePurchasedApisResponseBodyPurchasedApis extends TeaModel {
        @NameInMap("PurchasedApi")
        public java.util.List<DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi> purchasedApi;

        public static DescribePurchasedApisResponseBodyPurchasedApis build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApisResponseBodyPurchasedApis self = new DescribePurchasedApisResponseBodyPurchasedApis();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApisResponseBodyPurchasedApis setPurchasedApi(java.util.List<DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi> purchasedApi) {
            this.purchasedApi = purchasedApi;
            return this;
        }
        public java.util.List<DescribePurchasedApisResponseBodyPurchasedApisPurchasedApi> getPurchasedApi() {
            return this.purchasedApi;
        }

    }

}
