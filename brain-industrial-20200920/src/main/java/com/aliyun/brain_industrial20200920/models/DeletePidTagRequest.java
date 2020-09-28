// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class DeletePidTagRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("PidTagId")
    @Validation(required = true)
    public String pidTagId;

    public static DeletePidTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePidTagRequest self = new DeletePidTagRequest();
        return TeaModel.build(map, self);
    }

    public DeletePidTagRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public DeletePidTagRequest setPidTagId(String pidTagId) {
        this.pidTagId = pidTagId;
        return this;
    }
    public String getPidTagId() {
        return this.pidTagId;
    }

}
