// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetNodeResponseBody extends TeaModel {
    /**
     * <p>The information about the node.</p>
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
         * <p>The ID of the node.</p>
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
        public String projectId;

        /**
         * <p>The FlowSpec field information about this node. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow">FlowSpec</a>.</p>
         */
        @NameInMap("Spec")
        public String spec;

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

        public GetNodeResponseBodyNode setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetNodeResponseBodyNode setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
