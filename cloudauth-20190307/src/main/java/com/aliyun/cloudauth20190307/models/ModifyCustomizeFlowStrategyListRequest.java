// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyCustomizeFlowStrategyListRequest extends TeaModel {
    /**
     * <p>Product type, currently only supports <strong>ANT_CLOUD_AUTH</strong> (Financial-grade real person), all others have been phased out.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Strategy list.</p>
     */
    @NameInMap("StrategyObject")
    public java.util.List<ModifyCustomizeFlowStrategyListRequestStrategyObject> strategyObject;

    public static ModifyCustomizeFlowStrategyListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomizeFlowStrategyListRequest self = new ModifyCustomizeFlowStrategyListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomizeFlowStrategyListRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyCustomizeFlowStrategyListRequest setStrategyObject(java.util.List<ModifyCustomizeFlowStrategyListRequestStrategyObject> strategyObject) {
        this.strategyObject = strategyObject;
        return this;
    }
    public java.util.List<ModifyCustomizeFlowStrategyListRequestStrategyObject> getStrategyObject() {
        return this.strategyObject;
    }

    public static class ModifyCustomizeFlowStrategyListRequestStrategyObject extends TeaModel {
        /**
         * <p>AccumulateKey</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AccumulateKey")
        public String accumulateKey;

        /**
         * <p>Flow control statistical window size, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("AccumulateWindow")
        public Long accumulateWindow;

        /**
         * <p>API name, same as <strong>ProductCode</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>Flow type:</p>
         * <ul>
         * <li><strong>ACCUMULATE</strong>: Repeated appearance of ID card</li>
         * <li><strong>PASSED_RATE</strong>: Pass rate less than</li>
         * <li><strong>SUB_CODE_205</strong>: Authentication failed and liveness attack 205 ratio greater than</li>
         * <li><strong>SUB_CODE_206</strong>: Authentication failed and liveness attack 206 ratio greater than</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCUMULATE</p>
         */
        @NameInMap("FlowType")
        public String flowType;

        /**
         * <p>Rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Operation.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>Status:</p>
         * <ul>
         * <li><strong>disabled</strong>: Disabled</li>
         * <li><strong>normal</strong>: Enabled</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Flow control threshold.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>126005125163xxxx</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ModifyCustomizeFlowStrategyListRequestStrategyObject build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomizeFlowStrategyListRequestStrategyObject self = new ModifyCustomizeFlowStrategyListRequestStrategyObject();
            return TeaModel.build(map, self);
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setAccumulateKey(String accumulateKey) {
            this.accumulateKey = accumulateKey;
            return this;
        }
        public String getAccumulateKey() {
            return this.accumulateKey;
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setAccumulateWindow(Long accumulateWindow) {
            this.accumulateWindow = accumulateWindow;
            return this;
        }
        public Long getAccumulateWindow() {
            return this.accumulateWindow;
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public ModifyCustomizeFlowStrategyListRequestStrategyObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
