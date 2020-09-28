// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class DeletePidDataProcessRequest extends TeaModel {
    @NameInMap("PidDataProcessId")
    @Validation(required = true)
    public String pidDataProcessId;

    public static DeletePidDataProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePidDataProcessRequest self = new DeletePidDataProcessRequest();
        return TeaModel.build(map, self);
    }

    public DeletePidDataProcessRequest setPidDataProcessId(String pidDataProcessId) {
        this.pidDataProcessId = pidDataProcessId;
        return this;
    }
    public String getPidDataProcessId() {
        return this.pidDataProcessId;
    }

}
