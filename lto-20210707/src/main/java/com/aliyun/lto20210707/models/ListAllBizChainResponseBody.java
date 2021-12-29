// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllBizChainResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllBizChainResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllBizChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllBizChainResponseBody self = new ListAllBizChainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllBizChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllBizChainResponseBody setData(java.util.List<ListAllBizChainResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllBizChainResponseBodyData> getData() {
        return this.data;
    }

    public ListAllBizChainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllBizChainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllBizChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllBizChainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllBizChainResponseBodyData extends TeaModel {
        @NameInMap("BizChainId")
        public String bizChainId;

        @NameInMap("Name")
        public String name;

        @NameInMap("UsedOnchainCount")
        public Long usedOnchainCount;

        public static ListAllBizChainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllBizChainResponseBodyData self = new ListAllBizChainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllBizChainResponseBodyData setBizChainId(String bizChainId) {
            this.bizChainId = bizChainId;
            return this;
        }
        public String getBizChainId() {
            return this.bizChainId;
        }

        public ListAllBizChainResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllBizChainResponseBodyData setUsedOnchainCount(Long usedOnchainCount) {
            this.usedOnchainCount = usedOnchainCount;
            return this;
        }
        public Long getUsedOnchainCount() {
            return this.usedOnchainCount;
        }

    }

}
