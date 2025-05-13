// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RegisterEventSourceResponseBody extends TeaModel {
    /**
     * <p>The time when the event source was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-08-15T16:06:05.000+0000</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:eventbridge:cn-shanghai:123456:eventbus/mns-test/rule/fc-test1/target/abc</p>
     */
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
