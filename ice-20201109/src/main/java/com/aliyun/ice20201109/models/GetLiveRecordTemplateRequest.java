// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveRecordTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ab0e3e76-1e9d-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordTemplateRequest self = new GetLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordTemplateRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetLiveRecordTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
