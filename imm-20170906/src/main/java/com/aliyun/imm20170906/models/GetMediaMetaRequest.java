// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetMediaMetaRequest extends TeaModel {
    @NameInMap("MediaUri")
    public String mediaUri;

    @NameInMap("Project")
    public String project;

    public static GetMediaMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMetaRequest self = new GetMediaMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaMetaRequest setMediaUri(String mediaUri) {
        this.mediaUri = mediaUri;
        return this;
    }
    public String getMediaUri() {
        return this.mediaUri;
    }

    public GetMediaMetaRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
