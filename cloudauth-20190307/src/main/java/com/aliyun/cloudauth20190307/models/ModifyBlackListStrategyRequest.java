// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyBlackListStrategyRequest extends TeaModel {
    /**
     * <p>The blacklist rule.</p>
     */
    @NameInMap("BlackListStrategy")
    public ModifyBlackListStrategyRequestBlackListStrategy blackListStrategy;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyBlackListStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlackListStrategyRequest self = new ModifyBlackListStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBlackListStrategyRequest setBlackListStrategy(ModifyBlackListStrategyRequestBlackListStrategy blackListStrategy) {
        this.blackListStrategy = blackListStrategy;
        return this;
    }
    public ModifyBlackListStrategyRequestBlackListStrategy getBlackListStrategy() {
        return this.blackListStrategy;
    }

    public ModifyBlackListStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyBlackListStrategyRequestBlackListStrategy extends TeaModel {
        /**
         * <p>The blacklist string. Separate multiple entries with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,127.0.0.2</p>
         */
        @NameInMap("BizContent")
        public String bizContent;

        /**
         * <p>The blacklist type. Valid values:</p>
         * <ul>
         * <li><strong>mobile</strong>: mobile number blacklist.</li>
         * <li><strong>ip</strong>: IP blacklist.</li>
         * <li><strong>identifyNum</strong>: ID card blacklist.</li>
         * <li><strong>bankCard</strong>: bank card blacklist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("BizKey")
        public String bizKey;

        /**
         * <p>The rule ID. Valid values:</p>
         * <ul>
         * <li><strong>Empty</strong>: creates a rule.</li>
         * <li><strong>Not empty</strong>: modifies a rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The product name. Valid values:</p>
         * <ul>
         * <li><strong>id2meta</strong>: ID card two-element verification.</li>
         * <li><strong>mobile3Meta</strong>: mobile number element verification.</li>
         * <li><strong>bankcardMeta</strong>: bank card element verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>id2meta</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The authentication status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Authentication passed.</li>
         * <li><strong>2</strong>: Authentication failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public String status;

        public static ModifyBlackListStrategyRequestBlackListStrategy build(java.util.Map<String, ?> map) throws Exception {
            ModifyBlackListStrategyRequestBlackListStrategy self = new ModifyBlackListStrategyRequestBlackListStrategy();
            return TeaModel.build(map, self);
        }

        public ModifyBlackListStrategyRequestBlackListStrategy setBizContent(String bizContent) {
            this.bizContent = bizContent;
            return this;
        }
        public String getBizContent() {
            return this.bizContent;
        }

        public ModifyBlackListStrategyRequestBlackListStrategy setBizKey(String bizKey) {
            this.bizKey = bizKey;
            return this;
        }
        public String getBizKey() {
            return this.bizKey;
        }

        public ModifyBlackListStrategyRequestBlackListStrategy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyBlackListStrategyRequestBlackListStrategy setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ModifyBlackListStrategyRequestBlackListStrategy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
