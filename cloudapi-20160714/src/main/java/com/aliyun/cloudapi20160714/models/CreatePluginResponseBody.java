// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePluginResponseBody extends TeaModel {
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("TagStatus")
    public Boolean tagStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginResponseBody self = new CreatePluginResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePluginResponseBody setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public CreatePluginResponseBody setTagStatus(Boolean tagStatus) {
        this.tagStatus = tagStatus;
        return this;
    }
    public Boolean getTagStatus() {
        return this.tagStatus;
    }

    public CreatePluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
