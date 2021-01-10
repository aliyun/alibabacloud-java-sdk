// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishesByParentIdRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ParentId")
    public Integer parentId;

    public static FindPrepublishesByParentIdRequest build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishesByParentIdRequest self = new FindPrepublishesByParentIdRequest();
        return TeaModel.build(map, self);
    }

    public FindPrepublishesByParentIdRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindPrepublishesByParentIdRequest setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }
    public Integer getParentId() {
        return this.parentId;
    }

}
