// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryServerLockResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>S20190N1DAI4****</p>
     */
    @NameInMap("DomainInstanceId")
    public String domainInstanceId;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>2030-07-10 17:37:36</p>
     */
    @NameInMap("ExpireDate")
    public String expireDate;

    /**
     * <strong>example:</strong>
     * <p>2021-07-10 17:37:36</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2021-07-10 17:37:36</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>S2021591IQ28****</p>
     */
    @NameInMap("LockInstanceId")
    public String lockInstanceId;

    /**
     * <strong>example:</strong>
     * <p>1807**</p>
     */
    @NameInMap("LockProductId")
    public String lockProductId;

    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ServerLockStatus")
    public Integer serverLockStatus;

    /**
     * <strong>example:</strong>
     * <p>2021-07-10 17:37:36</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>121000000****</p>
     */
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
