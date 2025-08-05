// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetaTableChangeLogResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMetaTableChangeLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableChangeLogResponseBody self = new GetMetaTableChangeLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableChangeLogResponseBody setData(GetMetaTableChangeLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableChangeLogResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableChangeLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetaTableChangeLogResponseBodyDataDataEntityList extends TeaModel {
        @NameInMap("ChangeContent")
        public String changeContent;

        @NameInMap("ChangeType")
        public String changeType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Operator")
        public String operator;

        public static GetMetaTableChangeLogResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableChangeLogResponseBodyDataDataEntityList self = new GetMetaTableChangeLogResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setChangeContent(String changeContent) {
            this.changeContent = changeContent;
            return this;
        }
        public String getChangeContent() {
            return this.changeContent;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class GetMetaTableChangeLogResponseBodyData extends TeaModel {
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaTableChangeLogResponseBodyDataDataEntityList> dataEntityList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaTableChangeLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableChangeLogResponseBodyData self = new GetMetaTableChangeLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableChangeLogResponseBodyData setDataEntityList(java.util.List<GetMetaTableChangeLogResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTableChangeLogResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        public GetMetaTableChangeLogResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTableChangeLogResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableChangeLogResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
