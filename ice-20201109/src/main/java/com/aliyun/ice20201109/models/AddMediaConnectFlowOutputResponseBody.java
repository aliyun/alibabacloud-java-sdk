// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaConnectFlowOutputResponseBody extends TeaModel {
    /**
     * <p>Response body</p>
     */
    @NameInMap("Content")
    public AddMediaConnectFlowOutputResponseBodyContent content;

    /**
     * <p>Description of the API call</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>11AA9E73-FBA0-58DC-97BA-D606D847BCB6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned error code, 0 indicates success</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    public static AddMediaConnectFlowOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaConnectFlowOutputResponseBody self = new AddMediaConnectFlowOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaConnectFlowOutputResponseBody setContent(AddMediaConnectFlowOutputResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public AddMediaConnectFlowOutputResponseBodyContent getContent() {
        return this.content;
    }

    public AddMediaConnectFlowOutputResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddMediaConnectFlowOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMediaConnectFlowOutputResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public static class AddMediaConnectFlowOutputResponseBodyContent extends TeaModel {
        /**
         * <p>Output address</p>
         * 
         * <strong>example:</strong>
         * <p>srt://1.2.3.4:1025</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static AddMediaConnectFlowOutputResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            AddMediaConnectFlowOutputResponseBodyContent self = new AddMediaConnectFlowOutputResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public AddMediaConnectFlowOutputResponseBodyContent setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

}
