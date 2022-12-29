// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskTypeResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The list of tasks.
    @NameInMap("TypeList")
    public java.util.List<DescribeActiveOperationTaskTypeResponseBodyTypeList> typeList;

    public static DescribeActiveOperationTaskTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskTypeResponseBody self = new DescribeActiveOperationTaskTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveOperationTaskTypeResponseBody setTypeList(java.util.List<DescribeActiveOperationTaskTypeResponseBodyTypeList> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<DescribeActiveOperationTaskTypeResponseBodyTypeList> getTypeList() {
        return this.typeList;
    }

    public static class DescribeActiveOperationTaskTypeResponseBodyTypeList extends TeaModel {
        // The number of pending tasks.
        @NameInMap("Count")
        public Integer count;

        // The type of the task. Valid values:
        // 
        // *   **rds_apsaradb_transfer**: instance migration
        // *   **rds_apsaradb_upgrade**: minor version update
        @NameInMap("TaskType")
        public String taskType;

        // The task type (English).
        @NameInMap("TaskTypeInfoEn")
        public String taskTypeInfoEn;

        // The task type (Chinese).
        @NameInMap("TaskTypeInfoZh")
        public String taskTypeInfoZh;

        public static DescribeActiveOperationTaskTypeResponseBodyTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationTaskTypeResponseBodyTypeList self = new DescribeActiveOperationTaskTypeResponseBodyTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationTaskTypeResponseBodyTypeList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeActiveOperationTaskTypeResponseBodyTypeList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeActiveOperationTaskTypeResponseBodyTypeList setTaskTypeInfoEn(String taskTypeInfoEn) {
            this.taskTypeInfoEn = taskTypeInfoEn;
            return this;
        }
        public String getTaskTypeInfoEn() {
            return this.taskTypeInfoEn;
        }

        public DescribeActiveOperationTaskTypeResponseBodyTypeList setTaskTypeInfoZh(String taskTypeInfoZh) {
            this.taskTypeInfoZh = taskTypeInfoZh;
            return this;
        }
        public String getTaskTypeInfoZh() {
            return this.taskTypeInfoZh;
        }

    }

}
