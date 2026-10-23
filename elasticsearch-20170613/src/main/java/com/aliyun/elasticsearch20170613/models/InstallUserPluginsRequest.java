// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallUserPluginsRequest extends TeaModel {
    /**
     * <p>The list of custom plugins.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;elasticsearchVersion&quot;: &quot;8.17.0&quot;,
     *     &quot;pluginType&quot;: &quot;CUSTOM_PLUGIN&quot;,
     *     &quot;name&quot;: &quot;analysis-stempel&quot;,
     *     &quot;description&quot;: &quot;The Stempel Analysis plugin is <em><strong>&quot;,
     *     &quot;version&quot;: &quot;8.17.0&quot;,
     *     &quot;fileVersion&quot;: &quot;CAEQnwIYgYDAzYfNj4oaI</strong></em>&quot;
     *   }
     * ]</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>Specifies whether to forcibly install custom user plugins. Default value: false. Instances with the legacy architecture do not support forced installation.</p>
     */
    @NameInMap("force")
    public Boolean force;

    public static InstallUserPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallUserPluginsRequest self = new InstallUserPluginsRequest();
        return TeaModel.build(map, self);
    }

    public InstallUserPluginsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public InstallUserPluginsRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
