// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UAIDCollectionResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public UAIDCollectionResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UAIDCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UAIDCollectionResponseBody self = new UAIDCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UAIDCollectionResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UAIDCollectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UAIDCollectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UAIDCollectionResponseBody setModel(UAIDCollectionResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public UAIDCollectionResponseBodyModel getModel() {
        return this.model;
    }

    public UAIDCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UAIDCollectionResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Uaid")
        public String uaid;

        public static UAIDCollectionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UAIDCollectionResponseBodyModel self = new UAIDCollectionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public UAIDCollectionResponseBodyModel setUaid(String uaid) {
            this.uaid = uaid;
            return this;
        }
        public String getUaid() {
            return this.uaid;
        }

    }

}
