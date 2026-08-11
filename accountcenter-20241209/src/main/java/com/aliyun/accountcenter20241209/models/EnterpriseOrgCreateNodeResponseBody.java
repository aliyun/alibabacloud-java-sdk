// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgCreateNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnterpriseOrgCreateNodeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseOrgCreateNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgCreateNodeResponseBody self = new EnterpriseOrgCreateNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgCreateNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseOrgCreateNodeResponseBody setData(EnterpriseOrgCreateNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnterpriseOrgCreateNodeResponseBodyData getData() {
        return this.data;
    }

    public EnterpriseOrgCreateNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseOrgCreateNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseOrgCreateNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseOrgCreateNodeResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("ParentNodeId")
        public String parentNodeId;

        @NameInMap("ParentNodeType")
        public String parentNodeType;

        @NameInMap("TreeId")
        public Long treeId;

        public static EnterpriseOrgCreateNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseOrgCreateNodeResponseBodyData self = new EnterpriseOrgCreateNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseOrgCreateNodeResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public EnterpriseOrgCreateNodeResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public EnterpriseOrgCreateNodeResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public EnterpriseOrgCreateNodeResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public EnterpriseOrgCreateNodeResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public EnterpriseOrgCreateNodeResponseBodyData setParentNodeId(String parentNodeId) {
            this.parentNodeId = parentNodeId;
            return this;
        }
        public String getParentNodeId() {
            return this.parentNodeId;
        }

        public EnterpriseOrgCreateNodeResponseBodyData setParentNodeType(String parentNodeType) {
            this.parentNodeType = parentNodeType;
            return this;
        }
        public String getParentNodeType() {
            return this.parentNodeType;
        }

        public EnterpriseOrgCreateNodeResponseBodyData setTreeId(Long treeId) {
            this.treeId = treeId;
            return this;
        }
        public Long getTreeId() {
            return this.treeId;
        }

    }

}
