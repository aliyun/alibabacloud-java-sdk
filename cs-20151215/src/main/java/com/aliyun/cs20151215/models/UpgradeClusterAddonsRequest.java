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
         */
        @NameInMap("component_name")
        public String componentName;

        /**
         * <p>The custom component settings that you want to use. The value is a JSON string.</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>The version to which the component can be updated. You can call the `DescribeClusterAddonsVersion` operation to query the version to which the component can be updated.</p>
         */
        @NameInMap("next_version")
        public String nextVersion;

        /**
         * <p>The update policy. Valid values:</p>
         * <br>
         * <p>*   overwrite</p>
         * <p>*   canary</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <p>The current version of the component.</p>
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
