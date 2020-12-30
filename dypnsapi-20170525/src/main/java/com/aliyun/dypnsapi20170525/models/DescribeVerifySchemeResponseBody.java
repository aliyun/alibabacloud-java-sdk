// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DescribeVerifySchemeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("SchemeQueryResultDTO")
    public DescribeVerifySchemeResponseBodySchemeQueryResultDTO schemeQueryResultDTO;

    public static DescribeVerifySchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySchemeResponseBody self = new DescribeVerifySchemeResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeVerifySchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVerifySchemeResponseBody setSchemeQueryResultDTO(DescribeVerifySchemeResponseBodySchemeQueryResultDTO schemeQueryResultDTO) {
        this.schemeQueryResultDTO = schemeQueryResultDTO;
        return this;
    }
    public DescribeVerifySchemeResponseBodySchemeQueryResultDTO getSchemeQueryResultDTO() {
        return this.schemeQueryResultDTO;
    }

    public static class DescribeVerifySchemeResponseBodySchemeQueryResultDTO extends TeaModel {
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
