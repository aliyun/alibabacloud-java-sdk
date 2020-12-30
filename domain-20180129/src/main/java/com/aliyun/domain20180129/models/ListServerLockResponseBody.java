// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListServerLockResponseBody extends TeaModel {
    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public java.util.List<ListServerLockResponseBodyData> data;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    public static ListServerLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerLockResponseBody self = new ListServerLockResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerLockResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public ListServerLockResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListServerLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerLockResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServerLockResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public ListServerLockResponseBody setData(java.util.List<ListServerLockResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServerLockResponseBodyData> getData() {
        return this.data;
    }

    public ListServerLockResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListServerLockResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public static class ListServerLockResponseBodyData extends TeaModel {
        @NameInMap("ServerLockStatus")
        public String serverLockStatus;

        @NameInMap("LockInstanceId")
        public String lockInstanceId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("LockProductId")
        public String lockProductId;

        @NameInMap("DomainInstanceId")
        public String domainInstanceId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        public static ListServerLockResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServerLockResponseBodyData self = new ListServerLockResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServerLockResponseBodyData setServerLockStatus(String serverLockStatus) {
            this.serverLockStatus = serverLockStatus;
            return this;
        }
        public String getServerLockStatus() {
            return this.serverLockStatus;
        }

        public ListServerLockResponseBodyData setLockInstanceId(String lockInstanceId) {
            this.lockInstanceId = lockInstanceId;
            return this;
        }
        public String getLockInstanceId() {
            return this.lockInstanceId;
        }

        public ListServerLockResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListServerLockResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServerLockResponseBodyData setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListServerLockResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListServerLockResponseBodyData setLockProductId(String lockProductId) {
            this.lockProductId = lockProductId;
            return this;
        }
        public String getLockProductId() {
            return this.lockProductId;
        }

        public ListServerLockResponseBodyData setDomainInstanceId(String domainInstanceId) {
            this.domainInstanceId = domainInstanceId;
            return this;
        }
        public String getDomainInstanceId() {
            return this.domainInstanceId;
        }

        public ListServerLockResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServerLockResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
