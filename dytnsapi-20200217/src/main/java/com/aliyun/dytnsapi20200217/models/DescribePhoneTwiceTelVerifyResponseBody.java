// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneTwiceTelVerifyResponseBody extends TeaModel {
    /**
     * <p>The request status code. Valid values:</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>PortabilityNumberNotSupported</strong>: Queries for this ported number are not supported.</p>
     * </li>
     * <li><p><strong>RequestNumberNotSupported</strong>: Queries are not supported for numbers from China Broadnet (starting with 192), mobile virtual network operators, and other unsupported carriers.</p>
     * </li>
     * <li><p><strong>RequestFrequencyLimit</strong>: Carriers limit frequent queries for the same number. If you receive this error code, try again later.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>A charge applies when the value of <code>Code</code> is <code>OK</code> and the value of <code>VerifyResult</code> is not <code>0</code>. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html">Phone Number Service pricing</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A data structure that contains the verification results.</p>
     */
    @NameInMap("Data")
    public DescribePhoneTwiceTelVerifyResponseBodyData data;

    /**
     * <p>A description of the returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. This common parameter is returned with each request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD135850177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneTwiceTelVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneTwiceTelVerifyResponseBody self = new DescribePhoneTwiceTelVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneTwiceTelVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setData(DescribePhoneTwiceTelVerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneTwiceTelVerifyResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneTwiceTelVerifyResponseBodyData extends TeaModel {
        /**
         * <p>The carrier that provides service for the number. Valid values:</p>
         * <ul>
         * <li><p><strong>CMCC</strong>: China Mobile.</p>
         * </li>
         * <li><p><strong>CUCC</strong>: China Unicom.</p>
         * </li>
         * <li><p><strong>CTCC</strong>: China Telecom.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The carrier that currently provides service for the number. For a ported number, this is the destination carrier.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The verification result. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Cannot be determined.</p>
         * </li>
         * <li><p><strong>1</strong>: The number is a recycled number.</p>
         * </li>
         * <li><p><strong>2</strong>: The number is not a recycled number.</p>
         * </li>
         * <li><p><strong>3</strong>: The number has been deactivated.</p>
         * </li>
         * <li><p><strong>4</strong>: Unknown: The number was transferred to a new owner.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static DescribePhoneTwiceTelVerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneTwiceTelVerifyResponseBodyData self = new DescribePhoneTwiceTelVerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneTwiceTelVerifyResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribePhoneTwiceTelVerifyResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
