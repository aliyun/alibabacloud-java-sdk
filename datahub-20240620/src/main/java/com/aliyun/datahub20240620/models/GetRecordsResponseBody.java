// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetRecordsResponseBody extends TeaModel {
    @NameInMap("Records")
    public java.util.List<GetRecordsResponseBodyRecords> records;

    /**
     * <strong>example:</strong>
     * <p>A20A7093-8FE0-058C-BE0C-3C8057D5F1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsResponseBody self = new GetRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordsResponseBody setRecords(java.util.List<GetRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<GetRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public GetRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRecordsResponseBodyRecords extends TeaModel {
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        @NameInMap("Data")
        public java.util.List<String> data;

        /**
         * <strong>example:</strong>
         * <p>1769065251123</p>
         */
        @NameInMap("SystemTime")
        public Long systemTime;

        public static GetRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            GetRecordsResponseBodyRecords self = new GetRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public GetRecordsResponseBodyRecords setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        public GetRecordsResponseBodyRecords setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public GetRecordsResponseBodyRecords setSystemTime(Long systemTime) {
            this.systemTime = systemTime;
            return this;
        }
        public Long getSystemTime() {
            return this.systemTime;
        }

    }

}
