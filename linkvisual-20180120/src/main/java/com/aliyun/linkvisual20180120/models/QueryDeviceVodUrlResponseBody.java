// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DecryptKey")
    public String decryptKey;

    @NameInMap("Data")
    public QueryDeviceVodUrlResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceVodUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlResponseBody self = new QueryDeviceVodUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceVodUrlResponseBody setDecryptKey(String decryptKey) {
        this.decryptKey = decryptKey;
        return this;
    }
    public String getDecryptKey() {
        return this.decryptKey;
    }

    public QueryDeviceVodUrlResponseBody setData(QueryDeviceVodUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceVodUrlResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceVodUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceVodUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceVodUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceVodUrlResponseBodyData extends TeaModel {
        @NameInMap("VodUrl")
        public String vodUrl;

        public static QueryDeviceVodUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceVodUrlResponseBodyData self = new QueryDeviceVodUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceVodUrlResponseBodyData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
