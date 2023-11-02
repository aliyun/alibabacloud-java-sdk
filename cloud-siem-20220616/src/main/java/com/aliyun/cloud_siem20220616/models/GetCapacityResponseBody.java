// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetCapacityResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetCapacityResponseBodyData data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCapacityResponseBody self = new GetCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCapacityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCapacityResponseBody setData(GetCapacityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCapacityResponseBodyData getData() {
        return this.data;
    }

    public GetCapacityResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public GetCapacityResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public GetCapacityResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetCapacityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCapacityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCapacityResponseBodyData extends TeaModel {
        @NameInMap("ExistLogStore")
        public Boolean existLogStore;

        @NameInMap("PreservedCapacity")
        public Long preservedCapacity;

        @NameInMap("UsedCapacity")
        public Double usedCapacity;

        public static GetCapacityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCapacityResponseBodyData self = new GetCapacityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCapacityResponseBodyData setExistLogStore(Boolean existLogStore) {
            this.existLogStore = existLogStore;
            return this;
        }
        public Boolean getExistLogStore() {
            return this.existLogStore;
        }

        public GetCapacityResponseBodyData setPreservedCapacity(Long preservedCapacity) {
            this.preservedCapacity = preservedCapacity;
            return this;
        }
        public Long getPreservedCapacity() {
            return this.preservedCapacity;
        }

        public GetCapacityResponseBodyData setUsedCapacity(Double usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

    }

}
