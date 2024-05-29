// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventMaxRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDDosEventMaxRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventMaxRequest self = new DescribeDDosEventMaxRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventMaxRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDDosEventMaxRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
