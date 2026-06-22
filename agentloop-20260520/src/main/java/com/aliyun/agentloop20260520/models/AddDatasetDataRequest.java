// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class AddDatasetDataRequest extends TeaModel {
    @NameInMap("dataArray")
    public java.util.List<java.util.Map<String, ?>> dataArray;

    /**
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static AddDatasetDataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDatasetDataRequest self = new AddDatasetDataRequest();
        return TeaModel.build(map, self);
    }

    public AddDatasetDataRequest setDataArray(java.util.List<java.util.Map<String, ?>> dataArray) {
        this.dataArray = dataArray;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getDataArray() {
        return this.dataArray;
    }

    public AddDatasetDataRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
