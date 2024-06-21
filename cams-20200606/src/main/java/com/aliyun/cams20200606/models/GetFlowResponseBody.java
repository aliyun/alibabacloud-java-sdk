// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowResponseBody extends TeaModel {
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
    public GetFlowResponseBodyData data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
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
        /**
         * <p>The categories of the Flow.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The API version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("DataApiVersion")
        public String dataApiVersion;

        /**
         * <p>The Flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>flow_id_arms</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The name of the Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>dnjn</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>The JSON version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1</p>
         */
        @NameInMap("JSONVersion")
        public String JSONVersion;

        /**
         * <p>The temporary preview URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://pre-url">https://pre-url</a></p>
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

        /**
         * <p>The state of the Flow.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PUBLISHED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DRAFT</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DEPRECATED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
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
