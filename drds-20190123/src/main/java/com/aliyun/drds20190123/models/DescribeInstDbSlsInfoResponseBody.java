// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstDbSlsInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AuditInfo")
    public DescribeInstDbSlsInfoResponseBodyAuditInfo auditInfo;

    public static DescribeInstDbSlsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstDbSlsInfoResponseBody self = new DescribeInstDbSlsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstDbSlsInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstDbSlsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstDbSlsInfoResponseBody setAuditInfo(DescribeInstDbSlsInfoResponseBodyAuditInfo auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public DescribeInstDbSlsInfoResponseBodyAuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    public static class DescribeInstDbSlsInfoResponseBodyAuditInfo extends TeaModel {
        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

        public static DescribeInstDbSlsInfoResponseBodyAuditInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstDbSlsInfoResponseBodyAuditInfo self = new DescribeInstDbSlsInfoResponseBodyAuditInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstDbSlsInfoResponseBodyAuditInfo setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public DescribeInstDbSlsInfoResponseBodyAuditInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

}
