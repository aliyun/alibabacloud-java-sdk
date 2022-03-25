// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimGetStsTokenResponseBody extends TeaModel {
    @NameInMap("Datas")
    public BimGetStsTokenResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BimGetStsTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BimGetStsTokenResponseBody self = new BimGetStsTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public BimGetStsTokenResponseBody setDatas(BimGetStsTokenResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public BimGetStsTokenResponseBodyDatas getDatas() {
        return this.datas;
    }

    public BimGetStsTokenResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public BimGetStsTokenResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BimGetStsTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BimGetStsTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BimGetStsTokenResponseBodyDatas extends TeaModel {
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

        @NameInMap("SecurityToken")
        public String securityToken;

        public static BimGetStsTokenResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            BimGetStsTokenResponseBodyDatas self = new BimGetStsTokenResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public BimGetStsTokenResponseBodyDatas setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public BimGetStsTokenResponseBodyDatas setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public BimGetStsTokenResponseBodyDatas setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public BimGetStsTokenResponseBodyDatas setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public BimGetStsTokenResponseBodyDatas setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public BimGetStsTokenResponseBodyDatas setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
