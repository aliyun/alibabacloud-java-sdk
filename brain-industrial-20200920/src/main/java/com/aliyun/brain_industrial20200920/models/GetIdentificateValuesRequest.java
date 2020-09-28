// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetIdentificateValuesRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static GetIdentificateValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentificateValuesRequest self = new GetIdentificateValuesRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentificateValuesRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public GetIdentificateValuesRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
