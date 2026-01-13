// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class PrepaidRecord extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("accountName")
    public String accountName;

    @NameInMap("codeType")
    public String codeType;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("id")
    public Long id;

    @NameInMap("remainQuota")
    public Long remainQuota;

    @NameInMap("status")
    public String status;

    @NameInMap("totalQuota")
    public Long totalQuota;

    @NameInMap("usedQuota")
    public Long usedQuota;

    public static PrepaidRecord build(java.util.Map<String, ?> map) throws Exception {
        PrepaidRecord self = new PrepaidRecord();
        return TeaModel.build(map, self);
    }

    public PrepaidRecord setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PrepaidRecord setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public PrepaidRecord setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public PrepaidRecord setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PrepaidRecord setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PrepaidRecord setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PrepaidRecord setRemainQuota(Long remainQuota) {
        this.remainQuota = remainQuota;
        return this;
    }
    public Long getRemainQuota() {
        return this.remainQuota;
    }

    public PrepaidRecord setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PrepaidRecord setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    public PrepaidRecord setUsedQuota(Long usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public Long getUsedQuota() {
        return this.usedQuota;
    }

}
