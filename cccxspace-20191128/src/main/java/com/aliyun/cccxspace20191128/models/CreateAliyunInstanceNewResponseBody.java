// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateAliyunInstanceNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateAliyunInstanceNewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAliyunInstanceNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunInstanceNewResponseBody self = new CreateAliyunInstanceNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAliyunInstanceNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAliyunInstanceNewResponseBody setData(CreateAliyunInstanceNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAliyunInstanceNewResponseBodyData getData() {
        return this.data;
    }

    public CreateAliyunInstanceNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAliyunInstanceNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAliyunInstanceNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAliyunInstanceNewResponseBodyData extends TeaModel {
        @NameInMap("BuId")
        public Long buId;

        public static CreateAliyunInstanceNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAliyunInstanceNewResponseBodyData self = new CreateAliyunInstanceNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAliyunInstanceNewResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

    }

}
