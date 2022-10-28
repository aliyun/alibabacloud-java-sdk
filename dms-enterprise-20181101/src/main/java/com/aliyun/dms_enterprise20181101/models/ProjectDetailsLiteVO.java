// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ProjectDetailsLiteVO extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectName")
    public String projectName;

    public static ProjectDetailsLiteVO build(java.util.Map<String, ?> map) throws Exception {
        ProjectDetailsLiteVO self = new ProjectDetailsLiteVO();
        return TeaModel.build(map, self);
    }

    public ProjectDetailsLiteVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ProjectDetailsLiteVO setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
