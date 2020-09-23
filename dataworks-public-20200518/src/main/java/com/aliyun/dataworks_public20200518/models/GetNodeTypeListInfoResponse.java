// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeTypeListInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NodeTypeInfoList")
    @Validation(required = true)
    public GetNodeTypeListInfoResponseNodeTypeInfoList nodeTypeInfoList;

    public static GetNodeTypeListInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeTypeListInfoResponse self = new GetNodeTypeListInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeTypeListInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeTypeListInfoResponse setNodeTypeInfoList(GetNodeTypeListInfoResponseNodeTypeInfoList nodeTypeInfoList) {
        this.nodeTypeInfoList = nodeTypeInfoList;
        return this;
    }
    public GetNodeTypeListInfoResponseNodeTypeInfoList getNodeTypeInfoList() {
        return this.nodeTypeInfoList;
    }

    public static class GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo extends TeaModel {
        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        @NameInMap("NodeTypeName")
        @Validation(required = true)
        public String nodeTypeName;

        public static GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo self = new GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo();
            return TeaModel.build(map, self);
        }

        public GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

    }

    public static class GetNodeTypeListInfoResponseNodeTypeInfoList extends TeaModel {
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
        public java.util.List<GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo> nodeTypeInfo;

        public static GetNodeTypeListInfoResponseNodeTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetNodeTypeListInfoResponseNodeTypeInfoList self = new GetNodeTypeListInfoResponseNodeTypeInfoList();
            return TeaModel.build(map, self);
        }

        public GetNodeTypeListInfoResponseNodeTypeInfoList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetNodeTypeListInfoResponseNodeTypeInfoList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetNodeTypeListInfoResponseNodeTypeInfoList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetNodeTypeListInfoResponseNodeTypeInfoList setNodeTypeInfo(java.util.List<GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo> nodeTypeInfo) {
            this.nodeTypeInfo = nodeTypeInfo;
            return this;
        }
        public java.util.List<GetNodeTypeListInfoResponseNodeTypeInfoListNodeTypeInfo> getNodeTypeInfo() {
            return this.nodeTypeInfo;
        }

    }

}
