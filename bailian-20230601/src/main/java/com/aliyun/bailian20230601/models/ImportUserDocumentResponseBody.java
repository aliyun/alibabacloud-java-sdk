// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ImportUserDocumentResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImportUserDocumentResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ImportUserDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportUserDocumentResponseBody self = new ImportUserDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportUserDocumentResponseBody setData(ImportUserDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportUserDocumentResponseBodyData getData() {
        return this.data;
    }

    public ImportUserDocumentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ImportUserDocumentResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ImportUserDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportUserDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportUserDocumentResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("DataStatus")
        public Long dataStatus;

        public static ImportUserDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportUserDocumentResponseBodyData self = new ImportUserDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportUserDocumentResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImportUserDocumentResponseBodyData setDataStatus(Long dataStatus) {
            this.dataStatus = dataStatus;
            return this;
        }
        public Long getDataStatus() {
            return this.dataStatus;
        }

    }

}
