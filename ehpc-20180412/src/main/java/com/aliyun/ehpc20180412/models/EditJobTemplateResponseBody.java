// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class EditJobTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-job-tmpl-6RxO5y****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static EditJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditJobTemplateResponseBody self = new EditJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public EditJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditJobTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
