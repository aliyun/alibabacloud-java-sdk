// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeEmptyNumberResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The request is successful.</li>
     * <li><strong>InvalidPhoneNumber.Check</strong>: The phone number is invalid.</li>
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
    public DescribeEmptyNumberResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID. It is a common parameter and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEmptyNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmptyNumberResponseBody self = new DescribeEmptyNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmptyNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEmptyNumberResponseBody setData(DescribeEmptyNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEmptyNumberResponseBodyData getData() {
        return this.data;
    }

    public DescribeEmptyNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEmptyNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEmptyNumberResponseBodyData extends TeaModel {
        /**
         * <p>The specified phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>189****1234</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The returned status for the queried phone number. Valid values:</p>
         * <ul>
         * <li><strong>EMPTY</strong>: The queried phone number is a nonexistent number.</li>
         * <li><strong>NORMAL</strong>: The queried phone number is valid.</li>
         * <li><strong>SUSPECT_EMPTY</strong>: The queried phone number is suspected to be a nonexistent number.</li>
         * <li><strong>UNKNOWN</strong>: The queried phone number is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EMPTY</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEmptyNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmptyNumberResponseBodyData self = new DescribeEmptyNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEmptyNumberResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeEmptyNumberResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
