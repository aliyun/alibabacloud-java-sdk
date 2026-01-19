// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppImageSecretRequest extends TeaModel {
    /**
     * <p>Application ID, which can be obtained using the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Image repository password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Image repository address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-cn-shanghai.edas.aliyuncs.com</p>
     */
    @NameInMap("Registry")
    public String registry;

    /**
     * <p>Image repository username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Username")
    public String username;

    public static CreateEdgeContainerAppImageSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppImageSecretRequest self = new CreateEdgeContainerAppImageSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppImageSecretRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateEdgeContainerAppImageSecretRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateEdgeContainerAppImageSecretRequest setRegistry(String registry) {
        this.registry = registry;
        return this;
    }
    public String getRegistry() {
        return this.registry;
    }

    public CreateEdgeContainerAppImageSecretRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
