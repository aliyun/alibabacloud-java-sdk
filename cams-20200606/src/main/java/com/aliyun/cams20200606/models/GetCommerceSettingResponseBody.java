// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetCommerceSettingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCommerceSettingResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCommerceSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommerceSettingResponseBody self = new GetCommerceSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommerceSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCommerceSettingResponseBody setData(GetCommerceSettingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCommerceSettingResponseBodyData getData() {
        return this.data;
    }

    public GetCommerceSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCommerceSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCommerceSettingResponseBodyData extends TeaModel {
        @NameInMap("CartEnable")
        public Boolean cartEnable;

        @NameInMap("CatalogVisible")
        public Boolean catalogVisible;

        public static GetCommerceSettingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCommerceSettingResponseBodyData self = new GetCommerceSettingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCommerceSettingResponseBodyData setCartEnable(Boolean cartEnable) {
            this.cartEnable = cartEnable;
            return this;
        }
        public Boolean getCartEnable() {
            return this.cartEnable;
        }

        public GetCommerceSettingResponseBodyData setCatalogVisible(Boolean catalogVisible) {
            this.catalogVisible = catalogVisible;
            return this;
        }
        public Boolean getCatalogVisible() {
            return this.catalogVisible;
        }

    }

}
