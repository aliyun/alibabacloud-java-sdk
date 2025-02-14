// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaConnectFlowInputResponseBody extends TeaModel {
    /**
     * <p>Response body</p>
     */
    @NameInMap("Content")
    public AddMediaConnectFlowInputResponseBodyContent content;

    /**
     * <p>Description of the API call</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>11357BE8-4C54-58EA-890A-5AB646EDE4B2</p>
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

    public static AddMediaConnectFlowInputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaConnectFlowInputResponseBody self = new AddMediaConnectFlowInputResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaConnectFlowInputResponseBody setContent(AddMediaConnectFlowInputResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public AddMediaConnectFlowInputResponseBodyContent getContent() {
        return this.content;
    }

    public AddMediaConnectFlowInputResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddMediaConnectFlowInputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMediaConnectFlowInputResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public static class AddMediaConnectFlowInputResponseBodyContent extends TeaModel {
        /**
         * <p>Input URL</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://1.2.3.4:1935/live/AliTestInput_8666ec062190f00e263012666319a5be</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        public static AddMediaConnectFlowInputResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            AddMediaConnectFlowInputResponseBodyContent self = new AddMediaConnectFlowInputResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public AddMediaConnectFlowInputResponseBodyContent setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
        }

    }

}
