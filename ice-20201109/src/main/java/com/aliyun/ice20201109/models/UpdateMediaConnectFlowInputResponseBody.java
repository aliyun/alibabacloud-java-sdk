// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowInputResponseBody extends TeaModel {
    /**
     * <p>Response body</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Description of the API call</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>请求 ID</p>
     * 
     * <strong>example:</strong>
     * <p>52451256-FFEA-5D2E-AA60-EE7053000F22</p>
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

    public static UpdateMediaConnectFlowInputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaConnectFlowInputResponseBody self = new UpdateMediaConnectFlowInputResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaConnectFlowInputResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateMediaConnectFlowInputResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMediaConnectFlowInputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMediaConnectFlowInputResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

}
