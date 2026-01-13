// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ExpendExpiredTimeRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

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
