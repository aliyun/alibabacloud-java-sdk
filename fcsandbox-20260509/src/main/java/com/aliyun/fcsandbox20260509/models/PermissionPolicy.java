// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PermissionPolicy extends TeaModel {
    /**
     * <p>The allow policy.</p>
     */
    @NameInMap("allow")
    public PermissionPolicyAllow allow;

    /**
     * <p>catalog version</p>
     */
    @NameInMap("catalogVersion")
    public Long catalogVersion;

    /**
     * <p>The deny policy.</p>
     */
    @NameInMap("deny")
    public PermissionPolicyDeny deny;

    /**
     * <p>schema version</p>
     */
    @NameInMap("schemaVersion")
    public Long schemaVersion;

    public static PermissionPolicy build(java.util.Map<String, ?> map) throws Exception {
        PermissionPolicy self = new PermissionPolicy();
        return TeaModel.build(map, self);
    }

    public PermissionPolicy setAllow(PermissionPolicyAllow allow) {
        this.allow = allow;
        return this;
    }
    public PermissionPolicyAllow getAllow() {
        return this.allow;
    }

    public PermissionPolicy setCatalogVersion(Long catalogVersion) {
        this.catalogVersion = catalogVersion;
        return this;
    }
    public Long getCatalogVersion() {
        return this.catalogVersion;
    }

    public PermissionPolicy setDeny(PermissionPolicyDeny deny) {
        this.deny = deny;
        return this;
    }
    public PermissionPolicyDeny getDeny() {
        return this.deny;
    }

    public PermissionPolicy setSchemaVersion(Long schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public Long getSchemaVersion() {
        return this.schemaVersion;
    }

    public static class PermissionPolicyAllow extends TeaModel {
        /**
         * <p>The actions.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The capabilities.</p>
         */
        @NameInMap("capabilities")
        public java.util.List<String> capabilities;

        public static PermissionPolicyAllow build(java.util.Map<String, ?> map) throws Exception {
            PermissionPolicyAllow self = new PermissionPolicyAllow();
            return TeaModel.build(map, self);
        }

        public PermissionPolicyAllow setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public PermissionPolicyAllow setCapabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

    }

    public static class PermissionPolicyDeny extends TeaModel {
        /**
         * <p>The actions.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The capabilities.</p>
         */
        @NameInMap("capabilities")
        public java.util.List<String> capabilities;

        public static PermissionPolicyDeny build(java.util.Map<String, ?> map) throws Exception {
            PermissionPolicyDeny self = new PermissionPolicyDeny();
            return TeaModel.build(map, self);
        }

        public PermissionPolicyDeny setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public PermissionPolicyDeny setCapabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

    }

}
