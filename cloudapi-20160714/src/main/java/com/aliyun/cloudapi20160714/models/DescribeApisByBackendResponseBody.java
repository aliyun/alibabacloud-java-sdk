// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByBackendResponseBody extends TeaModel {
    /**
     * <p>The information about the returned API list.</p>
     */
    @NameInMap("ApiInfoList")
    public DescribeApisByBackendResponseBodyApiInfoList apiInfoList;

    /**
     * <p>The number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
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
     * <p>CEB6EC62-B6C7-5082-A45A-45A204724AC2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisByBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByBackendResponseBody self = new DescribeApisByBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisByBackendResponseBody setApiInfoList(DescribeApisByBackendResponseBodyApiInfoList apiInfoList) {
        this.apiInfoList = apiInfoList;
        return this;
    }
    public DescribeApisByBackendResponseBodyApiInfoList getApiInfoList() {
        return this.apiInfoList;
    }

    public DescribeApisByBackendResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByBackendResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisByBackendResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisByBackendResponseBodyApiInfoListApiInfo extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>20bcdc9453524b78a8beb1f6de21edb7</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>testApi</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>15bcdc9453524b7gs8beb1f6de21edb7</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>testApiGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The request method of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        public static DescribeApisByBackendResponseBodyApiInfoListApiInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByBackendResponseBodyApiInfoListApiInfo self = new DescribeApisByBackendResponseBodyApiInfoListApiInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisByBackendResponseBodyApiInfoListApiInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisByBackendResponseBodyApiInfoListApiInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisByBackendResponseBodyApiInfoListApiInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisByBackendResponseBodyApiInfoListApiInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisByBackendResponseBodyApiInfoListApiInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisByBackendResponseBodyApiInfoListApiInfo setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApisByBackendResponseBodyApiInfoListApiInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeApisByBackendResponseBodyApiInfoList extends TeaModel {
        @NameInMap("ApiInfo")
        public java.util.List<DescribeApisByBackendResponseBodyApiInfoListApiInfo> apiInfo;

        public static DescribeApisByBackendResponseBodyApiInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByBackendResponseBodyApiInfoList self = new DescribeApisByBackendResponseBodyApiInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeApisByBackendResponseBodyApiInfoList setApiInfo(java.util.List<DescribeApisByBackendResponseBodyApiInfoListApiInfo> apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public java.util.List<DescribeApisByBackendResponseBodyApiInfoListApiInfo> getApiInfo() {
            return this.apiInfo;
        }

    }

}
