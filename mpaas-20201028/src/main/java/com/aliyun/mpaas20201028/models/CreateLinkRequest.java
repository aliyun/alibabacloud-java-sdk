// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateLinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Cors")
    public String cors;

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
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkRequest self = new CreateLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLinkRequest setCors(String cors) {
        this.cors = cors;
        return this;
    }
    public String getCors() {
        return this.cors;
    }

    public CreateLinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateLinkRequest setDynamicfield(String dynamicfield) {
        this.dynamicfield = dynamicfield;
        return this;
    }
    public String getDynamicfield() {
        return this.dynamicfield;
    }

    public CreateLinkRequest setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public CreateLinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
