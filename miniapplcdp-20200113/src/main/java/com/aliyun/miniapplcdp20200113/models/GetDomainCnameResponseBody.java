// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDomainCnameResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDomainCnameResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDomainCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainCnameResponseBody self = new GetDomainCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainCnameResponseBody setData(GetDomainCnameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDomainCnameResponseBodyData getData() {
        return this.data;
    }

    public GetDomainCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDomainCnameResponseBodyData extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        public static GetDomainCnameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDomainCnameResponseBodyData self = new GetDomainCnameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDomainCnameResponseBodyData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

    }

}
