// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class FindActivityRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("CaseType")
    public Integer caseType;

    @NameInMap("ActivityCode")
    public String activityCode;

    public static FindActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        FindActivityRequest self = new FindActivityRequest();
        return TeaModel.build(map, self);
    }

    public FindActivityRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public FindActivityRequest setCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }
    public Integer getCaseType() {
        return this.caseType;
    }

    public FindActivityRequest setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

}
