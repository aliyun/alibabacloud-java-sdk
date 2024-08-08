// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class BatchEnrollAccountsRequest extends TeaModel {
    @NameInMap("Accounts")
    public java.util.List<BatchEnrollAccountsRequestAccounts> accounts;

    /**
     * <strong>example:</strong>
     * <p>afb-bp1durvn3lgqe28v****</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    @NameInMap("BaselineItems")
    public java.util.List<BatchEnrollAccountsRequestBaselineItems> baselineItems;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static BatchEnrollAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEnrollAccountsRequest self = new BatchEnrollAccountsRequest();
        return TeaModel.build(map, self);
    }

    public BatchEnrollAccountsRequest setAccounts(java.util.List<BatchEnrollAccountsRequestAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<BatchEnrollAccountsRequestAccounts> getAccounts() {
        return this.accounts;
    }

    public BatchEnrollAccountsRequest setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public BatchEnrollAccountsRequest setBaselineItems(java.util.List<BatchEnrollAccountsRequestBaselineItems> baselineItems) {
        this.baselineItems = baselineItems;
        return this;
    }
    public java.util.List<BatchEnrollAccountsRequestBaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    public BatchEnrollAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class BatchEnrollAccountsRequestAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12868156179****</p>
         */
        @NameInMap("AccountUid")
        public Long accountUid;

        public static BatchEnrollAccountsRequestAccounts build(java.util.Map<String, ?> map) throws Exception {
            BatchEnrollAccountsRequestAccounts self = new BatchEnrollAccountsRequestAccounts();
            return TeaModel.build(map, self);
        }

        public BatchEnrollAccountsRequestAccounts setAccountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }
        public Long getAccountUid() {
            return this.accountUid;
        }

    }

    public static class BatchEnrollAccountsRequestBaselineItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;Notifications\&quot;:[{\&quot;GroupKey\&quot;:\&quot;account_msg\&quot;,\&quot;Contacts\&quot;:[{\&quot;Name\&quot;:\&quot;aa\&quot;}],\&quot;PmsgStatus\&quot;:1,\&quot;EmailStatus\&quot;:1,\&quot;SmsStatus\&quot;:1}]}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static BatchEnrollAccountsRequestBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            BatchEnrollAccountsRequestBaselineItems self = new BatchEnrollAccountsRequestBaselineItems();
            return TeaModel.build(map, self);
        }

        public BatchEnrollAccountsRequestBaselineItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public BatchEnrollAccountsRequestBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchEnrollAccountsRequestBaselineItems setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public BatchEnrollAccountsRequestBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
