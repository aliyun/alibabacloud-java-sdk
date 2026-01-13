// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class IrAccountEntity extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("accountName")
    public String accountName;

    @NameInMap("accountStatus")
    public String accountStatus;

    @NameInMap("adjustedNormalQps")
    public Integer adjustedNormalQps;

    @NameInMap("configuration")
    public String configuration;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("id")
    public Long id;

    @NameInMap("isDeleted")
    public Integer isDeleted;

    @NameInMap("modifiedTime")
    public String modifiedTime;

    @NameInMap("quarkKey")
    public String quarkKey;

    @NameInMap("quarkOsr")
    public String quarkOsr;

    @NameInMap("quarkUsername")
    public String quarkUsername;

    @NameInMap("searchType")
    public String searchType;

    @NameInMap("testQps")
    public Integer testQps;

    @NameInMap("testQueryPerDay")
    public Integer testQueryPerDay;

    @NameInMap("testStartTime")
    public String testStartTime;

    public static IrAccountEntity build(java.util.Map<String, ?> map) throws Exception {
        IrAccountEntity self = new IrAccountEntity();
        return TeaModel.build(map, self);
    }

    public IrAccountEntity setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public IrAccountEntity setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public IrAccountEntity setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public IrAccountEntity setAdjustedNormalQps(Integer adjustedNormalQps) {
        this.adjustedNormalQps = adjustedNormalQps;
        return this;
    }
    public Integer getAdjustedNormalQps() {
        return this.adjustedNormalQps;
    }

    public IrAccountEntity setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public IrAccountEntity setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IrAccountEntity setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public IrAccountEntity setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public IrAccountEntity setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public IrAccountEntity setQuarkKey(String quarkKey) {
        this.quarkKey = quarkKey;
        return this;
    }
    public String getQuarkKey() {
        return this.quarkKey;
    }

    public IrAccountEntity setQuarkOsr(String quarkOsr) {
        this.quarkOsr = quarkOsr;
        return this;
    }
    public String getQuarkOsr() {
        return this.quarkOsr;
    }

    public IrAccountEntity setQuarkUsername(String quarkUsername) {
        this.quarkUsername = quarkUsername;
        return this;
    }
    public String getQuarkUsername() {
        return this.quarkUsername;
    }

    public IrAccountEntity setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public IrAccountEntity setTestQps(Integer testQps) {
        this.testQps = testQps;
        return this;
    }
    public Integer getTestQps() {
        return this.testQps;
    }

    public IrAccountEntity setTestQueryPerDay(Integer testQueryPerDay) {
        this.testQueryPerDay = testQueryPerDay;
        return this;
    }
    public Integer getTestQueryPerDay() {
        return this.testQueryPerDay;
    }

    public IrAccountEntity setTestStartTime(String testStartTime) {
        this.testStartTime = testStartTime;
        return this;
    }
    public String getTestStartTime() {
        return this.testStartTime;
    }

}
