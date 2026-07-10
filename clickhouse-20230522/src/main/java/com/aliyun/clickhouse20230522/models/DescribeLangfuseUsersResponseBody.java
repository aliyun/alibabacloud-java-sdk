// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseUsersResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeLangfuseUsersResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C342F3DD-1FF7-55E9-A1A1-098DE07CD1A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLangfuseUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseUsersResponseBody self = new DescribeLangfuseUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseUsersResponseBody setData(DescribeLangfuseUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLangfuseUsersResponseBodyData getData() {
        return this.data;
    }

    public DescribeLangfuseUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLangfuseUsersResponseBodyDataUsers extends TeaModel {
        /**
         * <p>The time when the user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T10:03:05Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>john</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeLangfuseUsersResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseUsersResponseBodyDataUsers self = new DescribeLangfuseUsersResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseUsersResponseBodyDataUsers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeLangfuseUsersResponseBodyDataUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeLangfuseUsersResponseBodyDataUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeLangfuseUsersResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The list of users.</p>
         */
        @NameInMap("Users")
        public java.util.List<DescribeLangfuseUsersResponseBodyDataUsers> users;

        public static DescribeLangfuseUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseUsersResponseBodyData self = new DescribeLangfuseUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseUsersResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeLangfuseUsersResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeLangfuseUsersResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeLangfuseUsersResponseBodyData setUsers(java.util.List<DescribeLangfuseUsersResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<DescribeLangfuseUsersResponseBodyDataUsers> getUsers() {
            return this.users;
        }

    }

}
