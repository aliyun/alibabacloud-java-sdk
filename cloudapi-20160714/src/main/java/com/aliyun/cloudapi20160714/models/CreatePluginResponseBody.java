// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePluginResponseBody extends TeaModel {
    /**
     * <p>The ID of the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>1f3bde29b43d4d53989248327ff737f2</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EF924FE4-2EDD-4CD3-89EC-34E4708574E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the plug-in is successfully marked.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TagStatus")
    public Boolean tagStatus;

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

    public CreatePluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePluginResponseBody setTagStatus(Boolean tagStatus) {
        this.tagStatus = tagStatus;
        return this;
    }
    public Boolean getTagStatus() {
        return this.tagStatus;
    }

}
