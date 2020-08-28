// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBusinessRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("BusinessId")
    @Validation(required = true)
    public Long businessId;

    public static GetBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessRequest self = new GetBusinessRequest();
        return TeaModel.build(map, self);
    }

}
