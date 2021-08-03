// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusResponseBody extends TeaModel {
    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityEventOperationStatuses")
    public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses> securityEventOperationStatuses;

    public static DescribeSecurityEventOperationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationStatusResponseBody self = new DescribeSecurityEventOperationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationStatusResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeSecurityEventOperationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventOperationStatusResponseBody setSecurityEventOperationStatuses(java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses> securityEventOperationStatuses) {
        this.securityEventOperationStatuses = securityEventOperationStatuses;
        return this;
    }
    public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses> getSecurityEventOperationStatuses() {
        return this.securityEventOperationStatuses;
    }

    public static class DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SecurityEventId")
        public Long securityEventId;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses self = new DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses setSecurityEventId(Long securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

}
