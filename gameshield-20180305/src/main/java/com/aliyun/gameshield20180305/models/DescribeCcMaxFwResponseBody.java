// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcMaxFwResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FwMaxInfoList")
    public java.util.List<DescribeCcMaxFwResponseBodyFwMaxInfoList> fwMaxInfoList;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeCcMaxFwResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcMaxFwResponseBody self = new DescribeCcMaxFwResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcMaxFwResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcMaxFwResponseBody setFwMaxInfoList(java.util.List<DescribeCcMaxFwResponseBodyFwMaxInfoList> fwMaxInfoList) {
        this.fwMaxInfoList = fwMaxInfoList;
        return this;
    }
    public java.util.List<DescribeCcMaxFwResponseBodyFwMaxInfoList> getFwMaxInfoList() {
        return this.fwMaxInfoList;
    }

    public DescribeCcMaxFwResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeCcMaxFwResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeCcMaxFwResponseBodyFwMaxInfoList extends TeaModel {
        @NameInMap("InWhiteList")
        public Boolean inWhiteList;

        @NameInMap("Time")
        public Long time;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("DestPort")
        public Integer destPort;

        @NameInMap("Action")
        public Integer action;

        @NameInMap("Protocol")
        public Integer protocol;

        @NameInMap("InBlackList")
        public Boolean inBlackList;

        @NameInMap("Count")
        public Integer count;

        public static DescribeCcMaxFwResponseBodyFwMaxInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcMaxFwResponseBodyFwMaxInfoList self = new DescribeCcMaxFwResponseBodyFwMaxInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeCcMaxFwResponseBodyFwMaxInfoList setInWhiteList(Boolean inWhiteList) {
            this.inWhiteList = inWhiteList;
            return this;
        }
        public Boolean getInWhiteList() {
            return this.inWhiteList;
        }

        public DescribeCcMaxFwResponseBodyFwMaxInfoList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeCcMaxFwResponseBodyFwMaxInfoList setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeCcMaxFwResponseBodyFwMaxInfoList setDestPort(Integer destPort) {
            this.destPort = destPort;
            return this;
        }
        public Integer getDestPort() {
            return this.destPort;
        }

        public DescribeCcMaxFwResponseBodyFwMaxInfoList setAction(Integer action) {
            this.action = action;
            return this;
        }
        public Integer getAction() {
            return this.action;
        }

        public DescribeCcMaxFwResponseBodyFwMaxInfoList setProtocol(Integer protocol) {
            this.protocol = protocol;
            return this;
        }
        public Integer getProtocol() {
            return this.protocol;
        }

        public DescribeCcMaxFwResponseBodyFwMaxInfoList setInBlackList(Boolean inBlackList) {
            this.inBlackList = inBlackList;
            return this;
        }
        public Boolean getInBlackList() {
            return this.inBlackList;
        }

        public DescribeCcMaxFwResponseBodyFwMaxInfoList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
