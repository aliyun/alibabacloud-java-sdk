// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class NotifyAddThingTopoRequest extends TeaModel {
    /**
     * <p>A JSON array of the sub-device identity information. You can use a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong> or only <strong>IotId</strong> to specify a device, such as <strong>[{&quot;productKey&quot;:&quot;a1BwAGxxx&quot;,&quot;deviceName&quot;:&quot;device1&quot;},{&quot;IotId&quot;:&quot;Q7uOhxxx&quot;}]</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;productKey&quot;:&quot;a1BwAGV****&quot;,&quot;deviceName&quot;:&quot;device1&quot;},{&quot;IotId&quot;:&quot;Q7uOhVRdZRRlDnTLv****00100&quot;}]</p>
     */
    @NameInMap("DeviceListStr")
    public String deviceListStr;

    /**
     * <p>The DeviceName of the gateway.</p>
     * <blockquote>
     * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gateway</p>
     */
    @NameInMap("GwDeviceName")
    public String gwDeviceName;

    /**
     * <p>The ID of the gateway device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <blockquote>
     * <p> If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vWxNur6BUApsqjv****4000100</p>
     */
    @NameInMap("GwIotId")
    public String gwIotId;

    /**
     * <p>The ProductKey of the product to which the gateway belongs.</p>
     * <blockquote>
     * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1T27vz****</p>
     */
    @NameInMap("GwProductKey")
    public String gwProductKey;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static NotifyAddThingTopoRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAddThingTopoRequest self = new NotifyAddThingTopoRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAddThingTopoRequest setDeviceListStr(String deviceListStr) {
        this.deviceListStr = deviceListStr;
        return this;
    }
    public String getDeviceListStr() {
        return this.deviceListStr;
    }

    public NotifyAddThingTopoRequest setGwDeviceName(String gwDeviceName) {
        this.gwDeviceName = gwDeviceName;
        return this;
    }
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    public NotifyAddThingTopoRequest setGwIotId(String gwIotId) {
        this.gwIotId = gwIotId;
        return this;
    }
    public String getGwIotId() {
        return this.gwIotId;
    }

    public NotifyAddThingTopoRequest setGwProductKey(String gwProductKey) {
        this.gwProductKey = gwProductKey;
        return this;
    }
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    public NotifyAddThingTopoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
