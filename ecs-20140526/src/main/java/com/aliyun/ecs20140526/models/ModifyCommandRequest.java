// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCommandRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CommandId")
    @Validation(required = true)
    public String commandId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("CommandContent")
    public String commandContent;

    @NameInMap("WorkingDir")
    public String workingDir;

    @NameInMap("Timeout")
    public Long timeout;

    public static ModifyCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommandRequest self = new ModifyCommandRequest();
        return TeaModel.build(map, self);
    }

}
