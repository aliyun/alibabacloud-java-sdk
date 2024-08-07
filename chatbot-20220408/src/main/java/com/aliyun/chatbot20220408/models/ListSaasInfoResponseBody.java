// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSaasInfoResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A629A28F-F25E-5572-A679-FA46FB0151D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>06614fdb-c72f-436e-8003-dfe8a2854a15</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>GLOBAL_SERVICE</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>GLOBAL SERVICE</p>
         */
        @NameInMap("EnName")
        public String enName;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p><a href="https://pre-alime4service.console.aliyun.com/?productCode=p_beebot_public&switchAgent=1204001&saasCode=Robot&saasToken=06614fdb-c72f-436e-8003-dfe8a2854a15&saasName=123#/robot">https://pre-alime4service.console.aliyun.com/?productCode=p_beebot_public&amp;switchAgent=1204001&amp;saasCode=Robot&amp;saasToken=06614fdb-c72f-436e-8003-dfe8a2854a15&amp;saasName=123#/robot</a></p>
         */
        @NameInMap("ServiceUrl")
        public String serviceUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alime.console.aliyun.com/?productCode=p_beebot_public&switchAgent=1204001&saasCode=Robot&saasToken=06614fdb-c72f-436e-8003-dfe8a2854a15&saasName=123#/robot">https://alime.console.aliyun.com/?productCode=p_beebot_public&amp;switchAgent=1204001&amp;saasCode=Robot&amp;saasToken=06614fdb-c72f-436e-8003-dfe8a2854a15&amp;saasName=123#/robot</a></p>
         */
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
