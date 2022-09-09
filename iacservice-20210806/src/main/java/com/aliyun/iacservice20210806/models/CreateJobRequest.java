// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    @NameInMap("subCommand")
    public String subCommand;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobRequest setSubCommand(String subCommand) {
        this.subCommand = subCommand;
        return this;
    }
    public String getSubCommand() {
        return this.subCommand;
    }

}
