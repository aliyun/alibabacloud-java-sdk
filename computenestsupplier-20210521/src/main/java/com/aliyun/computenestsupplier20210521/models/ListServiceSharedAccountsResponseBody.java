// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceSharedAccountsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CA3AE512-6D30-549A-B52D-B9042CA8D515</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Service shared account information.</p>
     */
    @NameInMap("ShareAccount")
    public java.util.List<ListServiceSharedAccountsResponseBodyShareAccount> shareAccount;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceSharedAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSharedAccountsResponseBody self = new ListServiceSharedAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceSharedAccountsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceSharedAccountsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceSharedAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceSharedAccountsResponseBody setShareAccount(java.util.List<ListServiceSharedAccountsResponseBodyShareAccount> shareAccount) {
        this.shareAccount = shareAccount;
        return this;
    }
    public java.util.List<ListServiceSharedAccountsResponseBodyShareAccount> getShareAccount() {
        return this.shareAccount;
    }

    public ListServiceSharedAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceSharedAccountsResponseBodyShareAccount extends TeaModel {
        /**
         * <p>The time when the service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-28T02:47:46.000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Service logo.</p>
         * 
         * <strong>example:</strong>
         * <p>logo</p>
         */
        @NameInMap("Logo")
        public String logo;

        /**
         * <p>The name of the service instance. The value must meet the following requirements:</p>
         * <ul>
         * <li>The name cannot exceed 64 characters in length.</li>
         * <li>It can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or a letter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The permissions on the service. Valid values:</p>
         * <ul>
         * <li>Deployable: Permissions to deploy the service.</li>
         * <li>Accessible: Permissions to access the service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployable</p>
         */
        @NameInMap("Permission")
        public String permission;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-e10349089de34exxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The time when the service was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-13T02:16:03.756Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The user aliUid.</p>
         * 
         * <strong>example:</strong>
         * <p>127383705xxxxxx</p>
         */
        @NameInMap("UserAliUid")
        public String userAliUid;

        public static ListServiceSharedAccountsResponseBodyShareAccount build(java.util.Map<String, ?> map) throws Exception {
            ListServiceSharedAccountsResponseBodyShareAccount self = new ListServiceSharedAccountsResponseBodyShareAccount();
            return TeaModel.build(map, self);
        }

        public ListServiceSharedAccountsResponseBodyShareAccount setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceSharedAccountsResponseBodyShareAccount setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public ListServiceSharedAccountsResponseBodyShareAccount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceSharedAccountsResponseBodyShareAccount setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public ListServiceSharedAccountsResponseBodyShareAccount setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceSharedAccountsResponseBodyShareAccount setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListServiceSharedAccountsResponseBodyShareAccount setUserAliUid(String userAliUid) {
            this.userAliUid = userAliUid;
            return this;
        }
        public String getUserAliUid() {
            return this.userAliUid;
        }

    }

}
