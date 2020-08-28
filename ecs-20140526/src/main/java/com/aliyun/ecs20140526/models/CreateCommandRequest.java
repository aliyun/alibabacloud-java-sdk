// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("CommandContent")
    @Validation(required = true)
    public String commandContent;

    @NameInMap("WorkingDir")
    public String workingDir;

    @NameInMap("Timeout")
    public Long timeout;

    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    public static CreateCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandRequest self = new CreateCommandRequest();
        return TeaModel.build(map, self);
    }

}
