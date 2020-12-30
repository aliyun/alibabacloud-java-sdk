// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetRecordOssUploadParamResponseBody extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("OssFileName")
    public String ossFileName;

    @NameInMap("Host")
    public String host;

    @NameInMap("Expires")
    public String expires;

    @NameInMap("Dir")
    public String dir;

    @NameInMap("Code")
    public String code;

    @NameInMap("OssAccessKeyId")
    public String ossAccessKeyId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRecordOssUploadParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordOssUploadParamResponseBody self = new GetRecordOssUploadParamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordOssUploadParamResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetRecordOssUploadParamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecordOssUploadParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecordOssUploadParamResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetRecordOssUploadParamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRecordOssUploadParamResponseBody setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public GetRecordOssUploadParamResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetRecordOssUploadParamResponseBody setExpires(String expires) {
        this.expires = expires;
        return this;
    }
    public String getExpires() {
        return this.expires;
    }

    public GetRecordOssUploadParamResponseBody setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public GetRecordOssUploadParamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRecordOssUploadParamResponseBody setOssAccessKeyId(String ossAccessKeyId) {
        this.ossAccessKeyId = ossAccessKeyId;
        return this;
    }
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    public GetRecordOssUploadParamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
