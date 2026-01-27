// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetCloudDriveServiceMountTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC27288A-F9E1-5092-9B5B-71C27D15****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tokens.</p>
     */
    @NameInMap("Token")
    public GetCloudDriveServiceMountTokenResponseBodyToken token;

    public static GetCloudDriveServiceMountTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudDriveServiceMountTokenResponseBody self = new GetCloudDriveServiceMountTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudDriveServiceMountTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCloudDriveServiceMountTokenResponseBody setToken(GetCloudDriveServiceMountTokenResponseBodyToken token) {
        this.token = token;
        return this;
    }
    public GetCloudDriveServiceMountTokenResponseBodyToken getToken() {
        return this.token;
    }

    public static class GetCloudDriveServiceMountTokenResponseBodyToken extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>h****</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <strong>example:</strong>
         * <p>2022-10-10T04:41:35Z</p>
         */
        @NameInMap("ExpiredAfter")
        public String expiredAfter;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The token.</p>
         * 
         * <strong>example:</strong>
         * <p>7836fa6eced7dc8d54c775k34iu3h4i2kh534f****</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The total capacity of the enterprise drive. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>6050416754750</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <strong>example:</strong>
         * <p>605089</p>
         */
        @NameInMap("UsedSize")
        public Long usedSize;

        public static GetCloudDriveServiceMountTokenResponseBodyToken build(java.util.Map<String, ?> map) throws Exception {
            GetCloudDriveServiceMountTokenResponseBodyToken self = new GetCloudDriveServiceMountTokenResponseBodyToken();
            return TeaModel.build(map, self);
        }

        public GetCloudDriveServiceMountTokenResponseBodyToken setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public GetCloudDriveServiceMountTokenResponseBodyToken setExpiredAfter(String expiredAfter) {
            this.expiredAfter = expiredAfter;
            return this;
        }
        public String getExpiredAfter() {
            return this.expiredAfter;
        }

        public GetCloudDriveServiceMountTokenResponseBodyToken setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCloudDriveServiceMountTokenResponseBodyToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetCloudDriveServiceMountTokenResponseBodyToken setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public GetCloudDriveServiceMountTokenResponseBodyToken setUsedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }
        public Long getUsedSize() {
            return this.usedSize;
        }

    }

}
