// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetCommerceSettingResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   Other values indicate that the request failed. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetCommerceSettingResponseBodyData data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
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
        /**
         * <p>Indicates whether the shopping cart button is displayed.</p>
         */
        @NameInMap("CartEnable")
        public Boolean cartEnable;

        /**
         * <p>Indicates whether the catalog button is displayed.</p>
         */
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
