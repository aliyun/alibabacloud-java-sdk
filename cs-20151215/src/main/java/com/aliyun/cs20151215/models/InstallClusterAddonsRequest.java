// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsRequest extends TeaModel {
    /**
     * <p>请求体参数。</p>
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
         * <p>组件自定义参数，使用JSON字符串编码。</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;,\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>组件名称。您可以通过<a href="https://help.aliyun.com/document_detail/2667939.html">ListAddons</a>接口查询可用组件的信息，包括组件名称及版本等。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>logtail-ds</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>组件版本。您可以通过<a href="https://help.aliyun.com/document_detail/2667939.html">ListAddons</a>接口查询可用组件的信息，包括组件名称及版本等。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.7.3.0-aliyun</p>
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
