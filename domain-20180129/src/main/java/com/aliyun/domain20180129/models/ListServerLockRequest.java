// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListServerLockRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndStartDate")
    public Long endStartDate;

    @NameInMap("BeginStartDate")
    public Long beginStartDate;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LockProductId")
    public String lockProductId;

    @NameInMap("ServerLockStatus")
    public Integer serverLockStatus;

    @NameInMap("StartExpireDate")
    public Long startExpireDate;

    @NameInMap("EndExpireDate")
    public Long endExpireDate;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ListServerLockRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerLockRequest self = new ListServerLockRequest();
        return TeaModel.build(map, self);
    }

    public ListServerLockRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListServerLockRequest setEndStartDate(Long endStartDate) {
        this.endStartDate = endStartDate;
        return this;
    }
    public Long getEndStartDate() {
        return this.endStartDate;
    }

    public ListServerLockRequest setBeginStartDate(Long beginStartDate) {
        this.beginStartDate = beginStartDate;
        return this;
    }
    public Long getBeginStartDate() {
        return this.beginStartDate;
    }

    public ListServerLockRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListServerLockRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServerLockRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListServerLockRequest setLockProductId(String lockProductId) {
        this.lockProductId = lockProductId;
        return this;
    }
    public String getLockProductId() {
        return this.lockProductId;
    }

    public ListServerLockRequest setServerLockStatus(Integer serverLockStatus) {
        this.serverLockStatus = serverLockStatus;
        return this;
    }
    public Integer getServerLockStatus() {
        return this.serverLockStatus;
    }

    public ListServerLockRequest setStartExpireDate(Long startExpireDate) {
        this.startExpireDate = startExpireDate;
        return this;
    }
    public Long getStartExpireDate() {
        return this.startExpireDate;
    }

    public ListServerLockRequest setEndExpireDate(Long endExpireDate) {
        this.endExpireDate = endExpireDate;
        return this;
    }
    public Long getEndExpireDate() {
        return this.endExpireDate;
    }

    public ListServerLockRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
