// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListServerLockResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListServerLockResponseBodyData> data;

    /**
     * <p>Indicates whether the current page is followed by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether the current page is preceded by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListServerLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerLockResponseBody self = new ListServerLockResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerLockResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListServerLockResponseBody setData(java.util.List<ListServerLockResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServerLockResponseBodyData> getData() {
        return this.data;
    }

    public ListServerLockResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public ListServerLockResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServerLockResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public ListServerLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerLockResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListServerLockResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListServerLockResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>S20190N1DAI4****</p>
         */
        @NameInMap("DomainInstanceId")
        public String domainInstanceId;

        /**
         * <p>The domain name that has valid registry lock information.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2030-07-10 17:37:36</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-19 16:38:07</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the domain name was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-19 16:40:38</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instance ID of the domain name for which the registry lock is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>S2021591IQ28****</p>
         */
        @NameInMap("LockInstanceId")
        public String lockInstanceId;

        /**
         * <p>The ID of the product to which the domain name with the registry lock enabled belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1807**</p>
         */
        @NameInMap("LockProductId")
        public String lockProductId;

        /**
         * <p>The status of the registry lock.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ServerLockStatus")
        public String serverLockStatus;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-10 17:37:36</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>121000000****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListServerLockResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServerLockResponseBodyData self = new ListServerLockResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServerLockResponseBodyData setDomainInstanceId(String domainInstanceId) {
            this.domainInstanceId = domainInstanceId;
            return this;
        }
        public String getDomainInstanceId() {
            return this.domainInstanceId;
        }

        public ListServerLockResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListServerLockResponseBodyData setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListServerLockResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServerLockResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServerLockResponseBodyData setLockInstanceId(String lockInstanceId) {
            this.lockInstanceId = lockInstanceId;
            return this;
        }
        public String getLockInstanceId() {
            return this.lockInstanceId;
        }

        public ListServerLockResponseBodyData setLockProductId(String lockProductId) {
            this.lockProductId = lockProductId;
            return this;
        }
        public String getLockProductId() {
            return this.lockProductId;
        }

        public ListServerLockResponseBodyData setServerLockStatus(String serverLockStatus) {
            this.serverLockStatus = serverLockStatus;
            return this;
        }
        public String getServerLockStatus() {
            return this.serverLockStatus;
        }

        public ListServerLockResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListServerLockResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
