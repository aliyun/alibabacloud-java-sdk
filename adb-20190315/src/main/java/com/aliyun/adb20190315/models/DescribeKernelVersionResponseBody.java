// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeKernelVersionResponseBody extends TeaModel {
    /**
     * <p>The minor versions to which you can update the current minor version of the cluster.</p>
     */
    @NameInMap("AvailableKernelVersions")
    public java.util.List<DescribeKernelVersionResponseBodyAvailableKernelVersions> availableKernelVersions;

    /**
     * <p>The maintenance expiration time of the version. The time follows the ISO 8601 standard in the yyyy-MM-DD HH:mm:ss format. The time is displayed in UTC. After the time arrives, the system no longer maintains the version. If any issues occur, update the minor version of the cluster to a later version.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-01T10:36:30Z</p>
     */
    @NameInMap("ExpireDate")
    public String expireDate;

    /**
     * <p>The minor version of the cluster. Example: <strong>3.1.8</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3.1.8</p>
     */
    @NameInMap("KernelVersion")
    public String kernelVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKernelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKernelVersionResponseBody self = new DescribeKernelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKernelVersionResponseBody setAvailableKernelVersions(java.util.List<DescribeKernelVersionResponseBodyAvailableKernelVersions> availableKernelVersions) {
        this.availableKernelVersions = availableKernelVersions;
        return this;
    }
    public java.util.List<DescribeKernelVersionResponseBodyAvailableKernelVersions> getAvailableKernelVersions() {
        return this.availableKernelVersions;
    }

    public DescribeKernelVersionResponseBody setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public DescribeKernelVersionResponseBody setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public DescribeKernelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKernelVersionResponseBodyAvailableKernelVersions extends TeaModel {
        /**
         * <p>The maintenance expiration time of the version. The time follows the ISO 8601 standard in the yyyy-MM-DD HH:mm:ss format. The time is displayed in UTC. After the time arrives, the system no longer maintains the version. If any issues occur, update the minor version of the cluster to a later version.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-01T10:36:30Z</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The minor version. Example: <strong>3.1.9</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3.1.9</p>
         */
        @NameInMap("KernelVersion")
        public String kernelVersion;

        /**
         * <p>The time when the minor version was released. The time follows the ISO 8601 standard in the yyyy-MM-DD HH:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-01T10:36:30Z</p>
         */
        @NameInMap("ReleaseDate")
        public String releaseDate;

        public static DescribeKernelVersionResponseBodyAvailableKernelVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeKernelVersionResponseBodyAvailableKernelVersions self = new DescribeKernelVersionResponseBodyAvailableKernelVersions();
            return TeaModel.build(map, self);
        }

        public DescribeKernelVersionResponseBodyAvailableKernelVersions setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public DescribeKernelVersionResponseBodyAvailableKernelVersions setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public DescribeKernelVersionResponseBodyAvailableKernelVersions setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

    }

}
