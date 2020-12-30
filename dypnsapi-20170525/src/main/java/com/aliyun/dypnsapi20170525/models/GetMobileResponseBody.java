// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetMobileResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("GetMobileResultDTO")
    public GetMobileResponseBodyGetMobileResultDTO getMobileResultDTO;

    public static GetMobileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMobileResponseBody self = new GetMobileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMobileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMobileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMobileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMobileResponseBody setGetMobileResultDTO(GetMobileResponseBodyGetMobileResultDTO getMobileResultDTO) {
        this.getMobileResultDTO = getMobileResultDTO;
        return this;
    }
    public GetMobileResponseBodyGetMobileResultDTO getGetMobileResultDTO() {
        return this.getMobileResultDTO;
    }

    public static class GetMobileResponseBodyGetMobileResultDTO extends TeaModel {
        @NameInMap("Mobile")
        public String mobile;

        public static GetMobileResponseBodyGetMobileResultDTO build(java.util.Map<String, ?> map) throws Exception {
            GetMobileResponseBodyGetMobileResultDTO self = new GetMobileResponseBodyGetMobileResultDTO();
            return TeaModel.build(map, self);
        }

        public GetMobileResponseBodyGetMobileResultDTO setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

}
