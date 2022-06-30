// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSurveyTemplateRequest extends TeaModel {
    @NameInMap("resourceType")
    public String resourceType;

    public static DescribeSurveyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSurveyTemplateRequest self = new DescribeSurveyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSurveyTemplateRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
