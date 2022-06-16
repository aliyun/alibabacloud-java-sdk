// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class TwoElementsVerificationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<TwoElementsVerificationResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static TwoElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TwoElementsVerificationResponseBody self = new TwoElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public TwoElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TwoElementsVerificationResponseBody setData(java.util.List<TwoElementsVerificationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TwoElementsVerificationResponseBodyData> getData() {
        return this.data;
    }

    public TwoElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TwoElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TwoElementsVerificationResponseBodyData extends TeaModel {
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        @NameInMap("IsConsistent")
        public Integer isConsistent;

        public static TwoElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TwoElementsVerificationResponseBodyData self = new TwoElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TwoElementsVerificationResponseBodyData setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public TwoElementsVerificationResponseBodyData setIsConsistent(Integer isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

    }

}
