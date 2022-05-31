// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ChangeDistributorSubjectInfoRequest extends TeaModel {
    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    // 主体信息
    @NameInMap("Subject_info")
    public String subjectInfo;

    public static ChangeDistributorSubjectInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDistributorSubjectInfoRequest self = new ChangeDistributorSubjectInfoRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDistributorSubjectInfoRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ChangeDistributorSubjectInfoRequest setSubjectInfo(String subjectInfo) {
        this.subjectInfo = subjectInfo;
        return this;
    }
    public String getSubjectInfo() {
        return this.subjectInfo;
    }

}
