// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageRequest extends TeaModel {
    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("Direction")
    @Validation(required = true)
    public String direction;

    @NameInMap("NextPrimaryKey")
    public String nextPrimaryKey;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetMetaTableLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableLineageRequest self = new GetMetaTableLineageRequest();
        return TeaModel.build(map, self);
    }

}
