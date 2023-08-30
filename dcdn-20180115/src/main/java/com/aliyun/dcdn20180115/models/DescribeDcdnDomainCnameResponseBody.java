// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCnameResponseBody extends TeaModel {
    /**
     * <p>The CNAME information.</p>
     */
    @NameInMap("CnameDatas")
    public DescribeDcdnDomainCnameResponseBodyCnameDatas cnameDatas;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCnameResponseBody self = new DescribeDcdnDomainCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCnameResponseBody setCnameDatas(DescribeDcdnDomainCnameResponseBodyCnameDatas cnameDatas) {
        this.cnameDatas = cnameDatas;
        return this;
    }
    public DescribeDcdnDomainCnameResponseBodyCnameDatas getCnameDatas() {
        return this.cnameDatas;
    }

    public DescribeDcdnDomainCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainCnameResponseBodyCnameDatasData extends TeaModel {
        /**
         * <p>The CNAME assigned to the domain name.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The configuration status of the CNAME record. If the operation returns 0 for the parameter, the configuration was successful. Otherwise, the configuration failed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeDcdnDomainCnameResponseBodyCnameDatasData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainCnameResponseBodyCnameDatasData self = new DescribeDcdnDomainCnameResponseBodyCnameDatasData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainCnameResponseBodyCnameDatasData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDcdnDomainCnameResponseBodyCnameDatasData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnDomainCnameResponseBodyCnameDatasData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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
