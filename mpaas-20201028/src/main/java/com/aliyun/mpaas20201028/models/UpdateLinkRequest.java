// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateLinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Cors")
    public Boolean cors;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Dynamicfield")
    public String dynamicfield;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetUrl")
    public String targetUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>This parameter is required.</p>
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
