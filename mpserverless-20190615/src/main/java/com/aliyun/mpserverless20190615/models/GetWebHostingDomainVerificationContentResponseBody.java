// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingDomainVerificationContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetWebHostingDomainVerificationContentResponseBodyData data;

    public static GetWebHostingDomainVerificationContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingDomainVerificationContentResponseBody self = new GetWebHostingDomainVerificationContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebHostingDomainVerificationContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebHostingDomainVerificationContentResponseBody setData(GetWebHostingDomainVerificationContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWebHostingDomainVerificationContentResponseBodyData getData() {
        return this.data;
    }

    public static class GetWebHostingDomainVerificationContentResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Domain")
        public String domain;

        public static GetWebHostingDomainVerificationContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWebHostingDomainVerificationContentResponseBodyData self = new GetWebHostingDomainVerificationContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWebHostingDomainVerificationContentResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetWebHostingDomainVerificationContentResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
