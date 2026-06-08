// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Constraints extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1717200000000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <strong>example:</strong>
     * <p>1717200000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    public static Constraints build(java.util.Map<String, ?> map) throws Exception {
        Constraints self = new Constraints();
        return TeaModel.build(map, self);
    }

    public Constraints setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public Constraints setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
