// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListVoiceFileResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListVoiceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceFileResponseBody self = new ListVoiceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceFileResponseBody setList(java.util.List<ListVoiceFileResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListVoiceFileResponseBodyList> getList() {
        return this.list;
    }

    public ListVoiceFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceFileResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVoiceFileResponseBodyList extends TeaModel {
        @NameInMap("AuditRemark")
        public String auditRemark;

        @NameInMap("CommitTs")
        public String commitTs;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("FileKey")
        public String fileKey;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("UpdateTs")
        public String updateTs;

        public static ListVoiceFileResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceFileResponseBodyList self = new ListVoiceFileResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListVoiceFileResponseBodyList setAuditRemark(String auditRemark) {
            this.auditRemark = auditRemark;
            return this;
        }
        public String getAuditRemark() {
            return this.auditRemark;
        }

        public ListVoiceFileResponseBodyList setCommitTs(String commitTs) {
            this.commitTs = commitTs;
            return this;
        }
        public String getCommitTs() {
            return this.commitTs;
        }

        public ListVoiceFileResponseBodyList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListVoiceFileResponseBodyList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListVoiceFileResponseBodyList setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public ListVoiceFileResponseBodyList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListVoiceFileResponseBodyList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListVoiceFileResponseBodyList setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public ListVoiceFileResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListVoiceFileResponseBodyList setUpdateTs(String updateTs) {
            this.updateTs = updateTs;
            return this;
        }
        public String getUpdateTs() {
            return this.updateTs;
        }

    }

}
