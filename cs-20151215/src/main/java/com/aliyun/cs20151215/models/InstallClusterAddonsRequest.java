// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * 
     * <strong>example:</strong>
     * <p>ags-metrics-collector</p>
     */
    @NameInMap("body")
    public java.util.List<InstallClusterAddonsRequestBody> body;

    public static InstallClusterAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallClusterAddonsRequest self = new InstallClusterAddonsRequest();
        return TeaModel.build(map, self);
    }

    public InstallClusterAddonsRequest setBody(java.util.List<InstallClusterAddonsRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<InstallClusterAddonsRequestBody> getBody() {
        return this.body;
    }

    public static class InstallClusterAddonsRequestBody extends TeaModel {
        /**
         * <p>The custom component settings that you want to use. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;,\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>The component name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ags-metrics-collector</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The component version.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/197434.html">DescribeClusterAddonsVersion</a> operation to query the version of a component.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0.2-cc3b2d6-aliyun</p>
         */
        @NameInMap("version")
        public String version;

        public static InstallClusterAddonsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            InstallClusterAddonsRequestBody self = new InstallClusterAddonsRequestBody();
            return TeaModel.build(map, self);
        }

        public InstallClusterAddonsRequestBody setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public InstallClusterAddonsRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallClusterAddonsRequestBody setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
