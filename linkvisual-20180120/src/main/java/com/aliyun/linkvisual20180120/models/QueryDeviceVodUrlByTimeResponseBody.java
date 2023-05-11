// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlByTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceVodUrlByTimeResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceVodUrlByTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlByTimeResponseBody self = new QueryDeviceVodUrlByTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlByTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceVodUrlByTimeResponseBody setData(QueryDeviceVodUrlByTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceVodUrlByTimeResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceVodUrlByTimeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceVodUrlByTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceVodUrlByTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceVodUrlByTimeResponseBodyData extends TeaModel {
        @NameInMap("DecryptKey")
        public String decryptKey;

        @NameInMap("StunInfo")
        public String stunInfo;

        @NameInMap("VodUrl")
        public String vodUrl;

        public static QueryDeviceVodUrlByTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceVodUrlByTimeResponseBodyData self = new QueryDeviceVodUrlByTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceVodUrlByTimeResponseBodyData setDecryptKey(String decryptKey) {
            this.decryptKey = decryptKey;
            return this;
        }
        public String getDecryptKey() {
            return this.decryptKey;
        }

        public QueryDeviceVodUrlByTimeResponseBodyData setStunInfo(String stunInfo) {
            this.stunInfo = stunInfo;
            return this;
        }
        public String getStunInfo() {
            return this.stunInfo;
        }

        public QueryDeviceVodUrlByTimeResponseBodyData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
