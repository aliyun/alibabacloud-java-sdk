// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateRetcodeAppRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RetcodeAppName")
    public String retcodeAppName;

    @NameInMap("RetcodeAppType")
    public String retcodeAppType;

    public static CreateRetcodeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRetcodeAppRequest self = new CreateRetcodeAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateRetcodeAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRetcodeAppRequest setRetcodeAppName(String retcodeAppName) {
        this.retcodeAppName = retcodeAppName;
        return this;
    }
    public String getRetcodeAppName() {
        return this.retcodeAppName;
    }

    public CreateRetcodeAppRequest setRetcodeAppType(String retcodeAppType) {
        this.retcodeAppType = retcodeAppType;
        return this;
    }
    public String getRetcodeAppType() {
        return this.retcodeAppType;
    }

}
