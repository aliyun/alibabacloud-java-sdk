// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRetcodeAppRequest extends TeaModel {
    @NameInMap("RetcodeAppName")
    @Validation(required = true)
    public String retcodeAppName;

    @NameInMap("RetcodeAppType")
    @Validation(required = true)
    public String retcodeAppType;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static CreateRetcodeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRetcodeAppRequest self = new CreateRetcodeAppRequest();
        return TeaModel.build(map, self);
    }

}
