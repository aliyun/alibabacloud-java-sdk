// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AuthReportInterval extends TeaModel {
    @NameInMap("TimeUnit")
    public String timeUnit;

    @NameInMap("Value")
    public Long value;

    public static AuthReportInterval build(java.util.Map<String, ?> map) throws Exception {
        AuthReportInterval self = new AuthReportInterval();
        return TeaModel.build(map, self);
    }

    public AuthReportInterval setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public AuthReportInterval setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
