// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetIdentificationResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetIdentificationResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD135850177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIdentificationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentificationResultResponseBody self = new GetIdentificationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentificationResultResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetIdentificationResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentificationResultResponseBody setData(GetIdentificationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentificationResultResponseBodyData getData() {
        return this.data;
    }

    public GetIdentificationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentificationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIdentificationResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsIdentified")
        public Boolean isIdentified;

        public static GetIdentificationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentificationResultResponseBodyData self = new GetIdentificationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentificationResultResponseBodyData setIsIdentified(Boolean isIdentified) {
            this.isIdentified = isIdentified;
            return this;
        }
        public Boolean getIsIdentified() {
            return this.isIdentified;
        }

    }

}
