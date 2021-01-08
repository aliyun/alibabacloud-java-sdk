// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListScenesRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    public static ListScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScenesRequest self = new ListScenesRequest();
        return TeaModel.build(map, self);
    }

    public ListScenesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
