// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowResponseBody extends TeaModel {
    /**
     * <p>The response body.</p>
     */
    @NameInMap("Content")
    public GetMediaConnectFlowResponseBodyContent content;

    /**
     * <p>The description of the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>FB503AEF-118E-1516-89E2-7B227EA1AC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return code. A value of 0 indicates success.</p>
     * 
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
         * <p>The creation time of the MediaConnect Flow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-18T01:29:24Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether Input Failover is enabled for the flow. Valid values: <code>yes</code> and <code>no</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("FlowFailover")
        public String flowFailover;

        /**
         * <p>The ID of the MediaConnect Flow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The name of the MediaConnect Flow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestFlow</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("FlowRegion")
        public String flowRegion;

        /**
         * <p>The status of the MediaConnect Flow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("FlowStatus")
        public String flowStatus;

        /**
         * <p>The start time of the MediaConnect Flow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-18T01:39:24Z</p>
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

        public GetMediaConnectFlowResponseBodyContent setFlowFailover(String flowFailover) {
            this.flowFailover = flowFailover;
            return this;
        }
        public String getFlowFailover() {
            return this.flowFailover;
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

        public GetMediaConnectFlowResponseBodyContent setFlowRegion(String flowRegion) {
            this.flowRegion = flowRegion;
            return this;
        }
        public String getFlowRegion() {
            return this.flowRegion;
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
