// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TaskSet")
    @Validation(required = true)
    public DescribeTasksResponseTaskSet taskSet;

    public static DescribeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponse self = new DescribeTasksResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTasksResponseTaskSetTask extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("TaskAction")
        @Validation(required = true)
        public String taskAction;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        @NameInMap("SupportCancel")
        @Validation(required = true)
        public String supportCancel;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("FinishedTime")
        @Validation(required = true)
        public String finishedTime;

        public static DescribeTasksResponseTaskSetTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseTaskSetTask self = new DescribeTasksResponseTaskSetTask();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTasksResponseTaskSet extends TeaModel {
        @NameInMap("Task")
        @Validation(required = true)
        public java.util.List<DescribeTasksResponseTaskSetTask> task;

        public static DescribeTasksResponseTaskSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseTaskSet self = new DescribeTasksResponseTaskSet();
            return TeaModel.build(map, self);
        }

    }

}
