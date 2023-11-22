// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowPreviewUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetFlowPreviewUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFlowPreviewUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowPreviewUrlResponseBody self = new GetFlowPreviewUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowPreviewUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFlowPreviewUrlResponseBody setData(GetFlowPreviewUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFlowPreviewUrlResponseBodyData getData() {
        return this.data;
    }

    public GetFlowPreviewUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFlowPreviewUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFlowPreviewUrlResponseBodyData extends TeaModel {
        /**
         * <p>flow ID。</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("PreviewUrlExpires")
        public Long previewUrlExpires;

        public static GetFlowPreviewUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFlowPreviewUrlResponseBodyData self = new GetFlowPreviewUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFlowPreviewUrlResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetFlowPreviewUrlResponseBodyData setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public GetFlowPreviewUrlResponseBodyData setPreviewUrlExpires(Long previewUrlExpires) {
            this.previewUrlExpires = previewUrlExpires;
            return this;
        }
        public Long getPreviewUrlExpires() {
            return this.previewUrlExpires;
        }

    }

}
