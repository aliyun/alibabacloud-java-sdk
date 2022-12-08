// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLocalFileUploadJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryLocalFileUploadJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryLocalFileUploadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLocalFileUploadJobResponseBody self = new QueryLocalFileUploadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLocalFileUploadJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLocalFileUploadJobResponseBody setData(QueryLocalFileUploadJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLocalFileUploadJobResponseBodyData getData() {
        return this.data;
    }

    public QueryLocalFileUploadJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLocalFileUploadJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLocalFileUploadJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLocalFileUploadJobResponseBodyDataResultListFileList extends TeaModel {
        @NameInMap("FileEndTime")
        public Integer fileEndTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileStartTime")
        public Integer fileStartTime;

        public static QueryLocalFileUploadJobResponseBodyDataResultListFileList build(java.util.Map<String, ?> map) throws Exception {
            QueryLocalFileUploadJobResponseBodyDataResultListFileList self = new QueryLocalFileUploadJobResponseBodyDataResultListFileList();
            return TeaModel.build(map, self);
        }

        public QueryLocalFileUploadJobResponseBodyDataResultListFileList setFileEndTime(Integer fileEndTime) {
            this.fileEndTime = fileEndTime;
            return this;
        }
        public Integer getFileEndTime() {
            return this.fileEndTime;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultListFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultListFileList setFileStartTime(Integer fileStartTime) {
            this.fileStartTime = fileStartTime;
            return this;
        }
        public Integer getFileStartTime() {
            return this.fileStartTime;
        }

    }

    public static class QueryLocalFileUploadJobResponseBodyDataResultList extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("FileList")
        public java.util.List<QueryLocalFileUploadJobResponseBodyDataResultListFileList> fileList;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("SlotEndTime")
        public Integer slotEndTime;

        @NameInMap("SlotStartTime")
        public Integer slotStartTime;

        @NameInMap("SlotStatus")
        public Integer slotStatus;

        public static QueryLocalFileUploadJobResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            QueryLocalFileUploadJobResponseBodyDataResultList self = new QueryLocalFileUploadJobResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setFileList(java.util.List<QueryLocalFileUploadJobResponseBodyDataResultListFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<QueryLocalFileUploadJobResponseBodyDataResultListFileList> getFileList() {
            return this.fileList;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setSlotEndTime(Integer slotEndTime) {
            this.slotEndTime = slotEndTime;
            return this;
        }
        public Integer getSlotEndTime() {
            return this.slotEndTime;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setSlotStartTime(Integer slotStartTime) {
            this.slotStartTime = slotStartTime;
            return this;
        }
        public Integer getSlotStartTime() {
            return this.slotStartTime;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setSlotStatus(Integer slotStatus) {
            this.slotStatus = slotStatus;
            return this;
        }
        public Integer getSlotStatus() {
            return this.slotStatus;
        }

    }

    public static class QueryLocalFileUploadJobResponseBodyData extends TeaModel {
        @NameInMap("ResultList")
        public java.util.List<QueryLocalFileUploadJobResponseBodyDataResultList> resultList;

        @NameInMap("Status")
        public Integer status;

        public static QueryLocalFileUploadJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLocalFileUploadJobResponseBodyData self = new QueryLocalFileUploadJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLocalFileUploadJobResponseBodyData setResultList(java.util.List<QueryLocalFileUploadJobResponseBodyDataResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<QueryLocalFileUploadJobResponseBodyDataResultList> getResultList() {
            return this.resultList;
        }

        public QueryLocalFileUploadJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
