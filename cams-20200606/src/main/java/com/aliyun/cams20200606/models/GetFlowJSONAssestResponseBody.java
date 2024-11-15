// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowJSONAssestResponseBody extends TeaModel {
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
    public GetFlowJSONAssestResponseBodyData data;

    /**
     * <p>Error description information.</p>
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
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFlowJSONAssestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowJSONAssestResponseBody self = new GetFlowJSONAssestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowJSONAssestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFlowJSONAssestResponseBody setData(GetFlowJSONAssestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFlowJSONAssestResponseBodyData getData() {
        return this.data;
    }

    public GetFlowJSONAssestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFlowJSONAssestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFlowJSONAssestResponseBodyData extends TeaModel {
        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://url.com/json.json">https://url.com/json.json</a></p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The Flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>flow_id_arms</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        public static GetFlowJSONAssestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFlowJSONAssestResponseBodyData self = new GetFlowJSONAssestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFlowJSONAssestResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetFlowJSONAssestResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

}
