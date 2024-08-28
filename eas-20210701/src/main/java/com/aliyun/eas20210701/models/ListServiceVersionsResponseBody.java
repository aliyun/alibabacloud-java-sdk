// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceVersionsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E089D584-B6F4-50C4-9902-DA2295B7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>166</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The historical versions of the service.</p>
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
         * 
         * <strong>example:</strong>
         * <p>2022-08-29T22:02:14Z</p>
         */
        @NameInMap("BuildTime")
        public String buildTime;

        /**
         * <p>Indicates whether the image is available. Valid values:</p>
         * <ul>
         * <li>true: The image is available.</li>
         * <li>false: The image is unavailable.</li>
         * <li>unknown: The availability of the image is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ImageAvailable")
        public String imageAvailable;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ImageId")
        public Integer imageId;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Service is Running</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The service deployment configurations. This parameter is returned only if the service is deployed by using a custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;metadata&quot;: {
         *         &quot;cpu&quot;: 1,
         *         &quot;instance&quot;: 1,
         *         &quot;memory&quot;: 1024
         *     },
         *     &quot;name&quot;: &quot;echo&quot;
         * }</p>
         */
        @NameInMap("ServiceConfig")
        public String serviceConfig;

        /**
         * <p>Indicates whether Elastic Algorithm service (EAS) is activated. Valid values:</p>
         * <ul>
         * <li>true: EAS is activated.</li>
         * <li>false: EAS is not activated.</li>
         * <li>unknown: The activation of EAS is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
