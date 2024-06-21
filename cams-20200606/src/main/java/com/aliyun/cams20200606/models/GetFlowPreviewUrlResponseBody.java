// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowPreviewUrlResponseBody extends TeaModel {
    /**
     * <p>If OK is returned, the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetFlowPreviewUrlResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
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
         * <p>The Flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6dd31e1b7cc940fc99e293d9952b5b79</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The temporary preview URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://url">https://url</a></p>
         */
        @NameInMap("PreviewUrl")
        public String previewUrl;

        /**
         * <p>The time when the preview URL expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1700617436633</p>
         */
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
