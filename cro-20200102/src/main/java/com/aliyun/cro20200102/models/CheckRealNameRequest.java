// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class CheckRealNameRequest extends TeaModel {
    @NameInMap("IdentityNumber")
    public String identityNumber;

    @NameInMap("Name")
    public String name;

    public static CheckRealNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRealNameRequest self = new CheckRealNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckRealNameRequest setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
        return this;
    }
    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public CheckRealNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
