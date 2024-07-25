// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    @NameInMap("description")
    public String description;

    @NameInMap("protocols")
    public java.util.List<String> protocols;

    @NameInMap("versionConfig")
    public HttpApiVersionConfig versionConfig;

    public static UpdateHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiRequest self = new UpdateHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public UpdateHttpApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateHttpApiRequest setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public UpdateHttpApiRequest setVersionConfig(HttpApiVersionConfig versionConfig) {
        this.versionConfig = versionConfig;
        return this;
    }
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

}
