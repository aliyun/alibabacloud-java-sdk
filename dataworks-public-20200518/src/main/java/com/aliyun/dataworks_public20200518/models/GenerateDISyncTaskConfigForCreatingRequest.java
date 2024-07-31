// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. This parameter is used to prevent repeated operations that are caused by multiple calls.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The script for the synchronization task. DataWorks allows you to create the following types of synchronization tasks:</p>
     * <ul>
     * <li>Synchronization task that is used to synchronize data from MySQL to MaxCompute</li>
     * <li>Synchronization task that is used to synchronize data from MySQL data to Kafka</li>
     * <li>Synchronization task that is used to synchronize data from MySQL to Hologres</li>
     * </ul>
     * <p>The SelectedTables parameter is used to specify tables that you want to synchronize from multiple databases. The Tables parameter is used to specify tables that you want to synchronize from a single database.</p>
     * <ul>
     * <li>If the script contains the SelectedTables parameter, the system synchronizes data from the tables that you specify in the SelectedTables parameter.</li>
     * <li>If the script contains the Tables parameter, the system synchronizes data from the tables that you specify in the Tables parameter.</li>
     * </ul>
     * <p>The following sample code provides a script for data synchronization from MySQL to MaxCompute:</p>
     * <pre><code>{
     *   &quot;type&quot;: &quot;realtime&quot;,
     *   &quot;version&quot;: &quot;1.0&quot;,
     *   &quot;setting&quot;: {
     *     &quot;resourceGroup&quot;: &quot;S_res_group_280749521950784_1623033752022&quot;,
     *     &quot;taskType&quot;: &quot;oneclick_to_odps&quot;
     *   },
     *   &quot;steps&quot;: [
     *     {
     *       &quot;stepType&quot;: &quot;mysql&quot;,
     *       &quot;parameter&quot;: {
     *         &quot;connection&quot;: [
     *           {
     *             &quot;datasourceType&quot;: &quot;mysql&quot;,
     *             &quot;datasource&quot;: &quot;mysql_pub1&quot;,
     *             &quot;selectedTables&quot;: [
     *               {
     *                 &quot;dbName&quot;: &quot;mysql_db&quot;,
     *                 &quot;schema&quot;: [
     *                   {
     *                     &quot;tableInfos&quot;: [
     *                       {
     *                         &quot;table&quot;: &quot;molin_di_test_in_pk_v4&quot;
     *                       }
     *                     ]
     *                   }
     *                 ]
     *               }
     *             ]
     *           }
     *         ]
     *       },
     *       &quot;name&quot;: &quot;Reader&quot;,
     *       &quot;category&quot;: &quot;reader&quot;
     *     },
     *     {
     *       &quot;stepType&quot;: &quot;odps&quot;,
     *       &quot;parameter&quot;: {
     *         &quot;datasource&quot;: &quot;odps_source&quot;
     *       },
     *       &quot;name&quot;: &quot;Writer&quot;,
     *       &quot;category&quot;: &quot;writer&quot;
     *     }
     *   ]
     * }
     * </code></pre>
     * <p>The following sample code provides a script for data synchronization from MySQL to Kafka:</p>
     * <pre><code>{
     *   &quot;type&quot;: &quot;realtime&quot;,
     *   &quot;version&quot;: &quot;1.0&quot;,
     *   &quot;setting&quot;: {
     *     &quot;resourceGroup&quot;: &quot;S_res_group_280749521950784_1623033752022&quot;,
     *     &quot;taskType&quot;: &quot;oneclick_to_kafka&quot;
     *   },
     *   &quot;steps&quot;: [
     *     {
     *       &quot;stepType&quot;: &quot;mysql&quot;,
     *       &quot;parameter&quot;: {
     *         &quot;connection&quot;: [
     *           {
     *             &quot;datasourceType&quot;: &quot;mysql&quot;,
     *             &quot;datasource&quot;: &quot;pkset_test&quot;,
     *             &quot;selectedTables&quot;: [
     *               {
     *                 &quot;dbName&quot;: &quot;mysql_db&quot;,
     *                 &quot;schema&quot;: [
     *                   {
     *                     &quot;tableInfos&quot;: [
     *                       {
     *                         &quot;table&quot;: &quot;molin_di_test_in_pk_v4&quot;
     *                       }
     *                     ]
     *                   }
     *                 ]
     *               }
     *             ]
     *           }
     *         ]
     *       },
     *       &quot;name&quot;: &quot;Reader&quot;,
     *       &quot;category&quot;: &quot;reader&quot;
     *     },
     *     {
     *       &quot;stepType&quot;: &quot;kafka&quot;,
     *       &quot;parameter&quot;: {
     *         &quot;datasource&quot;: &quot;azn_kafka&quot;
     *       },
     *       &quot;name&quot;: &quot;Writer&quot;,
     *       &quot;category&quot;: &quot;writer&quot;
     *     }
     *   ]
     * }
     * </code></pre>
     * <p>The following sample code provides a script for data synchronization from MySQL to Hologres:</p>
     * <pre><code>{
     *   &quot;type&quot;: &quot;realtime&quot;,
     *   &quot;version&quot;: &quot;1.0&quot;,
     *   &quot;setting&quot;: {
     *     &quot;resourceGroup&quot;: &quot;S_res_group_280749521950784_1623033752022&quot;,
     *     &quot;taskType&quot;: &quot;oneclick_to_holo&quot;
     *   },
     *   &quot;steps&quot;: [
     *     {
     *       &quot;stepType&quot;: &quot;mysql&quot;,
     *       &quot;parameter&quot;: {
     *         &quot;connection&quot;: [
     *           {
     *             &quot;datasourceType&quot;: &quot;mysql&quot;,
     *             &quot;datasource&quot;: &quot;mysql_pub&quot;,
     *             &quot;selectedTables&quot;: [
     *               {
     *                 &quot;dbName&quot;: &quot;mysql_db&quot;,
     *                 &quot;schema&quot;: [
     *                   {
     *                     &quot;tableInfos&quot;: [
     *                       {
     *                         &quot;table&quot;: &quot;molin_di_test_in2_pk_v3&quot;
     *                       }
     *                     ]
     *                   }
     *                 ]
     *               }
     *             ]
     *           }
     *         ]
     *       },
     *       &quot;name&quot;: &quot;Reader&quot;,
     *       &quot;category&quot;: &quot;reader&quot;
     *     },
     *     {
     *       &quot;stepType&quot;: &quot;holo&quot;,
     *       &quot;parameter&quot;: {
     *         &quot;datasource&quot;: &quot;holo&quot;
     *       },
     *       &quot;name&quot;: &quot;Writer&quot;,
     *       &quot;category&quot;: &quot;writer&quot;
     *     }
     *   ]
     * }
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{    &quot;type&quot;: &quot;realtime&quot;,     &quot;version&quot;: &quot;1.0&quot;,        &quot;setting&quot;: {       &quot;resourceGroup&quot;:       &quot;S_res_group_280749521950784_1623033752022&quot;,        &quot;scheduleResgroupId&quot;: 30003913,       &quot;name&quot;: &quot;openapi_realtime_solution_0813_1739&quot;,       &quot;taskType&quot;: &quot;oneclick_to_odps&quot;     },     &quot;steps&quot;: [         {             &quot;stepType&quot;: &quot;mysql&quot;,             &quot;parameter&quot;: {                 &quot;connection&quot;: [                     {                        &quot;datasourceType&quot;: &quot;mysql&quot;,                         &quot;datasource&quot;: &quot;mysql_pub&quot;,                         &quot;table&quot;: [                             &quot;xyx&quot;                         ]                     }                 ]             },             &quot;name&quot;: &quot;Reader&quot;,             &quot;category&quot;: &quot;reader&quot;         },         {             &quot;stepType&quot;: &quot;odps&quot;,             &quot;parameter&quot;: {                 &quot;datasource&quot;: &quot;odps_first&quot;             },             &quot;name&quot;: &quot;Writer&quot;,             &quot;category&quot;: &quot;writer&quot;         }     ] }</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The type of task that you want to create in Data Integration in asynchronous mode. Valid values:</p>
     * <ul>
     * <li>DI_REALTIME: real-time synchronization task</li>
     * <li>DI_SOLUTION: another type of synchronization task</li>
     * </ul>
     * <p>DataWorks allows you to create real-time synchronization tasks and other types of synchronization tasks in Data Integration only in asynchronous mode.</p>
     * <ul>
     * <li>DI_OFFLINE</li>
     * <li>DI_REALTIME</li>
     * <li>DI_SOLUTION</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DI_REALTIME</p>
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
