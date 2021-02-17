// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListProjectAPIsRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    public static ListProjectAPIsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectAPIsRequest self = new ListProjectAPIsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectAPIsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
