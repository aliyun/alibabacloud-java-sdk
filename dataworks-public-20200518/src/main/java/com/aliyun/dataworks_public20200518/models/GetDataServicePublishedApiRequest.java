// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServicePublishedApiRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("ApiId")
    @Validation(required = true)
    public Long apiId;

    public static GetDataServicePublishedApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServicePublishedApiRequest self = new GetDataServicePublishedApiRequest();
        return TeaModel.build(map, self);
    }

}
