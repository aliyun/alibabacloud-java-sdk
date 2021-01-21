// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlResponse extends TeaModel {
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
    public QueryDeviceVodUrlResponseData data;

    public static QueryDeviceVodUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlResponse self = new QueryDeviceVodUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceVodUrlResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceVodUrlResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceVodUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceVodUrlResponse setDecryptKey(String decryptKey) {
        this.decryptKey = decryptKey;
        return this;
    }
    public String getDecryptKey() {
        return this.decryptKey;
    }

    public QueryDeviceVodUrlResponse setData(QueryDeviceVodUrlResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceVodUrlResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceVodUrlResponseData extends TeaModel {
        @NameInMap("VodUrl")
        @Validation(required = true)
        public String vodUrl;

        public static QueryDeviceVodUrlResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceVodUrlResponseData self = new QueryDeviceVodUrlResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceVodUrlResponseData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
