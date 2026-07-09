// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeFrInstancesResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeFrInstancesResponseBodyData> data;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFrInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrInstancesResponseBody self = new DescribeFrInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFrInstancesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeFrInstancesResponseBody setData(java.util.List<DescribeFrInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeFrInstancesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeFrInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFrInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFrInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFrInstancesResponseBodyDataCapacityType extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>deadlineAcc</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>总量递减型</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeFrInstancesResponseBodyDataCapacityType build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesResponseBodyDataCapacityType self = new DescribeFrInstancesResponseBodyDataCapacityType();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesResponseBodyDataCapacityType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeFrInstancesResponseBodyDataCapacityType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrInstancesResponseBodyDataCommodity extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>slb_albcubag_dp_cn</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>ALB资源包</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeFrInstancesResponseBodyDataCommodity build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesResponseBodyDataCommodity self = new DescribeFrInstancesResponseBodyDataCommodity();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesResponseBodyDataCommodity setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeFrInstancesResponseBodyDataCommodity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrInstancesResponseBodyDataCycleType extends TeaModel {
        /**
         * <p>The commitment cycle code.</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The commitment cycle name.</p>
         * 
         * <strong>example:</strong>
         * <p>小时</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeFrInstancesResponseBodyDataCycleType build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesResponseBodyDataCycleType self = new DescribeFrInstancesResponseBodyDataCycleType();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesResponseBodyDataCycleType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeFrInstancesResponseBodyDataCycleType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrInstancesResponseBodyDataDeductRegions extends TeaModel {
        /**
         * <p>The deductible region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The deductible region.</p>
         * 
         * <strong>example:</strong>
         * <p>北京</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeFrInstancesResponseBodyDataDeductRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesResponseBodyDataDeductRegions self = new DescribeFrInstancesResponseBodyDataDeductRegions();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesResponseBodyDataDeductRegions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeFrInstancesResponseBodyDataDeductRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrInstancesResponseBodyDataProduct extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>负载均衡</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeFrInstancesResponseBodyDataProduct build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesResponseBodyDataProduct self = new DescribeFrInstancesResponseBodyDataProduct();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesResponseBodyDataProduct setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeFrInstancesResponseBodyDataProduct setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrInstancesResponseBodyDataStatus extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>有效</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeFrInstancesResponseBodyDataStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesResponseBodyDataStatus self = new DescribeFrInstancesResponseBodyDataStatus();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesResponseBodyDataStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeFrInstancesResponseBodyDataStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrInstancesResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>alb_cubag*******</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>中国内地区域</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeFrInstancesResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesResponseBodyDataTemplate self = new DescribeFrInstancesResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesResponseBodyDataTemplate setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeFrInstancesResponseBodyDataTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>icloudtest</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The capacity type name.</p>
         * 
         * <strong>example:</strong>
         * <p>总量递减型</p>
         */
        @NameInMap("CapacitiyTypeName")
        public String capacitiyTypeName;

        /**
         * <p>The capacity type.</p>
         */
        @NameInMap("CapacityType")
        public DescribeFrInstancesResponseBodyDataCapacityType capacityType;

        /**
         * <p>The capacity type code.</p>
         * 
         * <strong>example:</strong>
         * <p>deadlineAcc</p>
         */
        @NameInMap("CapacityTypeCode")
        public String capacityTypeCode;

        /**
         * <p>The commodity.</p>
         */
        @NameInMap("Commodity")
        public DescribeFrInstancesResponseBodyDataCommodity commodity;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>pts</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The commodity name.</p>
         * 
         * <strong>example:</strong>
         * <p>性能测试</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>The current capacity baseline unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CU</p>
         */
        @NameInMap("CurrCapacityBaseUnit")
        public String currCapacityBaseUnit;

        /**
         * <p>The current capacity baseline value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.000000</p>
         */
        @NameInMap("CurrCapacityBaseValue")
        public String currCapacityBaseValue;

        /**
         * <p>The current capacity display unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CU</p>
         */
        @NameInMap("CurrCapacityViewUnit")
        public String currCapacityViewUnit;

        /**
         * <p>The current capacity display value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.000000</p>
         */
        @NameInMap("CurrCapacityViewValue")
        public String currCapacityViewValue;

        /**
         * <p>The commitment cycle.</p>
         */
        @NameInMap("CycleType")
        public DescribeFrInstancesResponseBodyDataCycleType cycleType;

        /**
         * <p>The commitment cycle code.</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("CycleTypeCode")
        public String cycleTypeCode;

        /**
         * <p>The commitment cycle name.</p>
         * 
         * <strong>example:</strong>
         * <p>小时</p>
         */
        @NameInMap("CycleTypeName")
        public String cycleTypeName;

        /**
         * <p>The list of deductible regions.</p>
         */
        @NameInMap("DeductRegions")
        public java.util.List<DescribeFrInstancesResponseBodyDataDeductRegions> deductRegions;

        /**
         * <p>Indicates whether the resource plan can be exchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableExchange")
        public Boolean enableExchange;

        /**
         * <p>Indicates whether the resource plan can be renewed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableRenew")
        public Boolean enableRenew;

        /**
         * <p>Indicates whether the resource plan can be upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableUpgrade")
        public Boolean enableUpgrade;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710604800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The commodity code for exchange.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ExchangeCommodityCode")
        public String exchangeCommodityCode;

        /**
         * <p>The initial capacity baseline unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CU</p>
         */
        @NameInMap("InitCapacityBaseUnit")
        public String initCapacityBaseUnit;

        /**
         * <p>The initial capacity baseline value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.000000</p>
         */
        @NameInMap("InitCapacityBaseValue")
        public String initCapacityBaseValue;

        /**
         * <p>The initial capacity display unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CU</p>
         */
        @NameInMap("InitCapacityViewUnit")
        public String initCapacityViewUnit;

        /**
         * <p>The initial capacity display value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.000000</p>
         */
        @NameInMap("InitCapacityViewValue")
        public String initCapacityViewValue;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>alb_cubag*******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The period capacity display unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CU</p>
         */
        @NameInMap("PeriodCapacityViewUnit")
        public String periodCapacityViewUnit;

        /**
         * <p>The period capacity display value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.000000</p>
         */
        @NameInMap("PeriodCapacityViewValue")
        public String periodCapacityViewValue;

        /**
         * <p>The period time.</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("PeriodTime")
        public String periodTime;

        /**
         * <p>The product.</p>
         */
        @NameInMap("Product")
        public DescribeFrInstancesResponseBodyDataProduct product;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>pts</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>性能测试</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The purchase time.</p>
         * 
         * <strong>example:</strong>
         * <p>1678939036000</p>
         */
        @NameInMap("PurchaseTime")
        public Long purchaseTime;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The specification.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>1678939035000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The resource status.</p>
         */
        @NameInMap("Status")
        public DescribeFrInstancesResponseBodyDataStatus status;

        /**
         * <p>The resource status code.</p>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The resource status name.</p>
         * 
         * <strong>example:</strong>
         * <p>有效</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <p>The template.</p>
         */
        @NameInMap("Template")
        public DescribeFrInstancesResponseBodyDataTemplate template;

        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>FPT_armsappbag_deadlineAcc_bj</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>new_test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The period capacity baseline unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CU</p>
         */
        @NameInMap("periodCapacityBaseUnit")
        public String periodCapacityBaseUnit;

        /**
         * <p>The period capacity baseline value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.000000</p>
         */
        @NameInMap("periodCapacityBaseValue")
        public String periodCapacityBaseValue;

        public static DescribeFrInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesResponseBodyData self = new DescribeFrInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesResponseBodyData setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeFrInstancesResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeFrInstancesResponseBodyData setCapacitiyTypeName(String capacitiyTypeName) {
            this.capacitiyTypeName = capacitiyTypeName;
            return this;
        }
        public String getCapacitiyTypeName() {
            return this.capacitiyTypeName;
        }

        public DescribeFrInstancesResponseBodyData setCapacityType(DescribeFrInstancesResponseBodyDataCapacityType capacityType) {
            this.capacityType = capacityType;
            return this;
        }
        public DescribeFrInstancesResponseBodyDataCapacityType getCapacityType() {
            return this.capacityType;
        }

        public DescribeFrInstancesResponseBodyData setCapacityTypeCode(String capacityTypeCode) {
            this.capacityTypeCode = capacityTypeCode;
            return this;
        }
        public String getCapacityTypeCode() {
            return this.capacityTypeCode;
        }

        public DescribeFrInstancesResponseBodyData setCommodity(DescribeFrInstancesResponseBodyDataCommodity commodity) {
            this.commodity = commodity;
            return this;
        }
        public DescribeFrInstancesResponseBodyDataCommodity getCommodity() {
            return this.commodity;
        }

        public DescribeFrInstancesResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeFrInstancesResponseBodyData setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public DescribeFrInstancesResponseBodyData setCurrCapacityBaseUnit(String currCapacityBaseUnit) {
            this.currCapacityBaseUnit = currCapacityBaseUnit;
            return this;
        }
        public String getCurrCapacityBaseUnit() {
            return this.currCapacityBaseUnit;
        }

        public DescribeFrInstancesResponseBodyData setCurrCapacityBaseValue(String currCapacityBaseValue) {
            this.currCapacityBaseValue = currCapacityBaseValue;
            return this;
        }
        public String getCurrCapacityBaseValue() {
            return this.currCapacityBaseValue;
        }

        public DescribeFrInstancesResponseBodyData setCurrCapacityViewUnit(String currCapacityViewUnit) {
            this.currCapacityViewUnit = currCapacityViewUnit;
            return this;
        }
        public String getCurrCapacityViewUnit() {
            return this.currCapacityViewUnit;
        }

        public DescribeFrInstancesResponseBodyData setCurrCapacityViewValue(String currCapacityViewValue) {
            this.currCapacityViewValue = currCapacityViewValue;
            return this;
        }
        public String getCurrCapacityViewValue() {
            return this.currCapacityViewValue;
        }

        public DescribeFrInstancesResponseBodyData setCycleType(DescribeFrInstancesResponseBodyDataCycleType cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public DescribeFrInstancesResponseBodyDataCycleType getCycleType() {
            return this.cycleType;
        }

        public DescribeFrInstancesResponseBodyData setCycleTypeCode(String cycleTypeCode) {
            this.cycleTypeCode = cycleTypeCode;
            return this;
        }
        public String getCycleTypeCode() {
            return this.cycleTypeCode;
        }

        public DescribeFrInstancesResponseBodyData setCycleTypeName(String cycleTypeName) {
            this.cycleTypeName = cycleTypeName;
            return this;
        }
        public String getCycleTypeName() {
            return this.cycleTypeName;
        }

        public DescribeFrInstancesResponseBodyData setDeductRegions(java.util.List<DescribeFrInstancesResponseBodyDataDeductRegions> deductRegions) {
            this.deductRegions = deductRegions;
            return this;
        }
        public java.util.List<DescribeFrInstancesResponseBodyDataDeductRegions> getDeductRegions() {
            return this.deductRegions;
        }

        public DescribeFrInstancesResponseBodyData setEnableExchange(Boolean enableExchange) {
            this.enableExchange = enableExchange;
            return this;
        }
        public Boolean getEnableExchange() {
            return this.enableExchange;
        }

        public DescribeFrInstancesResponseBodyData setEnableRenew(Boolean enableRenew) {
            this.enableRenew = enableRenew;
            return this;
        }
        public Boolean getEnableRenew() {
            return this.enableRenew;
        }

        public DescribeFrInstancesResponseBodyData setEnableUpgrade(Boolean enableUpgrade) {
            this.enableUpgrade = enableUpgrade;
            return this;
        }
        public Boolean getEnableUpgrade() {
            return this.enableUpgrade;
        }

        public DescribeFrInstancesResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeFrInstancesResponseBodyData setExchangeCommodityCode(String exchangeCommodityCode) {
            this.exchangeCommodityCode = exchangeCommodityCode;
            return this;
        }
        public String getExchangeCommodityCode() {
            return this.exchangeCommodityCode;
        }

        public DescribeFrInstancesResponseBodyData setInitCapacityBaseUnit(String initCapacityBaseUnit) {
            this.initCapacityBaseUnit = initCapacityBaseUnit;
            return this;
        }
        public String getInitCapacityBaseUnit() {
            return this.initCapacityBaseUnit;
        }

        public DescribeFrInstancesResponseBodyData setInitCapacityBaseValue(String initCapacityBaseValue) {
            this.initCapacityBaseValue = initCapacityBaseValue;
            return this;
        }
        public String getInitCapacityBaseValue() {
            return this.initCapacityBaseValue;
        }

        public DescribeFrInstancesResponseBodyData setInitCapacityViewUnit(String initCapacityViewUnit) {
            this.initCapacityViewUnit = initCapacityViewUnit;
            return this;
        }
        public String getInitCapacityViewUnit() {
            return this.initCapacityViewUnit;
        }

        public DescribeFrInstancesResponseBodyData setInitCapacityViewValue(String initCapacityViewValue) {
            this.initCapacityViewValue = initCapacityViewValue;
            return this;
        }
        public String getInitCapacityViewValue() {
            return this.initCapacityViewValue;
        }

        public DescribeFrInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeFrInstancesResponseBodyData setPeriodCapacityViewUnit(String periodCapacityViewUnit) {
            this.periodCapacityViewUnit = periodCapacityViewUnit;
            return this;
        }
        public String getPeriodCapacityViewUnit() {
            return this.periodCapacityViewUnit;
        }

        public DescribeFrInstancesResponseBodyData setPeriodCapacityViewValue(String periodCapacityViewValue) {
            this.periodCapacityViewValue = periodCapacityViewValue;
            return this;
        }
        public String getPeriodCapacityViewValue() {
            return this.periodCapacityViewValue;
        }

        public DescribeFrInstancesResponseBodyData setPeriodTime(String periodTime) {
            this.periodTime = periodTime;
            return this;
        }
        public String getPeriodTime() {
            return this.periodTime;
        }

        public DescribeFrInstancesResponseBodyData setProduct(DescribeFrInstancesResponseBodyDataProduct product) {
            this.product = product;
            return this;
        }
        public DescribeFrInstancesResponseBodyDataProduct getProduct() {
            return this.product;
        }

        public DescribeFrInstancesResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeFrInstancesResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeFrInstancesResponseBodyData setPurchaseTime(Long purchaseTime) {
            this.purchaseTime = purchaseTime;
            return this;
        }
        public Long getPurchaseTime() {
            return this.purchaseTime;
        }

        public DescribeFrInstancesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeFrInstancesResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeFrInstancesResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeFrInstancesResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeFrInstancesResponseBodyData setStatus(DescribeFrInstancesResponseBodyDataStatus status) {
            this.status = status;
            return this;
        }
        public DescribeFrInstancesResponseBodyDataStatus getStatus() {
            return this.status;
        }

        public DescribeFrInstancesResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public DescribeFrInstancesResponseBodyData setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeFrInstancesResponseBodyData setTemplate(DescribeFrInstancesResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public DescribeFrInstancesResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public DescribeFrInstancesResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeFrInstancesResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeFrInstancesResponseBodyData setPeriodCapacityBaseUnit(String periodCapacityBaseUnit) {
            this.periodCapacityBaseUnit = periodCapacityBaseUnit;
            return this;
        }
        public String getPeriodCapacityBaseUnit() {
            return this.periodCapacityBaseUnit;
        }

        public DescribeFrInstancesResponseBodyData setPeriodCapacityBaseValue(String periodCapacityBaseValue) {
            this.periodCapacityBaseValue = periodCapacityBaseValue;
            return this;
        }
        public String getPeriodCapacityBaseValue() {
            return this.periodCapacityBaseValue;
        }

    }

}
