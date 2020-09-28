// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListIdentModelsRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static ListIdentModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdentModelsRequest self = new ListIdentModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListIdentModelsRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public ListIdentModelsRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
