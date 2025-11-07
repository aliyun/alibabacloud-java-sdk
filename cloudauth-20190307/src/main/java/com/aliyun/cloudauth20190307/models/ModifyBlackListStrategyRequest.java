// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyBlackListStrategyRequest extends TeaModel {
    /**
     * <p>Blacklist rule.</p>
     */
    @NameInMap("BlackListStrategy")
    public ModifyBlackListStrategyRequestBlackListStrategy blackListStrategy;

    /**
     * <p>Region ID</p>
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
         * <p>Blacklist string, with each blacklist entry separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,127.0.0.2</p>
         */
        @NameInMap("BizContent")
        public String bizContent;

        /**
         * <p>List Type:</p>
         * <ul>
         * <li><strong>mobile</strong>: Mobile number blacklist</li>
         * <li><strong>ip</strong>: IP blacklist</li>
         * <li><strong>identifyNum</strong>: ID number blacklist</li>
         * <li><strong>bankCard</strong>: Bank card blacklist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("BizKey")
        public String bizKey;

        /**
         * <p>Rule ID:</p>
         * <ul>
         * <li><strong>Empty</strong>: Add a new rule</li>
         * <li><strong>Non-empty</strong>: Modify an existing rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Product Name:</p>
         * <ul>
         * <li><strong>id2meta</strong>: ID card two-factor verification</li>
         * <li><strong>mobile3Meta</strong>: Mobile number factor verification</li>
         * <li><strong>bankcardMeta</strong>: Bank card factor verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>id2meta</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>Verification Status:</p>
         * <ul>
         * <li><strong>1</strong>: Verification passed</li>
         * <li><strong>2</strong>: Verification failed</li>
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
