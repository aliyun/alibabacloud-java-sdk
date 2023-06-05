// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingRequest extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of the object that you want to create in Data Integration in asynchronous mode. Valid values:</p>
     * <br>
     * <p>*   DI_REALTIME: real-time synchronization node</p>
     * <p>*   DI_SOLUTION: synchronization solution</p>
     * <br>
     * <p>DataWorks allows you to create real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. This parameter is used to prevent repeated operations that are caused by multiple calls.</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The script for the real-time synchronization node or synchronization solution in Data Integration.</p>
     * <br>
     * <p>The following types of real-time synchronization nodes and synchronization solutions are supported:</p>
     * <br>
     * <p>*   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL to MaxCompute</p>
     * <p>*   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL data to Kafka</p>
     * <p>*   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL to Hologres</p>
     * <br>
     * <p>The SelectedTables parameter is used to specify tables that you want to synchronize from multiple databases. The Tables parameter is used to specify tables that you want to synchronize from a single database.</p>
     * <br>
     * <p>*   If the script contains the SelectedTables parameter, the system synchronizes the tables that you specify in the SelectedTables parameter.</p>
     * <p>*   If the script contains the Tables parameter, the system synchronizes the tables that you specify in the Tables parameter.</p>
     * <br>
     * <p>The following sample code provides a script for data synchronization from MySQL to MaxCompute:</p>
     * <br>
     * <p>{</p>
     * <br>
     * <p>"type": "realtime",</p>
     * <br>
     * <p>"version": "1.0",</p>
     * <br>
     * <p>"setting": {</p>
     * <br>
     * <p>"resourceGroup": "S_res_group\_280749521950784\_1623033752022",</p>
     * <br>
     * <p>"taskType": "oneclick_to_odps"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"steps": { "stepType": "mysql", "parameter": { "connection": \[ { "datasourceType": "mysql", "datasource": "mysql_pub1", "selectedTables": \[ { "dbName": "mysql_db", "schema": \[ { "tableInfos": \[ { "table": "molin_di_test_in_pk_v4" }</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"name": "Reader",</p>
     * <br>
     * <p>"category": "reader"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>{</p>
     * <br>
     * <p>"stepType": "odps",</p>
     * <br>
     * <p>"parameter": {</p>
     * <br>
     * <p>"datasource": "odps_first"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"name": "Writer",</p>
     * <br>
     * <p>"category": "writer"</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>The following sample code provides a script for data synchronization from MySQL to Kafka:</p>
     * <br>
     * <p>{</p>
     * <br>
     * <p>"type": "realtime",</p>
     * <br>
     * <p>"version": "1.0",</p>
     * <br>
     * <p>"setting": {</p>
     * <br>
     * <p>"resourceGroup": "S_res_group\_280749521950784\_1623033752022",</p>
     * <br>
     * <p>"taskType": "oneclick_to_kafka"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"steps": { "stepType": "mysql", "parameter": { "connection": \[ { "datasourceType": "mysql", "datasource": "pkset_test", "selectedTables": \[ { "dbName": "mysql_db", "schema": \[ { "tableInfos": \[ { "table": "molin_di_test_in_pk_v4" }</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"name": "Reader",</p>
     * <br>
     * <p>"category": "reader"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>{</p>
     * <br>
     * <p>"stepType": "kafka",</p>
     * <br>
     * <p>"parameter": {</p>
     * <br>
     * <p>"datasource": "azn_kafka"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"name": "Writer",</p>
     * <br>
     * <p>"category": "writer"</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>The following sample code provides a script for data synchronization from MySQL to Hologres:</p>
     * <br>
     * <p>{</p>
     * <br>
     * <p>"type": "realtime",</p>
     * <br>
     * <p>"version": "1.0",</p>
     * <br>
     * <p>"setting": {</p>
     * <br>
     * <p>"resourceGroup": "S_res_group\_280749521950784\_1623033752022",</p>
     * <br>
     * <p>"taskType": "oneclick_to_holo"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"steps": { "stepType": "mysql", "parameter": { "connection": \[ { "datasourceType": "mysql", "datasource": "mysql_pub", "selectedTables": \[ { "dbName": "mysql_db", "schema": \[ { "tableInfos": \[ { "table": "molin_di_test_in2\_pk_v3" }</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"name": "Reader",</p>
     * <br>
     * <p>"category": "reader"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>{</p>
     * <br>
     * <p>"stepType": "holo",</p>
     * <br>
     * <p>"parameter": {</p>
     * <br>
     * <p>"datasource": "holo"</p>
     * <br>
     * <p>},</p>
     * <br>
     * <p>"name": "Writer",</p>
     * <br>
     * <p>"category": "writer"</p>
     * <br>
     * <p>}</p>
     * <br>
     * <p>]</p>
     * <br>
     * <p>}</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GenerateDISyncTaskConfigForCreatingRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForCreatingRequest self = new GenerateDISyncTaskConfigForCreatingRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForCreatingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateDISyncTaskConfigForCreatingRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GenerateDISyncTaskConfigForCreatingRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public GenerateDISyncTaskConfigForCreatingRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
