// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSurveyJobCountRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    public static DescribeSurveyJobCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSurveyJobCountRequest self = new DescribeSurveyJobCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSurveyJobCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
