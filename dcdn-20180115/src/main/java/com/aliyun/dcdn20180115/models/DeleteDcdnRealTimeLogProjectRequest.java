// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnRealTimeLogProjectRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProjectName")
    public String projectName;

    public static DeleteDcdnRealTimeLogProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnRealTimeLogProjectRequest self = new DeleteDcdnRealTimeLogProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnRealTimeLogProjectRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public DeleteDcdnRealTimeLogProjectRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDcdnRealTimeLogProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
