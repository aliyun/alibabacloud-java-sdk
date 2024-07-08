// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UAIDConversionResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public UAIDConversionResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UAIDConversionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UAIDConversionResponseBody self = new UAIDConversionResponseBody();
        return TeaModel.build(map, self);
    }

    public UAIDConversionResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UAIDConversionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UAIDConversionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UAIDConversionResponseBody setModel(UAIDConversionResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public UAIDConversionResponseBodyModel getModel() {
        return this.model;
    }

    public UAIDConversionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UAIDConversionResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("PhoneList")
        public String phoneList;

        public static UAIDConversionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UAIDConversionResponseBodyModel self = new UAIDConversionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public UAIDConversionResponseBodyModel setPhoneList(String phoneList) {
            this.phoneList = phoneList;
            return this;
        }
        public String getPhoneList() {
            return this.phoneList;
        }

    }

}
