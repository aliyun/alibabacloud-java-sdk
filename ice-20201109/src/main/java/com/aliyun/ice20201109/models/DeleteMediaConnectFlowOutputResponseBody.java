// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowOutputResponseBody extends TeaModel {
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
     * <p>DF73E08E-F807-50F5-A2BD-B76391EAE8FF</p>
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

    public static DeleteMediaConnectFlowOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowOutputResponseBody self = new DeleteMediaConnectFlowOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowOutputResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DeleteMediaConnectFlowOutputResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteMediaConnectFlowOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMediaConnectFlowOutputResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

}
