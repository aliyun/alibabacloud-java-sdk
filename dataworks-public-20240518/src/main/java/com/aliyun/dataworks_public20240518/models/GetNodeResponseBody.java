// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetNodeResponseBody extends TeaModel {
    /**
     * <p>Data Studio node details.</p>
     */
    @NameInMap("Node")
    public GetNodeResponseBodyNode node;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeResponseBody self = new GetNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeResponseBody setNode(GetNodeResponseBodyNode node) {
        this.node = node;
        return this;
    }
    public GetNodeResponseBodyNode getNode() {
        return this.node;
    }

    public GetNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNodeResponseBodyNode extends TeaModel {
        /**
         * <p>The time when the node was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700539206000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The unique identifier of the Data Studio node.</p>
         * <blockquote>
         * <p> Prior to SDK version 8.0.0, this field is of type Long. In SDK version 8.0.0 and later, it is of type String. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the node was last modified. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700539206000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Node name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>196596664824XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The FlowSpec field information about this node. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow">FlowSpec</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;version&quot;: &quot;1.1.0&quot;,
         *     &quot;kind&quot;: &quot;Node&quot;,
         *     &quot;spec&quot;: {
         *         &quot;nodes&quot;: [
         *             {
         *                 &quot;recurrence&quot;: &quot;Normal&quot;,
         *                 &quot;id&quot;: &quot;860438872620113XXXX&quot;,
         *                 &quot;timeout&quot;: 0,
         *                 &quot;instanceMode&quot;: &quot;T+1&quot;,
         *                 &quot;rerunMode&quot;: &quot;Allowed&quot;,
         *                 &quot;rerunTimes&quot;: 3,
         *                 &quot;rerunInterval&quot;: 180000,
         *                 &quot;datasource&quot;: {
         *                     &quot;name&quot;: &quot;odps_test&quot;,
         *                     &quot;type&quot;: &quot;odps&quot;
         *                 },
         *                 &quot;script&quot;: {
         *                     &quot;language&quot;: &quot;odps-sql&quot;,
         *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/ODPS_SQL_Test&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;ODPS_SQL&quot;,
         *                         &quot;commandTypeId&quot;: 10
         *                     },
         *                     &quot;content&quot;: &quot;select now();&quot;,
         *                     &quot;id&quot;: &quot;853573334108680XXXX&quot;
         *                 },
         *                 &quot;trigger&quot;: {
         *                     &quot;type&quot;: &quot;Scheduler&quot;,
         *                     &quot;id&quot;: &quot;543680677872062XXXX&quot;,
         *                     &quot;cron&quot;: &quot;00 00 00 * * ?&quot;,
         *                     &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
         *                     &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
         *                     &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
         *                     &quot;delaySeconds&quot;: 0
         *                 },
         *                 &quot;runtimeResource&quot;: {
         *                     &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;,
         *                     &quot;id&quot;: &quot;623731286945488XXXX&quot;,
         *                     &quot;resourceGroupId&quot;: &quot;7201XXXX&quot;
         *                 },
         *                 &quot;name&quot;: &quot;ODPS_SQL_Test&quot;,
         *                 &quot;owner&quot;: &quot;110755000425XXXX&quot;,
         *                 &quot;metadata&quot;: {
         *                     &quot;owner&quot;: &quot;110755000425XXXX&quot;,
         *                     &quot;ownerName&quot;: &quot;<a href="mailto:XXXXX@test.XXX.com">XXXXX@test.XXX.com</a>&quot;,
         *                     &quot;projectId&quot;: &quot;307XXX&quot;
         *                 },
         *                 &quot;inputs&quot;: {
         *                     &quot;nodeOutputs&quot;: [
         *                         {
         *                             &quot;data&quot;: &quot;lwttest_standard_root&quot;,
         *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;
         *                         }
         *                     ]
         *                 },
         *                 &quot;outputs&quot;: {
         *                     &quot;nodeOutputs&quot;: [
         *                         {
         *                             &quot;data&quot;: &quot;860438872620113XXXX&quot;,
         *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
         *                             &quot;refTableName&quot;: &quot;ODPS_SQL_Test&quot;,
         *                             &quot;isDefault&quot;: true
         *                         }
         *                     ]
         *                 }
         *             }
         *         ],
         *         &quot;flow&quot;: [
         *             {
         *                 &quot;nodeId&quot;: &quot;860438872620113XXXX&quot;,
         *                 &quot;depends&quot;: [
         *                     {
         *                         &quot;type&quot;: &quot;Normal&quot;,
         *                         &quot;output&quot;: &quot;lwttest_standard_root&quot;
         *                     }
         *                 ]
         *             }
         *         ]
         *     },
         *     &quot;metadata&quot;: {
         *         &quot;uuid&quot;: &quot;860438872620113XXXX&quot;
         *     }
         * }</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The ID of the corresponding scheduling task after the node is published.</p>
         * 
         * <strong>example:</strong>
         * <p>700006680527</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static GetNodeResponseBodyNode build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodyNode self = new GetNodeResponseBodyNode();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodyNode setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNodeResponseBodyNode setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetNodeResponseBodyNode setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetNodeResponseBodyNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNodeResponseBodyNode setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetNodeResponseBodyNode setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeResponseBodyNode setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetNodeResponseBodyNode setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
