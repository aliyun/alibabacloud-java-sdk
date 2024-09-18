// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>200: The request was successful.</li>
     * <li>Other codes: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B0949F09-B9C1-1D5E-8F27-0A5BF3CD5D95</p>
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
        /**
         * <p>The region of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>international_and_hmt</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The diversion mode. Valid values: on-demand always-on</p>
         * 
         * <strong>example:</strong>
         * <p>on-demand</p>
         */
        @NameInMap("DiversionType")
        public String diversionType;

        /**
         * <p>The mitigation plan.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("Edition")
        public String edition;

        /**
         * <p>The number of data centers. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IdcNumbers")
        public String idcNumbers;

        /**
         * <p>The initial installation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>gre_tunnel_by_pccw</p>
         */
        @NameInMap("InitialInstallation")
        public String initialInstallation;

        /**
         * <p>The initial installation quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InitialQty")
        public String initialQty;

        /**
         * <p>The number of CIDR blocks. Value range: 1 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IpSubnetNums")
        public String ipSubnetNums;

        /**
         * <p>The mitigation analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MitigationAnalysis")
        public String mitigationAnalysis;

        /**
         * <p>The log storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>3T</p>
         */
        @NameInMap("MitigationAnalysisCapacity")
        public String mitigationAnalysisCapacity;

        /**
         * <p>The maximum mitigation capability.</p>
         * 
         * <strong>example:</strong>
         * <p>unlimited</p>
         */
        @NameInMap("MitigationCapacity")
        public String mitigationCapacity;

        /**
         * <p>The number of mitigation sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>unlimited</p>
         */
        @NameInMap("MitigationNums")
        public String mitigationNums;

        /**
         * <p>The service traffic. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The purchase time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-15 11:10:42</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-23 00:00:00</p>
         */
        @NameInMap("GmtExpire")
        public String gmtExpire;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-15 11:10:42</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>The alias of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddos_diversion_public_cn-xxxxxxxxxxxxx_xxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The configurations of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddos_diversion_public_cn-xxxxxxxxxxxxx</p>
         */
        @NameInMap("SaleId")
        public String saleId;

        /**
         * <p>The specifications of the instance.</p>
         */
        @NameInMap("Spec")
        public ListInstanceResponseBodyDataInstancesSpec spec;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>normal</li>
         * <li>expired</li>
         * <li>deleting</li>
         * <li>stopped</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>177xxxxxxxxxxxxx</p>
         */
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
        /**
         * <p>The details of the anti-DDoS diversion instance.</p>
         */
        @NameInMap("Instances")
        public java.util.List<ListInstanceResponseBodyDataInstances> instances;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Num")
        public Long num;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
