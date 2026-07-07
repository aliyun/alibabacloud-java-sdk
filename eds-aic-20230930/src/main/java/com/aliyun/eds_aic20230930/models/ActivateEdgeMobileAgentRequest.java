// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ActivateEdgeMobileAgentRequest extends TeaModel {
    /**
     * <p>The device form factor. Valid values:</p>
     * <ul>
     * <li>BOX</li>
     * <li>PHONE</li>
     * <li>PAD</li>
     * <li>OTHER</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BOX</p>
     */
    @NameInMap("DeviceClass")
    public String deviceClass;

    /**
     * <p>The unique identifier of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sn-0001eevqa6jeapl*****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>The extended device metadata in JSON format. The string contains information such as fingerprint, deviceModel, and firmwareVersion.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;frmwareVersion&quot;: &quot;1.0.0&quot;}</p>
     */
    @NameInMap("DeviceMeta")
    public String deviceMeta;

    /**
     * <p>The license key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lic-ez197xvdf0j5eo0*****</p>
     */
    @NameInMap("LicenseKey")
    public String licenseKey;

    public static ActivateEdgeMobileAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateEdgeMobileAgentRequest self = new ActivateEdgeMobileAgentRequest();
        return TeaModel.build(map, self);
    }

    public ActivateEdgeMobileAgentRequest setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
        return this;
    }
    public String getDeviceClass() {
        return this.deviceClass;
    }

    public ActivateEdgeMobileAgentRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ActivateEdgeMobileAgentRequest setDeviceMeta(String deviceMeta) {
        this.deviceMeta = deviceMeta;
        return this;
    }
    public String getDeviceMeta() {
        return this.deviceMeta;
    }

    public ActivateEdgeMobileAgentRequest setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
    }

}
