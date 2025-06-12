// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180813.models;

import com.aliyun.tea.*;

public class ListPCAInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PCAInstanceList")
    public java.util.List<ListPCAInstanceResponseBodyPCAInstanceList> PCAInstanceList;

    /**
     * <strong>example:</strong>
     * <p>EECA10D5-BD0F-4EF1-B3EA-B4578E5C6F8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPCAInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPCAInstanceResponseBody self = new ListPCAInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPCAInstanceResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListPCAInstanceResponseBody setPCAInstanceList(java.util.List<ListPCAInstanceResponseBodyPCAInstanceList> PCAInstanceList) {
        this.PCAInstanceList = PCAInstanceList;
        return this;
    }
    public java.util.List<ListPCAInstanceResponseBodyPCAInstanceList> getPCAInstanceList() {
        return this.PCAInstanceList;
    }

    public ListPCAInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPCAInstanceResponseBody setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListPCAInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPCAInstanceResponseBodyPCAInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <strong>example:</strong>
         * <p>qingqitest</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <strong>example:</strong>
         * <p>1efb82eb-19e5-620f-bdaa-11cc6cb2a720</p>
         */
        @NameInMap("CaIdentifier")
        public String caIdentifier;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CertCount")
        public Long certCount;

        /**
         * <strong>example:</strong>
         * <p>2024-08-09T10:05:18</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1ef3fefc-8065-60de-871e-d15cf842aab6</p>
         */
        @NameInMap("InstanceUuid")
        public String instanceUuid;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IssuedCertCount")
        public Long issuedCertCount;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RelateStatus")
        public Boolean relateStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShareFlag")
        public Integer shareFlag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Trial")
        public String trial;

        public static ListPCAInstanceResponseBodyPCAInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListPCAInstanceResponseBodyPCAInstanceList self = new ListPCAInstanceResponseBodyPCAInstanceList();
            return TeaModel.build(map, self);
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setCaIdentifier(String caIdentifier) {
            this.caIdentifier = caIdentifier;
            return this;
        }
        public String getCaIdentifier() {
            return this.caIdentifier;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setCertCount(Long certCount) {
            this.certCount = certCount;
            return this;
        }
        public Long getCertCount() {
            return this.certCount;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setInstanceUuid(String instanceUuid) {
            this.instanceUuid = instanceUuid;
            return this;
        }
        public String getInstanceUuid() {
            return this.instanceUuid;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setIssuedCertCount(Long issuedCertCount) {
            this.issuedCertCount = issuedCertCount;
            return this;
        }
        public Long getIssuedCertCount() {
            return this.issuedCertCount;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setRelateStatus(Boolean relateStatus) {
            this.relateStatus = relateStatus;
            return this;
        }
        public Boolean getRelateStatus() {
            return this.relateStatus;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setShareFlag(Integer shareFlag) {
            this.shareFlag = shareFlag;
            return this;
        }
        public Integer getShareFlag() {
            return this.shareFlag;
        }

        public ListPCAInstanceResponseBodyPCAInstanceList setTrial(String trial) {
            this.trial = trial;
            return this;
        }
        public String getTrial() {
            return this.trial;
        }

    }

}
