// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoRequest extends TeaModel {
    @NameInMap("AppGuid")
    @Validation(required = true)
    public String appGuid;

    public static GetMetaDBInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBInfoRequest self = new GetMetaDBInfoRequest();
        return TeaModel.build(map, self);
    }

}
