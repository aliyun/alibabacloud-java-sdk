// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NodeTypeInfoList")
    @Validation(required = true)
    public ListFileTypeResponseNodeTypeInfoList nodeTypeInfoList;

    public static ListFileTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileTypeResponse self = new ListFileTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListFileTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileTypeResponse setNodeTypeInfoList(ListFileTypeResponseNodeTypeInfoList nodeTypeInfoList) {
        this.nodeTypeInfoList = nodeTypeInfoList;
        return this;
    }
    public ListFileTypeResponseNodeTypeInfoList getNodeTypeInfoList() {
        return this.nodeTypeInfoList;
    }

    public static class ListFileTypeResponseNodeTypeInfoListNodeTypeInfo extends TeaModel {
        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        @NameInMap("NodeTypeName")
        @Validation(required = true)
        public String nodeTypeName;

        public static ListFileTypeResponseNodeTypeInfoListNodeTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileTypeResponseNodeTypeInfoListNodeTypeInfo self = new ListFileTypeResponseNodeTypeInfoListNodeTypeInfo();
            return TeaModel.build(map, self);
        }

        public ListFileTypeResponseNodeTypeInfoListNodeTypeInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public ListFileTypeResponseNodeTypeInfoListNodeTypeInfo setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

    }

    public static class ListFileTypeResponseNodeTypeInfoList extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("NodeTypeInfo")
        @Validation(required = true)
        public java.util.List<ListFileTypeResponseNodeTypeInfoListNodeTypeInfo> nodeTypeInfo;

        public static ListFileTypeResponseNodeTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListFileTypeResponseNodeTypeInfoList self = new ListFileTypeResponseNodeTypeInfoList();
            return TeaModel.build(map, self);
        }

        public ListFileTypeResponseNodeTypeInfoList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFileTypeResponseNodeTypeInfoList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileTypeResponseNodeTypeInfoList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFileTypeResponseNodeTypeInfoList setNodeTypeInfo(java.util.List<ListFileTypeResponseNodeTypeInfoListNodeTypeInfo> nodeTypeInfo) {
            this.nodeTypeInfo = nodeTypeInfo;
            return this;
        }
        public java.util.List<ListFileTypeResponseNodeTypeInfoListNodeTypeInfo> getNodeTypeInfo() {
            return this.nodeTypeInfo;
        }

    }

}
