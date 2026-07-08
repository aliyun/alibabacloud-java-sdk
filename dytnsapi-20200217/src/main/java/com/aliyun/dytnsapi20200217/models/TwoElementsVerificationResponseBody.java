// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class TwoElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request was successful.</p>
     * </li>
     * <li><p>For other error codes, see the error code table in this chapter.</p>
     * </li>
     * <li><p><strong>RequestFrequencyLimit</strong>: Due to operator restrictions, repeated high-frequency queries against the same number or name in a short period are prohibited. If this error code is returned, try again later.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The structure.</p>
     */
    @NameInMap("Data")
    public TwoElementsVerificationResponseBodyData data;

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
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE****</p>
     */
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

    public TwoElementsVerificationResponseBody setData(TwoElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TwoElementsVerificationResponseBodyData getData() {
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
        /**
         * <p>The basic operator. Valid values:</p>
         * <ul>
         * <li><p><strong>China Mobile</strong>.</p>
         * </li>
         * <li><p><strong>China Unicom</strong>.</p>
         * </li>
         * <li><p><strong>China Telecom</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: China Broadcasting Network numbers are not currently supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>中国移动</p>
         */
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        /**
         * <p>Indicates whether the verification result is consistent. Returns:</p>
         * <ul>
         * <li><p><strong>1</strong>: Consistent.</p>
         * </li>
         * <li><p><strong>0</strong>: Inconsistent.</p>
         * </li>
         * <li><p><strong>2</strong>: Not found.</p>
         * </li>
         * </ul>
         * <p>The data update timeliness for different operators and cities is typically T+1 to T+3.
         * The verification results for different operator phone numbers in different states are as follows: </p>
         * <table>
         * <thead>
         * <tr>
         * <th>Operator/Phone Number Status</th>
         * <th>Suspended</th>
         * <th>Empty Number</th>
         * <th>Cancelled</th>
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
