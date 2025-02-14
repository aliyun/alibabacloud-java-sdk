// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowResponseBody extends TeaModel {
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
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>5AEC17BD-D80B-5F78-BE1B-F07DFA0C8622</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned error code, where <code>0</code> indicates success</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    public static DeleteMediaConnectFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowResponseBody self = new DeleteMediaConnectFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DeleteMediaConnectFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteMediaConnectFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMediaConnectFlowResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

}
