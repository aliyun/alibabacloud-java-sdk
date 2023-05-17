// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CheckUsedPropertyRequest extends TeaModel {
    @NameInMap("PropertyId")
    public Long propertyId;

    public static CheckUsedPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUsedPropertyRequest self = new CheckUsedPropertyRequest();
        return TeaModel.build(map, self);
    }

    public CheckUsedPropertyRequest setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public Long getPropertyId() {
        return this.propertyId;
    }

}
