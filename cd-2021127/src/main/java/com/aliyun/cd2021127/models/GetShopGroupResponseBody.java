// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetShopGroupResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 门店组编号（ID）
    @NameInMap("ShopGroupId")
    public String shopGroupId;

    // 门店组名称
    @NameInMap("ShopGroupName")
    public String shopGroupName;

    // 成功标志
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
