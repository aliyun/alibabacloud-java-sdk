// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobTemplateResponseBody extends TeaModel {
    /**
     * <p>The job template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>jt-xxxx</p>
     */
    @NameInMap("JobTemplateId")
    public String jobTemplateId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateResponseBody self = new CreateJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateResponseBody setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public CreateJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
