// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCnameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CnameDatas")
    public DescribeDcdnDomainCnameResponseBodyCnameDatas cnameDatas;

    public static DescribeDcdnDomainCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCnameResponseBody self = new DescribeDcdnDomainCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainCnameResponseBody setCnameDatas(DescribeDcdnDomainCnameResponseBodyCnameDatas cnameDatas) {
        this.cnameDatas = cnameDatas;
        return this;
    }
    public DescribeDcdnDomainCnameResponseBodyCnameDatas getCnameDatas() {
        return this.cnameDatas;
    }

    public static class DescribeDcdnDomainCnameResponseBodyCnameDatasData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Cname")
        public String cname;

        public static DescribeDcdnDomainCnameResponseBodyCnameDatasData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainCnameResponseBodyCnameDatasData self = new DescribeDcdnDomainCnameResponseBodyCnameDatasData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainCnameResponseBodyCnameDatasData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDcdnDomainCnameResponseBodyCnameDatasData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnDomainCnameResponseBodyCnameDatasData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

    }

    public static class DescribeDcdnDomainCnameResponseBodyCnameDatas extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DescribeDcdnDomainCnameResponseBodyCnameDatasData> data;

        public static DescribeDcdnDomainCnameResponseBodyCnameDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainCnameResponseBodyCnameDatas self = new DescribeDcdnDomainCnameResponseBodyCnameDatas();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainCnameResponseBodyCnameDatas setData(java.util.List<DescribeDcdnDomainCnameResponseBodyCnameDatasData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeDcdnDomainCnameResponseBodyCnameDatasData> getData() {
            return this.data;
        }

    }

}
