// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyControlStrategyRequest extends TeaModel {
    /**
     * <p>The list of security alert rules.</p>
     */
    @NameInMap("ControlStrategyList")
    public java.util.List<ModifyControlStrategyRequestControlStrategyList> controlStrategyList;

    /**
     * <p>The product type. Currently, only <strong>ANT_CLOUD_AUTH</strong> (financial-grade ID Verification) is supported. All other types have been discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyControlStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlStrategyRequest self = new ModifyControlStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyControlStrategyRequest setControlStrategyList(java.util.List<ModifyControlStrategyRequestControlStrategyList> controlStrategyList) {
        this.controlStrategyList = controlStrategyList;
        return this;
    }
    public java.util.List<ModifyControlStrategyRequestControlStrategyList> getControlStrategyList() {
        return this.controlStrategyList;
    }

    public ModifyControlStrategyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyControlStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyControlStrategyRequestControlStrategyList extends TeaModel {
        /**
         * <p>The API name, which is the same as <strong>ProductCode</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The rule configuration type. Valid values:</p>
         * <ul>
         * <li><strong>QPS</strong>: QPS greater than</li>
         * <li><strong>SUCCESS_RATE_5_MIN</strong>: success rate in the last 5 minutes less than</li>
         * <li><strong>RESP_TIME_5_MIN</strong>: average response time in the last 5 minutes greater than</li>
         * <li><strong>AMOUNT_RISE</strong>: call volume increase compared to the previous period greater than</li>
         * <li><strong>AMOUNT_FALL</strong>: call volume decrease compared to the previous period less than</li>
         * <li><strong>PASSED_RATE_1_HOUR</strong>: verification consistency rate in the last hour less than</li>
         * <li><strong>PARAM_ERROR_RATE_1_HOUR</strong>: parameter error rate in the last hour greater than.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS_RATE_5_MIN</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong>: Disabled.</li>
         * <li><strong>normal</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The alert threshold of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Threshold")
        public Double threshold;

        public static ModifyControlStrategyRequestControlStrategyList build(java.util.Map<String, ?> map) throws Exception {
            ModifyControlStrategyRequestControlStrategyList self = new ModifyControlStrategyRequestControlStrategyList();
            return TeaModel.build(map, self);
        }

        public ModifyControlStrategyRequestControlStrategyList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ModifyControlStrategyRequestControlStrategyList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ModifyControlStrategyRequestControlStrategyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyControlStrategyRequestControlStrategyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyControlStrategyRequestControlStrategyList setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

    }

}
