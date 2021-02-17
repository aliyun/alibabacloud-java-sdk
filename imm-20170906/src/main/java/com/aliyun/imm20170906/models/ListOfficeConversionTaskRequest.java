// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListOfficeConversionTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxKeys")
    public Integer maxKeys;

    public static ListOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeConversionTaskRequest self = new ListOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListOfficeConversionTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListOfficeConversionTaskRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListOfficeConversionTaskRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

}
