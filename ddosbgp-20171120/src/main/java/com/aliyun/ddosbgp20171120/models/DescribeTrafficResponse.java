// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeTrafficResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FlowList")
    @Validation(required = true)
    public java.util.List<DescribeTrafficResponseFlowList> flowList;

    public static DescribeTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficResponse self = new DescribeTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrafficResponse setFlowList(java.util.List<DescribeTrafficResponseFlowList> flowList) {
        this.flowList = flowList;
        return this;
    }
    public java.util.List<DescribeTrafficResponseFlowList> getFlowList() {
        return this.flowList;
    }

    public static class DescribeTrafficResponseFlowList extends TeaModel {
        @NameInMap("Pps")
        @Validation(required = true)
        public Integer pps;

        @NameInMap("FlowType")
        @Validation(required = true)
        public String flowType;

        @NameInMap("Kbps")
        @Validation(required = true)
        public Integer kbps;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Time")
        @Validation(required = true)
        public Integer time;

        public static DescribeTrafficResponseFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficResponseFlowList self = new DescribeTrafficResponseFlowList();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficResponseFlowList setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeTrafficResponseFlowList setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public DescribeTrafficResponseFlowList setKbps(Integer kbps) {
            this.kbps = kbps;
            return this;
        }
        public Integer getKbps() {
            return this.kbps;
        }

        public DescribeTrafficResponseFlowList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTrafficResponseFlowList setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

    }

}
