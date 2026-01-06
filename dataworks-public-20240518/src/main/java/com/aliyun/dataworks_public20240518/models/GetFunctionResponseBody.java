// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetFunctionResponseBody extends TeaModel {
    /**
     * <p>UDF function details.</p>
     */
    @NameInMap("Function")
    public GetFunctionResponseBodyFunction function;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6CF95929-6D12-5A88-8CC3-4B2F4C2EXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResponseBody self = new GetFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionResponseBody setFunction(GetFunctionResponseBodyFunction function) {
        this.function = function;
        return this;
    }
    public GetFunctionResponseBodyFunction getFunction() {
        return this.function;
    }

    public GetFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFunctionResponseBodyFunction extends TeaModel {
        /**
         * <p>The time when the UDF was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The unique identifier of the UDF function.</p>
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
         * <p>The time when the UDF was last modified. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1724506661000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the UDF.</p>
         * 
         * <strong>example:</strong>
         * <p>Function name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the UDF.</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the DataWorks workspace to which the UDF belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The FlowSpec field information about the UDF. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;version&quot;: &quot;1.1.0&quot;,
         *     &quot;kind&quot;: &quot;Function&quot;,
         *     &quot;spec&quot;: {
         *         &quot;functions&quot;: [
         *             {
         *                 &quot;name&quot;: &quot;Function_Name&quot;,
         *                 &quot;id&quot;: &quot;580667964888595XXXX&quot;,
         *                 &quot;script&quot;: {
         *                     &quot;content&quot;: &quot;{  \&quot;uuid\&quot;: \&quot;580667964888595XXXX\&quot;,  \&quot;name\&quot;: \&quot;Function_Name\&quot;,  \&quot;datasource\&quot;: {    \&quot;type\&quot;: \&quot;odps\&quot;,    \&quot;name\&quot;: \&quot;odps_first\&quot;  },  \&quot;runtimeResource\&quot;: {    \&quot;resourceGroup\&quot;: \&quot;S_res_group_XXXX_XXXX\&quot;,    \&quot;resourceGroupId\&quot;: 6591XXXX  }}&quot;,
         *                     &quot;path&quot;: &quot;XXX/OpenAPI/Function/Function_Name&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;ODPS_FUNCTION&quot;
         *                     }
         *                 },
         *                 &quot;datasource&quot;: {
         *                     &quot;name&quot;: &quot;odps_first&quot;,
         *                     &quot;type&quot;: &quot;odps&quot;
         *                 },
         *                 &quot;runtimeResource&quot;: {
         *                     &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;,
         *                     &quot;id&quot;: &quot;723932906364267XXXX&quot;,
         *                     &quot;resourceGroupId&quot;: &quot;6591XXXX&quot;
         *                 },
         *                 &quot;metadata&quot;: {
         *                     &quot;owner&quot;: &quot;110755000425XXXX&quot;
         *                 }
         *             }
         *         ]
         *     }
         * }</p>
         */
        @NameInMap("Spec")
        public String spec;

        public static GetFunctionResponseBodyFunction build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionResponseBodyFunction self = new GetFunctionResponseBodyFunction();
            return TeaModel.build(map, self);
        }

        public GetFunctionResponseBodyFunction setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFunctionResponseBodyFunction setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetFunctionResponseBodyFunction setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetFunctionResponseBodyFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionResponseBodyFunction setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetFunctionResponseBodyFunction setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetFunctionResponseBodyFunction setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
