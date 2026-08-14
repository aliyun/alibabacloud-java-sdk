// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSystemLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemLog")
    public java.util.List<DescribeSystemLogResponseBodySystemLog> systemLog;

    @NameInMap("Total")
    public Long total;

    public static DescribeSystemLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemLogResponseBody self = new DescribeSystemLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemLogResponseBody setSystemLog(java.util.List<DescribeSystemLogResponseBodySystemLog> systemLog) {
        this.systemLog = systemLog;
        return this;
    }
    public java.util.List<DescribeSystemLogResponseBodySystemLog> getSystemLog() {
        return this.systemLog;
    }

    public DescribeSystemLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeSystemLogResponseBodySystemLog extends TeaModel {
        @NameInMap("EntityObject")
        public String entityObject;

        @NameInMap("EntityType")
        public Integer entityType;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("OpAccount")
        public String opAccount;

        @NameInMap("OpAction")
        public Integer opAction;

        @NameInMap("OpDesc")
        public String opDesc;

        @NameInMap("Status")
        public Integer status;

        public static DescribeSystemLogResponseBodySystemLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemLogResponseBodySystemLog self = new DescribeSystemLogResponseBodySystemLog();
            return TeaModel.build(map, self);
        }

        public DescribeSystemLogResponseBodySystemLog setEntityObject(String entityObject) {
            this.entityObject = entityObject;
            return this;
        }
        public String getEntityObject() {
            return this.entityObject;
        }

        public DescribeSystemLogResponseBodySystemLog setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

        public DescribeSystemLogResponseBodySystemLog setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSystemLogResponseBodySystemLog setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSystemLogResponseBodySystemLog setOpAccount(String opAccount) {
            this.opAccount = opAccount;
            return this;
        }
        public String getOpAccount() {
            return this.opAccount;
        }

        public DescribeSystemLogResponseBodySystemLog setOpAction(Integer opAction) {
            this.opAction = opAction;
            return this;
        }
        public Integer getOpAction() {
            return this.opAction;
        }

        public DescribeSystemLogResponseBodySystemLog setOpDesc(String opDesc) {
            this.opDesc = opDesc;
            return this;
        }
        public String getOpDesc() {
            return this.opDesc;
        }

        public DescribeSystemLogResponseBodySystemLog setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
