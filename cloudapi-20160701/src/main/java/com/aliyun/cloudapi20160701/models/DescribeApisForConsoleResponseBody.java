// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApisForConsoleResponseBody extends TeaModel {
    @NameInMap("ApiInfos")
    public DescribeApisForConsoleResponseBodyApiInfos apiInfos;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisForConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisForConsoleResponseBody self = new DescribeApisForConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisForConsoleResponseBody setApiInfos(DescribeApisForConsoleResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApisForConsoleResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public DescribeApisForConsoleResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisForConsoleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisForConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisForConsoleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo extends TeaModel {
        @NameInMap("DeployedStatus")
        public String deployedStatus;

        @NameInMap("EffectiveVersion")
        public String effectiveVersion;

        @NameInMap("StageName")
        public String stageName;

        public static DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo self = new DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo setDeployedStatus(String deployedStatus) {
            this.deployedStatus = deployedStatus;
            return this;
        }
        public String getDeployedStatus() {
            return this.deployedStatus;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo setEffectiveVersion(String effectiveVersion) {
            this.effectiveVersion = effectiveVersion;
            return this;
        }
        public String getEffectiveVersion() {
            return this.effectiveVersion;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfos extends TeaModel {
        @NameInMap("DeployedInfo")
        public java.util.List<DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo> deployedInfo;

        public static DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfos self = new DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfos setDeployedInfo(java.util.List<DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo> deployedInfo) {
            this.deployedInfo = deployedInfo;
            return this;
        }
        public java.util.List<DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfosDeployedInfo> getDeployedInfo() {
            return this.deployedInfo;
        }

    }

    public static class DescribeApisForConsoleResponseBodyApiInfosApiInfo extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DeployedInfos")
        public DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfos deployedInfos;

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

        @NameInMap("Visibility")
        public String visibility;

        public static DescribeApisForConsoleResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisForConsoleResponseBodyApiInfosApiInfo self = new DescribeApisForConsoleResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setDeployedInfos(DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfos deployedInfos) {
            this.deployedInfos = deployedInfos;
            return this;
        }
        public DescribeApisForConsoleResponseBodyApiInfosApiInfoDeployedInfos getDeployedInfos() {
            return this.deployedInfos;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisForConsoleResponseBodyApiInfosApiInfo setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribeApisForConsoleResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApisForConsoleResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribeApisForConsoleResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisForConsoleResponseBodyApiInfos self = new DescribeApisForConsoleResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisForConsoleResponseBodyApiInfos setApiInfo(java.util.List<DescribeApisForConsoleResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApisForConsoleResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
