// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateSetRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("SetName")
    public String setName;

    public static CreateSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSetRequest self = new CreateSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateSetRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateSetRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public CreateSetRequest setSetName(String setName) {
        this.setName = setName;
        return this;
    }
    public String getSetName() {
        return this.setName;
    }

}
