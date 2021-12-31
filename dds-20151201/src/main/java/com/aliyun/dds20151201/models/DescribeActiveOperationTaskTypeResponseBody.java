// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskTypeInfoEn")
        public String taskTypeInfoEn;

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
