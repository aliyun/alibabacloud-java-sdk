// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Name")
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

    @NameInMap("Timed")
    public Boolean timed;

    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public java.util.List<String> instanceId;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    @NameInMap("ContentEncoding")
    public String contentEncoding;

    public static RunCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandRequest self = new RunCommandRequest();
        return TeaModel.build(map, self);
    }

}
