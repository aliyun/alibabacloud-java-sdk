// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TimeRange extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-12-31T00:00:00+08:00</p>
     */
    @NameInMap("End")
    public String end;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-12-31T00:00:00+08:00</p>
     */
    @NameInMap("Start")
    public String start;

    public static TimeRange build(java.util.Map<String, ?> map) throws Exception {
        TimeRange self = new TimeRange();
        return TeaModel.build(map, self);
    }

    public TimeRange setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public TimeRange setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
