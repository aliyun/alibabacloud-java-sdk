// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CollationTimeZone extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UTC+08:00</p>
     */
    @NameInMap("CurrentTimeOffset")
    public String currentTimeOffset;

    /**
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    public static CollationTimeZone build(java.util.Map<String, ?> map) throws Exception {
        CollationTimeZone self = new CollationTimeZone();
        return TeaModel.build(map, self);
    }

    public CollationTimeZone setCurrentTimeOffset(String currentTimeOffset) {
        this.currentTimeOffset = currentTimeOffset;
        return this;
    }
    public String getCurrentTimeOffset() {
        return this.currentTimeOffset;
    }

    public CollationTimeZone setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
