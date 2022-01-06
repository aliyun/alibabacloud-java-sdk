// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateAliyunInstanceNewSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateAliyunInstanceNewSaleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAliyunInstanceNewSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunInstanceNewSaleResponseBody self = new CreateAliyunInstanceNewSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAliyunInstanceNewSaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAliyunInstanceNewSaleResponseBody setData(CreateAliyunInstanceNewSaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAliyunInstanceNewSaleResponseBodyData getData() {
        return this.data;
    }

    public CreateAliyunInstanceNewSaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAliyunInstanceNewSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAliyunInstanceNewSaleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAliyunInstanceNewSaleResponseBodyData extends TeaModel {
        @NameInMap("BuId")
        public Long buId;

        public static CreateAliyunInstanceNewSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAliyunInstanceNewSaleResponseBodyData self = new CreateAliyunInstanceNewSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAliyunInstanceNewSaleResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

    }

}
