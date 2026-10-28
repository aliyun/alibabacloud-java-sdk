// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeKernelVersionResponseBody extends TeaModel {
    /**
     * <p>The list of target versions to which the current version can be upgraded.</p>
     */
    @NameInMap("AvailableKernelVersions")
    public java.util.List<DescribeKernelVersionResponseBodyAvailableKernelVersions> availableKernelVersions;

    /**
     * <p>The end-of-support date of the version. The time is in the yyyy-MM-DD HH:mm:ss format. After this date, the system no longer maintains this version. If any issues occur, upgrade to a later version.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T16:00:00Z</p>
     */
    @NameInMap("ExpireDate")
    public String expireDate;

    /**
     * <p>The kernel version number of the cluster. Example: <strong>3.1.8</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3.1.8</p>
     */
    @NameInMap("KernelVersion")
    public String kernelVersion;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The end-of-support date of the version. The time is in the yyyy-MM-DD HH:mm:ss format. After this date, the system no longer maintains this version. If any issues occur, upgrade to a later version.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-17T16:00:00Z</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The kernel version number of the cluster. Example: <strong>3.1.9</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3.1.9</p>
         */
        @NameInMap("KernelVersion")
        public String kernelVersion;

        /**
         * <p>The release time of the kernel version. The time format is yyyy-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-17T16:00:00Z</p>
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
