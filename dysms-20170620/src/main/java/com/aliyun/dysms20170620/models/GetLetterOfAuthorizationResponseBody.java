// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class GetLetterOfAuthorizationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetLetterOfAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLetterOfAuthorizationResponseBody self = new GetLetterOfAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLetterOfAuthorizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLetterOfAuthorizationResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public GetLetterOfAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLetterOfAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLetterOfAuthorizationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
