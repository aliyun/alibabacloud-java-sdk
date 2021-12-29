// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberBizChainStatInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeMemberBizChainStatInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMemberBizChainStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberBizChainStatInfoResponseBody self = new DescribeMemberBizChainStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMemberBizChainStatInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMemberBizChainStatInfoResponseBody setData(java.util.List<DescribeMemberBizChainStatInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMemberBizChainStatInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMemberBizChainStatInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeMemberBizChainStatInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMemberBizChainStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMemberBizChainStatInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMemberBizChainStatInfoResponseBodyData extends TeaModel {
        @NameInMap("BizChainName")
        public String bizChainName;

        @NameInMap("UsedCount")
        public Long usedCount;

        public static DescribeMemberBizChainStatInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMemberBizChainStatInfoResponseBodyData self = new DescribeMemberBizChainStatInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMemberBizChainStatInfoResponseBodyData setBizChainName(String bizChainName) {
            this.bizChainName = bizChainName;
            return this;
        }
        public String getBizChainName() {
            return this.bizChainName;
        }

        public DescribeMemberBizChainStatInfoResponseBodyData setUsedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Long getUsedCount() {
            return this.usedCount;
        }

    }

}
