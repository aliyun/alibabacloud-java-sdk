// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceVersionsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The versions of the service.</p>
     */
    @NameInMap("Versions")
    public java.util.List<ListServiceVersionsResponseBodyVersions> versions;

    public static ListServiceVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceVersionsResponseBody self = new ListServiceVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServiceVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListServiceVersionsResponseBody setVersions(java.util.List<ListServiceVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListServiceVersionsResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListServiceVersionsResponseBodyVersions extends TeaModel {
        /**
         * <p>The time when the service version was created. The time is displayed in UTC.</p>
         */
        @NameInMap("BuildTime")
        public String buildTime;

        /**
         * <p>Indicates whether the image is available. Valid values:</p>
         * <br>
         * <p>*   true: The image is available.</p>
         * <p>*   false: The image is unavailable.</p>
         * <p>*   unknown: The availability of the image is unknown.</p>
         */
        @NameInMap("ImageAvailable")
        public String imageAvailable;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public Integer imageId;

        /**
         * <p>The returned message.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The service deployment configurations. This parameter is returned only if the service is deployed by using a custom image.</p>
         */
        @NameInMap("ServiceConfig")
        public String serviceConfig;

        /**
         * <p>Indicates whether EAS is enabled. Valid values:</p>
         * <br>
         * <p>*   true: EAS is enabled.</p>
         * <p>*   false: EAS is not enabled.</p>
         * <p>*   unknown: The enabling status of EAS is unknown.</p>
         */
        @NameInMap("ServiceRunnable")
        public String serviceRunnable;

        public static ListServiceVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListServiceVersionsResponseBodyVersions self = new ListServiceVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListServiceVersionsResponseBodyVersions setBuildTime(String buildTime) {
            this.buildTime = buildTime;
            return this;
        }
        public String getBuildTime() {
            return this.buildTime;
        }

        public ListServiceVersionsResponseBodyVersions setImageAvailable(String imageAvailable) {
            this.imageAvailable = imageAvailable;
            return this;
        }
        public String getImageAvailable() {
            return this.imageAvailable;
        }

        public ListServiceVersionsResponseBodyVersions setImageId(Integer imageId) {
            this.imageId = imageId;
            return this;
        }
        public Integer getImageId() {
            return this.imageId;
        }

        public ListServiceVersionsResponseBodyVersions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListServiceVersionsResponseBodyVersions setServiceConfig(String serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }
        public String getServiceConfig() {
            return this.serviceConfig;
        }

        public ListServiceVersionsResponseBodyVersions setServiceRunnable(String serviceRunnable) {
            this.serviceRunnable = serviceRunnable;
            return this;
        }
        public String getServiceRunnable() {
            return this.serviceRunnable;
        }

    }

}
