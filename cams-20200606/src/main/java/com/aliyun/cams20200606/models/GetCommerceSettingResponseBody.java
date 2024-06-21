// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetCommerceSettingResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CartEnable")
        public Boolean cartEnable;

        /**
         * <p>Indicates whether the catalog button is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
