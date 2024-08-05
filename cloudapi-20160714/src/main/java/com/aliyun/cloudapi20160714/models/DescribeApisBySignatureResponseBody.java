// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisBySignatureResponseBody extends TeaModel {
    /**
     * <p>The returned API information. It is an array consisting of ApiInfo data.</p>
     */
    @NameInMap("ApiInfos")
    public DescribeApisBySignatureResponseBodyApiInfos apiInfos;

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
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
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

    public static DescribeApisBySignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisBySignatureResponseBody self = new DescribeApisBySignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisBySignatureResponseBody setApiInfos(DescribeApisBySignatureResponseBodyApiInfos apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public DescribeApisBySignatureResponseBodyApiInfos getApiInfos() {
        return this.apiInfos;
    }

    public DescribeApisBySignatureResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisBySignatureResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisBySignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisBySignatureResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisBySignatureResponseBodyApiInfosApiInfo extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>3b81fd160f5645e097cc8855d75a1cf6</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>testapi</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The binding time of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-23T08:28:48Z</p>
         */
        @NameInMap("BoundTime")
        public String boundTime;

        /**
         * <p>The description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>0009db9c828549768a200320714b8930</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>mygroup</p>
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
         * <p>TEST</p>
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

        public static DescribeApisBySignatureResponseBodyApiInfosApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisBySignatureResponseBodyApiInfosApiInfo self = new DescribeApisBySignatureResponseBodyApiInfosApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApisBySignatureResponseBodyApiInfosApiInfo setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribeApisBySignatureResponseBodyApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApisBySignatureResponseBodyApiInfosApiInfo> apiInfo;

        public static DescribeApisBySignatureResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisBySignatureResponseBodyApiInfos self = new DescribeApisBySignatureResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisBySignatureResponseBodyApiInfos setApiInfo(java.util.List<DescribeApisBySignatureResponseBodyApiInfosApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApisBySignatureResponseBodyApiInfosApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
