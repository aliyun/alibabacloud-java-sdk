// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryServerLockResponseBody extends TeaModel {
    @NameInMap("DomainInstanceId")
    public String domainInstanceId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ExpireDate")
    public String expireDate;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("LockInstanceId")
    public String lockInstanceId;

    @NameInMap("LockProductId")
    public String lockProductId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerLockStatus")
    public Integer serverLockStatus;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("UserId")
    public String userId;

    public static QueryServerLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServerLockResponseBody self = new QueryServerLockResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServerLockResponseBody setDomainInstanceId(String domainInstanceId) {
        this.domainInstanceId = domainInstanceId;
        return this;
    }
    public String getDomainInstanceId() {
        return this.domainInstanceId;
    }

    public QueryServerLockResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryServerLockResponseBody setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public QueryServerLockResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryServerLockResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryServerLockResponseBody setLockInstanceId(String lockInstanceId) {
        this.lockInstanceId = lockInstanceId;
        return this;
    }
    public String getLockInstanceId() {
        return this.lockInstanceId;
    }

    public QueryServerLockResponseBody setLockProductId(String lockProductId) {
        this.lockProductId = lockProductId;
        return this;
    }
    public String getLockProductId() {
        return this.lockProductId;
    }

    public QueryServerLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryServerLockResponseBody setServerLockStatus(Integer serverLockStatus) {
        this.serverLockStatus = serverLockStatus;
        return this;
    }
    public Integer getServerLockStatus() {
        return this.serverLockStatus;
    }

    public QueryServerLockResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryServerLockResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
