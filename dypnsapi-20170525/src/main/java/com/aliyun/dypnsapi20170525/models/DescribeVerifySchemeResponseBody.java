// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DescribeVerifySchemeResponseBody extends TeaModel {
    /**
     * <p>The response code. OK indicates that the request is successful. For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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
     * <p>0C5380A7-2032-5F7D-9614-1BF8B54D16CB</p>
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
         * 
         * <strong>example:</strong>
         * <p>ZDMARqPkyQzWVJjB/sB/+fCp5TA4lNsRnY7rEC+HfGsOIOk1Brj8UyXFW2RBYIWqLieCSo8ZypEaEj+h9rLd3FgpXAjGYDfmOperod6jPUUwFHhBObxK+HuKVoi2jOqN7aDOlyPyGcATyq3BDdlf922JmnFLT8Hvnu4qgzzCZk0LXWTb0XVPnm5/fHUGHEA2Q+aTrGkaWcHjmTDqQ7BtvrAIIcJJkCJu4i1aeU++/0EzGWap4mcb2VhKROBs****</p>
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
