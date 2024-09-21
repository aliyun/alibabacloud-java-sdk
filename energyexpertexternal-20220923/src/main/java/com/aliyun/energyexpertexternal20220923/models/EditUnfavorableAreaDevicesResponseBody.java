// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class EditUnfavorableAreaDevicesResponseBody extends TeaModel {
    @NameInMap("data")
    public Boolean data;

    @NameInMap("requestId")
    public String requestId;

    public static EditUnfavorableAreaDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditUnfavorableAreaDevicesResponseBody self = new EditUnfavorableAreaDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public EditUnfavorableAreaDevicesResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public EditUnfavorableAreaDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
