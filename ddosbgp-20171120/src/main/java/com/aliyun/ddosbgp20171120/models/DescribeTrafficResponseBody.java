// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeTrafficResponseBody extends TeaModel {
    @NameInMap("FlowList")
    public java.util.List<DescribeTrafficResponseBodyFlowList> flowList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficResponseBody self = new DescribeTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficResponseBody setFlowList(java.util.List<DescribeTrafficResponseBodyFlowList> flowList) {
        this.flowList = flowList;
        return this;
    }
    public java.util.List<DescribeTrafficResponseBodyFlowList> getFlowList() {
        return this.flowList;
    }

    public DescribeTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTrafficResponseBodyFlowList extends TeaModel {
        @NameInMap("FlowType")
        public String flowType;

        @NameInMap("Kbps")
        public Integer kbps;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pps")
        public Integer pps;

        @NameInMap("Time")
        public Integer time;

        public static DescribeTrafficResponseBodyFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficResponseBodyFlowList self = new DescribeTrafficResponseBodyFlowList();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficResponseBodyFlowList setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public DescribeTrafficResponseBodyFlowList setKbps(Integer kbps) {
            this.kbps = kbps;
            return this;
        }
        public Integer getKbps() {
            return this.kbps;
        }

        public DescribeTrafficResponseBodyFlowList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTrafficResponseBodyFlowList setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeTrafficResponseBodyFlowList setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

    }

}
