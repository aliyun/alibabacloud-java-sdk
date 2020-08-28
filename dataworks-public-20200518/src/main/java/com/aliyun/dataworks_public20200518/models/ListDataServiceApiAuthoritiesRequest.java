// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiAuthoritiesRequest extends TeaModel {
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

    public static ListDataServiceApiAuthoritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiAuthoritiesRequest self = new ListDataServiceApiAuthoritiesRequest();
        return TeaModel.build(map, self);
    }

}
