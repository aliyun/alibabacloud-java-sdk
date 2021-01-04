// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190403.models;

import com.aliyun.tea.*;

public class RetrieveFaceRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Face64String")
    public String face64String;

    @NameInMap("FaceUrl")
    public String faceUrl;

    public static RetrieveFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveFaceRequest self = new RetrieveFaceRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveFaceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RetrieveFaceRequest setFace64String(String face64String) {
        this.face64String = face64String;
        return this;
    }
    public String getFace64String() {
        return this.face64String;
    }

    public RetrieveFaceRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

}
