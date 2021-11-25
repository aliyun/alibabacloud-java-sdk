// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListSetsRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("Project")
    public String project;

    public static ListSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSetsRequest self = new ListSetsRequest();
        return TeaModel.build(map, self);
    }

    public ListSetsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListSetsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
