// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class BatchEnrollAccountsRequest extends TeaModel {
    /**
     * <p>The resource accounts.</p>
     */
    @NameInMap("Accounts")
    public java.util.List<BatchEnrollAccountsRequestAccounts> accounts;

    /**
     * <p>The ID of the baseline. If you leave this parameter empty, the default baseline is used.</p>
     * 
     * <strong>example:</strong>
     * <p>afb-bp1durvn3lgqe28v****</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>The baseline items.</p>
     * <p>If you specify this parameter, the baseline item configurations are merged with the configurations of the baseline specified by <code>BaselineId</code>. For duplicate baseline items, the configurations in this parameter take precedence. We recommend that you leave this parameter empty and use <code>BaselineId</code> to apply baseline configurations.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<BatchEnrollAccountsRequestBaselineItems> baselineItems;

    /**
     * <p>The region ID.</p>
     * 
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
         * <p>The ID of the account to enroll. This parameter is required.</p>
         * 
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
         * <p>The configurations of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Notifications&quot;:[{&quot;GroupKey&quot;:&quot;account_msg&quot;,&quot;Contacts&quot;:[{&quot;Name&quot;:&quot;aa&quot;}],&quot;PmsgStatus&quot;:1,&quot;EmailStatus&quot;:1,&quot;SmsStatus&quot;:1}]}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to skip the baseline item. Valid values:</p>
         * <ul>
         * <li><p>false (default): does not skip the baseline item.</p>
         * </li>
         * <li><p>true: skips the baseline item.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The version of the baseline item.</p>
         * 
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
