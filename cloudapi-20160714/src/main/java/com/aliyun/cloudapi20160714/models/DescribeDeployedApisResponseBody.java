// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployedApisResponseBody extends TeaModel {
    /**
     * <p>The returned API information. It is an array consisting of DeployedApiItem data.</p>
     */
    @NameInMap("DeployedApis")
    public DescribeDeployedApisResponseBodyDeployedApis deployedApis;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
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
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ002</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDeployedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployedApisResponseBody self = new DescribeDeployedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeployedApisResponseBody setDeployedApis(DescribeDeployedApisResponseBodyDeployedApis deployedApis) {
        this.deployedApis = deployedApis;
        return this;
    }
    public DescribeDeployedApisResponseBodyDeployedApis getDeployedApis() {
        return this.deployedApis;
    }

    public DescribeDeployedApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeployedApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeployedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeployedApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>c076144d7878437b8f82fb85890ce6a0</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The HTTP method of the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("ApiMethod")
        public String apiMethod;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribeObjects</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/trademark/search</p>
         */
        @NameInMap("ApiPath")
        public String apiPath;

        /**
         * <p>The publising time (UTC) of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-23T08:28:48Z</p>
         */
        @NameInMap("DeployedTime")
        public String deployedTime;

        /**
         * <p>The description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Queries objects by pages</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>63be9002440b4778a61122f14c2b2bbb</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>myGroup3</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The region where the API is located.</p>
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
         * <p>Indicates whether the API is public. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong></li>
         * <li><strong>PRIVATE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem self = new DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiMethod(String apiMethod) {
            this.apiMethod = apiMethod;
            return this;
        }
        public String getApiMethod() {
            return this.apiMethod;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
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
