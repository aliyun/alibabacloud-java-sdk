// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ClearFaceDeviceDBRequest extends TeaModel {
    /**
     * <p>The name of the device corresponding to the V-series edge all-in-one machine. On the <strong>Basic Information</strong> tab of the <strong>Host Details</strong> page for the V-series edge all-in-one machine in the Edge Computing console, find the <strong>Video Gateway</strong> information and obtain the <strong>DeviceName</strong> value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDevice_1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The instance ID.</p>
     * <p>You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console. If an ID value exists, you must pass this ID value. Otherwise, the call fails.</p>
     * <blockquote>
     * <p>If a public instance does not have an ID value, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The business isolation ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The unique identifier of the product to which the device corresponding to the V-series edge all-in-one machine belongs. On the <strong>Basic Information</strong> tab of the <strong>Host Details</strong> page for the V-series edge all-in-one machine in the Edge Computing console, find the <strong>Video Gateway</strong> information and obtain the <strong>ProductKey</strong> value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Wmy******</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static ClearFaceDeviceDBRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearFaceDeviceDBRequest self = new ClearFaceDeviceDBRequest();
        return TeaModel.build(map, self);
    }

    public ClearFaceDeviceDBRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ClearFaceDeviceDBRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ClearFaceDeviceDBRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public ClearFaceDeviceDBRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
