// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetCnameDetailResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public GetCnameDetailResponseBodyResult result;

    public static GetCnameDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCnameDetailResponseBody self = new GetCnameDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCnameDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCnameDetailResponseBody setResult(GetCnameDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCnameDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetCnameDetailResponseBodyResultData extends TeaModel {
        // cname名称
        @NameInMap("Cname")
        public String cname;

        // 域名名称
        @NameInMap("DomainName")
        public String domainName;

        // cname的状态
        @NameInMap("Status")
        public Integer status;

        public static GetCnameDetailResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetCnameDetailResponseBodyResultData self = new GetCnameDetailResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetCnameDetailResponseBodyResultData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public GetCnameDetailResponseBodyResultData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetCnameDetailResponseBodyResultData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetCnameDetailResponseBodyResult extends TeaModel {
        // 应用列表信息
        @NameInMap("Data")
        public java.util.List<GetCnameDetailResponseBodyResultData> data;

        public static GetCnameDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCnameDetailResponseBodyResult self = new GetCnameDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCnameDetailResponseBodyResult setData(java.util.List<GetCnameDetailResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetCnameDetailResponseBodyResultData> getData() {
            return this.data;
        }

    }

}
