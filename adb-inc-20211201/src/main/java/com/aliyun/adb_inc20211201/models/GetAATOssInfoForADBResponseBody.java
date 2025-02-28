// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetAATOssInfoForADBResponseBody extends TeaModel {
    @NameInMap("OssInfo")
    public GetAATOssInfoForADBResponseBodyOssInfo ossInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAATOssInfoForADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAATOssInfoForADBResponseBody self = new GetAATOssInfoForADBResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAATOssInfoForADBResponseBody setOssInfo(GetAATOssInfoForADBResponseBodyOssInfo ossInfo) {
        this.ossInfo = ossInfo;
        return this;
    }
    public GetAATOssInfoForADBResponseBodyOssInfo getOssInfo() {
        return this.ossInfo;
    }

    public GetAATOssInfoForADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAATOssInfoForADBResponseBodyOssInfo extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("Path")
        public String path;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetAATOssInfoForADBResponseBodyOssInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAATOssInfoForADBResponseBodyOssInfo self = new GetAATOssInfoForADBResponseBodyOssInfo();
            return TeaModel.build(map, self);
        }

        public GetAATOssInfoForADBResponseBodyOssInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetAATOssInfoForADBResponseBodyOssInfo setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetAATOssInfoForADBResponseBodyOssInfo setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public GetAATOssInfoForADBResponseBodyOssInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public GetAATOssInfoForADBResponseBodyOssInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetAATOssInfoForADBResponseBodyOssInfo setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
