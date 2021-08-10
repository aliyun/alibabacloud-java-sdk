// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCopyrightPersonDetailRequest extends TeaModel {
    @NameInMap("PersonId")
    public Integer personId;

    @NameInMap("UseType")
    public String useType;

    public static GetCopyrightPersonDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCopyrightPersonDetailRequest self = new GetCopyrightPersonDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCopyrightPersonDetailRequest setPersonId(Integer personId) {
        this.personId = personId;
        return this;
    }
    public Integer getPersonId() {
        return this.personId;
    }

    public GetCopyrightPersonDetailRequest setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}
