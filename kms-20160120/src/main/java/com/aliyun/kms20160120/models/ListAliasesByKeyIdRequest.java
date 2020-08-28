// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesByKeyIdRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAliasesByKeyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesByKeyIdRequest self = new ListAliasesByKeyIdRequest();
        return TeaModel.build(map, self);
    }

}
