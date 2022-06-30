// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateFileJobRequest extends TeaModel {
    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("surveyJobId")
    public Long surveyJobId;

    @NameInMap("regionId")
    public String regionId;

    public static CreateFileJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileJobRequest self = new CreateFileJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileJobRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateFileJobRequest setSurveyJobId(Long surveyJobId) {
        this.surveyJobId = surveyJobId;
        return this;
    }
    public Long getSurveyJobId() {
        return this.surveyJobId;
    }

    public CreateFileJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
