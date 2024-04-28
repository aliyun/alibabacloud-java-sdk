// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <br>
     * <p>*   **200**: The request was successful.</p>
     * <p>*   Other codes: The request failed.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ListInstanceResponseBodyData data;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListInstanceResponseBody setData(ListInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceResponseBodyDataInstancesSpec extends TeaModel {
        @NameInMap("Coverage")
        public String coverage;

        @NameInMap("DiversionType")
        public String diversionType;

        @NameInMap("Edition")
        public String edition;

        @NameInMap("IdcNumbers")
        public String idcNumbers;

        @NameInMap("InitialInstallation")
        public String initialInstallation;

        @NameInMap("InitialQty")
        public String initialQty;

        @NameInMap("IpSubnetNums")
        public String ipSubnetNums;

        @NameInMap("MitigationAnalysis")
        public String mitigationAnalysis;

        @NameInMap("MitigationAnalysisCapacity")
        public String mitigationAnalysisCapacity;

        @NameInMap("MitigationCapacity")
        public String mitigationCapacity;

        @NameInMap("MitigationNums")
        public String mitigationNums;

        @NameInMap("NormalBandwidth")
        public String normalBandwidth;

        public static ListInstanceResponseBodyDataInstancesSpec build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyDataInstancesSpec self = new ListInstanceResponseBodyDataInstancesSpec();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyDataInstancesSpec setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public ListInstanceResponseBodyDataInstancesSpec setDiversionType(String diversionType) {
            this.diversionType = diversionType;
            return this;
        }
        public String getDiversionType() {
            return this.diversionType;
        }

        public ListInstanceResponseBodyDataInstancesSpec setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public ListInstanceResponseBodyDataInstancesSpec setIdcNumbers(String idcNumbers) {
            this.idcNumbers = idcNumbers;
            return this;
        }
        public String getIdcNumbers() {
            return this.idcNumbers;
        }

        public ListInstanceResponseBodyDataInstancesSpec setInitialInstallation(String initialInstallation) {
            this.initialInstallation = initialInstallation;
            return this;
        }
        public String getInitialInstallation() {
            return this.initialInstallation;
        }

        public ListInstanceResponseBodyDataInstancesSpec setInitialQty(String initialQty) {
            this.initialQty = initialQty;
            return this;
        }
        public String getInitialQty() {
            return this.initialQty;
        }

        public ListInstanceResponseBodyDataInstancesSpec setIpSubnetNums(String ipSubnetNums) {
            this.ipSubnetNums = ipSubnetNums;
            return this;
        }
        public String getIpSubnetNums() {
            return this.ipSubnetNums;
        }

        public ListInstanceResponseBodyDataInstancesSpec setMitigationAnalysis(String mitigationAnalysis) {
            this.mitigationAnalysis = mitigationAnalysis;
            return this;
        }
        public String getMitigationAnalysis() {
            return this.mitigationAnalysis;
        }

        public ListInstanceResponseBodyDataInstancesSpec setMitigationAnalysisCapacity(String mitigationAnalysisCapacity) {
            this.mitigationAnalysisCapacity = mitigationAnalysisCapacity;
            return this;
        }
        public String getMitigationAnalysisCapacity() {
            return this.mitigationAnalysisCapacity;
        }

        public ListInstanceResponseBodyDataInstancesSpec setMitigationCapacity(String mitigationCapacity) {
            this.mitigationCapacity = mitigationCapacity;
            return this;
        }
        public String getMitigationCapacity() {
            return this.mitigationCapacity;
        }

        public ListInstanceResponseBodyDataInstancesSpec setMitigationNums(String mitigationNums) {
            this.mitigationNums = mitigationNums;
            return this;
        }
        public String getMitigationNums() {
            return this.mitigationNums;
        }

        public ListInstanceResponseBodyDataInstancesSpec setNormalBandwidth(String normalBandwidth) {
            this.normalBandwidth = normalBandwidth;
            return this;
        }
        public String getNormalBandwidth() {
            return this.normalBandwidth;
        }

    }

    public static class ListInstanceResponseBodyDataInstances extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtExpire")
        public String gmtExpire;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("SaleId")
        public String saleId;

        @NameInMap("Spec")
        public ListInstanceResponseBodyDataInstancesSpec spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        public static ListInstanceResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyDataInstances self = new ListInstanceResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyDataInstances setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListInstanceResponseBodyDataInstances setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListInstanceResponseBodyDataInstances setGmtExpire(String gmtExpire) {
            this.gmtExpire = gmtExpire;
            return this;
        }
        public String getGmtExpire() {
            return this.gmtExpire;
        }

        public ListInstanceResponseBodyDataInstances setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public ListInstanceResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceResponseBodyDataInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListInstanceResponseBodyDataInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstanceResponseBodyDataInstances setSaleId(String saleId) {
            this.saleId = saleId;
            return this;
        }
        public String getSaleId() {
            return this.saleId;
        }

        public ListInstanceResponseBodyDataInstances setSpec(ListInstanceResponseBodyDataInstancesSpec spec) {
            this.spec = spec;
            return this;
        }
        public ListInstanceResponseBodyDataInstancesSpec getSpec() {
            return this.spec;
        }

        public ListInstanceResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceResponseBodyDataInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListInstanceResponseBodyData extends TeaModel {
        @NameInMap("Instances")
        public java.util.List<ListInstanceResponseBodyDataInstances> instances;

        @NameInMap("Num")
        public Long num;

        @NameInMap("Page")
        public Long page;

        @NameInMap("Total")
        public Long total;

        public static ListInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyData self = new ListInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyData setInstances(java.util.List<ListInstanceResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public ListInstanceResponseBodyData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public ListInstanceResponseBodyData setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListInstanceResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
