// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class TagAppRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppRevision")
    public String appRevision;

    @NameInMap("RevisionTag")
    public String revisionTag;

    @NameInMap("Workspace")
    public String workspace;

    public static TagAppRequest build(java.util.Map<String, ?> map) throws Exception {
        TagAppRequest self = new TagAppRequest();
        return TeaModel.build(map, self);
    }

    public TagAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TagAppRequest setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public TagAppRequest setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public TagAppRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
