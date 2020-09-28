// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetParsingTagTaskRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    public static GetParsingTagTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParsingTagTaskRequest self = new GetParsingTagTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetParsingTagTaskRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

}
