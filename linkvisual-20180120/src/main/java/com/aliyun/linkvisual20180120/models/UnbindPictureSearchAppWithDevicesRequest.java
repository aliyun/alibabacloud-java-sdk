// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UnbindPictureSearchAppWithDevicesRequest extends TeaModel {
    /**
     * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a502d3fbab8410e8fd4be9037c7****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The list of device IoT IDs. You can specify the IoT IDs of V-series edge all-in-one machines or cameras.</p>
     * <p>An IoT ID is the unique identifier issued by IoT Platform for a device. You can call the IoT Platform <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the IoT ID.</p>
     * <p>You can specify up to 20 device IoT IDs in a single call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VrJwPGjC1sJlqPjZA3cxg4****</p>
     */
    @NameInMap("DeviceIotIds")
    public java.util.List<String> deviceIotIds;

    /**
     * <p>The instance ID.</p>
     * <ul>
     * <li>Enterprise Enterprise instance: You must specify this parameter. You can view the ID of your Enterprise Enterprise instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</li>
     * <li>Public instance: You do not need to specify this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iot-060a****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static UnbindPictureSearchAppWithDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPictureSearchAppWithDevicesRequest self = new UnbindPictureSearchAppWithDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPictureSearchAppWithDevicesRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public UnbindPictureSearchAppWithDevicesRequest setDeviceIotIds(java.util.List<String> deviceIotIds) {
        this.deviceIotIds = deviceIotIds;
        return this;
    }
    public java.util.List<String> getDeviceIotIds() {
        return this.deviceIotIds;
    }

    public UnbindPictureSearchAppWithDevicesRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
