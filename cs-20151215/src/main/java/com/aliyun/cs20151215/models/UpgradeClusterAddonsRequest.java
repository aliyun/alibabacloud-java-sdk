// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterAddonsRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
     */
    @NameInMap("body")
    public java.util.List<UpgradeClusterAddonsRequestBody> body;

    public static UpgradeClusterAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterAddonsRequest self = new UpgradeClusterAddonsRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterAddonsRequest setBody(java.util.List<UpgradeClusterAddonsRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<UpgradeClusterAddonsRequestBody> getBody() {
        return this.body;
    }

    public static class UpgradeClusterAddonsRequestBody extends TeaModel {
        /**
         * <p>The component name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>coredns</p>
         */
        @NameInMap("component_name")
        public String componentName;

        /**
         * <p>The custom parameters of the component, encoded as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CpuRequest&quot;:&quot;800m&quot;}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>The target version to which you want to upgrade. You can call the <code>DescribeAddon</code> operation to query the versions to which the component can be upgraded.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.11.3.5-5321daf49-aliyun</p>
         */
        @NameInMap("next_version")
        public String nextVersion;

        /**
         * <p>The component upgrade policy. Valid values:</p>
         * <ul>
         * <li>overwrite: overwrites the existing version.</li>
         * <li>canary: performs a canary upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>canary</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <p>The current component version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.11.3.2-f57ea7ed6-aliyun</p>
         */
        @NameInMap("version")
        public String version;

        public static UpgradeClusterAddonsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpgradeClusterAddonsRequestBody self = new UpgradeClusterAddonsRequestBody();
            return TeaModel.build(map, self);
        }

        public UpgradeClusterAddonsRequestBody setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public UpgradeClusterAddonsRequestBody setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public UpgradeClusterAddonsRequestBody setNextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }
        public String getNextVersion() {
            return this.nextVersion;
        }

        public UpgradeClusterAddonsRequestBody setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public UpgradeClusterAddonsRequestBody setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
