// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ResumeMediaConnectFlowOutputResponseBody extends TeaModel {
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
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
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

    public static ResumeMediaConnectFlowOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeMediaConnectFlowOutputResponseBody self = new ResumeMediaConnectFlowOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeMediaConnectFlowOutputResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ResumeMediaConnectFlowOutputResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResumeMediaConnectFlowOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeMediaConnectFlowOutputResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

}
