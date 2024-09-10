// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TestApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Revision")
    public String revision;

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

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppResponseBody setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public CreateAppResponseBody setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public CreateAppResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
