// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetAlarmDetailByIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetAlarmDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmDetailByIdRequest self = new GetAlarmDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAlarmDetailByIdRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
