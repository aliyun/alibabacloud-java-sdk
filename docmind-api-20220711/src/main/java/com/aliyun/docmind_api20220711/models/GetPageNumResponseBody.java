// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetPageNumResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetPageNumResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPageNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageNumResponseBody self = new GetPageNumResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageNumResponseBody setData(GetPageNumResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPageNumResponseBodyData getData() {
        return this.data;
    }

    public GetPageNumResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPageNumResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPageNumResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetPageNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPageNumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPageNumResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        public static GetPageNumResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPageNumResponseBodyData self = new GetPageNumResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPageNumResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

    }

}
