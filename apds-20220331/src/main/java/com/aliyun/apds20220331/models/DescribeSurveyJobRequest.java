// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSurveyJobRequest extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("regionId")
    public String regionId;

    public static DescribeSurveyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSurveyJobRequest self = new DescribeSurveyJobRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSurveyJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeSurveyJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
