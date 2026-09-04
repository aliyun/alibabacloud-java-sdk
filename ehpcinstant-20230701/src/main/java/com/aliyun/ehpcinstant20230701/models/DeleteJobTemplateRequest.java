// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteJobTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the job template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jt-xxxx</p>
     */
    @NameInMap("JobTemplateId")
    public String jobTemplateId;

    public static DeleteJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobTemplateRequest self = new DeleteJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobTemplateRequest setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

}
