// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppDisableResponseBody extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * 
     * <strong>example:</strong>
     * <p>ab6b5740****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
     * 
     * <strong>example:</strong>
     * <p>H4sIAAAAAAAE/wBwAI//zguHB+lYCilkv7diSkk4GhHQAvMXs5tWyI+I09+uEBiB5sqa28ycJSJFmsd50Mhz8nDrvvqmti+fVaNLC5CMgLvNIy48v1aV9x74LRNFN0+Dxd2Al51xuDNkEIDaEwjqfyxscTXjSr0iQjHu2WgkpQAAAP//AQAA//+yR5XCc****</p>
     */
    @NameInMap("AppSign")
    public String appSign;

    /**
     * <p>Indicates whether the interactive messaging application is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Disable")
    public Boolean disable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6AA1AE11-EA78-1FD4-A966-6BA843073F6D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLiveMessageAppDisableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppDisableResponseBody self = new ModifyLiveMessageAppDisableResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppDisableResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageAppDisableResponseBody setAppSign(String appSign) {
        this.appSign = appSign;
        return this;
    }
    public String getAppSign() {
        return this.appSign;
    }

    public ModifyLiveMessageAppDisableResponseBody setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }
    public Boolean getDisable() {
        return this.disable;
    }

    public ModifyLiveMessageAppDisableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
