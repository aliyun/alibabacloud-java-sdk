// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneTemplateFileUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInterveneTemplateFileUrlResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInterveneTemplateFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneTemplateFileUrlResponseBody self = new GetInterveneTemplateFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInterveneTemplateFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInterveneTemplateFileUrlResponseBody setData(GetInterveneTemplateFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInterveneTemplateFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetInterveneTemplateFileUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInterveneTemplateFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInterveneTemplateFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInterveneTemplateFileUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInterveneTemplateFileUrlResponseBodyData extends TeaModel {
        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetInterveneTemplateFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneTemplateFileUrlResponseBodyData self = new GetInterveneTemplateFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInterveneTemplateFileUrlResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
