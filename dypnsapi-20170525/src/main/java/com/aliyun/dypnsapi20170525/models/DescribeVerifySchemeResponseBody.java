// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DescribeVerifySchemeResponseBody extends TeaModel {
    /**
     * <p>The response code. OK indicates that the request is successful. For more information about other error codes, see [API response codes](~~85198~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("SchemeQueryResultDTO")
    public DescribeVerifySchemeResponseBodySchemeQueryResultDTO schemeQueryResultDTO;

    public static DescribeVerifySchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySchemeResponseBody self = new DescribeVerifySchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVerifySchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVerifySchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifySchemeResponseBody setSchemeQueryResultDTO(DescribeVerifySchemeResponseBodySchemeQueryResultDTO schemeQueryResultDTO) {
        this.schemeQueryResultDTO = schemeQueryResultDTO;
        return this;
    }
    public DescribeVerifySchemeResponseBodySchemeQueryResultDTO getSchemeQueryResultDTO() {
        return this.schemeQueryResultDTO;
    }

    public static class DescribeVerifySchemeResponseBodySchemeQueryResultDTO extends TeaModel {
        /**
         * <p>The key generated when you create a service in the console.</p>
         */
        @NameInMap("AppEncryptInfo")
        public String appEncryptInfo;

        public static DescribeVerifySchemeResponseBodySchemeQueryResultDTO build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifySchemeResponseBodySchemeQueryResultDTO self = new DescribeVerifySchemeResponseBodySchemeQueryResultDTO();
            return TeaModel.build(map, self);
        }

        public DescribeVerifySchemeResponseBodySchemeQueryResultDTO setAppEncryptInfo(String appEncryptInfo) {
            this.appEncryptInfo = appEncryptInfo;
            return this;
        }
        public String getAppEncryptInfo() {
            return this.appEncryptInfo;
        }

    }

}
