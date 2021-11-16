// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRefDISyncTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListRefDISyncTasksResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRefDISyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRefDISyncTasksResponseBody self = new ListRefDISyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRefDISyncTasksResponseBody setData(ListRefDISyncTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRefDISyncTasksResponseBodyData getData() {
        return this.data;
    }

    public ListRefDISyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRefDISyncTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRefDISyncTasksResponseBodyDataDISyncTasks extends TeaModel {
        @NameInMap("DiDestinationDatasource")
        public String diDestinationDatasource;

        @NameInMap("DiSourceDatasource")
        public String diSourceDatasource;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("TaskType")
        public String taskType;

        public static ListRefDISyncTasksResponseBodyDataDISyncTasks build(java.util.Map<String, ?> map) throws Exception {
            ListRefDISyncTasksResponseBodyDataDISyncTasks self = new ListRefDISyncTasksResponseBodyDataDISyncTasks();
            return TeaModel.build(map, self);
        }

        public ListRefDISyncTasksResponseBodyDataDISyncTasks setDiDestinationDatasource(String diDestinationDatasource) {
            this.diDestinationDatasource = diDestinationDatasource;
            return this;
        }
        public String getDiDestinationDatasource() {
            return this.diDestinationDatasource;
        }

        public ListRefDISyncTasksResponseBodyDataDISyncTasks setDiSourceDatasource(String diSourceDatasource) {
            this.diSourceDatasource = diSourceDatasource;
            return this;
        }
        public String getDiSourceDatasource() {
            return this.diSourceDatasource;
        }

        public ListRefDISyncTasksResponseBodyDataDISyncTasks setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListRefDISyncTasksResponseBodyDataDISyncTasks setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListRefDISyncTasksResponseBodyDataDISyncTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class ListRefDISyncTasksResponseBodyData extends TeaModel {
        @NameInMap("DISyncTasks")
        public java.util.List<ListRefDISyncTasksResponseBodyDataDISyncTasks> DISyncTasks;

        public static ListRefDISyncTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRefDISyncTasksResponseBodyData self = new ListRefDISyncTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRefDISyncTasksResponseBodyData setDISyncTasks(java.util.List<ListRefDISyncTasksResponseBodyDataDISyncTasks> DISyncTasks) {
            this.DISyncTasks = DISyncTasks;
            return this;
        }
        public java.util.List<ListRefDISyncTasksResponseBodyDataDISyncTasks> getDISyncTasks() {
            return this.DISyncTasks;
        }

    }

}
