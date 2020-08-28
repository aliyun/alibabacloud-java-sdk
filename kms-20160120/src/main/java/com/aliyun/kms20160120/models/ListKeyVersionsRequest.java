// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeyVersionsRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListKeyVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKeyVersionsRequest self = new ListKeyVersionsRequest();
        return TeaModel.build(map, self);
    }

}
