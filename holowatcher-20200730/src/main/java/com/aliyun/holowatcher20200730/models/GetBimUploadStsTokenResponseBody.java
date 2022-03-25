// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimUploadStsTokenResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimUploadStsTokenResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimUploadStsTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimUploadStsTokenResponseBody self = new GetBimUploadStsTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimUploadStsTokenResponseBody setDatas(GetBimUploadStsTokenResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimUploadStsTokenResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimUploadStsTokenResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimUploadStsTokenResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimUploadStsTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimUploadStsTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimUploadStsTokenResponseBodyDatas extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Expiration")
        public Long expiration;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssRegion")
        public String ossRegion;

        // 路径
        @NameInMap("Path")
        public String path;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetBimUploadStsTokenResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimUploadStsTokenResponseBodyDatas self = new GetBimUploadStsTokenResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimUploadStsTokenResponseBodyDatas setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetBimUploadStsTokenResponseBodyDatas setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetBimUploadStsTokenResponseBodyDatas setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public GetBimUploadStsTokenResponseBodyDatas setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public GetBimUploadStsTokenResponseBodyDatas setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public GetBimUploadStsTokenResponseBodyDatas setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetBimUploadStsTokenResponseBodyDatas setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
