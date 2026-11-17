// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressCompareIntlResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return result.</p>
     */
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
        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>all: Exactly the same.</li>
         * <li>prov: Province. </li>
         * <li>city: City.</li>
         * <li>district: District.</li>
         * <li>town: Town.</li>
         * <li>road: Road.</li>
         * <li>roadno: Road number.</li>
         * <li>poi: Residential community.</li>
         * <li>roomno: Room number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *      sameLevel: &quot;city&quot;, 
         *      distance:  5997.34m, -- Distance between addresses
         *      same_info: {    -- Identical information
         *               prov: &quot;Zhejiang Province&quot;,
         *               city: &quot;Hangzhou&quot;,
         *               district: &quot;Xihu District&quot;
         *       } 
         * }</p>
         */
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
