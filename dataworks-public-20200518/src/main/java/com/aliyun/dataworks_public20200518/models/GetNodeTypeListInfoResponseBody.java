// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeTypeListInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NodeTypeInfoList")
    public GetNodeTypeListInfoResponseBodyNodeTypeInfoList nodeTypeInfoList;

    public static GetNodeTypeListInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeTypeListInfoResponseBody self = new GetNodeTypeListInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeTypeListInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeTypeListInfoResponseBody setNodeTypeInfoList(GetNodeTypeListInfoResponseBodyNodeTypeInfoList nodeTypeInfoList) {
        this.nodeTypeInfoList = nodeTypeInfoList;
        return this;
    }
    public GetNodeTypeListInfoResponseBodyNodeTypeInfoList getNodeTypeInfoList() {
        return this.nodeTypeInfoList;
    }

    public static class GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo extends TeaModel {
        @NameInMap("NodeTypeName")
        public String nodeTypeName;

        @NameInMap("NodeType")
        public Integer nodeType;

        public static GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo self = new GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo();
            return TeaModel.build(map, self);
        }

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

    }

    public static class GetNodeTypeListInfoResponseBodyNodeTypeInfoList extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("NodeTypeInfo")
        public java.util.List<GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo> nodeTypeInfo;

        public static GetNodeTypeListInfoResponseBodyNodeTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetNodeTypeListInfoResponseBodyNodeTypeInfoList self = new GetNodeTypeListInfoResponseBodyNodeTypeInfoList();
            return TeaModel.build(map, self);
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

        public GetNodeTypeListInfoResponseBodyNodeTypeInfoList setNodeTypeInfo(java.util.List<GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo> nodeTypeInfo) {
            this.nodeTypeInfo = nodeTypeInfo;
            return this;
        }
        public java.util.List<GetNodeTypeListInfoResponseBodyNodeTypeInfoListNodeTypeInfo> getNodeTypeInfo() {
            return this.nodeTypeInfo;
        }

    }

}
