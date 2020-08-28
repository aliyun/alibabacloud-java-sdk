// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretVersionIdsRequest extends TeaModel {
    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("IncludeDeprecated")
    public String includeDeprecated;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSecretVersionIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretVersionIdsRequest self = new ListSecretVersionIdsRequest();
        return TeaModel.build(map, self);
    }

}
