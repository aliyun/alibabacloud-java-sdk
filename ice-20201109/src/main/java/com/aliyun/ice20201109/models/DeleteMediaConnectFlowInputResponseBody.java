// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowInputResponseBody extends TeaModel {
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
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>C0C02296-113C-5838-8FE9-8F3A32998DDC</p>
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

    public static DeleteMediaConnectFlowInputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowInputResponseBody self = new DeleteMediaConnectFlowInputResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowInputResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DeleteMediaConnectFlowInputResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteMediaConnectFlowInputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMediaConnectFlowInputResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

}
