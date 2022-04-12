// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AdaptCreateServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AdaptCreateServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AdaptCreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdaptCreateServiceResponseBody self = new AdaptCreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AdaptCreateServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AdaptCreateServiceResponseBody setData(AdaptCreateServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AdaptCreateServiceResponseBodyData getData() {
        return this.data;
    }

    public AdaptCreateServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AdaptCreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AdaptCreateServiceResponseBodyData extends TeaModel {
        @NameInMap("AdaptApplyId")
        public Long adaptApplyId;

        public static AdaptCreateServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AdaptCreateServiceResponseBodyData self = new AdaptCreateServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AdaptCreateServiceResponseBodyData setAdaptApplyId(Long adaptApplyId) {
            this.adaptApplyId = adaptApplyId;
            return this;
        }
        public Long getAdaptApplyId() {
            return this.adaptApplyId;
        }

    }

}
