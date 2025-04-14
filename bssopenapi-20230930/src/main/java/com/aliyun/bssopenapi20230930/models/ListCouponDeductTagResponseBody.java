// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListCouponDeductTagResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListCouponDeductTagResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCouponDeductTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCouponDeductTagResponseBody self = new ListCouponDeductTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCouponDeductTagResponseBody setData(java.util.List<ListCouponDeductTagResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCouponDeductTagResponseBodyData> getData() {
        return this.data;
    }

    public ListCouponDeductTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCouponDeductTagResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListCouponDeductTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCouponDeductTagResponseBodyData self = new ListCouponDeductTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCouponDeductTagResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListCouponDeductTagResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
