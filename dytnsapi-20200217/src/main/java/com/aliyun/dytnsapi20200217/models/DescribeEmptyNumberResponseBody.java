// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeEmptyNumberResponseBody extends TeaModel {
    /**
     * <p>返回状态码。取值：</p>
     * <ul>
     * <li><p><strong>OK</strong>：成功。</p>
     * </li>
     * <li><p><strong>InvalidPhoneNumber.Check</strong>：手机号非法。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回结果。</p>
     */
    @NameInMap("Data")
    public DescribeEmptyNumberResponseBodyData data;

    /**
     * <p>状态码的描述。</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>公共参数，每个请求返回的ID都是唯一的，可用于排查和定位问题。</p>
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
         * <p>传入的手机号。</p>
         * 
         * <strong>example:</strong>
         * <p>189****1234</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>检测手机号返回状态。取值：</p>
         * <ul>
         * <li><p><strong>EMPTY</strong>：空号。</p>
         * </li>
         * <li><p><strong>NORMAL</strong>：正常。</p>
         * </li>
         * <li><p><strong>SUSPECT_EMPTY</strong>：疑似空号。</p>
         * </li>
         * <li><p><strong>UNKNOWN</strong>：未知。</p>
         * </li>
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
