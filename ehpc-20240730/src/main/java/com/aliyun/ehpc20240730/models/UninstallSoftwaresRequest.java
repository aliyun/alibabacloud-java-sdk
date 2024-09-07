// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UninstallSoftwaresRequest extends TeaModel {
    /**
     * <p>The information about the software systems that you want to uninstall.</p>
     */
    @NameInMap("AdditionalPackages")
    public java.util.List<UninstallSoftwaresRequestAdditionalPackages> additionalPackages;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UninstallSoftwaresRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallSoftwaresRequest self = new UninstallSoftwaresRequest();
        return TeaModel.build(map, self);
    }

    public UninstallSoftwaresRequest setAdditionalPackages(java.util.List<UninstallSoftwaresRequestAdditionalPackages> additionalPackages) {
        this.additionalPackages = additionalPackages;
        return this;
    }
    public java.util.List<UninstallSoftwaresRequestAdditionalPackages> getAdditionalPackages() {
        return this.additionalPackages;
    }

    public UninstallSoftwaresRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public static class UninstallSoftwaresRequestAdditionalPackages extends TeaModel {
        /**
         * <p>The software name.</p>
         * 
         * <strong>example:</strong>
         * <p>gromacs</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The software version.</p>
         * 
         * <strong>example:</strong>
         * <p>2024.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static UninstallSoftwaresRequestAdditionalPackages build(java.util.Map<String, ?> map) throws Exception {
            UninstallSoftwaresRequestAdditionalPackages self = new UninstallSoftwaresRequestAdditionalPackages();
            return TeaModel.build(map, self);
        }

        public UninstallSoftwaresRequestAdditionalPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UninstallSoftwaresRequestAdditionalPackages setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
