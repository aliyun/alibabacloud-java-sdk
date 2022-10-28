// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class StsApplyVO extends TeaModel {
    @NameInMap("AliyunId")
    public String aliyunId;

    @NameInMap("Duration")
    public Long duration;

    public static StsApplyVO build(java.util.Map<String, ?> map) throws Exception {
        StsApplyVO self = new StsApplyVO();
        return TeaModel.build(map, self);
    }

    public StsApplyVO setAliyunId(String aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public String getAliyunId() {
        return this.aliyunId;
    }

    public StsApplyVO setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

}
