// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppDisableRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ab6b5740****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>Specifies whether to disable the interactive messaging application.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Disable")
    public Boolean disable;

    public static ModifyLiveMessageAppDisableRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppDisableRequest self = new ModifyLiveMessageAppDisableRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppDisableRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageAppDisableRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ModifyLiveMessageAppDisableRequest setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }
    public Boolean getDisable() {
        return this.disable;
    }

}
