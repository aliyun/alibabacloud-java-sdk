// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsRequest extends TeaModel {
    /**
     * <p>The add-on information.</p>
     */
    @NameInMap("Addons")
    public java.util.List<UnInstallClusterAddonsRequestAddons> addons;

    /**
     * <p>The ID of the cluster.</p>
     * <p>The target cluster must be in the running state. You can call DescribeClustersV1 to query the cluster state.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

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

    public UnInstallClusterAddonsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public static class UnInstallClusterAddonsRequestAddons extends TeaModel {
        /**
         * <p>The name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>edge-csi-lite</p>
         */
        @NameInMap("Name")
        public String name;

        public static UnInstallClusterAddonsRequestAddons build(java.util.Map<String, ?> map) throws Exception {
            UnInstallClusterAddonsRequestAddons self = new UnInstallClusterAddonsRequestAddons();
            return TeaModel.build(map, self);
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
