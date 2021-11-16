// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterAddonsRequest extends TeaModel {
    // Request body，类型是对象数组
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
        // 组件名称
        @NameInMap("component_name")
        public String componentName;

        // 可升级版本
        @NameInMap("next_version")
        public String nextVersion;

        // 当前版本
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

        public UpgradeClusterAddonsRequestBody setNextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }
        public String getNextVersion() {
            return this.nextVersion;
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
