// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ExpendExpiredTimeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>280451935746041600</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>2025:02:24 00:00:00</p>
     */
    @NameInMap("testStartTime")
    public String testStartTime;

    public static ExpendExpiredTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpendExpiredTimeRequest self = new ExpendExpiredTimeRequest();
        return TeaModel.build(map, self);
    }

    public ExpendExpiredTimeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ExpendExpiredTimeRequest setTestStartTime(String testStartTime) {
        this.testStartTime = testStartTime;
        return this;
    }
    public String getTestStartTime() {
        return this.testStartTime;
    }

}
