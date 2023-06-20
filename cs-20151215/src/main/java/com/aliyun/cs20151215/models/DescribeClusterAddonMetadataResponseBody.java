// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonMetadataResponseBody extends TeaModel {
    /**
     * <p>The schema of component parameters.</p>
     */
    @NameInMap("config_schema")
    public String configSchema;

    /**
     * <p>The name of the component.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The version of the component.</p>
     */
    @NameInMap("version")
    public String version;

    public static DescribeClusterAddonMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonMetadataResponseBody self = new DescribeClusterAddonMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonMetadataResponseBody setConfigSchema(String configSchema) {
        this.configSchema = configSchema;
        return this;
    }
    public String getConfigSchema() {
        return this.configSchema;
    }

    public DescribeClusterAddonMetadataResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClusterAddonMetadataResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
