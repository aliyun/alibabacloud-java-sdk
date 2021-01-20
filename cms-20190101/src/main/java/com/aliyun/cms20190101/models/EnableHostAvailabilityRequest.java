// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableHostAvailabilityRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<Integer> id;

    public static EnableHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableHostAvailabilityRequest self = new EnableHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public EnableHostAvailabilityRequest setId(java.util.List<Integer> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Integer> getId() {
        return this.id;
    }

}
