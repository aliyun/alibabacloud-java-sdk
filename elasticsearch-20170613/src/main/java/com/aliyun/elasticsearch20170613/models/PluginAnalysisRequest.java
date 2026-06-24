// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class PluginAnalysisRequest extends TeaModel {
    /**
     * <p>Request body parameters  </p>
     * <pre><code class="language-json">
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;name&quot;: &quot;plugin_name.zip&quot;,// plugin name
     *     &quot;ossObject&quot;: {
     *       &quot;bucketName&quot;: &quot;bucketName&quot;,// oss bucket name
     *       &quot;key&quot;: &quot;my_plugin_dir/plugin_name.zip&quot; // oss file name 
     *     }
     *   }</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>Whether to perform pre-upgrade validation:  </p>
     * <ul>
     * <li>true: Validate only  </li>
     * <li>false: Upload directly</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public String dryRun;

    public static PluginAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        PluginAnalysisRequest self = new PluginAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public PluginAnalysisRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PluginAnalysisRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

}
