// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class TakeBreakRequest extends TeaModel {
    /**
     * <p>Break status code. Customers can define any custom break status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lunchtime</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Device ID. This parameter is meaningless and can be filled with any value.</p>
     * 
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Agent ID. If not specified, the agent mapped to the current RAM account is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static TakeBreakRequest build(java.util.Map<String, ?> map) throws Exception {
        TakeBreakRequest self = new TakeBreakRequest();
        return TeaModel.build(map, self);
    }

    public TakeBreakRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TakeBreakRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public TakeBreakRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TakeBreakRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
