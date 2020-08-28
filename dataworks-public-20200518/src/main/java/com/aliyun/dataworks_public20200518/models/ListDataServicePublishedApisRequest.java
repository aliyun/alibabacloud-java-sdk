// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("ApiNameKeyword")
    public String apiNameKeyword;

    @NameInMap("ApiPathKeyword")
    public String apiPathKeyword;

    @NameInMap("CreatorId")
    public String creatorId;

    public static ListDataServicePublishedApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServicePublishedApisRequest self = new ListDataServicePublishedApisRequest();
        return TeaModel.build(map, self);
    }

}
