// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveDomainStatusResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 返回结果
    @NameInMap("Result")
    public GetLiveDomainStatusResponseBodyResult result;

    public static GetLiveDomainStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveDomainStatusResponseBody self = new GetLiveDomainStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveDomainStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveDomainStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLiveDomainStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLiveDomainStatusResponseBody setResult(GetLiveDomainStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLiveDomainStatusResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLiveDomainStatusResponseBodyResultLiveDomainInfoList extends TeaModel {
        // 直播域名
        @NameInMap("Domain")
        public String domain;

        // 直播域名CNAME
        @NameInMap("Cname")
        public String cname;

        // 直播域名状态
        @NameInMap("Status")
        public String status;

        public static GetLiveDomainStatusResponseBodyResultLiveDomainInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetLiveDomainStatusResponseBodyResultLiveDomainInfoList self = new GetLiveDomainStatusResponseBodyResultLiveDomainInfoList();
            return TeaModel.build(map, self);
        }

        public GetLiveDomainStatusResponseBodyResultLiveDomainInfoList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLiveDomainStatusResponseBodyResultLiveDomainInfoList setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public GetLiveDomainStatusResponseBodyResultLiveDomainInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetLiveDomainStatusResponseBodyResult extends TeaModel {
        // 直播域名信息列表
        @NameInMap("LiveDomainInfoList")
        public java.util.List<GetLiveDomainStatusResponseBodyResultLiveDomainInfoList> liveDomainInfoList;

        public static GetLiveDomainStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLiveDomainStatusResponseBodyResult self = new GetLiveDomainStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLiveDomainStatusResponseBodyResult setLiveDomainInfoList(java.util.List<GetLiveDomainStatusResponseBodyResultLiveDomainInfoList> liveDomainInfoList) {
            this.liveDomainInfoList = liveDomainInfoList;
            return this;
        }
        public java.util.List<GetLiveDomainStatusResponseBodyResultLiveDomainInfoList> getLiveDomainInfoList() {
            return this.liveDomainInfoList;
        }

    }

}
