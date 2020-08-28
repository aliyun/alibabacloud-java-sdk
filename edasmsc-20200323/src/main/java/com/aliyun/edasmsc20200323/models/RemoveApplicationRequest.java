// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class RemoveApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    public static RemoveApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationRequest self = new RemoveApplicationRequest();
        return TeaModel.build(map, self);
    }

}
