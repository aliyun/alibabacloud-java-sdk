// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstDbSlsInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("AuditInfo")
    @Validation(required = true)
    public DescribeInstDbSlsInfoResponseAuditInfo auditInfo;

    public static DescribeInstDbSlsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstDbSlsInfoResponse self = new DescribeInstDbSlsInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstDbSlsInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstDbSlsInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstDbSlsInfoResponse setAuditInfo(DescribeInstDbSlsInfoResponseAuditInfo auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public DescribeInstDbSlsInfoResponseAuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    public static class DescribeInstDbSlsInfoResponseAuditInfo extends TeaModel {
        @NameInMap("Project")
        @Validation(required = true)
        public String project;

        @NameInMap("LogStore")
        @Validation(required = true)
        public String logStore;

        public static DescribeInstDbSlsInfoResponseAuditInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstDbSlsInfoResponseAuditInfo self = new DescribeInstDbSlsInfoResponseAuditInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstDbSlsInfoResponseAuditInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeInstDbSlsInfoResponseAuditInfo setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

    }

}
