// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListTrunkProvidersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TrunkProviders")
    public java.util.List<ListTrunkProvidersResponseBodyTrunkProviders> trunkProviders;

    public static ListTrunkProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrunkProvidersResponseBody self = new ListTrunkProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrunkProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTrunkProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTrunkProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTrunkProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrunkProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTrunkProvidersResponseBody setTrunkProviders(java.util.List<ListTrunkProvidersResponseBodyTrunkProviders> trunkProviders) {
        this.trunkProviders = trunkProviders;
        return this;
    }
    public java.util.List<ListTrunkProvidersResponseBodyTrunkProviders> getTrunkProviders() {
        return this.trunkProviders;
    }

    public static class ListTrunkProvidersResponseBodyTrunkProviders extends TeaModel {
        @NameInMap("ProviderName")
        public String providerName;

        @NameInMap("Status")
        public String status;

        public static ListTrunkProvidersResponseBodyTrunkProviders build(java.util.Map<String, ?> map) throws Exception {
            ListTrunkProvidersResponseBodyTrunkProviders self = new ListTrunkProvidersResponseBodyTrunkProviders();
            return TeaModel.build(map, self);
        }

        public ListTrunkProvidersResponseBodyTrunkProviders setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public ListTrunkProvidersResponseBodyTrunkProviders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
