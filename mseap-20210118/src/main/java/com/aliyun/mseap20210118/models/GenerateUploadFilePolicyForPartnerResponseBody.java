// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyForPartnerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Module")
    public GenerateUploadFilePolicyForPartnerResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>6254E13A-A79F-5786-9C75-7590727342C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateUploadFilePolicyForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyForPartnerResponseBody self = new GenerateUploadFilePolicyForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setModule(GenerateUploadFilePolicyForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GenerateUploadFilePolicyForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadFilePolicyForPartnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateUploadFilePolicyForPartnerResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LTAI5tQPEXqDVu7794Bvw2xM</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>XXXXXXX</p>
         */
        @NameInMap("EncodedPolicy")
        public String encodedPolicy;

        /**
         * <strong>example:</strong>
         * <p>1719112842</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>website_partner_leads/website/xxxxxx/xxxxxx</p>
         */
        @NameInMap("FileDir")
        public String fileDir;

        /**
         * <strong>example:</strong>
         * <p>//xx-xxx-partner.oss-cn-zhangjiakou.aliyuncs.com/</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p><a href="https://msea-website-partner.oss-cn-zhangjiakou.aliyuncs.com/website_xxxx_party_leads/website/xxxx/xxxx/2024/06/25/website_partner_third_party_leads_01?Expires=1719868413&OSSAccessKeyId=LTAI5tAnyDDDDD&Signature=XXXX">https://msea-website-partner.oss-cn-zhangjiakou.aliyuncs.com/website_xxxx_party_leads/website/xxxx/xxxx/2024/06/25/website_partner_third_party_leads_01?Expires=1719868413&amp;OSSAccessKeyId=LTAI5tAnyDDDDD&amp;Signature=XXXX</a></p>
         */
        @NameInMap("OssUrl")
        public String ossUrl;

        /**
         * <strong>example:</strong>
         * <p>qQb34p8lIXcSFtog2y0H08bC0OI=</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static GenerateUploadFilePolicyForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GenerateUploadFilePolicyForPartnerResponseBodyModule self = new GenerateUploadFilePolicyForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GenerateUploadFilePolicyForPartnerResponseBodyModule setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GenerateUploadFilePolicyForPartnerResponseBodyModule setEncodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }
        public String getEncodedPolicy() {
            return this.encodedPolicy;
        }

        public GenerateUploadFilePolicyForPartnerResponseBodyModule setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GenerateUploadFilePolicyForPartnerResponseBodyModule setFileDir(String fileDir) {
            this.fileDir = fileDir;
            return this;
        }
        public String getFileDir() {
            return this.fileDir;
        }

        public GenerateUploadFilePolicyForPartnerResponseBodyModule setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateUploadFilePolicyForPartnerResponseBodyModule setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public GenerateUploadFilePolicyForPartnerResponseBodyModule setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
