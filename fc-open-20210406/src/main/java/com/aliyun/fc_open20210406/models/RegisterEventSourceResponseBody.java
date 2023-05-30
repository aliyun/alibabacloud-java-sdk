// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RegisterEventSourceResponseBody extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("sourceArn")
    public String sourceArn;

    public static RegisterEventSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterEventSourceResponseBody self = new RegisterEventSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterEventSourceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public RegisterEventSourceResponseBody setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

}
