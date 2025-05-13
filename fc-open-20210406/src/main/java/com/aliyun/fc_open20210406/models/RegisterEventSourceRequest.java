// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RegisterEventSourceRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the event source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:eventbridge:cn-shanghai:123456:eventbus/mns-test/rule/fc-test1/target/abc</p>
     */
    @NameInMap("sourceArn")
    public String sourceArn;

    /**
     * <p>The version or alias of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static RegisterEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterEventSourceRequest self = new RegisterEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterEventSourceRequest setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public RegisterEventSourceRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
