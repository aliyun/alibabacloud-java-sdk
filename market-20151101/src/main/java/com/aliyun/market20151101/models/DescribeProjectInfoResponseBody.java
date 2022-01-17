// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeProjectInfoResponseBodyResult result;

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
        @NameInMap("CurrentStepNo")
        public Integer currentStepNo;

        @NameInMap("CustomerAliUid")
        public Long customerAliUid;

        @NameInMap("FinalStepNo")
        public Integer finalStepNo;

        @NameInMap("FinishType")
        public String finishType;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtExpired")
        public Long gmtExpired;

        @NameInMap("GmtFinished")
        public Long gmtFinished;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductSkuCode")
        public String productSkuCode;

        @NameInMap("ProductSkuName")
        public String productSkuName;

        @NameInMap("ProjectStatus")
        public String projectStatus;

        @NameInMap("SupplierAliUid")
        public Long supplierAliUid;

        @NameInMap("TemplateId")
        public Long templateId;

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
