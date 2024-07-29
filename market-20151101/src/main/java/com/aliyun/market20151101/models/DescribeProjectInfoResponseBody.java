// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ee3e1b3b-6c38-4bcf-be40-5a946cfda761</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeProjectInfoResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeProjectInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectInfoResponseBody self = new DescribeProjectInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectInfoResponseBody setResult(DescribeProjectInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeProjectInfoResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeProjectInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProjectInfoResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CurrentStepNo")
        public Integer currentStepNo;

        /**
         * <strong>example:</strong>
         * <p>27291111****</p>
         */
        @NameInMap("CustomerAliUid")
        public Long customerAliUid;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FinalStepNo")
        public Integer finalStepNo;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("FinishType")
        public String finishType;

        /**
         * <strong>example:</strong>
         * <p>1588834324000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1620403200000</p>
         */
        @NameInMap("GmtExpired")
        public Long gmtExpired;

        /**
         * <strong>example:</strong>
         * <p>1620403200000</p>
         */
        @NameInMap("GmtFinished")
        public Long gmtFinished;

        /**
         * <strong>example:</strong>
         * <p>4****89</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2059111111111</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>cmgj***055</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>yuncode****500001</p>
         */
        @NameInMap("ProductSkuCode")
        public String productSkuCode;

        @NameInMap("ProductSkuName")
        public String productSkuName;

        /**
         * <strong>example:</strong>
         * <p>Starting</p>
         */
        @NameInMap("ProjectStatus")
        public String projectStatus;

        /**
         * <strong>example:</strong>
         * <p>45121111****</p>
         */
        @NameInMap("SupplierAliUid")
        public Long supplierAliUid;

        /**
         * <strong>example:</strong>
         * <p>410</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static DescribeProjectInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectInfoResponseBodyResult self = new DescribeProjectInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeProjectInfoResponseBodyResult setCurrentStepNo(Integer currentStepNo) {
            this.currentStepNo = currentStepNo;
            return this;
        }
        public Integer getCurrentStepNo() {
            return this.currentStepNo;
        }

        public DescribeProjectInfoResponseBodyResult setCustomerAliUid(Long customerAliUid) {
            this.customerAliUid = customerAliUid;
            return this;
        }
        public Long getCustomerAliUid() {
            return this.customerAliUid;
        }

        public DescribeProjectInfoResponseBodyResult setFinalStepNo(Integer finalStepNo) {
            this.finalStepNo = finalStepNo;
            return this;
        }
        public Integer getFinalStepNo() {
            return this.finalStepNo;
        }

        public DescribeProjectInfoResponseBodyResult setFinishType(String finishType) {
            this.finishType = finishType;
            return this;
        }
        public String getFinishType() {
            return this.finishType;
        }

        public DescribeProjectInfoResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectInfoResponseBodyResult setGmtExpired(Long gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }
        public Long getGmtExpired() {
            return this.gmtExpired;
        }

        public DescribeProjectInfoResponseBodyResult setGmtFinished(Long gmtFinished) {
            this.gmtFinished = gmtFinished;
            return this;
        }
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        public DescribeProjectInfoResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeProjectInfoResponseBodyResult setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public DescribeProjectInfoResponseBodyResult setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeProjectInfoResponseBodyResult setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeProjectInfoResponseBodyResult setProductSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }
        public String getProductSkuCode() {
            return this.productSkuCode;
        }

        public DescribeProjectInfoResponseBodyResult setProductSkuName(String productSkuName) {
            this.productSkuName = productSkuName;
            return this;
        }
        public String getProductSkuName() {
            return this.productSkuName;
        }

        public DescribeProjectInfoResponseBodyResult setProjectStatus(String projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public String getProjectStatus() {
            return this.projectStatus;
        }

        public DescribeProjectInfoResponseBodyResult setSupplierAliUid(Long supplierAliUid) {
            this.supplierAliUid = supplierAliUid;
            return this;
        }
        public Long getSupplierAliUid() {
            return this.supplierAliUid;
        }

        public DescribeProjectInfoResponseBodyResult setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeProjectInfoResponseBodyResult setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
