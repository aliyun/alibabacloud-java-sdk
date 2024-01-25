// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionProgressRequest extends TeaModel {
    @NameInMap("InspectionRecordId")
    public Long inspectionRecordId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeInspectionProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionProgressRequest self = new DescribeInspectionProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionProgressRequest setInspectionRecordId(Long inspectionRecordId) {
        this.inspectionRecordId = inspectionRecordId;
        return this;
    }
    public Long getInspectionRecordId() {
        return this.inspectionRecordId;
    }

    public DescribeInspectionProgressRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
