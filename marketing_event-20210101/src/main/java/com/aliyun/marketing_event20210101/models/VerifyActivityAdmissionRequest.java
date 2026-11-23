// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class VerifyActivityAdmissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActivityId")
    public Long activityId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdCardNo")
    public String idCardNo;

    public static VerifyActivityAdmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyActivityAdmissionRequest self = new VerifyActivityAdmissionRequest();
        return TeaModel.build(map, self);
    }

    public VerifyActivityAdmissionRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public VerifyActivityAdmissionRequest setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
        return this;
    }
    public String getIdCardNo() {
        return this.idCardNo;
    }

}
