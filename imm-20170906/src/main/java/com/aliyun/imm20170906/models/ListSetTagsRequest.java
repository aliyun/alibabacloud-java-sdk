// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListSetTagsRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    public static ListSetTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSetTagsRequest self = new ListSetTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListSetTagsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListSetTagsRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

}
