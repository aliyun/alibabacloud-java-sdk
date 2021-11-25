// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideosRequest extends TeaModel {
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    public static ListVideosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVideosRequest self = new ListVideosRequest();
        return TeaModel.build(map, self);
    }

    public ListVideosRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListVideosRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListVideosRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListVideosRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

}
