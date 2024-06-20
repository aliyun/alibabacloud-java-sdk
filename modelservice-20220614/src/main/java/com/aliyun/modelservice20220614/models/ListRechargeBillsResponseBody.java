// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class ListRechargeBillsResponseBody extends TeaModel {
    @NameInMap("InstanseInfos")
    public java.util.List<ListRechargeBillsResponseBodyInstanseInfos> instanseInfos;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResidueAmount")
    public Integer residueAmount;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRechargeBillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRechargeBillsResponseBody self = new ListRechargeBillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRechargeBillsResponseBody setInstanseInfos(java.util.List<ListRechargeBillsResponseBodyInstanseInfos> instanseInfos) {
        this.instanseInfos = instanseInfos;
        return this;
    }
    public java.util.List<ListRechargeBillsResponseBodyInstanseInfos> getInstanseInfos() {
        return this.instanseInfos;
    }

    public ListRechargeBillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRechargeBillsResponseBody setResidueAmount(Integer residueAmount) {
        this.residueAmount = residueAmount;
        return this;
    }
    public Integer getResidueAmount() {
        return this.residueAmount;
    }

    public ListRechargeBillsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRechargeBillsResponseBodyInstanseInfos extends TeaModel {
        @NameInMap("CurrTimes")
        public Integer currTimes;

        @NameInMap("GmtEndTime")
        public String gmtEndTime;

        @NameInMap("InitTimes")
        public Integer initTimes;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Source")
        public String source;

        public static ListRechargeBillsResponseBodyInstanseInfos build(java.util.Map<String, ?> map) throws Exception {
            ListRechargeBillsResponseBodyInstanseInfos self = new ListRechargeBillsResponseBodyInstanseInfos();
            return TeaModel.build(map, self);
        }

        public ListRechargeBillsResponseBodyInstanseInfos setCurrTimes(Integer currTimes) {
            this.currTimes = currTimes;
            return this;
        }
        public Integer getCurrTimes() {
            return this.currTimes;
        }

        public ListRechargeBillsResponseBodyInstanseInfos setGmtEndTime(String gmtEndTime) {
            this.gmtEndTime = gmtEndTime;
            return this;
        }
        public String getGmtEndTime() {
            return this.gmtEndTime;
        }

        public ListRechargeBillsResponseBodyInstanseInfos setInitTimes(Integer initTimes) {
            this.initTimes = initTimes;
            return this;
        }
        public Integer getInitTimes() {
            return this.initTimes;
        }

        public ListRechargeBillsResponseBodyInstanseInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRechargeBillsResponseBodyInstanseInfos setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
