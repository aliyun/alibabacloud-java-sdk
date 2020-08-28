// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretsRequest extends TeaModel {
    @NameInMap("FetchTags")
    public String fetchTags;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsRequest self = new ListSecretsRequest();
        return TeaModel.build(map, self);
    }

}
