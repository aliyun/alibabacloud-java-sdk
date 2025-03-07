// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaConnectFlowResponseBody extends TeaModel {
    /**
     * <p>The response body.</p>
     */
    @NameInMap("Content")
    public CreateMediaConnectFlowResponseBodyContent content;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>86D92F9D-65E8-58A2-85D1-9DEEECC172E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned error code. A value of 0 indicates the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    public static CreateMediaConnectFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConnectFlowResponseBody self = new CreateMediaConnectFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaConnectFlowResponseBody setContent(CreateMediaConnectFlowResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateMediaConnectFlowResponseBodyContent getContent() {
        return this.content;
    }

    public CreateMediaConnectFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMediaConnectFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMediaConnectFlowResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public static class CreateMediaConnectFlowResponseBodyContent extends TeaModel {
        /**
         * <p>The flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        public static CreateMediaConnectFlowResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConnectFlowResponseBodyContent self = new CreateMediaConnectFlowResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateMediaConnectFlowResponseBodyContent setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

}
