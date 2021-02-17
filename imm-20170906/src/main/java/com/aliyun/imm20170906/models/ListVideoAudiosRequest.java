// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoAudiosRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("Marker")
    public String marker;

    public static ListVideoAudiosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVideoAudiosRequest self = new ListVideoAudiosRequest();
        return TeaModel.build(map, self);
    }

    public ListVideoAudiosRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListVideoAudiosRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public ListVideoAudiosRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public ListVideoAudiosRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
