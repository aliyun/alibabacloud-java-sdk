// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ModifyInstanceFeaturesShrinkRequest extends TeaModel {
    /**
     * <p>The plan instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-b6ga97vfo64g</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of site feature configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SiteFeatures")
    public String siteFeaturesShrink;

    public static ModifyInstanceFeaturesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceFeaturesShrinkRequest self = new ModifyInstanceFeaturesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceFeaturesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceFeaturesShrinkRequest setSiteFeaturesShrink(String siteFeaturesShrink) {
        this.siteFeaturesShrink = siteFeaturesShrink;
        return this;
    }
    public String getSiteFeaturesShrink() {
        return this.siteFeaturesShrink;
    }

}
