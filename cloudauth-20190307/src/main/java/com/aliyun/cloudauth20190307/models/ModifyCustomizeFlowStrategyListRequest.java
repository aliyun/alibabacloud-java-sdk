// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyCustomizeFlowStrategyListRequest extends TeaModel {
    /**
     * <p>The product type. Currently, only <strong>ANT_CLOUD_AUTH</strong> (Financial-grade ID Verification) is supported. All other product types are retired.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of policies.</p>
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
         * <p>The size of the rate limiting statistical window, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("AccumulateWindow")
        public Long accumulateWindow;

        /**
         * <p>The API name. This parameter is the same as <strong>ProductCode</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The flow type. Valid values:</p>
         * <ul>
         * <li><strong>ACCUMULATE</strong>: Duplicate ID cards.</li>
         * <li><strong>PASSED_RATE</strong>: The pass rate is less than the specified value.</li>
         * <li><strong>SUB_CODE_205</strong>: Authentication fails and the proportion of liveness attack 205 is greater than the specified value.</li>
         * <li><strong>SUB_CODE_206</strong>: Authentication fails and the proportion of liveness attack 206 is greater than the specified value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCUMULATE</p>
         */
        @NameInMap("FlowType")
        public String flowType;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The operation.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong>: Disabled.</li>
         * <li><strong>normal</strong>: Enabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The rate limiting threshold.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        /**
         * <p>The ID of the user.</p>
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
