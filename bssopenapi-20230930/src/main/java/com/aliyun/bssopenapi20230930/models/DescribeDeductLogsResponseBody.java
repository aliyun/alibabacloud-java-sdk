// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeDeductLogsResponseBody extends TeaModel {
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
    public java.util.List<DescribeDeductLogsResponseBodyData> data;

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
     * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDeductLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeductLogsResponseBody self = new DescribeDeductLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeductLogsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDeductLogsResponseBody setData(java.util.List<DescribeDeductLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDeductLogsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDeductLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeductLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeductLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeductLogsResponseBodyDataBillingCommodity extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>云服务器ECS-快照</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDeductLogsResponseBodyDataBillingCommodity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsResponseBodyDataBillingCommodity self = new DescribeDeductLogsResponseBodyDataBillingCommodity();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsResponseBodyDataBillingCommodity setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDeductLogsResponseBodyDataBillingCommodity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDeductLogsResponseBodyDataBillingPriceField extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>Storage</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>零折使用容量</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDeductLogsResponseBodyDataBillingPriceField build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsResponseBodyDataBillingPriceField self = new DescribeDeductLogsResponseBodyDataBillingPriceField();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsResponseBodyDataBillingPriceField setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDeductLogsResponseBodyDataBillingPriceField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDeductLogsResponseBodyDataCapacityType extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>absolute</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>总量恒定型</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDeductLogsResponseBodyDataCapacityType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsResponseBodyDataCapacityType self = new DescribeDeductLogsResponseBodyDataCapacityType();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsResponseBodyDataCapacityType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDeductLogsResponseBodyDataCapacityType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDeductLogsResponseBodyDataCommodity extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>ossbag</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>对象存储OSS资源包(包月)</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDeductLogsResponseBodyDataCommodity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsResponseBodyDataCommodity self = new DescribeDeductLogsResponseBodyDataCommodity();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsResponseBodyDataCommodity setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDeductLogsResponseBodyDataCommodity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDeductLogsResponseBodyDataCycleType extends TeaModel {
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

        public static DescribeDeductLogsResponseBodyDataCycleType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsResponseBodyDataCycleType self = new DescribeDeductLogsResponseBodyDataCycleType();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsResponseBodyDataCycleType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDeductLogsResponseBodyDataCycleType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDeductLogsResponseBodyDataProduct extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>对象存储</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDeductLogsResponseBodyDataProduct build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsResponseBodyDataProduct self = new DescribeDeductLogsResponseBodyDataProduct();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsResponseBodyDataProduct setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDeductLogsResponseBodyDataProduct setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDeductLogsResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>FPT_ossbag********</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>标准存储包</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDeductLogsResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsResponseBodyDataTemplate self = new DescribeDeductLogsResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsResponseBodyDataTemplate setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDeductLogsResponseBodyDataTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDeductLogsResponseBodyData extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1929817951466001</p>
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
         * <p>The deducted commodity.</p>
         */
        @NameInMap("BillingCommodity")
        public DescribeDeductLogsResponseBodyDataBillingCommodity billingCommodity;

        /**
         * <p>The deducted commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot</p>
         */
        @NameInMap("BillingCommodityCode")
        public String billingCommodityCode;

        /**
         * <p>The deducted commodity name.</p>
         * 
         * <strong>example:</strong>
         * <p>云服务器ECS-快照</p>
         */
        @NameInMap("BillingCommodityName")
        public String billingCommodityName;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1679036400000</p>
         */
        @NameInMap("BillingEndTime")
        public Long billingEndTime;

        /**
         * <p>The deduction instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("BillingInstanceId")
        public String billingInstanceId;

        /**
         * <p>The deduction billable item.</p>
         */
        @NameInMap("BillingPriceField")
        public DescribeDeductLogsResponseBodyDataBillingPriceField billingPriceField;

        /**
         * <p>The deduction billable item code.</p>
         * 
         * <strong>example:</strong>
         * <p>Storage</p>
         */
        @NameInMap("BillingPriceFieldCode")
        public String billingPriceFieldCode;

        /**
         * <p>The deduction billable item name.</p>
         * 
         * <strong>example:</strong>
         * <p>零折使用容量</p>
         */
        @NameInMap("BillingPriceFieldName")
        public String billingPriceFieldName;

        /**
         * <p>The effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>1679032800000</p>
         */
        @NameInMap("BillingStartTime")
        public Long billingStartTime;

        /**
         * <p>The display unit of the capacity after deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("CapacityAfterDeductViewUnit")
        public String capacityAfterDeductViewUnit;

        /**
         * <p>The display value of the capacity after deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>23.896484</p>
         */
        @NameInMap("CapacityAfterDeductViewValue")
        public String capacityAfterDeductViewValue;

        /**
         * <p>The display unit of the capacity before deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("CapacityBeforeDeductViewUnit")
        public String capacityBeforeDeductViewUnit;

        /**
         * <p>The display value of the capacity before deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>40.000000</p>
         */
        @NameInMap("CapacityBeforeDeductViewValue")
        public String capacityBeforeDeductViewValue;

        /**
         * <p>The display unit of the deducted capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("CapacityDeductedViewUnit")
        public String capacityDeductedViewUnit;

        /**
         * <p>The display value of the deducted capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>16.103515</p>
         */
        @NameInMap("CapacityDeductedViewValue")
        public String capacityDeductedViewValue;

        /**
         * <p>The capacity type.</p>
         */
        @NameInMap("CapacityType")
        public DescribeDeductLogsResponseBodyDataCapacityType capacityType;

        /**
         * <p>The capacity type code.</p>
         * 
         * <strong>example:</strong>
         * <p>absolute</p>
         */
        @NameInMap("CapacityTypeCode")
        public String capacityTypeCode;

        /**
         * <p>The capacity type name.</p>
         * 
         * <strong>example:</strong>
         * <p>总量恒定型</p>
         */
        @NameInMap("CapacityTypeName")
        public String capacityTypeName;

        /**
         * <p>The commodity.</p>
         */
        @NameInMap("Commodity")
        public DescribeDeductLogsResponseBodyDataCommodity commodity;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>ossbag</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The commodity name.</p>
         * 
         * <strong>example:</strong>
         * <p>对象存储OSS资源包(包月)</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>The commitment cycle.</p>
         */
        @NameInMap("CycleType")
        public DescribeDeductLogsResponseBodyDataCycleType cycleType;

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
         * <p>The deduction time.</p>
         * 
         * <strong>example:</strong>
         * <p>1679039572000</p>
         */
        @NameInMap("DeductTime")
        public Long deductTime;

        /**
         * <p>The deduction factor.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Factor")
        public String factor;

        /**
         * <p>The ID of the account to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("InstanceBelongAccountId")
        public Long instanceBelongAccountId;

        /**
         * <p>The name of the account to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>icloudtest</p>
         */
        @NameInMap("InstanceBelongAccountName")
        public String instanceBelongAccountName;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>OSSBAG-cn-****s</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The display unit of the metering amount after deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>Byte</p>
         */
        @NameInMap("MeasureAfterDeductViewUnit")
        public String measureAfterDeductViewUnit;

        /**
         * <p>The display value of the metering amount after deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MeasureAfterDeductViewValue")
        public String measureAfterDeductViewValue;

        /**
         * <p>The display unit of the metering amount before deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("MeasureBeforeDeductViewUnit")
        public String measureBeforeDeductViewUnit;

        /**
         * <p>The display value of the metering amount before deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>16.103515</p>
         */
        @NameInMap("MeasureBeforeDeductViewValue")
        public String measureBeforeDeductViewValue;

        /**
         * <p>The display unit of the deducted metering amount.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("MeasureDeductedViewUnit")
        public String measureDeductedViewUnit;

        /**
         * <p>The display value of the deducted metering amount.</p>
         * 
         * <strong>example:</strong>
         * <p>16.103515</p>
         */
        @NameInMap("MeasureDeductedViewValue")
        public String measureDeductedViewValue;

        /**
         * <p>The product.</p>
         */
        @NameInMap("Product")
        public DescribeDeductLogsResponseBodyDataProduct product;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>对象存储</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The deduction account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("RelationAccountId")
        public Long relationAccountId;

        /**
         * <p>The deduction account name.</p>
         * 
         * <strong>example:</strong>
         * <p>icloudtest</p>
         */
        @NameInMap("RelationAccountName")
        public String relationAccountName;

        /**
         * <p>The template.</p>
         */
        @NameInMap("Template")
        public DescribeDeductLogsResponseBodyDataTemplate template;

        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>FPT_ossbag********</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>标准存储包</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeDeductLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsResponseBodyData self = new DescribeDeductLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsResponseBodyData setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeDeductLogsResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeDeductLogsResponseBodyData setBillingCommodity(DescribeDeductLogsResponseBodyDataBillingCommodity billingCommodity) {
            this.billingCommodity = billingCommodity;
            return this;
        }
        public DescribeDeductLogsResponseBodyDataBillingCommodity getBillingCommodity() {
            return this.billingCommodity;
        }

        public DescribeDeductLogsResponseBodyData setBillingCommodityCode(String billingCommodityCode) {
            this.billingCommodityCode = billingCommodityCode;
            return this;
        }
        public String getBillingCommodityCode() {
            return this.billingCommodityCode;
        }

        public DescribeDeductLogsResponseBodyData setBillingCommodityName(String billingCommodityName) {
            this.billingCommodityName = billingCommodityName;
            return this;
        }
        public String getBillingCommodityName() {
            return this.billingCommodityName;
        }

        public DescribeDeductLogsResponseBodyData setBillingEndTime(Long billingEndTime) {
            this.billingEndTime = billingEndTime;
            return this;
        }
        public Long getBillingEndTime() {
            return this.billingEndTime;
        }

        public DescribeDeductLogsResponseBodyData setBillingInstanceId(String billingInstanceId) {
            this.billingInstanceId = billingInstanceId;
            return this;
        }
        public String getBillingInstanceId() {
            return this.billingInstanceId;
        }

        public DescribeDeductLogsResponseBodyData setBillingPriceField(DescribeDeductLogsResponseBodyDataBillingPriceField billingPriceField) {
            this.billingPriceField = billingPriceField;
            return this;
        }
        public DescribeDeductLogsResponseBodyDataBillingPriceField getBillingPriceField() {
            return this.billingPriceField;
        }

        public DescribeDeductLogsResponseBodyData setBillingPriceFieldCode(String billingPriceFieldCode) {
            this.billingPriceFieldCode = billingPriceFieldCode;
            return this;
        }
        public String getBillingPriceFieldCode() {
            return this.billingPriceFieldCode;
        }

        public DescribeDeductLogsResponseBodyData setBillingPriceFieldName(String billingPriceFieldName) {
            this.billingPriceFieldName = billingPriceFieldName;
            return this;
        }
        public String getBillingPriceFieldName() {
            return this.billingPriceFieldName;
        }

        public DescribeDeductLogsResponseBodyData setBillingStartTime(Long billingStartTime) {
            this.billingStartTime = billingStartTime;
            return this;
        }
        public Long getBillingStartTime() {
            return this.billingStartTime;
        }

        public DescribeDeductLogsResponseBodyData setCapacityAfterDeductViewUnit(String capacityAfterDeductViewUnit) {
            this.capacityAfterDeductViewUnit = capacityAfterDeductViewUnit;
            return this;
        }
        public String getCapacityAfterDeductViewUnit() {
            return this.capacityAfterDeductViewUnit;
        }

        public DescribeDeductLogsResponseBodyData setCapacityAfterDeductViewValue(String capacityAfterDeductViewValue) {
            this.capacityAfterDeductViewValue = capacityAfterDeductViewValue;
            return this;
        }
        public String getCapacityAfterDeductViewValue() {
            return this.capacityAfterDeductViewValue;
        }

        public DescribeDeductLogsResponseBodyData setCapacityBeforeDeductViewUnit(String capacityBeforeDeductViewUnit) {
            this.capacityBeforeDeductViewUnit = capacityBeforeDeductViewUnit;
            return this;
        }
        public String getCapacityBeforeDeductViewUnit() {
            return this.capacityBeforeDeductViewUnit;
        }

        public DescribeDeductLogsResponseBodyData setCapacityBeforeDeductViewValue(String capacityBeforeDeductViewValue) {
            this.capacityBeforeDeductViewValue = capacityBeforeDeductViewValue;
            return this;
        }
        public String getCapacityBeforeDeductViewValue() {
            return this.capacityBeforeDeductViewValue;
        }

        public DescribeDeductLogsResponseBodyData setCapacityDeductedViewUnit(String capacityDeductedViewUnit) {
            this.capacityDeductedViewUnit = capacityDeductedViewUnit;
            return this;
        }
        public String getCapacityDeductedViewUnit() {
            return this.capacityDeductedViewUnit;
        }

        public DescribeDeductLogsResponseBodyData setCapacityDeductedViewValue(String capacityDeductedViewValue) {
            this.capacityDeductedViewValue = capacityDeductedViewValue;
            return this;
        }
        public String getCapacityDeductedViewValue() {
            return this.capacityDeductedViewValue;
        }

        public DescribeDeductLogsResponseBodyData setCapacityType(DescribeDeductLogsResponseBodyDataCapacityType capacityType) {
            this.capacityType = capacityType;
            return this;
        }
        public DescribeDeductLogsResponseBodyDataCapacityType getCapacityType() {
            return this.capacityType;
        }

        public DescribeDeductLogsResponseBodyData setCapacityTypeCode(String capacityTypeCode) {
            this.capacityTypeCode = capacityTypeCode;
            return this;
        }
        public String getCapacityTypeCode() {
            return this.capacityTypeCode;
        }

        public DescribeDeductLogsResponseBodyData setCapacityTypeName(String capacityTypeName) {
            this.capacityTypeName = capacityTypeName;
            return this;
        }
        public String getCapacityTypeName() {
            return this.capacityTypeName;
        }

        public DescribeDeductLogsResponseBodyData setCommodity(DescribeDeductLogsResponseBodyDataCommodity commodity) {
            this.commodity = commodity;
            return this;
        }
        public DescribeDeductLogsResponseBodyDataCommodity getCommodity() {
            return this.commodity;
        }

        public DescribeDeductLogsResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDeductLogsResponseBodyData setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public DescribeDeductLogsResponseBodyData setCycleType(DescribeDeductLogsResponseBodyDataCycleType cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public DescribeDeductLogsResponseBodyDataCycleType getCycleType() {
            return this.cycleType;
        }

        public DescribeDeductLogsResponseBodyData setCycleTypeCode(String cycleTypeCode) {
            this.cycleTypeCode = cycleTypeCode;
            return this;
        }
        public String getCycleTypeCode() {
            return this.cycleTypeCode;
        }

        public DescribeDeductLogsResponseBodyData setCycleTypeName(String cycleTypeName) {
            this.cycleTypeName = cycleTypeName;
            return this;
        }
        public String getCycleTypeName() {
            return this.cycleTypeName;
        }

        public DescribeDeductLogsResponseBodyData setDeductTime(Long deductTime) {
            this.deductTime = deductTime;
            return this;
        }
        public Long getDeductTime() {
            return this.deductTime;
        }

        public DescribeDeductLogsResponseBodyData setFactor(String factor) {
            this.factor = factor;
            return this;
        }
        public String getFactor() {
            return this.factor;
        }

        public DescribeDeductLogsResponseBodyData setInstanceBelongAccountId(Long instanceBelongAccountId) {
            this.instanceBelongAccountId = instanceBelongAccountId;
            return this;
        }
        public Long getInstanceBelongAccountId() {
            return this.instanceBelongAccountId;
        }

        public DescribeDeductLogsResponseBodyData setInstanceBelongAccountName(String instanceBelongAccountName) {
            this.instanceBelongAccountName = instanceBelongAccountName;
            return this;
        }
        public String getInstanceBelongAccountName() {
            return this.instanceBelongAccountName;
        }

        public DescribeDeductLogsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDeductLogsResponseBodyData setMeasureAfterDeductViewUnit(String measureAfterDeductViewUnit) {
            this.measureAfterDeductViewUnit = measureAfterDeductViewUnit;
            return this;
        }
        public String getMeasureAfterDeductViewUnit() {
            return this.measureAfterDeductViewUnit;
        }

        public DescribeDeductLogsResponseBodyData setMeasureAfterDeductViewValue(String measureAfterDeductViewValue) {
            this.measureAfterDeductViewValue = measureAfterDeductViewValue;
            return this;
        }
        public String getMeasureAfterDeductViewValue() {
            return this.measureAfterDeductViewValue;
        }

        public DescribeDeductLogsResponseBodyData setMeasureBeforeDeductViewUnit(String measureBeforeDeductViewUnit) {
            this.measureBeforeDeductViewUnit = measureBeforeDeductViewUnit;
            return this;
        }
        public String getMeasureBeforeDeductViewUnit() {
            return this.measureBeforeDeductViewUnit;
        }

        public DescribeDeductLogsResponseBodyData setMeasureBeforeDeductViewValue(String measureBeforeDeductViewValue) {
            this.measureBeforeDeductViewValue = measureBeforeDeductViewValue;
            return this;
        }
        public String getMeasureBeforeDeductViewValue() {
            return this.measureBeforeDeductViewValue;
        }

        public DescribeDeductLogsResponseBodyData setMeasureDeductedViewUnit(String measureDeductedViewUnit) {
            this.measureDeductedViewUnit = measureDeductedViewUnit;
            return this;
        }
        public String getMeasureDeductedViewUnit() {
            return this.measureDeductedViewUnit;
        }

        public DescribeDeductLogsResponseBodyData setMeasureDeductedViewValue(String measureDeductedViewValue) {
            this.measureDeductedViewValue = measureDeductedViewValue;
            return this;
        }
        public String getMeasureDeductedViewValue() {
            return this.measureDeductedViewValue;
        }

        public DescribeDeductLogsResponseBodyData setProduct(DescribeDeductLogsResponseBodyDataProduct product) {
            this.product = product;
            return this;
        }
        public DescribeDeductLogsResponseBodyDataProduct getProduct() {
            return this.product;
        }

        public DescribeDeductLogsResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeDeductLogsResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeDeductLogsResponseBodyData setRelationAccountId(Long relationAccountId) {
            this.relationAccountId = relationAccountId;
            return this;
        }
        public Long getRelationAccountId() {
            return this.relationAccountId;
        }

        public DescribeDeductLogsResponseBodyData setRelationAccountName(String relationAccountName) {
            this.relationAccountName = relationAccountName;
            return this;
        }
        public String getRelationAccountName() {
            return this.relationAccountName;
        }

        public DescribeDeductLogsResponseBodyData setTemplate(DescribeDeductLogsResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public DescribeDeductLogsResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public DescribeDeductLogsResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeDeductLogsResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
