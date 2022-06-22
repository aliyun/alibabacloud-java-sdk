// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfLatestDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPtsPerfLatestDataResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPtsPerfLatestDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfLatestDataResponseBody self = new ListPtsPerfLatestDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfLatestDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPtsPerfLatestDataResponseBody setData(java.util.List<ListPtsPerfLatestDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPtsPerfLatestDataResponseBodyData> getData() {
        return this.data;
    }

    public ListPtsPerfLatestDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPtsPerfLatestDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPtsPerfLatestDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPtsPerfLatestDataResponseBodyData extends TeaModel {
        @NameInMap("DataIndicatorDesc")
        public String dataIndicatorDesc;

        @NameInMap("DataIndicatorType")
        public String dataIndicatorType;

        @NameInMap("DataValue")
        public String dataValue;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("TimeStamp")
        public Long timeStamp;

        public static ListPtsPerfLatestDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPtsPerfLatestDataResponseBodyData self = new ListPtsPerfLatestDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPtsPerfLatestDataResponseBodyData setDataIndicatorDesc(String dataIndicatorDesc) {
            this.dataIndicatorDesc = dataIndicatorDesc;
            return this;
        }
        public String getDataIndicatorDesc() {
            return this.dataIndicatorDesc;
        }

        public ListPtsPerfLatestDataResponseBodyData setDataIndicatorType(String dataIndicatorType) {
            this.dataIndicatorType = dataIndicatorType;
            return this;
        }
        public String getDataIndicatorType() {
            return this.dataIndicatorType;
        }

        public ListPtsPerfLatestDataResponseBodyData setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public ListPtsPerfLatestDataResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListPtsPerfLatestDataResponseBodyData setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListPtsPerfLatestDataResponseBodyData setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

    }

}
