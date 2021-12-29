// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceGroupAuthorizedBizChainResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListDeviceGroupAuthorizedBizChainResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDeviceGroupAuthorizedBizChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupAuthorizedBizChainResponseBody self = new ListDeviceGroupAuthorizedBizChainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupAuthorizedBizChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceGroupAuthorizedBizChainResponseBody setData(java.util.List<ListDeviceGroupAuthorizedBizChainResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeviceGroupAuthorizedBizChainResponseBodyData> getData() {
        return this.data;
    }

    public ListDeviceGroupAuthorizedBizChainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDeviceGroupAuthorizedBizChainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceGroupAuthorizedBizChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceGroupAuthorizedBizChainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDeviceGroupAuthorizedBizChainResponseBodyData extends TeaModel {
        @NameInMap("Authorized")
        public Boolean authorized;

        @NameInMap("BizChainId")
        public String bizChainId;

        @NameInMap("BizChainName")
        public String bizChainName;

        @NameInMap("BlockChainType")
        public String blockChainType;

        public static ListDeviceGroupAuthorizedBizChainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGroupAuthorizedBizChainResponseBodyData self = new ListDeviceGroupAuthorizedBizChainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceGroupAuthorizedBizChainResponseBodyData setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public ListDeviceGroupAuthorizedBizChainResponseBodyData setBizChainId(String bizChainId) {
            this.bizChainId = bizChainId;
            return this;
        }
        public String getBizChainId() {
            return this.bizChainId;
        }

        public ListDeviceGroupAuthorizedBizChainResponseBodyData setBizChainName(String bizChainName) {
            this.bizChainName = bizChainName;
            return this;
        }
        public String getBizChainName() {
            return this.bizChainName;
        }

        public ListDeviceGroupAuthorizedBizChainResponseBodyData setBlockChainType(String blockChainType) {
            this.blockChainType = blockChainType;
            return this;
        }
        public String getBlockChainType() {
            return this.blockChainType;
        }

    }

}
