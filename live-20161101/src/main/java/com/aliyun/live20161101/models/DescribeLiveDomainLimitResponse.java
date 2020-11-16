// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainLimitResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveDomainLimitList")
    @Validation(required = true)
    public DescribeLiveDomainLimitResponseLiveDomainLimitList liveDomainLimitList;

    public static DescribeLiveDomainLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainLimitResponse self = new DescribeLiveDomainLimitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainLimitResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainLimitResponse setLiveDomainLimitList(DescribeLiveDomainLimitResponseLiveDomainLimitList liveDomainLimitList) {
        this.liveDomainLimitList = liveDomainLimitList;
        return this;
    }
    public DescribeLiveDomainLimitResponseLiveDomainLimitList getLiveDomainLimitList() {
        return this.liveDomainLimitList;
    }

    public static class DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("LimitNum")
        @Validation(required = true)
        public Integer limitNum;

        @NameInMap("LimitTranscodeNum")
        @Validation(required = true)
        public Integer limitTranscodeNum;

        public static DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit self = new DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit setLimitNum(Integer limitNum) {
            this.limitNum = limitNum;
            return this;
        }
        public Integer getLimitNum() {
            return this.limitNum;
        }

        public DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit setLimitTranscodeNum(Integer limitTranscodeNum) {
            this.limitTranscodeNum = limitTranscodeNum;
            return this;
        }
        public Integer getLimitTranscodeNum() {
            return this.limitTranscodeNum;
        }

    }

    public static class DescribeLiveDomainLimitResponseLiveDomainLimitList extends TeaModel {
        @NameInMap("LiveDomainLimit")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit> liveDomainLimit;

        public static DescribeLiveDomainLimitResponseLiveDomainLimitList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainLimitResponseLiveDomainLimitList self = new DescribeLiveDomainLimitResponseLiveDomainLimitList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainLimitResponseLiveDomainLimitList setLiveDomainLimit(java.util.List<DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit> liveDomainLimit) {
            this.liveDomainLimit = liveDomainLimit;
            return this;
        }
        public java.util.List<DescribeLiveDomainLimitResponseLiveDomainLimitListLiveDomainLimit> getLiveDomainLimit() {
            return this.liveDomainLimit;
        }

    }

}
