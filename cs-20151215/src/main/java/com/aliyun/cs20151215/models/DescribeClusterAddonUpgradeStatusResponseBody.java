// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonUpgradeStatusResponseBody extends TeaModel {
    @NameInMap("template")
    @Validation(required = true)
    public String template;

    @NameInMap("can_upgrade")
    @Validation(required = true)
    public Boolean canUpgrade;

    @NameInMap("addon_info")
    @Validation(required = true)
    public DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo addonInfo;

    public static DescribeClusterAddonUpgradeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonUpgradeStatusResponseBody self = new DescribeClusterAddonUpgradeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public static class DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo extends TeaModel {
        @NameInMap("message")
        @Validation(required = true)
        public String message;

        @NameInMap("category")
        @Validation(required = true)
        public String category;

        @NameInMap("yaml")
        @Validation(required = true)
        public String yaml;

        @NameInMap("component_name")
        @Validation(required = true)
        public String componentName;

        @NameInMap("version")
        @Validation(required = true)
        public String version;

        public static DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo self = new DescribeClusterAddonUpgradeStatusResponseBodyAddonInfo();
            return TeaModel.build(map, self);
        }

    }

}
