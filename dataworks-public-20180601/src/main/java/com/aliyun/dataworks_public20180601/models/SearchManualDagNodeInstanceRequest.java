// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SearchManualDagNodeInstanceRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("ProjectName")
    public String projectName;

    public static SearchManualDagNodeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchManualDagNodeInstanceRequest self = new SearchManualDagNodeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SearchManualDagNodeInstanceRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public SearchManualDagNodeInstanceRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
