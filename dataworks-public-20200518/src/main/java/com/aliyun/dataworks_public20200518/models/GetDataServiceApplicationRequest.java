// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApplicationRequest extends TeaModel {
    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("ApplicationId")
    @Validation(required = true)
    public Long applicationId;

    public static GetDataServiceApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApplicationRequest self = new GetDataServiceApplicationRequest();
        return TeaModel.build(map, self);
    }

}
