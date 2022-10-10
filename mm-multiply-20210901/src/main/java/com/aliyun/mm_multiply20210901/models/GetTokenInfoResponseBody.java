// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetTokenInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TbNick")
    public String tbNick;

    @NameInMap("TbShopId")
    public String tbShopId;

    @NameInMap("TbShopName")
    public String tbShopName;

    public static GetTokenInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenInfoResponseBody self = new GetTokenInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTokenInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTokenInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTokenInfoResponseBody setTbNick(String tbNick) {
        this.tbNick = tbNick;
        return this;
    }
    public String getTbNick() {
        return this.tbNick;
    }

    public GetTokenInfoResponseBody setTbShopId(String tbShopId) {
        this.tbShopId = tbShopId;
        return this;
    }
    public String getTbShopId() {
        return this.tbShopId;
    }

    public GetTokenInfoResponseBody setTbShopName(String tbShopName) {
        this.tbShopName = tbShopName;
        return this;
    }
    public String getTbShopName() {
        return this.tbShopName;
    }

}
