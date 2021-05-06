// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskStatus")
    @Validation(required = true)
    public String taskStatus;

    @NameInMap("SecurityEventOperationStatuses")
    @Validation(required = true)
    public java.util.List<DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses> securityEventOperationStatuses;

    public static DescribeSecurityEventOperationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationStatusResponse self = new DescribeSecurityEventOperationStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventOperationStatusResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeSecurityEventOperationStatusResponse setSecurityEventOperationStatuses(java.util.List<DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses> securityEventOperationStatuses) {
        this.securityEventOperationStatuses = securityEventOperationStatuses;
        return this;
    }
    public java.util.List<DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses> getSecurityEventOperationStatuses() {
        return this.securityEventOperationStatuses;
    }

    public static class DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses extends TeaModel {
        @NameInMap("SecurityEventId")
        @Validation(required = true)
        public Long securityEventId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        public static DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses self = new DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses setSecurityEventId(Long securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        public DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSecurityEventOperationStatusResponseSecurityEventOperationStatuses setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

}
