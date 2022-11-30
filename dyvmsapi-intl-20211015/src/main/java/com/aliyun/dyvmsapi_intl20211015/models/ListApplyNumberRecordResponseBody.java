// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListApplyNumberRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListApplyNumberRecordResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListApplyNumberRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplyNumberRecordResponseBody self = new ListApplyNumberRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplyNumberRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApplyNumberRecordResponseBody setList(java.util.List<ListApplyNumberRecordResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListApplyNumberRecordResponseBodyList> getList() {
        return this.list;
    }

    public ListApplyNumberRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplyNumberRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplyNumberRecordResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListApplyNumberRecordResponseBodyList extends TeaModel {
        @NameInMap("Amount")
        public String amount;

        @NameInMap("ApplyId")
        public String applyId;

        @NameInMap("ApplyNote")
        public String applyNote;

        @NameInMap("AuditNote")
        public String auditNote;

        @NameInMap("AuditTs")
        public String auditTs;

        @NameInMap("BatchIndex")
        public Long batchIndex;

        @NameInMap("CommitTs")
        public String commitTs;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("InboundConcurrency")
        public Long inboundConcurrency;

        @NameInMap("OutboundConcurrency")
        public Long outboundConcurrency;

        @NameInMap("PhoneType")
        public Long phoneType;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Support")
        public Long support;

        @NameInMap("UpdateTs")
        public String updateTs;

        public static ListApplyNumberRecordResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListApplyNumberRecordResponseBodyList self = new ListApplyNumberRecordResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListApplyNumberRecordResponseBodyList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public ListApplyNumberRecordResponseBodyList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public ListApplyNumberRecordResponseBodyList setApplyNote(String applyNote) {
            this.applyNote = applyNote;
            return this;
        }
        public String getApplyNote() {
            return this.applyNote;
        }

        public ListApplyNumberRecordResponseBodyList setAuditNote(String auditNote) {
            this.auditNote = auditNote;
            return this;
        }
        public String getAuditNote() {
            return this.auditNote;
        }

        public ListApplyNumberRecordResponseBodyList setAuditTs(String auditTs) {
            this.auditTs = auditTs;
            return this;
        }
        public String getAuditTs() {
            return this.auditTs;
        }

        public ListApplyNumberRecordResponseBodyList setBatchIndex(Long batchIndex) {
            this.batchIndex = batchIndex;
            return this;
        }
        public Long getBatchIndex() {
            return this.batchIndex;
        }

        public ListApplyNumberRecordResponseBodyList setCommitTs(String commitTs) {
            this.commitTs = commitTs;
            return this;
        }
        public String getCommitTs() {
            return this.commitTs;
        }

        public ListApplyNumberRecordResponseBodyList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListApplyNumberRecordResponseBodyList setInboundConcurrency(Long inboundConcurrency) {
            this.inboundConcurrency = inboundConcurrency;
            return this;
        }
        public Long getInboundConcurrency() {
            return this.inboundConcurrency;
        }

        public ListApplyNumberRecordResponseBodyList setOutboundConcurrency(Long outboundConcurrency) {
            this.outboundConcurrency = outboundConcurrency;
            return this;
        }
        public Long getOutboundConcurrency() {
            return this.outboundConcurrency;
        }

        public ListApplyNumberRecordResponseBodyList setPhoneType(Long phoneType) {
            this.phoneType = phoneType;
            return this;
        }
        public Long getPhoneType() {
            return this.phoneType;
        }

        public ListApplyNumberRecordResponseBodyList setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public ListApplyNumberRecordResponseBodyList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListApplyNumberRecordResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListApplyNumberRecordResponseBodyList setSupport(Long support) {
            this.support = support;
            return this;
        }
        public Long getSupport() {
            return this.support;
        }

        public ListApplyNumberRecordResponseBodyList setUpdateTs(String updateTs) {
            this.updateTs = updateTs;
            return this;
        }
        public String getUpdateTs() {
            return this.updateTs;
        }

    }

}
