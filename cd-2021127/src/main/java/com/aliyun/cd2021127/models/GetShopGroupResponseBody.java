// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetShopGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopGroupName")
    public String shopGroupName;

    @NameInMap("Success")
    public Boolean success;

    public static GetShopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShopGroupResponseBody self = new GetShopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShopGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetShopGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetShopGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetShopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetShopGroupResponseBody setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public GetShopGroupResponseBody setShopGroupName(String shopGroupName) {
        this.shopGroupName = shopGroupName;
        return this;
    }
    public String getShopGroupName() {
        return this.shopGroupName;
    }

    public GetShopGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
