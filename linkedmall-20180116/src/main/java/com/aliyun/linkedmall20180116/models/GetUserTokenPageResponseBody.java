// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserTokenPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetUserTokenPageResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>B7E4EF89-DBC3-5CD0-9993-02D8C13E7177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserTokenPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenPageResponseBody self = new GetUserTokenPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserTokenPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserTokenPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserTokenPageResponseBody setModel(GetUserTokenPageResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetUserTokenPageResponseBodyModel getModel() {
        return this.model;
    }

    public GetUserTokenPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserTokenPageResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetUserTokenPageResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetUserTokenPageResponseBodyModel self = new GetUserTokenPageResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetUserTokenPageResponseBodyModel setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
