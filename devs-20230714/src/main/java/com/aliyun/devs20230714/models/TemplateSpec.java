// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TemplateSpec extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CAP</p>
     */
    @NameInMap("author")
    public String author;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>Apache-1.0</p>
     */
    @NameInMap("license")
    public String license;

    /**
     * <strong>example:</strong>
     * <p>demo-package</p>
     */
    @NameInMap("packageName")
    public String packageName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("readme")
    public String readme;

    @NameInMap("registryToken")
    public String registryToken;

    @NameInMap("services")
    public java.util.Map<String, TemplateServiceConfig> services;

    @NameInMap("source")
    public TemplateSpecSource source;

    @NameInMap("variables")
    public java.util.Map<String, TemplateParameterSchema> variables;

    @NameInMap("version")
    public String version;

    public static TemplateSpec build(java.util.Map<String, ?> map) throws Exception {
        TemplateSpec self = new TemplateSpec();
        return TeaModel.build(map, self);
    }

    public TemplateSpec setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public TemplateSpec setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public TemplateSpec setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public TemplateSpec setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public TemplateSpec setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

    public TemplateSpec setRegistryToken(String registryToken) {
        this.registryToken = registryToken;
        return this;
    }
    public String getRegistryToken() {
        return this.registryToken;
    }

    public TemplateSpec setServices(java.util.Map<String, TemplateServiceConfig> services) {
        this.services = services;
        return this;
    }
    public java.util.Map<String, TemplateServiceConfig> getServices() {
        return this.services;
    }

    public TemplateSpec setSource(TemplateSpecSource source) {
        this.source = source;
        return this;
    }
    public TemplateSpecSource getSource() {
        return this.source;
    }

    public TemplateSpec setVariables(java.util.Map<String, TemplateParameterSchema> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, TemplateParameterSchema> getVariables() {
        return this.variables;
    }

    public TemplateSpec setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class TemplateSpecSource extends TeaModel {
        @NameInMap("repository")
        public RepositorySourceConfig repository;

        public static TemplateSpecSource build(java.util.Map<String, ?> map) throws Exception {
            TemplateSpecSource self = new TemplateSpecSource();
            return TeaModel.build(map, self);
        }

        public TemplateSpecSource setRepository(RepositorySourceConfig repository) {
            this.repository = repository;
            return this;
        }
        public RepositorySourceConfig getRepository() {
            return this.repository;
        }

    }

}
