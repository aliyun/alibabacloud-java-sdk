// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateApplicationTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the newly created application template.</p>
     * 
     * <strong>example:</strong>
     * <p>ati-4f0691c56b8d4f06</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationTemplateResponseBody self = new CreateApplicationTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationTemplateResponseBody setApplicationTemplateId(String applicationTemplateId) {
        this.applicationTemplateId = applicationTemplateId;
        return this;
    }
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    public CreateApplicationTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
