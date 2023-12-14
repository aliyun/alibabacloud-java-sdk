// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseDataListResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryEnterpriseDataListResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEnterpriseDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseDataListResponseBody self = new QueryEnterpriseDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseDataListResponseBody setData(QueryEnterpriseDataListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEnterpriseDataListResponseBodyData getData() {
        return this.data;
    }

    public QueryEnterpriseDataListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryEnterpriseDataListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryEnterpriseDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEnterpriseDataListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEnterpriseDataListResponseBodyDataList extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("DataName")
        public String dataName;

        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("DataStatus")
        public String dataStatus;

        @NameInMap("DataStatusCode")
        public Integer dataStatusCode;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DataTypeCode")
        public Integer dataTypeCode;

        @NameInMap("StatusDetail")
        public String statusDetail;

        @NameInMap("StoreType")
        public String storeType;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("UploadTime")
        public String uploadTime;

        public static QueryEnterpriseDataListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryEnterpriseDataListResponseBodyDataList self = new QueryEnterpriseDataListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryEnterpriseDataListResponseBodyDataList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryEnterpriseDataListResponseBodyDataList setDataName(String dataName) {
            this.dataName = dataName;
            return this;
        }
        public String getDataName() {
            return this.dataName;
        }

        public QueryEnterpriseDataListResponseBodyDataList setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public QueryEnterpriseDataListResponseBodyDataList setDataStatus(String dataStatus) {
            this.dataStatus = dataStatus;
            return this;
        }
        public String getDataStatus() {
            return this.dataStatus;
        }

        public QueryEnterpriseDataListResponseBodyDataList setDataStatusCode(Integer dataStatusCode) {
            this.dataStatusCode = dataStatusCode;
            return this;
        }
        public Integer getDataStatusCode() {
            return this.dataStatusCode;
        }

        public QueryEnterpriseDataListResponseBodyDataList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryEnterpriseDataListResponseBodyDataList setDataTypeCode(Integer dataTypeCode) {
            this.dataTypeCode = dataTypeCode;
            return this;
        }
        public Integer getDataTypeCode() {
            return this.dataTypeCode;
        }

        public QueryEnterpriseDataListResponseBodyDataList setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public QueryEnterpriseDataListResponseBodyDataList setStoreType(String storeType) {
            this.storeType = storeType;
            return this;
        }
        public String getStoreType() {
            return this.storeType;
        }

        public QueryEnterpriseDataListResponseBodyDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public QueryEnterpriseDataListResponseBodyDataList setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

    public static class QueryEnterpriseDataListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryEnterpriseDataListResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static QueryEnterpriseDataListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEnterpriseDataListResponseBodyData self = new QueryEnterpriseDataListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEnterpriseDataListResponseBodyData setList(java.util.List<QueryEnterpriseDataListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryEnterpriseDataListResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryEnterpriseDataListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryEnterpriseDataListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEnterpriseDataListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
