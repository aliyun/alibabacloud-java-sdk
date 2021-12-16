// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditRoutineConfRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EnvConf")
    public java.util.Map<String, ?> envConf;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static EditRoutineConfRequest build(java.util.Map<String, ?> map) throws Exception {
        EditRoutineConfRequest self = new EditRoutineConfRequest();
        return TeaModel.build(map, self);
    }

    public EditRoutineConfRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EditRoutineConfRequest setEnvConf(java.util.Map<String, ?> envConf) {
        this.envConf = envConf;
        return this;
    }
    public java.util.Map<String, ?> getEnvConf() {
        return this.envConf;
    }

    public EditRoutineConfRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EditRoutineConfRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
