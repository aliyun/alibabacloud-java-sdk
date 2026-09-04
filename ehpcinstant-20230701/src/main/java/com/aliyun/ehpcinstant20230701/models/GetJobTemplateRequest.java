// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetJobTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the job template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jt-xxxx</p>
     */
    @NameInMap("JobTemplateId")
    public String jobTemplateId;

    public static GetJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobTemplateRequest self = new GetJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetJobTemplateRequest setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

}
