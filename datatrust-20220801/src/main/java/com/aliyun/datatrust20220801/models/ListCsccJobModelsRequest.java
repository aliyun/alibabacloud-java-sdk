// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobModelsRequest extends TeaModel {
    @NameInMap("JobClassifyType")
    public Integer jobClassifyType;

    @NameInMap("ProjectId")
    public Long projectId;

    public static ListCsccJobModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobModelsRequest self = new ListCsccJobModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccJobModelsRequest setJobClassifyType(Integer jobClassifyType) {
        this.jobClassifyType = jobClassifyType;
        return this;
    }
    public Integer getJobClassifyType() {
        return this.jobClassifyType;
    }

    public ListCsccJobModelsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
