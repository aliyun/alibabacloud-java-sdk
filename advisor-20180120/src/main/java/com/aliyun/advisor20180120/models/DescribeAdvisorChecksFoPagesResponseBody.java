// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorChecksFoPagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeAdvisorChecksFoPagesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>566331F9-5AB3-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAdvisorChecksFoPagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorChecksFoPagesResponseBody self = new DescribeAdvisorChecksFoPagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorChecksFoPagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAdvisorChecksFoPagesResponseBody setData(java.util.List<DescribeAdvisorChecksFoPagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAdvisorChecksFoPagesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAdvisorChecksFoPagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdvisorChecksFoPagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdvisorChecksFoPagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAdvisorChecksFoPagesResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>EcsCostLowUtilizationCheck</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConfigSupport")
        public String configSupport;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InspectionScope")
        public String inspectionScope;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;type\&quot;:\&quot;template\&quot;,\&quot;value\&quot;:\&quot;cloudmonitor.console.aliyun.com/index.htm?custom_trace=ecs_console#/hostDetail/chart/instanceId=${Resource.resourceId}&amp;system=Linux&amp;region=${Resource.regionId}&amp;aliyunhost=true\&quot;,\&quot;key\&quot;:\&quot;Detail\&quot;},{\&quot;type\&quot;:\&quot;template\&quot;,\&quot;value\&quot;:\&quot;/diagnosis?product=${Product}&amp;resourceId=${Resource.resourceId}\&quot;,\&quot;key\&quot;:\&quot;Refresh\&quot;}]</p>
         */
        @NameInMap("OperateColumn")
        public String operateColumn;

        /**
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Product")
        public String product;

        @NameInMap("RiskLevel")
        public Long riskLevel;

        /**
         * <strong>example:</strong>
         * <p>Advisor</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubCategory")
        public java.util.List<Long> subCategory;

        @NameInMap("Tips")
        public String tips;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_resourceId\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_resourceName\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_regionId\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_instanceChargeType\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_instanceType\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_severity\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_costBefore\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_costAfter\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;EcsCostIdleCheck_costSavings\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;First_time\&quot;},{\&quot;type\&quot;:\&quot;DEFAULT\&quot;,\&quot;key\&quot;:\&quot;Duration_time\&quot;}]</p>
         */
        @NameInMap("ViewColumn")
        public String viewColumn;

        public static DescribeAdvisorChecksFoPagesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvisorChecksFoPagesResponseBodyDataResult self = new DescribeAdvisorChecksFoPagesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setConfigSupport(String configSupport) {
            this.configSupport = configSupport;
            return this;
        }
        public String getConfigSupport() {
            return this.configSupport;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setInspectionScope(String inspectionScope) {
            this.inspectionScope = inspectionScope;
            return this;
        }
        public String getInspectionScope() {
            return this.inspectionScope;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setOperateColumn(String operateColumn) {
            this.operateColumn = operateColumn;
            return this;
        }
        public String getOperateColumn() {
            return this.operateColumn;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setRiskLevel(Long riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Long getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setSubCategory(java.util.List<Long> subCategory) {
            this.subCategory = subCategory;
            return this;
        }
        public java.util.List<Long> getSubCategory() {
            return this.subCategory;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyDataResult setViewColumn(String viewColumn) {
            this.viewColumn = viewColumn;
            return this;
        }
        public String getViewColumn() {
            return this.viewColumn;
        }

    }

    public static class DescribeAdvisorChecksFoPagesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<DescribeAdvisorChecksFoPagesResponseBodyDataResult> result;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static DescribeAdvisorChecksFoPagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvisorChecksFoPagesResponseBodyData self = new DescribeAdvisorChecksFoPagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAdvisorChecksFoPagesResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyData setResult(java.util.List<DescribeAdvisorChecksFoPagesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeAdvisorChecksFoPagesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public DescribeAdvisorChecksFoPagesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
