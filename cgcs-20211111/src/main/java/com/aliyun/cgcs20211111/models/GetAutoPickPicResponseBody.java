// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAutoPickPicResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAutoPickPicResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAutoPickPicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoPickPicResponseBody self = new GetAutoPickPicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoPickPicResponseBody setData(GetAutoPickPicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoPickPicResponseBodyData getData() {
        return this.data;
    }

    public GetAutoPickPicResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAutoPickPicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAutoPickPicResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetAutoPickPicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoPickPicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutoPickPicResponseBodyDataDtoList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Url")
        public String url;

        public static GetAutoPickPicResponseBodyDataDtoList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoPickPicResponseBodyDataDtoList self = new GetAutoPickPicResponseBodyDataDtoList();
            return TeaModel.build(map, self);
        }

        public GetAutoPickPicResponseBodyDataDtoList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAutoPickPicResponseBodyDataDtoList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAutoPickPicResponseBodyData extends TeaModel {
        @NameInMap("DtoList")
        public java.util.List<GetAutoPickPicResponseBodyDataDtoList> dtoList;

        @NameInMap("Url")
        public String url;

        public static GetAutoPickPicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoPickPicResponseBodyData self = new GetAutoPickPicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoPickPicResponseBodyData setDtoList(java.util.List<GetAutoPickPicResponseBodyDataDtoList> dtoList) {
            this.dtoList = dtoList;
            return this;
        }
        public java.util.List<GetAutoPickPicResponseBodyDataDtoList> getDtoList() {
            return this.dtoList;
        }

        public GetAutoPickPicResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
