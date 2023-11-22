// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowJSONAssestResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetFlowJSONAssestResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
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
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>flow ID。</p>
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
