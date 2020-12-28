// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteApplicationEmpIdRelationRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("EmpIds")
    public String empIds;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static DeleteApplicationEmpIdRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationEmpIdRelationRequest self = new DeleteApplicationEmpIdRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationEmpIdRelationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DeleteApplicationEmpIdRelationRequest setEmpIds(String empIds) {
        this.empIds = empIds;
        return this;
    }
    public String getEmpIds() {
        return this.empIds;
    }

    public DeleteApplicationEmpIdRelationRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
