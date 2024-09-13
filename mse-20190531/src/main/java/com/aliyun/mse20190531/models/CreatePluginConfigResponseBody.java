// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreatePluginConfigResponseBody extends TeaModel {
    /**
     * <p>The plug-in configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PluginConfigID")
    public Long pluginConfigID;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>03A3E2F4-6804-5663-9D5D-2EC47A1*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePluginConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginConfigResponseBody self = new CreatePluginConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePluginConfigResponseBody setPluginConfigID(Long pluginConfigID) {
        this.pluginConfigID = pluginConfigID;
        return this;
    }
    public Long getPluginConfigID() {
        return this.pluginConfigID;
    }

    public CreatePluginConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
