// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllDeviceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllDeviceGroupResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllDeviceGroupResponseBody self = new ListAllDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllDeviceGroupResponseBody setData(java.util.List<ListAllDeviceGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllDeviceGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListAllDeviceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllDeviceGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("Name")
        public String name;

        public static ListAllDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllDeviceGroupResponseBodyData self = new ListAllDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllDeviceGroupResponseBodyData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public ListAllDeviceGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
