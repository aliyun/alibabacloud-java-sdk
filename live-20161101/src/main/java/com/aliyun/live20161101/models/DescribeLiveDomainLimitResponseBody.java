// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainLimitResponseBody extends TeaModel {
    /**
     * <p>The limits.</p>
     */
    @NameInMap("LiveDomainLimitList")
    public DescribeLiveDomainLimitResponseBodyLiveDomainLimitList liveDomainLimitList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainLimitResponseBody self = new DescribeLiveDomainLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainLimitResponseBody setLiveDomainLimitList(DescribeLiveDomainLimitResponseBodyLiveDomainLimitList liveDomainLimitList) {
        this.liveDomainLimitList = liveDomainLimitList;
        return this;
    }
    public DescribeLiveDomainLimitResponseBodyLiveDomainLimitList getLiveDomainLimitList() {
        return this.liveDomainLimitList;
    }

    public DescribeLiveDomainLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit extends TeaModel {
        /**
         * <p>The current number of ingested streams.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CurrentNum")
        public Integer currentNum;

        /**
         * <p>The current number of transcoded streams.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CurrentTranscodeNum")
        public Integer currentTranscodeNum;

        /**
         * <p>The current number of streams relayed from the live center.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CurrentTransferNum")
        public Integer currentTransferNum;

        /**
         * <p>The name of the queried main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The maximum number of ingested streams.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LimitNum")
        public Integer limitNum;

        /**
         * <p>The maximum number of transcoded streams.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("LimitTranscodeNum")
        public Integer limitTranscodeNum;

        /**
         * <p>The maximum allowed number of streams relayed from the live center.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("LimitTransferNum")
        public Integer limitTransferNum;

        public static DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit self = new DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit setCurrentNum(Integer currentNum) {
            this.currentNum = currentNum;
            return this;
        }
        public Integer getCurrentNum() {
            return this.currentNum;
        }

        public DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit setCurrentTranscodeNum(Integer currentTranscodeNum) {
            this.currentTranscodeNum = currentTranscodeNum;
            return this;
        }
        public Integer getCurrentTranscodeNum() {
            return this.currentTranscodeNum;
        }

        public DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit setCurrentTransferNum(Integer currentTransferNum) {
            this.currentTransferNum = currentTransferNum;
            return this;
        }
        public Integer getCurrentTransferNum() {
            return this.currentTransferNum;
        }

        public DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit setLimitNum(Integer limitNum) {
            this.limitNum = limitNum;
            return this;
        }
        public Integer getLimitNum() {
            return this.limitNum;
        }

        public DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit setLimitTranscodeNum(Integer limitTranscodeNum) {
            this.limitTranscodeNum = limitTranscodeNum;
            return this;
        }
        public Integer getLimitTranscodeNum() {
            return this.limitTranscodeNum;
        }

        public DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit setLimitTransferNum(Integer limitTransferNum) {
            this.limitTransferNum = limitTransferNum;
            return this;
        }
        public Integer getLimitTransferNum() {
            return this.limitTransferNum;
        }

    }

    public static class DescribeLiveDomainLimitResponseBodyLiveDomainLimitList extends TeaModel {
        @NameInMap("LiveDomainLimit")
        public java.util.List<DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit> liveDomainLimit;

        public static DescribeLiveDomainLimitResponseBodyLiveDomainLimitList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainLimitResponseBodyLiveDomainLimitList self = new DescribeLiveDomainLimitResponseBodyLiveDomainLimitList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainLimitResponseBodyLiveDomainLimitList setLiveDomainLimit(java.util.List<DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit> liveDomainLimit) {
            this.liveDomainLimit = liveDomainLimit;
            return this;
        }
        public java.util.List<DescribeLiveDomainLimitResponseBodyLiveDomainLimitListLiveDomainLimit> getLiveDomainLimit() {
            return this.liveDomainLimit;
        }

    }

}
