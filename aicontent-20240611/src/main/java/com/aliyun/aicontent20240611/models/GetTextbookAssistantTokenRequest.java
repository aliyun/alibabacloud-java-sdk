// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetTextbookAssistantTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>700d4d9411efbe6e0</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("deviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25032PS56C</p>
     */
    @NameInMap("model")
    public String model;

    public static GetTextbookAssistantTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTextbookAssistantTokenRequest self = new GetTextbookAssistantTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTextbookAssistantTokenRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetTextbookAssistantTokenRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

}
