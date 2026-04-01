// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RemovePluginRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;name&quot;: &quot;pluginName&quot;,
     *     &quot;elasticsearchVersion&quot;: &quot;8.17.0&quot;,
     *     &quot;version&quot;: &quot;8.17.0&quot;,
     *     &quot;fileVersion&quot;: &quot;CAEQbxiBgIDMoJqe6hkiIGYzM****&quot;,
     *     &quot;state&quot;: &quot;UNINSTALLED&quot;,
     *     &quot;source&quot;: &quot;USER&quot;,
     *     &quot;pluginType&quot;: &quot;CUSTOM_PLUGIN&quot;
     *   }
     * ]</p>
     */
    @NameInMap("body")
    public String body;

    public static RemovePluginRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePluginRequest self = new RemovePluginRequest();
        return TeaModel.build(map, self);
    }

    public RemovePluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
