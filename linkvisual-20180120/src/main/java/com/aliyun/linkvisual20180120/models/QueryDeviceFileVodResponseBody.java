// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileVodResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DecryptKey")
    public String decryptKey;

    @NameInMap("Data")
    public QueryDeviceFileVodResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceFileVodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileVodResponseBody self = new QueryDeviceFileVodResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileVodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceFileVodResponseBody setDecryptKey(String decryptKey) {
        this.decryptKey = decryptKey;
        return this;
    }
    public String getDecryptKey() {
        return this.decryptKey;
    }

    public QueryDeviceFileVodResponseBody setData(QueryDeviceFileVodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceFileVodResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceFileVodResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceFileVodResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceFileVodResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceFileVodResponseBodyData extends TeaModel {
        @NameInMap("VodUrl")
        public String vodUrl;

        public static QueryDeviceFileVodResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileVodResponseBodyData self = new QueryDeviceFileVodResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileVodResponseBodyData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
