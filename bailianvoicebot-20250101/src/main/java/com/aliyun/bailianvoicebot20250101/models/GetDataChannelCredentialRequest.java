// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetDataChannelCredentialRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device-3i5x4234f2j4w55e</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    public static GetDataChannelCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataChannelCredentialRequest self = new GetDataChannelCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetDataChannelCredentialRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public GetDataChannelCredentialRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
