// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRefDISyncTasksResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ListRefDISyncTasksResponseBodyData data;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937635973****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The destination of the synchronization task. If the synchronization task has multiple destinations, the return value is a JSON array, such as \\&quot;odps_writer\\&quot;, \\&quot;mysql\\&quot;. If the RefType parameter is set to to, the synchronization tasks that use the specified data source as the destination are returned. In this case, the value of this parameter indicates the specified data source.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;qcc_polardb2\&quot;]</p>
         */
        @NameInMap("DiDestinationDatasource")
        public String diDestinationDatasource;

        /**
         * <p>The source of the synchronization task. If the synchronization task has multiple sources, the return value is a JSON array, such as \\&quot;odps_writer\\&quot;, \\&quot;mysql\\&quot;. If the RefType parameter is set to from, the synchronization tasks that use the specified data source as the source are returned. In this case, the value of this parameter indicates the specified data source.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;odps_writer\&quot;]</p>
         */
        @NameInMap("DiSourceDatasource")
        public String diSourceDatasource;

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd1234</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The type of the synchronization task. Valid values:</p>
         * <ul>
         * <li>DI_OFFLINE: batch synchronization task</li>
         * <li>DI_REALTIME: real-time synchronization task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DI_OFFLINE</p>
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
         * <p>The details of the synchronization tasks. In most cases, a data source is used by multiple synchronization tasks. Therefore, the value of this parameter is an array. The following parameters are the elements in the array. The sample values of these parameters show the details of a synchronization task.</p>
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
