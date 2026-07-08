// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class VirtualThreeElementsVerificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public VirtualThreeElementsVerificationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static VirtualThreeElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VirtualThreeElementsVerificationResponseBody self = new VirtualThreeElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public VirtualThreeElementsVerificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public VirtualThreeElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VirtualThreeElementsVerificationResponseBody setData(VirtualThreeElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VirtualThreeElementsVerificationResponseBodyData getData() {
        return this.data;
    }

    public VirtualThreeElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VirtualThreeElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VirtualThreeElementsVerificationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("IsConsistent")
        public Long isConsistent;

        public static VirtualThreeElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VirtualThreeElementsVerificationResponseBodyData self = new VirtualThreeElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VirtualThreeElementsVerificationResponseBodyData setIsConsistent(Long isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Long getIsConsistent() {
            return this.isConsistent;
        }

    }

}
