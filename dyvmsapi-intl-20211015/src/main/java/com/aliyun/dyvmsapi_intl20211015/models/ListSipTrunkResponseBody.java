// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListSipTrunkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListSipTrunkResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    public static ListSipTrunkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSipTrunkResponseBody self = new ListSipTrunkResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSipTrunkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSipTrunkResponseBody setList(java.util.List<ListSipTrunkResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSipTrunkResponseBodyList> getList() {
        return this.list;
    }

    public ListSipTrunkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSipTrunkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSipTrunkResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class ListSipTrunkResponseBodyList extends TeaModel {
        @NameInMap("ApplyId")
        public String applyId;

        @NameInMap("ApplyNote")
        public String applyNote;

        @NameInMap("AuditNote")
        public String auditNote;

        @NameInMap("AuditTs")
        public String auditTs;

        @NameInMap("CommitTs")
        public String commitTs;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("InboundIpPorts")
        public String inboundIpPorts;

        @NameInMap("OutboundIps")
        public String outboundIps;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTs")
        public String updateTs;

        @NameInMap("UserUuid")
        public String userUuid;

        public static ListSipTrunkResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSipTrunkResponseBodyList self = new ListSipTrunkResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSipTrunkResponseBodyList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public ListSipTrunkResponseBodyList setApplyNote(String applyNote) {
            this.applyNote = applyNote;
            return this;
        }
        public String getApplyNote() {
            return this.applyNote;
        }

        public ListSipTrunkResponseBodyList setAuditNote(String auditNote) {
            this.auditNote = auditNote;
            return this;
        }
        public String getAuditNote() {
            return this.auditNote;
        }

        public ListSipTrunkResponseBodyList setAuditTs(String auditTs) {
            this.auditTs = auditTs;
            return this;
        }
        public String getAuditTs() {
            return this.auditTs;
        }

        public ListSipTrunkResponseBodyList setCommitTs(String commitTs) {
            this.commitTs = commitTs;
            return this;
        }
        public String getCommitTs() {
            return this.commitTs;
        }

        public ListSipTrunkResponseBodyList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListSipTrunkResponseBodyList setInboundIpPorts(String inboundIpPorts) {
            this.inboundIpPorts = inboundIpPorts;
            return this;
        }
        public String getInboundIpPorts() {
            return this.inboundIpPorts;
        }

        public ListSipTrunkResponseBodyList setOutboundIps(String outboundIps) {
            this.outboundIps = outboundIps;
            return this;
        }
        public String getOutboundIps() {
            return this.outboundIps;
        }

        public ListSipTrunkResponseBodyList setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public ListSipTrunkResponseBodyList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListSipTrunkResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSipTrunkResponseBodyList setUpdateTs(String updateTs) {
            this.updateTs = updateTs;
            return this;
        }
        public String getUpdateTs() {
            return this.updateTs;
        }

        public ListSipTrunkResponseBodyList setUserUuid(String userUuid) {
            this.userUuid = userUuid;
            return this;
        }
        public String getUserUuid() {
            return this.userUuid;
        }

    }

}
