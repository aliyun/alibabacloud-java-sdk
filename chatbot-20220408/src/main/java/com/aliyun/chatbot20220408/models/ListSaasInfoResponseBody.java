// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSaasInfoResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SaasToken")
    public String saasToken;

    public static ListSaasInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSaasInfoResponseBody self = new ListSaasInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSaasInfoResponseBody setData(java.util.List<ListSaasInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSaasInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListSaasInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSaasInfoResponseBody setSaasToken(String saasToken) {
        this.saasToken = saasToken;
        return this;
    }
    public String getSaasToken() {
        return this.saasToken;
    }

    public static class ListSaasInfoResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ServiceUrl")
        public String serviceUrl;

        @NameInMap("Url")
        public String url;

        public static ListSaasInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSaasInfoResponseBodyData self = new ListSaasInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSaasInfoResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListSaasInfoResponseBodyData setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public ListSaasInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSaasInfoResponseBodyData setServiceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public String getServiceUrl() {
            return this.serviceUrl;
        }

        public ListSaasInfoResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
