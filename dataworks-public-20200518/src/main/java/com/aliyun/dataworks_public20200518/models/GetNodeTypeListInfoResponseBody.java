// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeTypeListInfoResponseBody extends TeaModel {
    /**
     * <p>The list of node types.</p>
     */
    @NameInMap("NodeTypeInfoList")
    public GetNodeTypeListInfoResponseBodyNodeTypeInfoList nodeTypeInfoList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNodeTypeListInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeTypeListInfoResponseBody self = new GetNodeTypeListInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeTypeListInfoResponseBody setNodeTypeInfoList(GetNodeTypeListInfoResponseBodyNodeTypeInfoList nodeTypeInfoList) {
        this.nodeTypeInfoList = nodeTypeInfoList;
        return this;
    }
    public GetNodeTypeListInfoResponseBodyNodeTypeInfoList getNodeTypeInfoList() {
        return this.nodeTypeInfoList;
    }

    public GetNodeTypeListInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo extends TeaModel {
        /**
         * <p>The type of the node, which is specified by a number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The name of the node type.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS SQL</p>
         */
        @NameInMap("NodeTypeName")
        public String nodeTypeName;

        public static GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo self = new GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo();
            return TeaModel.build(map, self);
        }

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

    }

    public static class GetNodeTypeListInfoResponseBodyNodeTypeInfoList extends TeaModel {
        /**
         * <p>The information about a node type.</p>
         */
        @NameInMap("NodeTypeInfo")
        public java.util.List<GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo> nodeTypeInfo;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>127</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetNodeTypeListInfoResponseBodyNodeTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetNodeTypeListInfoResponseBodyNodeTypeInfoList self = new GetNodeTypeListInfoResponseBodyNodeTypeInfoList();
            return TeaModel.build(map, self);
        }

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoList setNodeTypeInfo(java.util.List<GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo> nodeTypeInfo) {
            this.nodeTypeInfo = nodeTypeInfo;
            return this;
        }
        public java.util.List<GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo> getNodeTypeInfo() {
            return this.nodeTypeInfo;
        }

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
