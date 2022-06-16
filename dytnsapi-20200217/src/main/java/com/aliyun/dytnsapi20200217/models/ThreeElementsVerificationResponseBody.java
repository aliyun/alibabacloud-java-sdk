// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ThreeElementsVerificationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ThreeElementsVerificationResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ThreeElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ThreeElementsVerificationResponseBody self = new ThreeElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ThreeElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ThreeElementsVerificationResponseBody setData(java.util.List<ThreeElementsVerificationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ThreeElementsVerificationResponseBodyData> getData() {
        return this.data;
    }

    public ThreeElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ThreeElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ThreeElementsVerificationResponseBodyData extends TeaModel {
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        @NameInMap("IsConsistent")
        public Integer isConsistent;

        public static ThreeElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ThreeElementsVerificationResponseBodyData self = new ThreeElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ThreeElementsVerificationResponseBodyData setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public ThreeElementsVerificationResponseBodyData setIsConsistent(Integer isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

    }

}
