// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetFlowResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowResponseBody self = new GetFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFlowResponseBody setData(GetFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFlowResponseBodyData getData() {
        return this.data;
    }

    public GetFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFlowResponseBodyData extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("DataApiVersion")
        public String dataApiVersion;

        /**
         * <p>flow ID。</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("JSONVersion")
        public String JSONVersion;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("PreviewUrlExpires")
        public Long previewUrlExpires;

        @NameInMap("Status")
        public String status;

        public static GetFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFlowResponseBodyData self = new GetFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFlowResponseBodyData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public GetFlowResponseBodyData setDataApiVersion(String dataApiVersion) {
            this.dataApiVersion = dataApiVersion;
            return this;
        }
        public String getDataApiVersion() {
            return this.dataApiVersion;
        }

        public GetFlowResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetFlowResponseBodyData setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public GetFlowResponseBodyData setJSONVersion(String JSONVersion) {
            this.JSONVersion = JSONVersion;
            return this;
        }
        public String getJSONVersion() {
            return this.JSONVersion;
        }

        public GetFlowResponseBodyData setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public GetFlowResponseBodyData setPreviewUrlExpires(Long previewUrlExpires) {
            this.previewUrlExpires = previewUrlExpires;
            return this;
        }
        public Long getPreviewUrlExpires() {
            return this.previewUrlExpires;
        }

        public GetFlowResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
