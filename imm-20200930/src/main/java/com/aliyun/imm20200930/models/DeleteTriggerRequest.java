// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteTriggerRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectName")
    public String projectName;

    public static DeleteTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTriggerRequest self = new DeleteTriggerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTriggerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteTriggerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
