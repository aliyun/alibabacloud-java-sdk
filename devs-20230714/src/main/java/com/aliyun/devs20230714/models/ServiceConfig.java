// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceConfig extends TeaModel {
    @NameInMap("artifact")
    public ArtifactMeta artifact;

    @NameInMap("build")
    public BuildConfig build;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:fc3@1.0.0">fc3@1.0.0</a></p>
     */
    @NameInMap("component")
    public String component;

    @NameInMap("props")
    public java.util.Map<String, ?> props;

    @NameInMap("source")
    public SourceConfig source;

    /**
     * <strong>example:</strong>
     * <p>Function</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("variables")
    public java.util.Map<String, Variable> variables;

    public static ServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        ServiceConfig self = new ServiceConfig();
        return TeaModel.build(map, self);
    }

    public ServiceConfig setArtifact(ArtifactMeta artifact) {
        this.artifact = artifact;
        return this;
    }
    public ArtifactMeta getArtifact() {
        return this.artifact;
    }

    public ServiceConfig setBuild(BuildConfig build) {
        this.build = build;
        return this;
    }
    public BuildConfig getBuild() {
        return this.build;
    }

    public ServiceConfig setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public ServiceConfig setProps(java.util.Map<String, ?> props) {
        this.props = props;
        return this;
    }
    public java.util.Map<String, ?> getProps() {
        return this.props;
    }

    public ServiceConfig setSource(SourceConfig source) {
        this.source = source;
        return this;
    }
    public SourceConfig getSource() {
        return this.source;
    }

    public ServiceConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ServiceConfig setVariables(java.util.Map<String, Variable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, Variable> getVariables() {
        return this.variables;
    }

}
