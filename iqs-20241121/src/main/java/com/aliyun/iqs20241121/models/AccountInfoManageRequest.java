// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class AccountInfoManageRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("name")
    public String name;

    @NameInMap("quarkKey")
    public String quarkKey;

    @NameInMap("quarkName")
    public String quarkName;

    @NameInMap("testQps")
    public Integer testQps;

    @NameInMap("testQueryPerDay")
    public Integer testQueryPerDay;

    public static AccountInfoManageRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountInfoManageRequest self = new AccountInfoManageRequest();
        return TeaModel.build(map, self);
    }

    public AccountInfoManageRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AccountInfoManageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AccountInfoManageRequest setQuarkKey(String quarkKey) {
        this.quarkKey = quarkKey;
        return this;
    }
    public String getQuarkKey() {
        return this.quarkKey;
    }

    public AccountInfoManageRequest setQuarkName(String quarkName) {
        this.quarkName = quarkName;
        return this;
    }
    public String getQuarkName() {
        return this.quarkName;
    }

    public AccountInfoManageRequest setTestQps(Integer testQps) {
        this.testQps = testQps;
        return this;
    }
    public Integer getTestQps() {
        return this.testQps;
    }

    public AccountInfoManageRequest setTestQueryPerDay(Integer testQueryPerDay) {
        this.testQueryPerDay = testQueryPerDay;
        return this;
    }
    public Integer getTestQueryPerDay() {
        return this.testQueryPerDay;
    }

}
