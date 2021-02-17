// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetMediaMetaRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("MediaUri")
    public String mediaUri;

    public static GetMediaMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMetaRequest self = new GetMediaMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaMetaRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetMediaMetaRequest setMediaUri(String mediaUri) {
        this.mediaUri = mediaUri;
        return this;
    }
    public String getMediaUri() {
        return this.mediaUri;
    }

}
