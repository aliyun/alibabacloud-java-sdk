// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCnameResponseBody extends TeaModel {
    @NameInMap("CnameDatas")
    public DescribeDomainCnameResponseBodyCnameDatas cnameDatas;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCnameResponseBody self = new DescribeDomainCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCnameResponseBody setCnameDatas(DescribeDomainCnameResponseBodyCnameDatas cnameDatas) {
        this.cnameDatas = cnameDatas;
        return this;
    }
    public DescribeDomainCnameResponseBodyCnameDatas getCnameDatas() {
        return this.cnameDatas;
    }

    public DescribeDomainCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainCnameResponseBodyCnameDatasData extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Status")
        public Integer status;

        public static DescribeDomainCnameResponseBodyCnameDatasData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainCnameResponseBodyCnameDatasData self = new DescribeDomainCnameResponseBodyCnameDatasData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainCnameResponseBodyCnameDatasData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainCnameResponseBodyCnameDatasData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainCnameResponseBodyCnameDatasData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeDomainCnameResponseBodyCnameDatas extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DescribeDomainCnameResponseBodyCnameDatasData> data;

        public static DescribeDomainCnameResponseBodyCnameDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainCnameResponseBodyCnameDatas self = new DescribeDomainCnameResponseBodyCnameDatas();
            return TeaModel.build(map, self);
        }

        public DescribeDomainCnameResponseBodyCnameDatas setData(java.util.List<DescribeDomainCnameResponseBodyCnameDatasData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeDomainCnameResponseBodyCnameDatasData> getData() {
            return this.data;
        }

    }

}
