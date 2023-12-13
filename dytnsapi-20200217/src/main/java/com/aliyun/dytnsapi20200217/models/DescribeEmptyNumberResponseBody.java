// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeEmptyNumberResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   **InvalidPhoneNumber.Check**: The phone number is invalid.</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID. It is a common parameter and can be used to troubleshoot issues.</p>
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
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The returned status for the queried phone number. Valid values:</p>
         * <br>
         * <p>*   **EMPTY**: The queried phone number is a nonexistent number.</p>
         * <p>*   **NORMAL**: The queried phone number is valid.</p>
         * <p>*   **SUSPECT_EMPTY**: The queried phone number is suspected to be a nonexistent number.</p>
         * <p>*   **UNKNOWN**: The queried phone number is unknown.</p>
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
