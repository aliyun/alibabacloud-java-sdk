// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetStorageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetStorageResponseBodyData data;

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

    public static GetStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageResponseBody self = new GetStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetStorageResponseBody setData(GetStorageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStorageResponseBodyData getData() {
        return this.data;
    }

    public GetStorageResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public GetStorageResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public GetStorageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetStorageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStorageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStorageResponseBodyData extends TeaModel {
        @NameInMap("CanOperate")
        public Boolean canOperate;

        @NameInMap("DisplayRegion")
        public Boolean displayRegion;

        @NameInMap("Region")
        public String region;

        @NameInMap("Ttl")
        public Integer ttl;

        public static GetStorageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStorageResponseBodyData self = new GetStorageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStorageResponseBodyData setCanOperate(Boolean canOperate) {
            this.canOperate = canOperate;
            return this;
        }
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        public GetStorageResponseBodyData setDisplayRegion(Boolean displayRegion) {
            this.displayRegion = displayRegion;
            return this;
        }
        public Boolean getDisplayRegion() {
            return this.displayRegion;
        }

        public GetStorageResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetStorageResponseBodyData setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
