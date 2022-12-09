// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateSlrAndSlsProjectRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("Region")
    public String region;

    public static CreateSlrAndSlsProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrAndSlsProjectRequest self = new CreateSlrAndSlsProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlrAndSlsProjectRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateSlrAndSlsProjectRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
