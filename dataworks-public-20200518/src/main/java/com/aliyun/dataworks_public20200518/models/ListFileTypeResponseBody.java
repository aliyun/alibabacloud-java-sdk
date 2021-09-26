// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NodeTypeInfoList")
    public ListFileTypeResponseBodyNodeTypeInfoList nodeTypeInfoList;

    public static ListFileTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileTypeResponseBody self = new ListFileTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileTypeResponseBody setNodeTypeInfoList(ListFileTypeResponseBodyNodeTypeInfoList nodeTypeInfoList) {
        this.nodeTypeInfoList = nodeTypeInfoList;
        return this;
    }
    public ListFileTypeResponseBodyNodeTypeInfoList getNodeTypeInfoList() {
        return this.nodeTypeInfoList;
    }

    public static class ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo extends TeaModel {
        @NameInMap("NodeTypeName")
        public String nodeTypeName;

        @NameInMap("NodeType")
        public Integer nodeType;

        public static ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo self = new ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo();
            return TeaModel.build(map, self);
        }

        public ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        public ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

    }

    public static class ListFileTypeResponseBodyNodeTypeInfoList extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("NodeTypeInfo")
        public java.util.List<ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo> nodeTypeInfo;

        public static ListFileTypeResponseBodyNodeTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListFileTypeResponseBodyNodeTypeInfoList self = new ListFileTypeResponseBodyNodeTypeInfoList();
            return TeaModel.build(map, self);
        }

        public ListFileTypeResponseBodyNodeTypeInfoList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFileTypeResponseBodyNodeTypeInfoList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileTypeResponseBodyNodeTypeInfoList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFileTypeResponseBodyNodeTypeInfoList setNodeTypeInfo(java.util.List<ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo> nodeTypeInfo) {
            this.nodeTypeInfo = nodeTypeInfo;
            return this;
        }
        public java.util.List<ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo> getNodeTypeInfo() {
            return this.nodeTypeInfo;
        }

    }

}
