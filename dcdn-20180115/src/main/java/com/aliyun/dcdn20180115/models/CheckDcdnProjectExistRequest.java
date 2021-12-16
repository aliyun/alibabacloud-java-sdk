// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CheckDcdnProjectExistRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProjectName")
    public String projectName;

    public static CheckDcdnProjectExistRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDcdnProjectExistRequest self = new CheckDcdnProjectExistRequest();
        return TeaModel.build(map, self);
    }

    public CheckDcdnProjectExistRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckDcdnProjectExistRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
