// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeBizChainStatInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeBizChainStatInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeBizChainStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizChainStatInfoResponseBody self = new DescribeBizChainStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizChainStatInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBizChainStatInfoResponseBody setData(java.util.List<DescribeBizChainStatInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBizChainStatInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBizChainStatInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBizChainStatInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBizChainStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBizChainStatInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBizChainStatInfoResponseBodyData extends TeaModel {
        @NameInMap("BizChainName")
        public String bizChainName;

        @NameInMap("UsedCount")
        public Long usedCount;

        public static DescribeBizChainStatInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizChainStatInfoResponseBodyData self = new DescribeBizChainStatInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBizChainStatInfoResponseBodyData setBizChainName(String bizChainName) {
            this.bizChainName = bizChainName;
            return this;
        }
        public String getBizChainName() {
            return this.bizChainName;
        }

        public DescribeBizChainStatInfoResponseBodyData setUsedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Long getUsedCount() {
            return this.usedCount;
        }

    }

}
