// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataByDataIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetEnterpriseDataByDataIdResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetEnterpriseDataByDataIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataByDataIdResponseBody self = new GetEnterpriseDataByDataIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataByDataIdResponseBody setData(GetEnterpriseDataByDataIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnterpriseDataByDataIdResponseBodyData getData() {
        return this.data;
    }

    public GetEnterpriseDataByDataIdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetEnterpriseDataByDataIdResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetEnterpriseDataByDataIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseDataByDataIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnterpriseDataByDataIdResponseBodyData extends TeaModel {
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

        public static GetEnterpriseDataByDataIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseDataByDataIdResponseBodyData self = new GetEnterpriseDataByDataIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseDataByDataIdResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setDataName(String dataName) {
            this.dataName = dataName;
            return this;
        }
        public String getDataName() {
            return this.dataName;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setDataStatus(String dataStatus) {
            this.dataStatus = dataStatus;
            return this;
        }
        public String getDataStatus() {
            return this.dataStatus;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setDataStatusCode(Integer dataStatusCode) {
            this.dataStatusCode = dataStatusCode;
            return this;
        }
        public Integer getDataStatusCode() {
            return this.dataStatusCode;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setDataTypeCode(Integer dataTypeCode) {
            this.dataTypeCode = dataTypeCode;
            return this;
        }
        public Integer getDataTypeCode() {
            return this.dataTypeCode;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setStoreType(String storeType) {
            this.storeType = storeType;
            return this;
        }
        public String getStoreType() {
            return this.storeType;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetEnterpriseDataByDataIdResponseBodyData setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
