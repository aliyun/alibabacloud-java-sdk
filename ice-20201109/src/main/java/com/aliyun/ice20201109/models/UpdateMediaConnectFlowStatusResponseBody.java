// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowStatusResponseBody extends TeaModel {
    /**
     * <p>The response body.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The call description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>20B3A1B6-4BD2-5DE6-BCBC-098C9B4F4E91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned error code. A value of 0 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    public static UpdateMediaConnectFlowStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaConnectFlowStatusResponseBody self = new UpdateMediaConnectFlowStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaConnectFlowStatusResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateMediaConnectFlowStatusResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMediaConnectFlowStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMediaConnectFlowStatusResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

}
