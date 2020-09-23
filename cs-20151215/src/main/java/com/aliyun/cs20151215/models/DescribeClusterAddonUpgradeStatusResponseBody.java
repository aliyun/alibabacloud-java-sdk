// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonUpgradeStatusResponseBody extends TeaModel {
    // 组件信息。
    @NameInMap("addon_info")
    public DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo addonInfo;

    // 是否能够升级。
    @NameInMap("can_upgrade")
    public Boolean canUpgrade;

    // 模板信息，采用base64加密。
    @NameInMap("template")
    public String template;

    public static DescribeClusterAddonUpgradeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonUpgradeStatusResponseBody self = new DescribeClusterAddonUpgradeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonUpgradeStatusResponseBody setAddonInfo(DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo addonInfo) {
        this.addonInfo = addonInfo;
        return this;
    }
    public DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo getAddonInfo() {
        return this.addonInfo;
    }

    public DescribeClusterAddonUpgradeStatusResponseBody setCanUpgrade(Boolean canUpgrade) {
        this.canUpgrade = canUpgrade;
        return this;
    }
    public Boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public DescribeClusterAddonUpgradeStatusResponseBody setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public static class DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo extends TeaModel {
        // Addon类别。
        @NameInMap("category")
        public String category;

        // 组件名称。
        @NameInMap("component_name")
        public String componentName;

        // 升级说明信息。
        @NameInMap("message")
        public String message;

        // 组件版本。
        @NameInMap("version")
        public String version;

        // 组件配置文件。
        @NameInMap("yaml")
        public String yaml;

        public static DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo self = new DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo setYaml(String yaml) {
            this.yaml = yaml;
            return this;
        }
        public String getYaml() {
            return this.yaml;
        }

    }

}
