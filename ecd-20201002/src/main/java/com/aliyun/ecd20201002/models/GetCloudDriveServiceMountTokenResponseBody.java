// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetCloudDriveServiceMountTokenResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("ExpiredAfter")
        public String expiredAfter;

        @NameInMap("Token")
        public String token;

        @NameInMap("TotalSize")
        public Long totalSize;

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
