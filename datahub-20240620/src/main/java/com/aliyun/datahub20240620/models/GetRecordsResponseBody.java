// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetRecordsResponseBody extends TeaModel {
    /**
     * <p>The records that were read.</p>
     */
    @NameInMap("Records")
    public java.util.List<GetRecordsResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A20A7093-8FE0-058C-BE0C-3C8057D5F1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
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
        /**
         * <p>The additional information of the record. This value is empty if no additional information exists.</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        /**
         * <p>The data content of the record.</p>
         */
        @NameInMap("Data")
        public java.util.List<String> data;

        /**
         * <p>The write time of the record.</p>
         * 
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
