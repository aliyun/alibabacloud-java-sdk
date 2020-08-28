// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileVodResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("DecryptKey")
    @Validation(required = true)
    public String decryptKey;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceFileVodResponseData data;

    public static QueryDeviceFileVodResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileVodResponse self = new QueryDeviceFileVodResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileVodResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceFileVodResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceFileVodResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceFileVodResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceFileVodResponse setDecryptKey(String decryptKey) {
        this.decryptKey = decryptKey;
        return this;
    }
    public String getDecryptKey() {
        return this.decryptKey;
    }

    public QueryDeviceFileVodResponse setData(QueryDeviceFileVodResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceFileVodResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceFileVodResponseData extends TeaModel {
        @NameInMap("VodUrl")
        @Validation(required = true)
        public String vodUrl;

        public static QueryDeviceFileVodResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileVodResponseData self = new QueryDeviceFileVodResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileVodResponseData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
