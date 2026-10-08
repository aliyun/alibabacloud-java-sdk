// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class PersonReferenceConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable character reference configuration. Default value: false.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    public static PersonReferenceConfig build(java.util.Map<String, ?> map) throws Exception {
        PersonReferenceConfig self = new PersonReferenceConfig();
        return TeaModel.build(map, self);
    }

    public PersonReferenceConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
