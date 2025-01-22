// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowResponseBody extends TeaModel {
    @NameInMap("Content")
    public GetMediaConnectFlowResponseBodyContent content;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>FB503AEF-118E-1516-89E2-7B227EA1AC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Retcode")
    public Integer retcode;

    public static GetMediaConnectFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectFlowResponseBody self = new GetMediaConnectFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectFlowResponseBody setContent(GetMediaConnectFlowResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetMediaConnectFlowResponseBodyContent getContent() {
        return this.content;
    }

    public GetMediaConnectFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMediaConnectFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaConnectFlowResponseBody setRetcode(Integer retcode) {
        this.retcode = retcode;
        return this;
    }
    public Integer getRetcode() {
        return this.retcode;
    }

    public static class GetMediaConnectFlowResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-07-18T01:29:24Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <strong>example:</strong>
         * <p>WorkTypeAfterRefresh</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("FlowStatus")
        public String flowStatus;

        /**
         * <strong>example:</strong>
         * <p>2020-05-11T02:40Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetMediaConnectFlowResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetMediaConnectFlowResponseBodyContent self = new GetMediaConnectFlowResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetMediaConnectFlowResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaConnectFlowResponseBodyContent setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetMediaConnectFlowResponseBodyContent setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public GetMediaConnectFlowResponseBodyContent setFlowStatus(String flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public String getFlowStatus() {
            return this.flowStatus;
        }

        public GetMediaConnectFlowResponseBodyContent setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
