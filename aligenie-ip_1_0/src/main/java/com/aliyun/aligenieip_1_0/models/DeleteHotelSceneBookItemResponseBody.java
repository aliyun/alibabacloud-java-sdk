// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteHotelSceneBookItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeleteHotelSceneBookItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotelSceneBookItemResponseBody self = new DeleteHotelSceneBookItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHotelSceneBookItemResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteHotelSceneBookItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteHotelSceneBookItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHotelSceneBookItemResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
