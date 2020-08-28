// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableFullInfoRequest extends TeaModel {
    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetMetaTableFullInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableFullInfoRequest self = new GetMetaTableFullInfoRequest();
        return TeaModel.build(map, self);
    }

}
