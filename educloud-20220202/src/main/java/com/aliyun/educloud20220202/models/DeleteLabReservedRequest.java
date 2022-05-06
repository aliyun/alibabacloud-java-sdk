// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DeleteLabReservedRequest extends TeaModel {
    @NameInMap("ReservedId")
    public String reservedId;

    public static DeleteLabReservedRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabReservedRequest self = new DeleteLabReservedRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLabReservedRequest setReservedId(String reservedId) {
        this.reservedId = reservedId;
        return this;
    }
    public String getReservedId() {
        return this.reservedId;
    }

}
