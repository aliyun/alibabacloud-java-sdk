// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RegisterEventSourceRequest extends TeaModel {
    // 事件源资源标识符
    @NameInMap("sourceArn")
    public String sourceArn;

    // 别名或版本
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
