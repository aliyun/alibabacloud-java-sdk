// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class DeletePidProjectRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    public static DeletePidProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePidProjectRequest self = new DeletePidProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeletePidProjectRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

}
