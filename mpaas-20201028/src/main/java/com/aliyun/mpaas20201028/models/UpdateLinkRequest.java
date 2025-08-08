// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateLinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BB5953C300957</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Cors")
    public Boolean cors;

    /**
     * <strong>example:</strong>
     * <p>x519.cn</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>txt</p>
     */
    @NameInMap("Dynamicfield")
    public String dynamicfield;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>https://********</p>
     */
    @NameInMap("TargetUrl")
    public String targetUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/8hGb9SyJARqp7V4PGP92X">https://xxx/8hGb9SyJARqp7V4PGP92X</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkRequest self = new UpdateLinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateLinkRequest setCors(Boolean cors) {
        this.cors = cors;
        return this;
    }
    public Boolean getCors() {
        return this.cors;
    }

    public UpdateLinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateLinkRequest setDynamicfield(String dynamicfield) {
        this.dynamicfield = dynamicfield;
        return this;
    }
    public String getDynamicfield() {
        return this.dynamicfield;
    }

    public UpdateLinkRequest setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public UpdateLinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateLinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
