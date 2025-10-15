// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationAccountsForUserResponseBody extends TeaModel {
    @NameInMap("ApplicationAccounts")
    public java.util.List<ListApplicationAccountsForUserResponseBodyApplicationAccounts> applicationAccounts;

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

    public static ListApplicationAccountsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAccountsForUserResponseBody self = new ListApplicationAccountsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationAccountsForUserResponseBody setApplicationAccounts(java.util.List<ListApplicationAccountsForUserResponseBodyApplicationAccounts> applicationAccounts) {
        this.applicationAccounts = applicationAccounts;
        return this;
    }
    public java.util.List<ListApplicationAccountsForUserResponseBodyApplicationAccounts> getApplicationAccounts() {
        return this.applicationAccounts;
    }

    public ListApplicationAccountsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationAccountsForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationAccountsForUserResponseBodyApplicationAccounts extends TeaModel {
        /**
         * <p>IDaaS EIAM 应用账号Id</p>
         * 
         * <strong>example:</strong>
         * <p>aac_m6e3ukegwvbcb2fne7j32xxxxxx</p>
         */
        @NameInMap("ApplicationAccountId")
        public String applicationAccountId;

        /**
         * <p>IDaaS EIAM 应用Id</p>
         * 
         * <strong>example:</strong>
         * <p>app_na2r76irswrwfgpkz7xvcj7xxxxx</p>
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
         * <p>1754359439000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ki6hd7ihir4ybawogqk6xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>IDaaS EIAM 用户Id</p>
         * 
         * <strong>example:</strong>
         * <p>user_tkmboufpnvpbitdpzrlng6mxxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListApplicationAccountsForUserResponseBodyApplicationAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationAccountsForUserResponseBodyApplicationAccounts self = new ListApplicationAccountsForUserResponseBodyApplicationAccounts();
            return TeaModel.build(map, self);
        }

        public ListApplicationAccountsForUserResponseBodyApplicationAccounts setApplicationAccountId(String applicationAccountId) {
            this.applicationAccountId = applicationAccountId;
            return this;
        }
        public String getApplicationAccountId() {
            return this.applicationAccountId;
        }

        public ListApplicationAccountsForUserResponseBodyApplicationAccounts setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationAccountsForUserResponseBodyApplicationAccounts setApplicationUsername(String applicationUsername) {
            this.applicationUsername = applicationUsername;
            return this;
        }
        public String getApplicationUsername() {
            return this.applicationUsername;
        }

        public ListApplicationAccountsForUserResponseBodyApplicationAccounts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationAccountsForUserResponseBodyApplicationAccounts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationAccountsForUserResponseBodyApplicationAccounts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
