// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBTableListRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AppGuid")
    @Validation(required = true)
    public String appGuid;

    public static GetMetaDBTableListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBTableListRequest self = new GetMetaDBTableListRequest();
        return TeaModel.build(map, self);
    }

}
