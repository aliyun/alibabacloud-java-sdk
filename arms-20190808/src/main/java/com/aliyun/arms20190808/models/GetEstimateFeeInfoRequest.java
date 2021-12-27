// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetEstimateFeeInfoRequest extends TeaModel {
    @NameInMap("TargetUserId")
    public String targetUserId;

    @NameInMap("UsageCn")
    public Long usageCn;

    @NameInMap("UsageFn")
    public Long usageFn;

    public static GetEstimateFeeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEstimateFeeInfoRequest self = new GetEstimateFeeInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetEstimateFeeInfoRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public GetEstimateFeeInfoRequest setUsageCn(Long usageCn) {
        this.usageCn = usageCn;
        return this;
    }
    public Long getUsageCn() {
        return this.usageCn;
    }

    public GetEstimateFeeInfoRequest setUsageFn(Long usageFn) {
        this.usageFn = usageFn;
        return this;
    }
    public Long getUsageFn() {
        return this.usageFn;
    }

}
