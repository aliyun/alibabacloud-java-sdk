// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsRequest extends TeaModel {
    /**
     * <p>The components that you want to uninstall. The list is an array.</p>
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
         * <p>Specifies whether to release cloud resources.</p>
         */
        @NameInMap("cleanup_cloud_resources")
        public Boolean cleanupCloudResources;

        /**
         * <p>The component name.</p>
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
