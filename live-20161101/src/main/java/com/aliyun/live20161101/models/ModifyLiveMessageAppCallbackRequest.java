// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppCallbackRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application whose callback settings you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
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
     * <p>The callback URL for events such as user logon, logoff, joining a group, and leaving a group. If you leave this parameter empty, callbacks are disabled. The callback URL must start with http:// or https:// and cannot contain a private IP address or a port number.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/examplecallback">http://example.aliyundoc.com/examplecallback</a></p>
     */
    @NameInMap("EventCallbackUrl")
    public String eventCallbackUrl;

    public static ModifyLiveMessageAppCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppCallbackRequest self = new ModifyLiveMessageAppCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageAppCallbackRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ModifyLiveMessageAppCallbackRequest setEventCallbackUrl(String eventCallbackUrl) {
        this.eventCallbackUrl = eventCallbackUrl;
        return this;
    }
    public String getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

}
