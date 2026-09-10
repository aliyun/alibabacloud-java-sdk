// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetMetaOssTempKeyResponseBody extends TeaModel {
    /**
     * <p>The response body. For more information about the fields, see the child field descriptions.</p>
     */
    @NameInMap("data")
    public GetMetaOssTempKeyResponseBodyData data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetMetaOssTempKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaOssTempKeyResponseBody self = new GetMetaOssTempKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaOssTempKeyResponseBody setData(GetMetaOssTempKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaOssTempKeyResponseBodyData getData() {
        return this.data;
    }

    public GetMetaOssTempKeyResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetMetaOssTempKeyResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetMetaOssTempKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaOssTempKeyResponseBodyData extends TeaModel {
        /**
         * <p>The temporary AccessKey ID (STS token). This value is used together with securityToken to authenticate direct uploads to OSS. This is a sensitive credential. Do not hard-code it in your code or print it to logs.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NY6bbCNqNPpt5GcSTEzB6Lahn</p>
         */
        @NameInMap("ak")
        public String ak;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>lhm-pre-cn-hangzhou</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The allowed OSS upload directory prefix. The value must end with a forward slash (/). The key of the uploaded object must start with this prefix. Otherwise, the request is rejected by OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>teleport/meta/1063934947625635/</p>
         */
        @NameInMap("dir")
        public String dir;

        /**
         * <p>The endpoint of the region where the OSS bucket resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The credential expiration timestamp in Unix seconds. Before use, verify whether the current time has exceeded this value. If the credential has expired, obtain new credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>1779966540</p>
         */
        @NameInMap("expire")
        public Long expire;

        /**
         * <p>The Base64-encoded upload policy that defines constraints such as file size and path prefix. The decoded value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNi0wNS0yOFQxMToxMjo1OC43MzZaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwXSxbInN0YXJ0cy13aXRoIiwiJGtleSIsInRlbGVwb3J0L21ldGEvMTA2MzkzNDk0NzYyNTYzNS8iXV19</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <p>The STS temporary security token. This value is used together with ak for authentication and is returned only in STS authentication mode. This is a sensitive credential. Do not hard-code it in your code or print it to logs.</p>
         * 
         * <strong>example:</strong>
         * <p>CAIS3QJ1q6Ft5B2yfSjIr5rsAOjugKcY9YqlSRPBlWEFZN1V3fD6gzz2IHhMfHFvA</p>
         */
        @NameInMap("securityToken")
        public String securityToken;

        /**
         * <p>The signature calculated based on the policy. The OSS server uses this signature to verify the validity of upload requests.</p>
         * 
         * <strong>example:</strong>
         * <p>ydDYrWUzfKNM6slVhjPhUx83qUo=</p>
         */
        @NameInMap("signature")
        public String signature;

        public static GetMetaOssTempKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaOssTempKeyResponseBodyData self = new GetMetaOssTempKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaOssTempKeyResponseBodyData setAk(String ak) {
            this.ak = ak;
            return this;
        }
        public String getAk() {
            return this.ak;
        }

        public GetMetaOssTempKeyResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetMetaOssTempKeyResponseBodyData setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetMetaOssTempKeyResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetMetaOssTempKeyResponseBodyData setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public GetMetaOssTempKeyResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetMetaOssTempKeyResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetMetaOssTempKeyResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
