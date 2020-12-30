// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryServerLockResponseBody extends TeaModel {
    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExpireDate")
    public String expireDate;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("DomainInstanceId")
    public String domainInstanceId;

    @NameInMap("LockInstanceId")
    public String lockInstanceId;

    @NameInMap("ServerLockStatus")
    public Integer serverLockStatus;

    @NameInMap("LockProductId")
    public String lockProductId;

    public static QueryServerLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServerLockResponseBody self = new QueryServerLockResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServerLockResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryServerLockResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryServerLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryServerLockResponseBody setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public QueryServerLockResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryServerLockResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryServerLockResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryServerLockResponseBody setDomainInstanceId(String domainInstanceId) {
        this.domainInstanceId = domainInstanceId;
        return this;
    }
    public String getDomainInstanceId() {
        return this.domainInstanceId;
    }

    public QueryServerLockResponseBody setLockInstanceId(String lockInstanceId) {
        this.lockInstanceId = lockInstanceId;
        return this;
    }
    public String getLockInstanceId() {
        return this.lockInstanceId;
    }

    public QueryServerLockResponseBody setServerLockStatus(Integer serverLockStatus) {
        this.serverLockStatus = serverLockStatus;
        return this;
    }
    public Integer getServerLockStatus() {
        return this.serverLockStatus;
    }

    public QueryServerLockResponseBody setLockProductId(String lockProductId) {
        this.lockProductId = lockProductId;
        return this;
    }
    public String getLockProductId() {
        return this.lockProductId;
    }

}
