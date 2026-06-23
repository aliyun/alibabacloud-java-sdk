// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class InvokePluginRequest extends TeaModel {
    /**
     * <p>Request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;query&quot;: &quot;介绍一下贵金属业务&quot;,
     *         &quot;filters&quot;: [
     *             {
     *                 &quot;libraryId&quot;: &quot;9xznrxw&quot;
     *             }
     *         ],
     *         &quot;topK&quot;: 1
     *     }</p>
     */
    @NameInMap("params")
    public java.util.Map<String, ?> params;

    /**
     * <p>The plugin ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3mj87da7zr</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    public static InvokePluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokePluginRequest self = new InvokePluginRequest();
        return TeaModel.build(map, self);
    }

    public InvokePluginRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public InvokePluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
