// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class InvalidateThirdPartyAppLoginStateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>com.<em>.</em>.*</p>
     */
    @NameInMap("ThirdPartyAppId")
    public String thirdPartyAppId;

    public static InvalidateThirdPartyAppLoginStateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvalidateThirdPartyAppLoginStateShrinkRequest self = new InvalidateThirdPartyAppLoginStateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvalidateThirdPartyAppLoginStateShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public InvalidateThirdPartyAppLoginStateShrinkRequest setThirdPartyAppId(String thirdPartyAppId) {
        this.thirdPartyAppId = thirdPartyAppId;
        return this;
    }
    public String getThirdPartyAppId() {
        return this.thirdPartyAppId;
    }

}
