// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRetcodeAppRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DeleteRetcodeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRetcodeAppRequest self = new DeleteRetcodeAppRequest();
        return TeaModel.build(map, self);
    }

}
