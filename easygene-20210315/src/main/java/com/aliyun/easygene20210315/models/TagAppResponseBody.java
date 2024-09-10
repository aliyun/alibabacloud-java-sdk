// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class TagAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TestApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AppRevision")
    public String appRevision;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FormerRevision")
    public String formerRevision;

    /**
     * <strong>example:</strong>
     * <p>TestTag</p>
     */
    @NameInMap("FormerTag")
    public String formerTag;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ProduceVersion</p>
     */
    @NameInMap("RevisionTag")
    public String revisionTag;

    /**
     * <strong>example:</strong>
     * <p>TestWorkspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static TagAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagAppResponseBody self = new TagAppResponseBody();
        return TeaModel.build(map, self);
    }

    public TagAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TagAppResponseBody setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public TagAppResponseBody setFormerRevision(String formerRevision) {
        this.formerRevision = formerRevision;
        return this;
    }
    public String getFormerRevision() {
        return this.formerRevision;
    }

    public TagAppResponseBody setFormerTag(String formerTag) {
        this.formerTag = formerTag;
        return this;
    }
    public String getFormerTag() {
        return this.formerTag;
    }

    public TagAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TagAppResponseBody setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public TagAppResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
