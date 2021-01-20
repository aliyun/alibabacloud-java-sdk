// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableHostAvailabilityRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<Integer> id;

    public static DisableHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableHostAvailabilityRequest self = new DisableHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public DisableHostAvailabilityRequest setId(java.util.List<Integer> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Integer> getId() {
        return this.id;
    }

}
