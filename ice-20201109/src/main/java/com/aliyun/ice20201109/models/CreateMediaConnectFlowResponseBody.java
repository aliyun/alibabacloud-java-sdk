// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaConnectFlowResponseBody extends TeaModel {
    @NameInMap("Content")
    public CreateMediaConnectFlowResponseBodyContent content;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

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
