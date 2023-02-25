// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditRoutineConfRequest extends TeaModel {
    /**
     * <p>The description of the routine.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configurations of the specified environment.</p>
     */
    @NameInMap("EnvConf")
    public java.util.Map<String, ?> envConf;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

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

}
