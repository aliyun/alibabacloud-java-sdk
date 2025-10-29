// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetComponentResponseBody extends TeaModel {
    /**
     * <p>JSON serialization of the component module.</p>
     */
    @NameInMap("Component")
    public GetComponentResponseBodyComponent component;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComponentResponseBody self = new GetComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComponentResponseBody setComponent(GetComponentResponseBodyComponent component) {
        this.component = component;
        return this;
    }
    public GetComponentResponseBodyComponent getComponent() {
        return this.component;
    }

    public GetComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetComponentResponseBodyComponent extends TeaModel {
        /**
         * <p>The ID of the dataset acceleration component. For information on how to obtain the component ID, see <a href="https://help.aliyun.com/document_detail/2979566.html">ListComponents</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>43cd873b-235c-44f8-be07-e4d4cf7e73b0</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2017-04-27T05:37:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The modification time (millisecond-level timestamp).</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-26T07:44:21Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Parameter</p>
         * 
         * <strong>example:</strong>
         * <p>dim_whse_epet_warehouse_jz_storage_stock_lot_relation_id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>207316543660665792</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64623</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The region ID, such as ap-southeast-1. The region ID is automatically parsed from your endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The FlowSpec information for this workflow. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow/">FlowSpec</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;kind&quot;: &quot;Component&quot;,
         *     &quot;name&quot;: &quot;com1&quot;,
         *     &quot;spec&quot;: {
         *         &quot;components&quot;: [
         *             {
         *                 &quot;name&quot;: &quot;test11&quot;,
         *                 &quot;id&quot;: &quot;8196828925037*****&quot;,
         *                 &quot;owner&quot;: &quot;054664&quot;,
         *                 &quot;description&quot;: &quot;&quot;,
         *                 &quot;script&quot;: {
         *                     &quot;language&quot;: &quot;odps-sql&quot;,
         *                     &quot;path&quot;: &quot;test11&quot;,
         *                     &quot;content&quot;: &quot;select \&quot;@@{bizdate}\&quot;, \&quot;@@{my_input_table}\&quot;&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;SQL_COMPONENT&quot;
         *                     }
         *                 },
         *                 &quot;inputs&quot;: [
         *                     {
         *                         &quot;name&quot;: &quot;bizdate&quot;,
         *                         &quot;type&quot;: &quot;string&quot;
         *                     },
         *                     {
         *                         &quot;name&quot;: &quot;my_input_table&quot;,
         *                         &quot;type&quot;: &quot;string&quot;
         *                     }
         *                 ],
         *                 &quot;outputs&quot;: [
         *                     {
         *                         &quot;name&quot;: &quot;my_output_table1&quot;,
         *                         &quot;type&quot;: &quot;string&quot;
         *                     }
         *                 ]
         *             }
         *         ]
         *     }
         * }</p>
         */
        @NameInMap("Spec")
        public String spec;

        public static GetComponentResponseBodyComponent build(java.util.Map<String, ?> map) throws Exception {
            GetComponentResponseBodyComponent self = new GetComponentResponseBodyComponent();
            return TeaModel.build(map, self);
        }

        public GetComponentResponseBodyComponent setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public GetComponentResponseBodyComponent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetComponentResponseBodyComponent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetComponentResponseBodyComponent setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetComponentResponseBodyComponent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComponentResponseBodyComponent setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetComponentResponseBodyComponent setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetComponentResponseBodyComponent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetComponentResponseBodyComponent setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
