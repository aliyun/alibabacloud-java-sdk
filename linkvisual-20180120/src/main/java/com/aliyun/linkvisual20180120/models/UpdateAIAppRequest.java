// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateAIAppRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Level")
    public Integer level;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static UpdateAIAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIAppRequest self = new UpdateAIAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAIAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAIAppRequest setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public UpdateAIAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAIAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
