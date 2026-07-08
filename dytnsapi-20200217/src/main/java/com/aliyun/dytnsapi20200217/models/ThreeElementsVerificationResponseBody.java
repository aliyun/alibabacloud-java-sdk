// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ThreeElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><strong>OK</strong>: The request was successful.</li>
     * <li>For other error codes, see the error code table in this chapter.</li>
     * <li><strong>RequestFrequencyLimit</strong>: Due to carrier restrictions, repeated high-frequency queries on the same number within a short period are prohibited. If this error code is returned, try again later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ThreeElementsVerificationResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
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

    public ThreeElementsVerificationResponseBody setData(ThreeElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ThreeElementsVerificationResponseBodyData getData() {
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
        /**
         * <p>The basic carrier. Valid values:</p>
         * <ul>
         * <li><p><strong>China Mobile</strong>.</p>
         * </li>
         * <li><p><strong>China Unicom</strong>.</p>
         * </li>
         * <li><p><strong>China Telecom</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>中国移动</p>
         */
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        /**
         * <p>Indicates whether the verification results are consistent. Returned values:</p>
         * <ul>
         * <li><strong>1</strong>: Consistent</li>
         * <li><strong>0</strong>: Inconsistent</li>
         * <li><strong>2</strong>: Not found<blockquote>
         * <p>The data update timeliness varies by carrier and city, and is typically between T+1 and T+3.
         * The verification results for mobile phone numbers of different carriers in different states are as follows:</p>
         * </blockquote>
         * </li>
         * </ul>
         * <table>
         * <thead>
         * <tr>
         * <th>Carrier/Mobile Phone Number Status</th>
         * <th>Suspended</th>
         * <th>Empty Number</th>
         * <th>Deregistered</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>China Mobile</td>
         * <td>Normal verification</td>
         * <td>Not found</td>
         * <td>Not found</td>
         * </tr>
         * <tr>
         * <td>China Unicom</td>
         * <td>Normal verification</td>
         * <td>Inconsistent</td>
         * <td>Inconsistent</td>
         * </tr>
         * <tr>
         * <td>China Telecom</td>
         * <td>Normal verification</td>
         * <td>Not found</td>
         * <td>Not found</td>
         * </tr>
         * </tbody></table>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
