// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetRoutineSubdomainShrinkRequest extends TeaModel {
    /**
     * <p>The parameters of the subdomain.</p>
     * <p>The parameters are in the following format:</p>
     * <pre><code>Subdomains: [
     *     &quot;subdomain-test&quot;
     * ]
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;subdomain-test&quot;]</p>
     */
    @NameInMap("Subdomains")
    public String subdomainsShrink;

    public static SetRoutineSubdomainShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRoutineSubdomainShrinkRequest self = new SetRoutineSubdomainShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetRoutineSubdomainShrinkRequest setSubdomainsShrink(String subdomainsShrink) {
        this.subdomainsShrink = subdomainsShrink;
        return this;
    }
    public String getSubdomainsShrink() {
        return this.subdomainsShrink;
    }

}
