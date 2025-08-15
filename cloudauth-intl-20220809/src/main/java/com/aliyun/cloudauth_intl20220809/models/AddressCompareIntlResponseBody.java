// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressCompareIntlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddressCompareIntlResponseBodyResult result;

    public static AddressCompareIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddressCompareIntlResponseBody self = new AddressCompareIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public AddressCompareIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddressCompareIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddressCompareIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddressCompareIntlResponseBody setResult(AddressCompareIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddressCompareIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddressCompareIntlResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static AddressCompareIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddressCompareIntlResponseBodyResult self = new AddressCompareIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddressCompareIntlResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
