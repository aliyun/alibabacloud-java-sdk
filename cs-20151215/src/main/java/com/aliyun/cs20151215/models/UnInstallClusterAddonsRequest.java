// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsRequest extends TeaModel {
    /**
     * <p>The list of add-ons to uninstall.</p>
     */
    @NameInMap("addons")
    public java.util.List<UnInstallClusterAddonsRequestAddons> addons;

    public static UnInstallClusterAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        UnInstallClusterAddonsRequest self = new UnInstallClusterAddonsRequest();
        return TeaModel.build(map, self);
    }

    public UnInstallClusterAddonsRequest setAddons(java.util.List<UnInstallClusterAddonsRequestAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<UnInstallClusterAddonsRequestAddons> getAddons() {
        return this.addons;
    }

    public static class UnInstallClusterAddonsRequestAddons extends TeaModel {
        /**
         * <p>Specifies whether to clean up related cloud resources during uninstallation.</p>
         * <ul>
         * <li>true: clean up</li>
         * <li>false: retain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cleanup_cloud_resources")
        public Boolean cleanupCloudResources;

        /**
         * <p>The name of the add-on to uninstall. You can call the <a href="https://help.aliyun.com/document_detail/2667940.html">ListClusterAddonInstances</a> operation to query the installed add-ons.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-node-problem-detector</p>
         */
        @NameInMap("name")
        public String name;

        public static UnInstallClusterAddonsRequestAddons build(java.util.Map<String, ?> map) throws Exception {
            UnInstallClusterAddonsRequestAddons self = new UnInstallClusterAddonsRequestAddons();
            return TeaModel.build(map, self);
        }

        public UnInstallClusterAddonsRequestAddons setCleanupCloudResources(Boolean cleanupCloudResources) {
            this.cleanupCloudResources = cleanupCloudResources;
            return this;
        }
        public Boolean getCleanupCloudResources() {
            return this.cleanupCloudResources;
        }

        public UnInstallClusterAddonsRequestAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
