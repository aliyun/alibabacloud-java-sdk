// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApplicationsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectIdList")
    @Validation(required = true)
    public String projectIdList;

    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    public static ListDataServiceApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApplicationsRequest self = new ListDataServiceApplicationsRequest();
        return TeaModel.build(map, self);
    }

}
