// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DeleteVoiceFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVoiceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVoiceFileResponseBody self = new DeleteVoiceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVoiceFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteVoiceFileResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DeleteVoiceFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVoiceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
