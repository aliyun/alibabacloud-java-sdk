// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMigrationWorkflowInstanceLogInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMigrationWorkflowInstanceLogInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetMigrationWorkflowInstanceLogInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationWorkflowInstanceLogInfoResponseBody self = new GetMigrationWorkflowInstanceLogInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMigrationWorkflowInstanceLogInfoResponseBody setData(GetMigrationWorkflowInstanceLogInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMigrationWorkflowInstanceLogInfoResponseBodyData getData() {
        return this.data;
    }

    public GetMigrationWorkflowInstanceLogInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMigrationWorkflowInstanceLogInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMigrationWorkflowInstanceLogInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetMigrationWorkflowInstanceLogInfoResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LogContent")
        public String logContent;

        public static GetMigrationWorkflowInstanceLogInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationWorkflowInstanceLogInfoResponseBodyData self = new GetMigrationWorkflowInstanceLogInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMigrationWorkflowInstanceLogInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMigrationWorkflowInstanceLogInfoResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

    }

}
