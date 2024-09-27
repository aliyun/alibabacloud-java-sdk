// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class EditProhibitedDevicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9bc20a5a-b26b-4c28-922a-7cd10b61f96f</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EditProhibitedDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditProhibitedDevicesResponseBody self = new EditProhibitedDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public EditProhibitedDevicesResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public EditProhibitedDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
