// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedApisRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("ApiNameKeyword")
    public String apiNameKeyword;

    public static ListDataServiceAuthorizedApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedApisRequest self = new ListDataServiceAuthorizedApisRequest();
        return TeaModel.build(map, self);
    }

}
