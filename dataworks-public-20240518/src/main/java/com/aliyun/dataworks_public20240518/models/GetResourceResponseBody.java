// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E871F6C0-2EFF-5790-A00D-C57543EEXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the file resource.</p>
     */
    @NameInMap("Resource")
    public GetResourceResponseBodyResource resource;

    public static GetResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceResponseBody self = new GetResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceResponseBody setResource(GetResourceResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetResourceResponseBodyResource getResource() {
        return this.resource;
    }

    public static class GetResourceResponseBodyResource extends TeaModel {
        /**
         * <p>The time when the file resource was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700539206000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the file resource.</p>
         * 
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the file resource was last modified. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700539206000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the file resource.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI_Test_Resource. py</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the file resource.</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the workspace to which the file resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The FlowSpec field information about the file resource. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow">FlowSpec</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;version&quot;: &quot;1.1.0&quot;,
         *     &quot;kind&quot;: &quot;Resource&quot;,
         *     &quot;spec&quot;: {
         *         &quot;fileResources&quot;: [
         *             {
         *                 &quot;name&quot;: &quot;OpenAPI_Test_Resource.py&quot;,
         *                 &quot;id&quot;: &quot;631478864897630XXXX&quot;,
         *                 &quot;script&quot;: {
         *                     &quot;content&quot;: &quot;&quot;,
         *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/Resource_Test/OpenAPI_Test_Resource.py&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;ODPS_PYTHON&quot;
         *                     }
         *                 },
         *                 &quot;type&quot;: &quot;python&quot;,
         *                 &quot;file&quot;: {
         *                     &quot;storage&quot;: {}
         *                 },
         *                 &quot;datasource&quot;: {
         *                     &quot;name&quot;: &quot;odps_first&quot;,
         *                     &quot;type&quot;: &quot;odps&quot;
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

        public static GetResourceResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetResourceResponseBodyResource self = new GetResourceResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetResourceResponseBodyResource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetResourceResponseBodyResource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResourceResponseBodyResource setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetResourceResponseBodyResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceResponseBodyResource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetResourceResponseBodyResource setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetResourceResponseBodyResource setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
