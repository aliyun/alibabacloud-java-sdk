// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateContainerGroupFromTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    public String containerGroupId;

    public static CreateContainerGroupFromTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerGroupFromTemplateResponse self = new CreateContainerGroupFromTemplateResponse();
        return TeaModel.build(map, self);
    }

}
