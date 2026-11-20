// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAXBCallResponseBody extends TeaModel {
    /**
     * <p>The details of the access denied error.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code. Valid values:</p>
     * <ul>
     * <li><p>0000: Success.</p>
     * </li>
     * <li><p>Other values: Failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The AXB call binding result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;BindId&quot;:&quot;476567566&quot;}</p>
     */
    @NameInMap("Data")
    public BindAXBCallResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p>true: Success.</p>
     * </li>
     * <li><p>false: Failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindAXBCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAXBCallResponseBody self = new BindAXBCallResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAXBCallResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindAXBCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAXBCallResponseBody setData(BindAXBCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAXBCallResponseBodyData getData() {
        return this.data;
    }

    public BindAXBCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAXBCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindAXBCallResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>476567566</p>
         */
        @NameInMap("BindId")
        public String bindId;

        public static BindAXBCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAXBCallResponseBodyData self = new BindAXBCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAXBCallResponseBodyData setBindId(String bindId) {
            this.bindId = bindId;
            return this;
        }
        public String getBindId() {
            return this.bindId;
        }

    }

}
