// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaColumnLineageRequest extends TeaModel {
    @NameInMap("ColumnGuid")
    @Validation(required = true)
    public String columnGuid;

    @NameInMap("Direction")
    @Validation(required = true)
    public String direction;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetMetaColumnLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaColumnLineageRequest self = new GetMetaColumnLineageRequest();
        return TeaModel.build(map, self);
    }

}
