// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupQueryListResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1029030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>param error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageData")
    public DsgUserGroupQueryListResponseBodyPageData pageData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DsgUserGroupQueryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupQueryListResponseBody self = new DsgUserGroupQueryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupQueryListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgUserGroupQueryListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgUserGroupQueryListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgUserGroupQueryListResponseBody setPageData(DsgUserGroupQueryListResponseBodyPageData pageData) {
        this.pageData = pageData;
        return this;
    }
    public DsgUserGroupQueryListResponseBodyPageData getPageData() {
        return this.pageData;
    }

    public DsgUserGroupQueryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgUserGroupQueryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgUserGroupQueryListResponseBodyPageDataData extends TeaModel {
        /**
         * <p>The usernames in the user group.</p>
         */
        @NameInMap("Accounts")
        public java.util.List<String> accounts;

        /**
         * <p>The time when the user group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-10 17:14:44</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the user group was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-10 17:14:44</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Owner")
        public String owner;

        public static DsgUserGroupQueryListResponseBodyPageDataData build(java.util.Map<String, ?> map) throws Exception {
            DsgUserGroupQueryListResponseBodyPageDataData self = new DsgUserGroupQueryListResponseBodyPageDataData();
            return TeaModel.build(map, self);
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setAccounts(java.util.List<String> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<String> getAccounts() {
            return this.accounts;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

    }

    public static class DsgUserGroupQueryListResponseBodyPageData extends TeaModel {
        /**
         * <p>The user groups.</p>
         */
        @NameInMap("Data")
        public java.util.List<DsgUserGroupQueryListResponseBodyPageDataData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of user groups returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DsgUserGroupQueryListResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            DsgUserGroupQueryListResponseBodyPageData self = new DsgUserGroupQueryListResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public DsgUserGroupQueryListResponseBodyPageData setData(java.util.List<DsgUserGroupQueryListResponseBodyPageDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DsgUserGroupQueryListResponseBodyPageDataData> getData() {
            return this.data;
        }

        public DsgUserGroupQueryListResponseBodyPageData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DsgUserGroupQueryListResponseBodyPageData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DsgUserGroupQueryListResponseBodyPageData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
