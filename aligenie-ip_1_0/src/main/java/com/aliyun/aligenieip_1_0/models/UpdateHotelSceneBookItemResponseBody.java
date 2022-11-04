// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneBookItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static UpdateHotelSceneBookItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelSceneBookItemResponseBody self = new UpdateHotelSceneBookItemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHotelSceneBookItemResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateHotelSceneBookItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateHotelSceneBookItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHotelSceneBookItemResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
