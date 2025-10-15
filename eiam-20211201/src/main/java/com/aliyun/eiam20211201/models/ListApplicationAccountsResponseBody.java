// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationAccountsResponseBody extends TeaModel {
    @NameInMap("ApplicationAccounts")
    public java.util.List<ListApplicationAccountsResponseBodyApplicationAccounts> applicationAccounts;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAccountsResponseBody self = new ListApplicationAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationAccountsResponseBody setApplicationAccounts(java.util.List<ListApplicationAccountsResponseBodyApplicationAccounts> applicationAccounts) {
        this.applicationAccounts = applicationAccounts;
        return this;
    }
    public java.util.List<ListApplicationAccountsResponseBodyApplicationAccounts> getApplicationAccounts() {
        return this.applicationAccounts;
    }

    public ListApplicationAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationAccountsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationAccountsResponseBodyApplicationAccounts extends TeaModel {
        /**
         * <p>IDaaS EIAM 应用账号Id</p>
         * 
         * <strong>example:</strong>
         * <p>aac_m66smhbq5krept7nza54hxxxx</p>
         */
        @NameInMap("ApplicationAccountId")
        public String applicationAccountId;

        /**
         * <p>IDaaS EIAM 应用Id</p>
         * 
         * <strong>example:</strong>
         * <p>app_m43o4h5adeo5klvbbxgxxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>IDaaS EIAM 应用账号名称</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApplicationUsername")
        public String applicationUsername;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1737510353000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_eznwtkkaucljizh6qqu7ptxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>IDaaS EIAM 用户Id</p>
         * 
         * <strong>example:</strong>
         * <p>user_tkmboufpnvpbitdpzrlngxzxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListApplicationAccountsResponseBodyApplicationAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationAccountsResponseBodyApplicationAccounts self = new ListApplicationAccountsResponseBodyApplicationAccounts();
            return TeaModel.build(map, self);
        }

        public ListApplicationAccountsResponseBodyApplicationAccounts setApplicationAccountId(String applicationAccountId) {
            this.applicationAccountId = applicationAccountId;
            return this;
        }
        public String getApplicationAccountId() {
            return this.applicationAccountId;
        }

        public ListApplicationAccountsResponseBodyApplicationAccounts setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationAccountsResponseBodyApplicationAccounts setApplicationUsername(String applicationUsername) {
            this.applicationUsername = applicationUsername;
            return this;
        }
        public String getApplicationUsername() {
            return this.applicationUsername;
        }

        public ListApplicationAccountsResponseBodyApplicationAccounts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationAccountsResponseBodyApplicationAccounts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationAccountsResponseBodyApplicationAccounts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
