// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeResourcesDeleteProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<DescribeResourcesDeleteProtectionResponseBody> body;

    public static DescribeResourcesDeleteProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesDeleteProtectionResponse self = new DescribeResourcesDeleteProtectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesDeleteProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcesDeleteProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourcesDeleteProtectionResponse setBody(java.util.List<DescribeResourcesDeleteProtectionResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeResourcesDeleteProtectionResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeResourcesDeleteProtectionResponseBody extends TeaModel {
        /**
         * <p>The name of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The namespace to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The type of resource for which deletion protection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaces</p>
         */
        @NameInMap("resource")
        public String resource;

        /**
         * <p>Indicates whether deletion protection is enabled.</p>
         * <ul>
         * <li>true: deletion protection is enabled.</li>
         * <li>false: deletion protection is disabled.</li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("protection")
        public Boolean protection;

        public static DescribeResourcesDeleteProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesDeleteProtectionResponseBody self = new DescribeResourcesDeleteProtectionResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesDeleteProtectionResponseBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcesDeleteProtectionResponseBody setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeResourcesDeleteProtectionResponseBody setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeResourcesDeleteProtectionResponseBody setProtection(Boolean protection) {
            this.protection = protection;
            return this;
        }
        public Boolean getProtection() {
            return this.protection;
        }

    }

}
