// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCnameResponseBody extends TeaModel {
    /**
     * <p>Details about the CNAME detection results.</p>
     */
    @NameInMap("CnameDatas")
    public DescribeDomainCnameResponseBodyCnameDatas cnameDatas;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06D29681-B7CD-4034-A8CC-28AFFA213539</p>
     */
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
        /**
         * <p>The CNAME assigned to the domain name by Alibaba Cloud CDN.</p>
         * 
         * <strong>example:</strong>
         * <p>a.com.w.alikunlun.net</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>a.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Passed")
        public String passed;

        /**
         * <p>The CNAME detection result. Valid values:</p>
         * <ul>
         * <li>0: The DNS can detect the CNAME assigned to the domain name.</li>
         * <li>Value other than 0: The DNS cannot detect the CNAME assigned to the domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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

        public DescribeDomainCnameResponseBodyCnameDatasData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeDomainCnameResponseBodyCnameDatasData setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
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
