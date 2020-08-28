// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityEntityRequest extends TeaModel {
    @NameInMap("EntityId")
    @Validation(required = true)
    public Long entityId;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("EnvType")
    @Validation(required = true)
    public String envType;

    public static DeleteQualityEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityEntityRequest self = new DeleteQualityEntityRequest();
        return TeaModel.build(map, self);
    }

}
