// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetRoutineSubdomainRequest extends TeaModel {
    @NameInMap("Subdomains")
    public java.util.Map<String, ?> subdomains;

    public static SetRoutineSubdomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRoutineSubdomainRequest self = new SetRoutineSubdomainRequest();
        return TeaModel.build(map, self);
    }

    public SetRoutineSubdomainRequest setSubdomains(java.util.Map<String, ?> subdomains) {
        this.subdomains = subdomains;
        return this;
    }
    public java.util.Map<String, ?> getSubdomains() {
        return this.subdomains;
    }

}
