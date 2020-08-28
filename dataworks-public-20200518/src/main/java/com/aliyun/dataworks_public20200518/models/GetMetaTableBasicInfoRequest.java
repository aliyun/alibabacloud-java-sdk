// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableBasicInfoRequest extends TeaModel {
    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    public static GetMetaTableBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableBasicInfoRequest self = new GetMetaTableBasicInfoRequest();
        return TeaModel.build(map, self);
    }

}
