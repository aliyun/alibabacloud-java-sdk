// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RestoreArchivedRecordingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<RestoreArchivedRecordingsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RestoreArchivedRecordingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreArchivedRecordingsResponseBody self = new RestoreArchivedRecordingsResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreArchivedRecordingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RestoreArchivedRecordingsResponseBody setData(java.util.List<RestoreArchivedRecordingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RestoreArchivedRecordingsResponseBodyData> getData() {
        return this.data;
    }

    public RestoreArchivedRecordingsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RestoreArchivedRecordingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestoreArchivedRecordingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RestoreArchivedRecordingsResponseBodyData extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("Exists")
        public String exists;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageType")
        public String storageType;

        public static RestoreArchivedRecordingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestoreArchivedRecordingsResponseBodyData self = new RestoreArchivedRecordingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestoreArchivedRecordingsResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public RestoreArchivedRecordingsResponseBodyData setExists(String exists) {
            this.exists = exists;
            return this;
        }
        public String getExists() {
            return this.exists;
        }

        public RestoreArchivedRecordingsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RestoreArchivedRecordingsResponseBodyData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
