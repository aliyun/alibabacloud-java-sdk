// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceShrinkRequest extends TeaModel {
    @NameInMap("Develop")
    public String develop;

    @NameInMap("Labels")
    public String labelsShrink;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("body")
    public String body;

    public static CreateServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceShrinkRequest self = new CreateServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceShrinkRequest setDevelop(String develop) {
        this.develop = develop;
        return this;
    }
    public String getDevelop() {
        return this.develop;
    }

    public CreateServiceShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public CreateServiceShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateServiceShrinkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
