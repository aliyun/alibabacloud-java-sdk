// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class TwoElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The request is successful.</li>
     * <li>For more information, see Error codes in this documentation.</li>
     * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number or name at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public TwoElementsVerificationResponseBodyData data;

    /**
     * <p>The returned message.</p>
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
         * <p>The basic carriers. Valid values:</p>
         * <ul>
         * <li><strong>China Mobile</strong></li>
         * <li><strong>China Unicom</strong></li>
         * <li><strong>China Telecom</strong></li>
         * </ul>
         * <blockquote>
         * <p> You are not allowed to verify numbers assigned by China Broadnet.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>China Mobile</p>
         */
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        /**
         * <p>Indicates whether the specified name and phone number belong to the same user. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: The specified name and phone number belong to the same user.</p>
         * </li>
         * <li><p><strong>0</strong>: The specified name and phone number do not belong to the same user.</p>
         * </li>
         * <li><p><strong>2</strong>: The specified name and phone number cannot be found.</p>
         * </li>
         * </ul>
         * <p>The phone number registration data of a user is usually updated one or three days after registration. The registration data can be queried only after the update. The following table shows the verification results under different phone number states.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Carrier/Phone number state</th>
         * <th>Out-of-service</th>
         * <th>Nonexistent</th>
         * <th>Canceled</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>China Mobile</td>
         * <td>Verifications can be carried out normally.</td>
         * <td>The specified name and phone number cannot be found.</td>
         * <td>The specified name and phone number cannot be found.</td>
         * </tr>
         * <tr>
         * <td>China Unicom</td>
         * <td>Verifications can be carried out normally.</td>
         * <td>The specified name and phone number do not belong to the same user.</td>
         * <td>The specified name and phone number do not belong to the same user.</td>
         * </tr>
         * <tr>
         * <td>China Telecom</td>
         * <td>Verifications can be carried out normally.</td>
         * <td>The specified name and phone number cannot be found.</td>
         * <td>The specified name and phone number cannot be found.</td>
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
