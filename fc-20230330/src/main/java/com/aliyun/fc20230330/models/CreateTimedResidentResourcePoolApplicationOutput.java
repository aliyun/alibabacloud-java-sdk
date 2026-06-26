// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateTimedResidentResourcePoolApplicationOutput extends TeaModel {
    @NameInMap("applicationStatus")
    public String applicationStatus;

    @NameInMap("timedPoolId")
    public String timedPoolId;

    public static CreateTimedResidentResourcePoolApplicationOutput build(java.util.Map<String, ?> map) throws Exception {
        CreateTimedResidentResourcePoolApplicationOutput self = new CreateTimedResidentResourcePoolApplicationOutput();
        return TeaModel.build(map, self);
    }

    public CreateTimedResidentResourcePoolApplicationOutput setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
        return this;
    }
    public String getApplicationStatus() {
        return this.applicationStatus;
    }

    public CreateTimedResidentResourcePoolApplicationOutput setTimedPoolId(String timedPoolId) {
        this.timedPoolId = timedPoolId;
        return this;
    }
    public String getTimedPoolId() {
        return this.timedPoolId;
    }

}
