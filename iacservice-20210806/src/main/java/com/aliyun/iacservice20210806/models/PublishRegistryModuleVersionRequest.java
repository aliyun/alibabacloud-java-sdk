// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class PublishRegistryModuleVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-bucket</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>terraform-alicloud-modules</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
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
