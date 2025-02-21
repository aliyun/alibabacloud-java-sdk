// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsAdmin")
    @Deprecated
    public Boolean isAdmin;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>用户列表。</p>
     */
    @NameInMap("Users")
    public java.util.List<Users> users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public ListUsersResponseBody setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public ListUsersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUsersResponseBody setUsers(java.util.List<Users> users) {
        this.users = users;
        return this;
    }
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static class Users extends TeaModel {
        /**
         * <p>创建时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1509338726362</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>备注。</p>
         * 
         * <strong>example:</strong>
         * <p>添加test用户</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Keytab内容Base64编码。</p>
         * 
         * <strong>example:</strong>
         * <p>DBEDASDF==</p>
         */
        @NameInMap("KeytabHex")
        public String keytabHex;

        /**
         * <p>LDAP链接。
         * ldap://emr-header-1.cluster-50018****:10389</p>
         * 
         * <strong>example:</strong>
         * <p>ldap://master-1-1.c-c6ce2d16d118****.cn-hangzhou.emr.aliyuncs.com:10389</p>
         */
        @NameInMap("LdapUrl")
        public String ldapUrl;

        /**
         * <p>用户ID。</p>
         * 
         * <strong>example:</strong>
         * <p>125046002175****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>用户名称。
         * test</p>
         * 
         * <strong>example:</strong>
         * <p>yun****</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static Users build(java.util.Map<String, ?> map) throws Exception {
            Users self = new Users();
            return TeaModel.build(map, self);
        }

        public Users setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public Users setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Users setKeytabHex(String keytabHex) {
            this.keytabHex = keytabHex;
            return this;
        }
        public String getKeytabHex() {
            return this.keytabHex;
        }

        public Users setLdapUrl(String ldapUrl) {
            this.ldapUrl = ldapUrl;
            return this;
        }
        public String getLdapUrl() {
            return this.ldapUrl;
        }

        public Users setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public Users setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
