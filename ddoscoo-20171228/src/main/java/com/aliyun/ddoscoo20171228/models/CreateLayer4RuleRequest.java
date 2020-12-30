// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer4RuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Listeners")
    public String listeners;

    public static CreateLayer4RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RuleRequest self = new CreateLayer4RuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateLayer4RuleRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
