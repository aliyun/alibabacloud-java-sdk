// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ConnectionType")
    @Validation(required = true)
    public String connectionType;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("EnvType")
    @Validation(required = true)
    public Integer envType;

    @NameInMap("Content")
    @Validation(required = true)
    public String content;

    public static CreateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionRequest self = new CreateConnectionRequest();
        return TeaModel.build(map, self);
    }

}
