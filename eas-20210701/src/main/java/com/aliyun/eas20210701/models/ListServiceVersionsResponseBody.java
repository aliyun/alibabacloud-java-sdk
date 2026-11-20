// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceVersionsResponseBody extends TeaModel {
    /**
     * <p>The current page number of the returned historical versions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of historical versions returned on each page.</p>
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
     * <p>The total number of versions.</p>
     * 
     * <strong>example:</strong>
     * <p>166</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of versions.</p>
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
         * <p>The UTC time when the version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-29T22:02:14Z</p>
         */
        @NameInMap("BuildTime")
        public String buildTime;

        /**
         * <p>The availability of the image. Valid values:</p>
         * <ul>
         * <li>true: Available.</li>
         * <li>false: Unavailable.</li>
         * <li>unknown: Unknown.</li>
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
         * <p>The summary of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Service is Running</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>new version.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The deployment configuration of the service. This field is returned only for custom image deployments.</p>
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
         * <p>Indicates whether the EAS service is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * <li>unknown: Unknown.</li>
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

        public ListServiceVersionsResponseBodyVersions setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
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
