// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetDyplsOSSInfoForUploadFileResponseBody extends TeaModel {
    /**
     * <p>Details of denied access.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Request status code. Valid values:  </p>
     * <ul>
     * <li>OK: indicates that the request succeeded.  </li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/109196.html">Error Code List</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public GetDyplsOSSInfoForUploadFileResponseBodyData data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2FD3B2F-5028-16E3-9F83-2F76F99B3873</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Valid values:  </p>
     * <ul>
     * <li><p>true: indicates success.  </p>
     * </li>
     * <li><p>false: indicates failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDyplsOSSInfoForUploadFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDyplsOSSInfoForUploadFileResponseBody self = new GetDyplsOSSInfoForUploadFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDyplsOSSInfoForUploadFileResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetDyplsOSSInfoForUploadFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDyplsOSSInfoForUploadFileResponseBody setData(GetDyplsOSSInfoForUploadFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDyplsOSSInfoForUploadFileResponseBodyData getData() {
        return this.data;
    }

    public GetDyplsOSSInfoForUploadFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDyplsOSSInfoForUploadFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDyplsOSSInfoForUploadFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDyplsOSSInfoForUploadFileResponseBodyData extends TeaModel {
        /**
         * <p>AccessKey ID used for signing.</p>
         * 
         * <strong>example:</strong>
         * <p>YOUR_ACCESS_KEY_ID</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>Expiration Time.</p>
         * 
         * <strong>example:</strong>
         * <p>1744613007</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Host address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alicom-**********-cn-zhangjiakou.aliyuncs.com">https://alicom-**********-cn-zhangjiakou.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Signing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>IjoiMjAyN*****9udGV</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>Signature computed from the <strong>AccessKey secret</strong> and <strong>policy</strong>. When invoking the OSS API, OSS authenticates this signature to confirm the validity of the POST request.</p>
         * 
         * <strong>example:</strong>
         * <p>BXwW**********aoZH</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>Policy path.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("StartPath")
        public String startPath;

        public static GetDyplsOSSInfoForUploadFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDyplsOSSInfoForUploadFileResponseBodyData self = new GetDyplsOSSInfoForUploadFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDyplsOSSInfoForUploadFileResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetDyplsOSSInfoForUploadFileResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetDyplsOSSInfoForUploadFileResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDyplsOSSInfoForUploadFileResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetDyplsOSSInfoForUploadFileResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetDyplsOSSInfoForUploadFileResponseBodyData setStartPath(String startPath) {
            this.startPath = startPath;
            return this;
        }
        public String getStartPath() {
            return this.startPath;
        }

    }

}
