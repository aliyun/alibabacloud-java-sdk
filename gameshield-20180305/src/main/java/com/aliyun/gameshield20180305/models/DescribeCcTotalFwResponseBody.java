// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcTotalFwResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("FwTotalInfoList")
    public java.util.List<DescribeCcTotalFwResponseBodyFwTotalInfoList> fwTotalInfoList;

    public static DescribeCcTotalFwResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcTotalFwResponseBody self = new DescribeCcTotalFwResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcTotalFwResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcTotalFwResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeCcTotalFwResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeCcTotalFwResponseBody setFwTotalInfoList(java.util.List<DescribeCcTotalFwResponseBodyFwTotalInfoList> fwTotalInfoList) {
        this.fwTotalInfoList = fwTotalInfoList;
        return this;
    }
    public java.util.List<DescribeCcTotalFwResponseBodyFwTotalInfoList> getFwTotalInfoList() {
        return this.fwTotalInfoList;
    }

    public static class DescribeCcTotalFwResponseBodyFwTotalInfoList extends TeaModel {
        @NameInMap("InWhiteList")
        public Boolean inWhiteList;

        @NameInMap("Time")
        public Long time;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("AttackType")
        public String attackType;

        @NameInMap("InBlackList")
        public Boolean inBlackList;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("SourceLocation")
        public String sourceLocation;

        public static DescribeCcTotalFwResponseBodyFwTotalInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcTotalFwResponseBodyFwTotalInfoList self = new DescribeCcTotalFwResponseBodyFwTotalInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeCcTotalFwResponseBodyFwTotalInfoList setInWhiteList(Boolean inWhiteList) {
            this.inWhiteList = inWhiteList;
            return this;
        }
        public Boolean getInWhiteList() {
            return this.inWhiteList;
        }

        public DescribeCcTotalFwResponseBodyFwTotalInfoList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeCcTotalFwResponseBodyFwTotalInfoList setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeCcTotalFwResponseBodyFwTotalInfoList setAttackType(String attackType) {
            this.attackType = attackType;
            return this;
        }
        public String getAttackType() {
            return this.attackType;
        }

        public DescribeCcTotalFwResponseBodyFwTotalInfoList setInBlackList(Boolean inBlackList) {
            this.inBlackList = inBlackList;
            return this;
        }
        public Boolean getInBlackList() {
            return this.inBlackList;
        }

        public DescribeCcTotalFwResponseBodyFwTotalInfoList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeCcTotalFwResponseBodyFwTotalInfoList setSourceLocation(String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }
        public String getSourceLocation() {
            return this.sourceLocation;
        }

    }

}
