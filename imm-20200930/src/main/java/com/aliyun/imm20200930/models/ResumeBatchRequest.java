// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ResumeBatchRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectName")
    public String projectName;

    public static ResumeBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeBatchRequest self = new ResumeBatchRequest();
        return TeaModel.build(map, self);
    }

    public ResumeBatchRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ResumeBatchRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
