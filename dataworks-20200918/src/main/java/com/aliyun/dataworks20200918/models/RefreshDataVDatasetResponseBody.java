// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RefreshDataVDatasetResponseBody extends TeaModel {
    @NameInMap("data")
    public RefreshDataVDatasetResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    public static RefreshDataVDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDataVDatasetResponseBody self = new RefreshDataVDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDataVDatasetResponseBody setData(RefreshDataVDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshDataVDatasetResponseBodyData getData() {
        return this.data;
    }

    public RefreshDataVDatasetResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RefreshDataVDatasetResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RefreshDataVDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefreshDataVDatasetResponseBodyDataHeaders extends TeaModel {
        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("key")
        public String key;

        @NameInMap("type")
        public String type;

        public static RefreshDataVDatasetResponseBodyDataHeaders build(java.util.Map<String, ?> map) throws Exception {
            RefreshDataVDatasetResponseBodyDataHeaders self = new RefreshDataVDatasetResponseBodyDataHeaders();
            return TeaModel.build(map, self);
        }

        public RefreshDataVDatasetResponseBodyDataHeaders setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public RefreshDataVDatasetResponseBodyDataHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RefreshDataVDatasetResponseBodyDataHeaders setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RefreshDataVDatasetResponseBodyData extends TeaModel {
        @NameInMap("body")
        public java.util.List<java.util.Map<String, ?>> body;

        @NameInMap("code")
        public String code;

        @NameInMap("count")
        public Integer count;

        @NameInMap("headers")
        public java.util.List<RefreshDataVDatasetResponseBodyDataHeaders> headers;

        @NameInMap("msg")
        public String msg;

        @NameInMap("statusEnum")
        public String statusEnum;

        public static RefreshDataVDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshDataVDatasetResponseBodyData self = new RefreshDataVDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshDataVDatasetResponseBodyData setBody(java.util.List<java.util.Map<String, ?>> body) {
            this.body = body;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getBody() {
            return this.body;
        }

        public RefreshDataVDatasetResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RefreshDataVDatasetResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public RefreshDataVDatasetResponseBodyData setHeaders(java.util.List<RefreshDataVDatasetResponseBodyDataHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<RefreshDataVDatasetResponseBodyDataHeaders> getHeaders() {
            return this.headers;
        }

        public RefreshDataVDatasetResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public RefreshDataVDatasetResponseBodyData setStatusEnum(String statusEnum) {
            this.statusEnum = statusEnum;
            return this;
        }
        public String getStatusEnum() {
            return this.statusEnum;
        }

    }

}
