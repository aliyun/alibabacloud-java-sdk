// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ModifyInstanceFeaturesRequest extends TeaModel {
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
    public java.util.List<ModifyInstanceFeaturesRequestSiteFeatures> siteFeatures;

    public static ModifyInstanceFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceFeaturesRequest self = new ModifyInstanceFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceFeaturesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceFeaturesRequest setSiteFeatures(java.util.List<ModifyInstanceFeaturesRequestSiteFeatures> siteFeatures) {
        this.siteFeatures = siteFeatures;
        return this;
    }
    public java.util.List<ModifyInstanceFeaturesRequestSiteFeatures> getSiteFeatures() {
        return this.siteFeatures;
    }

    public static class ModifyInstanceFeaturesRequestSiteFeatures extends TeaModel {
        /**
         * <p>The site feature configurations to modify.</p>
         * 
         * <strong>example:</strong>
         * <p>network_optimization|smart_routing,loadbalance</p>
         */
        @NameInMap("Features")
        public String features;

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>151097616427232</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        public static ModifyInstanceFeaturesRequestSiteFeatures build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceFeaturesRequestSiteFeatures self = new ModifyInstanceFeaturesRequestSiteFeatures();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceFeaturesRequestSiteFeatures setFeatures(String features) {
            this.features = features;
            return this;
        }
        public String getFeatures() {
            return this.features;
        }

        public ModifyInstanceFeaturesRequestSiteFeatures setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

    }

}
