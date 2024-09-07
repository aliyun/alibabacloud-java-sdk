// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class InstallSoftwaresRequest extends TeaModel {
    /**
     * <p>The information about the software systems that you want to install.</p>
     */
    @NameInMap("AdditionalPackages")
    public java.util.List<InstallSoftwaresRequestAdditionalPackages> additionalPackages;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static InstallSoftwaresRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallSoftwaresRequest self = new InstallSoftwaresRequest();
        return TeaModel.build(map, self);
    }

    public InstallSoftwaresRequest setAdditionalPackages(java.util.List<InstallSoftwaresRequestAdditionalPackages> additionalPackages) {
        this.additionalPackages = additionalPackages;
        return this;
    }
    public java.util.List<InstallSoftwaresRequestAdditionalPackages> getAdditionalPackages() {
        return this.additionalPackages;
    }

    public InstallSoftwaresRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public static class InstallSoftwaresRequestAdditionalPackages extends TeaModel {
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

        public static InstallSoftwaresRequestAdditionalPackages build(java.util.Map<String, ?> map) throws Exception {
            InstallSoftwaresRequestAdditionalPackages self = new InstallSoftwaresRequestAdditionalPackages();
            return TeaModel.build(map, self);
        }

        public InstallSoftwaresRequestAdditionalPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallSoftwaresRequestAdditionalPackages setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
