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
         * <p>The name of the component.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>coredns</p>
         */
        @NameInMap("component_name")
        public String componentName;

        /**
         * <p>The custom component settings that you want to use. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;CpuRequest\&quot;:\&quot;800m\&quot;}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>The version to which the component can be updated. You can call the <code>DescribeClusterAddonsVersion</code> operation to query the version to which the component can be updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.7</p>
         */
        @NameInMap("next_version")
        public String nextVersion;

        /**
         * <p>The update policy. Valid values:</p>
         * <ul>
         * <li>overwrite</li>
         * <li>canary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>canary</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <p>The current version of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.6.2</p>
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
