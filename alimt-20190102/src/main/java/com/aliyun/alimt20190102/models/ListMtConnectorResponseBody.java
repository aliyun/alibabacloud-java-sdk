// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20190102.models;

import com.aliyun.tea.*;

public class ListMtConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("bizErrorCode")
    public Long bizErrorCode;

    @NameInMap("data")
    public java.util.List<ListMtConnectorResponseBodyData> data;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public String success;

    public static ListMtConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMtConnectorResponseBody self = new ListMtConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMtConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMtConnectorResponseBody setBizErrorCode(Long bizErrorCode) {
        this.bizErrorCode = bizErrorCode;
        return this;
    }
    public Long getBizErrorCode() {
        return this.bizErrorCode;
    }

    public ListMtConnectorResponseBody setData(java.util.List<ListMtConnectorResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMtConnectorResponseBodyData> getData() {
        return this.data;
    }

    public ListMtConnectorResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMtConnectorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListMtConnectorResponseBodyData extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListMtConnectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMtConnectorResponseBodyData self = new ListMtConnectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMtConnectorResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMtConnectorResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
