// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecImportFileUrlRequest extends TeaModel {
    /**
     * <p>The Content-Type of the uploaded file. You must use the same value returned in the response when the client sends a PUT request.</p>
     * 
     * <strong>example:</strong>
     * <p>application/zip</p>
     */
    @NameInMap("contentType")
    public String contentType;

    public static GetAgentSpecImportFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecImportFileUrlRequest self = new GetAgentSpecImportFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecImportFileUrlRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

}
