// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateWebFilterTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the newly created web filtering template.</p>
     * 
     * <strong>example:</strong>
     * <p>wft-3f2a9c1d4b5e6f70</p>
     */
    @NameInMap("WebFilterTemplateId")
    public String webFilterTemplateId;

    public static CreateWebFilterTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFilterTemplateResponseBody self = new CreateWebFilterTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWebFilterTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWebFilterTemplateResponseBody setWebFilterTemplateId(String webFilterTemplateId) {
        this.webFilterTemplateId = webFilterTemplateId;
        return this;
    }
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

}
