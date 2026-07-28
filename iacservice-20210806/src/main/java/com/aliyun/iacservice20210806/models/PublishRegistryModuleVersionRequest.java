// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class PublishRegistryModuleVersionRequest extends TeaModel {
    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ModuleName</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <p>The workspace name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NamespaceName</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <p>The version number. The value must conform to the <a href="http://semver.org/">semantic version</a> specification, such as 1.0.1. The initial version is 1.0.0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.0</p>
     */
    @NameInMap("version")
    public String version;

    public static PublishRegistryModuleVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRegistryModuleVersionRequest self = new PublishRegistryModuleVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishRegistryModuleVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PublishRegistryModuleVersionRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public PublishRegistryModuleVersionRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public PublishRegistryModuleVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
