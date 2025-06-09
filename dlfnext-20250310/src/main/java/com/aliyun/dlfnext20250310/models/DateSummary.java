// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class DateSummary extends TeaModel {
    @NameInMap("date")
    public String date;

    /**
     * <p>Metric value at corresponding date</p>
     */
    @NameInMap("value")
    public Long value;

    public static DateSummary build(java.util.Map<String, ?> map) throws Exception {
        DateSummary self = new DateSummary();
        return TeaModel.build(map, self);
    }

    public DateSummary setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public DateSummary setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
