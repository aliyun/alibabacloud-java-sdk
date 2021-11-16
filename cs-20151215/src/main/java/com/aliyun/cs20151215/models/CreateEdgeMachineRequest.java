// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateEdgeMachineRequest extends TeaModel {
    // hostname
    @NameInMap("hostname")
    public String hostname;

    // model
    @NameInMap("model")
    public String model;

    // sn
    @NameInMap("sn")
    public String sn;

    public static CreateEdgeMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeMachineRequest self = new CreateEdgeMachineRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeMachineRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateEdgeMachineRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateEdgeMachineRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
