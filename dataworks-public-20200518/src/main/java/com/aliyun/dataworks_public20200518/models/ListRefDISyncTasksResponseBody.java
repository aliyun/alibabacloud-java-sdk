// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRefDISyncTasksResponseBody extends TeaModel {
    /**
     * <p>The data returned for the query.</p>
     */
    @NameInMap("Data")
    public ListRefDISyncTasksResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
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
        /**
         * <p>The destination data source of the sync node.</p>
         * <br>
         * <p>If the sync node has multiple destination data sources, the return value is a JSON array, such as \\\\"odps_writer\\\\", \\\\"mysql\\\\".</p>
         * <br>
         * <p>If the RefType parameter is set to to, the sync nodes that use the specified data source as the destination data source are returned. In this case, the value of this parameter indicates the specified data source.</p>
         */
        @NameInMap("DiDestinationDatasource")
        public String diDestinationDatasource;

        /**
         * <p>The source data source of the sync node.</p>
         * <br>
         * <p>If the sync node has multiple source data sources, the return value is a JSON array, such as \\\\"odps_writer\\\\", \\\\"mysql\\\\".</p>
         * <br>
         * <p>If the RefType parameter is set to from, the sync nodes that use the specified data source as the source data source are returned. In this case, the value of this parameter indicates the specified data source.</p>
         */
        @NameInMap("DiSourceDatasource")
        public String diSourceDatasource;

        /**
         * <p>The ID of the sync node.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the sync node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The type of the sync node. Valid values:</p>
         * <br>
         * <p>*   DI_OFFLINE: batch sync node</p>
         * <p>*   DI_REALTIME: real-time sync node</p>
         */
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
        /**
         * <p>The details of the sync nodes.</p>
         * <br>
         * <p>A data source is usually associated with multiple sync nodes. Therefore, the value of this parameter is an array. The following parameters are the elements in the array. The sample values of these parameters show the details of a sync node.</p>
         */
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
