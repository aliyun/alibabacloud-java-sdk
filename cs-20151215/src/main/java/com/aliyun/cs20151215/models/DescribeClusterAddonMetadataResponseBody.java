// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonMetadataResponseBody extends TeaModel {
    /**
     * <p>The component schema parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{\n  \&quot;$schema\&quot;: \&quot;<a href="https://json-schema.org/draft-07/schema#%5C%5C%22,%5C%5Cn">https://json-schema.org/draft-07/schema#\\&quot;,\\n</a>  \&quot;properties\&quot;: {\n    \&quot;controller\&quot;: {\n      \&quot;description\&quot;: \&quot;\&quot;,\n      \&quot;properties\&quot;: {\n        \&quot;resources\&quot;: {\n          \&quot;properties\&quot;: {\n            \&quot;armsPrometheusOperator\&quot;: {\n              \&quot;properties\&quot;: {\n                \&quot;resources\&quot;: {\n                  \&quot;properties\&quot;: {\n                    \&quot;limits\&quot;: {\n                      \&quot;properties\&quot;: {\n                        \&quot;memory\&quot;: {\n                          \&quot;description\&quot;: \&quot;memory limit of arms prometheus operator\&quot;,\n                          \&quot;type\&quot;: \&quot;string\&quot;,\n                          \&quot;pattern\&quot;: \&quot;^[1-9][0-9]<em>(\\\\.\\\\d+)?(K|Ki|M|Mi|G|Gi|T|Ti)?$\&quot;,\n                          \&quot;default\&quot;: \&quot;500m\&quot;,\n                          \&quot;x-ui-description\&quot;: \&quot;<mds-key>\&quot;,\n                          \&quot;x-ui-prompt-message\&quot;: \&quot;<mds-key>\&quot;,\n                          \&quot;x-ui-validation-message\&quot;: \&quot;<mds-key>\&quot;,\n                          \&quot;x-ui-additional-tips\&quot;: \&quot;<mds-key>\&quot;\n                        },\n                        \&quot;cpu\&quot;: {\n                          \&quot;description\&quot;: \&quot;cpu limit of arms prometheus operator\&quot;,\n                          \&quot;type\&quot;: \&quot;string\&quot;,\n                          \&quot;pattern\&quot;: \&quot;^[1-9][0-9]</em>(m|\\\\.\\\\d+)?$\&quot;,\n                          \&quot;default\&quot;: \&quot;1.0\&quot;,\n                          \&quot;x-ui-description\&quot;: \&quot;<mds-key>\&quot;,\n                          \&quot;x-ui-validation-message\&quot;: \&quot;<mds-key>\&quot;\n                        }\n                      },\n                      \&quot;type\&quot;: \&quot;object\&quot;,\n                      \&quot;additionalProperties\&quot;: false\n                    },\n                    \&quot;requests\&quot;: {\n                      \&quot;properties\&quot;: {\n                        \&quot;memory\&quot;: {\n                          \&quot;description\&quot;: \&quot;memory request of arms prometheus operator\&quot;,\n                          \&quot;type\&quot;: \&quot;string\&quot;,\n                          \&quot;pattern\&quot;: \&quot;^[1-9][0-9]<em>(\\\\.\\\\d+)?(K|Ki|M|Mi|G|Gi|T|Ti)?$\&quot;,\n                          \&quot;default\&quot;: \&quot;500m\&quot;,\n                          \&quot;x-ui-description\&quot;: \&quot;<mds-key>\&quot;,\n                          \&quot;x-ui-validation-message\&quot;: \&quot;<mds-key>\&quot;\n                        },\n                        \&quot;cpu\&quot;: {\n                          \&quot;description\&quot;: \&quot;cpu request of arms prometheus operator\&quot;,\n                          \&quot;type\&quot;: \&quot;string\&quot;,\n                          \&quot;pattern\&quot;: \&quot;^[1-9][0-9]</em>(m|\\\\.\\\\d+)?$\&quot;,\n                          \&quot;default\&quot;: \&quot;1.0\&quot;,\n                          \&quot;x-ui-description\&quot;: \&quot;<mds-key>\&quot;,\n                          \&quot;x-ui-validation-message\&quot;: \&quot;<mds-key>\&quot;\n                        }\n                      },\n                      \&quot;type\&quot;: \&quot;object\&quot;,\n                      \&quot;additionalProperties\&quot;: false\n                    }\n                  },\n                  \&quot;type\&quot;: \&quot;object\&quot;,\n                  \&quot;additionalProperties\&quot;: false\n                }\n              },\n              \&quot;type\&quot;: \&quot;object\&quot;,\n              \&quot;additionalProperties\&quot;: false\n            }\n          },\n          \&quot;type\&quot;: \&quot;object\&quot;,\n          \&quot;additionalProperties\&quot;: false\n        }\n      },\n      \&quot;type\&quot;: \&quot;object\&quot;,\n      \&quot;additionalProperties\&quot;: false\n    }\n  },\n  \&quot;title\&quot;: \&quot;Values\&quot;,\n  \&quot;type\&quot;: \&quot;object\&quot;,\n  \&quot;additionalProperties\&quot;: false\n}</p>
     */
    @NameInMap("config_schema")
    public String configSchema;

    /**
     * <p>The component name.</p>
     * 
     * <strong>example:</strong>
     * <p>coredns</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The component version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.8.4.1</p>
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
