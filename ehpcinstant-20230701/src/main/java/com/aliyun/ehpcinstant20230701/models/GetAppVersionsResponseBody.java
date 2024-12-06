// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetAppVersionsResponseBody extends TeaModel {
    @NameInMap("AppVersions")
    public java.util.List<GetAppVersionsResponseBodyAppVersions> appVersions;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetAppVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppVersionsResponseBody self = new GetAppVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppVersionsResponseBody setAppVersions(java.util.List<GetAppVersionsResponseBodyAppVersions> appVersions) {
        this.appVersions = appVersions;
        return this;
    }
    public java.util.List<GetAppVersionsResponseBodyAppVersions> getAppVersions() {
        return this.appVersions;
    }

    public GetAppVersionsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetAppVersionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetAppVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAppVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetAppVersionsResponseBodyAppVersions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-f8z0dfa96luomqly****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>V-Ray</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>v1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetAppVersionsResponseBodyAppVersions build(java.util.Map<String, ?> map) throws Exception {
            GetAppVersionsResponseBodyAppVersions self = new GetAppVersionsResponseBodyAppVersions();
            return TeaModel.build(map, self);
        }

        public GetAppVersionsResponseBodyAppVersions setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetAppVersionsResponseBodyAppVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppVersionsResponseBodyAppVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
