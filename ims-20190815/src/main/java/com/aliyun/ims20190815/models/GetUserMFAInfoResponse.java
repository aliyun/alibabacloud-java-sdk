// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsMFAEnable")
    @Validation(required = true)
    public Boolean isMFAEnable;

    @NameInMap("MFADevice")
    @Validation(required = true)
    public GetUserMFAInfoResponseMFADevice MFADevice;

    public static GetUserMFAInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoResponse self = new GetUserMFAInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserMFAInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserMFAInfoResponse setIsMFAEnable(Boolean isMFAEnable) {
        this.isMFAEnable = isMFAEnable;
        return this;
    }
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
    }

    public GetUserMFAInfoResponse setMFADevice(GetUserMFAInfoResponseMFADevice MFADevice) {
        this.MFADevice = MFADevice;
        return this;
    }
    public GetUserMFAInfoResponseMFADevice getMFADevice() {
        return this.MFADevice;
    }

    public static class GetUserMFAInfoResponseMFADevice extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        public static GetUserMFAInfoResponseMFADevice build(java.util.Map<String, ?> map) throws Exception {
            GetUserMFAInfoResponseMFADevice self = new GetUserMFAInfoResponseMFADevice();
            return TeaModel.build(map, self);
        }

        public GetUserMFAInfoResponseMFADevice setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetUserMFAInfoResponseMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

}
