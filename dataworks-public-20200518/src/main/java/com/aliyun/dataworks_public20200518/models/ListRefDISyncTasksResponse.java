// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRefDISyncTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListRefDISyncTasksResponseData data;

    public static ListRefDISyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRefDISyncTasksResponse self = new ListRefDISyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListRefDISyncTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRefDISyncTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRefDISyncTasksResponse setData(ListRefDISyncTasksResponseData data) {
        this.data = data;
        return this;
    }
    public ListRefDISyncTasksResponseData getData() {
        return this.data;
    }

    public static class ListRefDISyncTasksResponseDataDISyncTasks extends TeaModel {
        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("TaskType")
        @Validation(required = true)
        public String taskType;

        @NameInMap("DiDestinationDatasource")
        @Validation(required = true)
        public String diDestinationDatasource;

        @NameInMap("DiSourceDatasource")
        @Validation(required = true)
        public String diSourceDatasource;

        public static ListRefDISyncTasksResponseDataDISyncTasks build(java.util.Map<String, ?> map) throws Exception {
            ListRefDISyncTasksResponseDataDISyncTasks self = new ListRefDISyncTasksResponseDataDISyncTasks();
            return TeaModel.build(map, self);
        }

        public ListRefDISyncTasksResponseDataDISyncTasks setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListRefDISyncTasksResponseDataDISyncTasks setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListRefDISyncTasksResponseDataDISyncTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListRefDISyncTasksResponseDataDISyncTasks setDiDestinationDatasource(String diDestinationDatasource) {
            this.diDestinationDatasource = diDestinationDatasource;
            return this;
        }
        public String getDiDestinationDatasource() {
            return this.diDestinationDatasource;
        }

        public ListRefDISyncTasksResponseDataDISyncTasks setDiSourceDatasource(String diSourceDatasource) {
            this.diSourceDatasource = diSourceDatasource;
            return this;
        }
        public String getDiSourceDatasource() {
            return this.diSourceDatasource;
        }

    }

    public static class ListRefDISyncTasksResponseData extends TeaModel {
        @NameInMap("DISyncTasks")
        @Validation(required = true)
        public java.util.List<ListRefDISyncTasksResponseDataDISyncTasks> DISyncTasks;

        public static ListRefDISyncTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListRefDISyncTasksResponseData self = new ListRefDISyncTasksResponseData();
            return TeaModel.build(map, self);
        }

        public ListRefDISyncTasksResponseData setDISyncTasks(java.util.List<ListRefDISyncTasksResponseDataDISyncTasks> DISyncTasks) {
            this.DISyncTasks = DISyncTasks;
            return this;
        }
        public java.util.List<ListRefDISyncTasksResponseDataDISyncTasks> getDISyncTasks() {
            return this.DISyncTasks;
        }

    }

}
