// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisResponseBody extends TeaModel {
    /**
     * <p>The queried API definitions.</p>
     */
    @NameInMap("ApiSummarys")
    public DescribeApisResponseBodyApiSummarys apiSummarys;

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
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisResponseBody self = new DescribeApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisResponseBody setApiSummarys(DescribeApisResponseBodyApiSummarys apiSummarys) {
        this.apiSummarys = apiSummarys;
        return this;
    }
    public DescribeApisResponseBodyApiSummarys getApiSummarys() {
        return this.apiSummarys;
    }

    public DescribeApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo extends TeaModel {
        /**
         * <p>The deployment status. Valid values: DEPLOYED and NONDEPLOYED.</p>
         */
        @NameInMap("DeployedStatus")
        public String deployedStatus;

        /**
         * <p>The deployed version.</p>
         */
        @NameInMap("EffectiveVersion")
        public String effectiveVersion;

        /**
         * <p>Stage Name:</p>
         * <br>
         * <p>*   **RELEASE**: production environment</p>
         * <p>*   **PRE**: staging environment</p>
         * <p>*   **TEST**: test environment</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo self = new DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo setDeployedStatus(String deployedStatus) {
            this.deployedStatus = deployedStatus;
            return this;
        }
        public String getDeployedStatus() {
            return this.deployedStatus;
        }

        public DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo setEffectiveVersion(String effectiveVersion) {
            this.effectiveVersion = effectiveVersion;
            return this;
        }
        public String getEffectiveVersion() {
            return this.effectiveVersion;
        }

        public DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfos extends TeaModel {
        @NameInMap("DeployedInfo")
        public java.util.List<DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo> deployedInfo;

        public static DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfos self = new DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfos setDeployedInfo(java.util.List<DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo> deployedInfo) {
            this.deployedInfo = deployedInfo;
            return this;
        }
        public java.util.List<DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfosDeployedInfo> getDeployedInfo() {
            return this.deployedInfo;
        }

    }

    public static class DescribeApisResponseBodyApiSummarysApiSummaryTagListTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeApisResponseBodyApiSummarysApiSummaryTagListTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisResponseBodyApiSummarysApiSummaryTagListTag self = new DescribeApisResponseBodyApiSummarysApiSummaryTagListTag();
            return TeaModel.build(map, self);
        }

        public DescribeApisResponseBodyApiSummarysApiSummaryTagListTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeApisResponseBodyApiSummarysApiSummaryTagListTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeApisResponseBodyApiSummarysApiSummaryTagList extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeApisResponseBodyApiSummarysApiSummaryTagListTag> tag;

        public static DescribeApisResponseBodyApiSummarysApiSummaryTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisResponseBodyApiSummarysApiSummaryTagList self = new DescribeApisResponseBodyApiSummarysApiSummaryTagList();
            return TeaModel.build(map, self);
        }

        public DescribeApisResponseBodyApiSummarysApiSummaryTagList setTag(java.util.List<DescribeApisResponseBodyApiSummarysApiSummaryTagListTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeApisResponseBodyApiSummarysApiSummaryTagListTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeApisResponseBodyApiSummarysApiSummary extends TeaModel {
        /**
         * <p>The API ID.</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The HTTP method of the API request.</p>
         */
        @NameInMap("ApiMethod")
        public String apiMethod;

        /**
         * <p>The API name.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The request path of the API.</p>
         */
        @NameInMap("ApiPath")
        public String apiPath;

        /**
         * <p>The time when the API was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The API publishing statuses.</p>
         */
        @NameInMap("DeployedInfos")
        public DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfos deployedInfos;

        /**
         * <p>The API description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The API group ID.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group to which the API belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the API was modified. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the region to which the API belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The tags that are added to the APIs.</p>
         */
        @NameInMap("TagList")
        public DescribeApisResponseBodyApiSummarysApiSummaryTagList tagList;

        /**
         * <p>Indicates whether the API is public. Valid values:</p>
         * <br>
         * <p>*   **PUBLIC**: The API is public.</p>
         * <p>*   **PRIVATE**: The API is private.</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static DescribeApisResponseBodyApiSummarysApiSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisResponseBodyApiSummarysApiSummary self = new DescribeApisResponseBodyApiSummarysApiSummary();
            return TeaModel.build(map, self);
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setApiMethod(String apiMethod) {
            this.apiMethod = apiMethod;
            return this;
        }
        public String getApiMethod() {
            return this.apiMethod;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setDeployedInfos(DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfos deployedInfos) {
            this.deployedInfos = deployedInfos;
            return this;
        }
        public DescribeApisResponseBodyApiSummarysApiSummaryDeployedInfos getDeployedInfos() {
            return this.deployedInfos;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setTagList(DescribeApisResponseBodyApiSummarysApiSummaryTagList tagList) {
            this.tagList = tagList;
            return this;
        }
        public DescribeApisResponseBodyApiSummarysApiSummaryTagList getTagList() {
            return this.tagList;
        }

        public DescribeApisResponseBodyApiSummarysApiSummary setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribeApisResponseBodyApiSummarys extends TeaModel {
        @NameInMap("ApiSummary")
        public java.util.List<DescribeApisResponseBodyApiSummarysApiSummary> apiSummary;

        public static DescribeApisResponseBodyApiSummarys build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisResponseBodyApiSummarys self = new DescribeApisResponseBodyApiSummarys();
            return TeaModel.build(map, self);
        }

        public DescribeApisResponseBodyApiSummarys setApiSummary(java.util.List<DescribeApisResponseBodyApiSummarysApiSummary> apiSummary) {
            this.apiSummary = apiSummary;
            return this;
        }
        public java.util.List<DescribeApisResponseBodyApiSummarysApiSummary> getApiSummary() {
            return this.apiSummary;
        }

    }

}
