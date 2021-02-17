// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoFramesRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("Marker")
    public String marker;

    public static ListVideoFramesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVideoFramesRequest self = new ListVideoFramesRequest();
        return TeaModel.build(map, self);
    }

    public ListVideoFramesRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListVideoFramesRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public ListVideoFramesRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public ListVideoFramesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
