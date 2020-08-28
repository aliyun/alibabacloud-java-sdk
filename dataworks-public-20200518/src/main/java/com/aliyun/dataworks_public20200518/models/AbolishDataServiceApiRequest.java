// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AbolishDataServiceApiRequest extends TeaModel {
    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("ApiId")
    @Validation(required = true)
    public Long apiId;

    public static AbolishDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AbolishDataServiceApiRequest self = new AbolishDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

}
