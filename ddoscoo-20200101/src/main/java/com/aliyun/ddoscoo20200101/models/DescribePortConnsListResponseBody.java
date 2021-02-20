// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortConnsListResponseBody extends TeaModel {
    @NameInMap("ConnsList")
    public java.util.List<DescribePortConnsListResponseBodyConnsList> connsList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortConnsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortConnsListResponseBody self = new DescribePortConnsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortConnsListResponseBody setConnsList(java.util.List<DescribePortConnsListResponseBodyConnsList> connsList) {
        this.connsList = connsList;
        return this;
    }
    public java.util.List<DescribePortConnsListResponseBodyConnsList> getConnsList() {
        return this.connsList;
    }

    public DescribePortConnsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortConnsListResponseBodyConnsList extends TeaModel {
        @NameInMap("ActConns")
        public Long actConns;

        @NameInMap("InActConns")
        public Long inActConns;

        @NameInMap("Index")
        public Long index;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Cps")
        public Long cps;

        @NameInMap("Conns")
        public Long conns;

        public static DescribePortConnsListResponseBodyConnsList build(java.util.Map<String, ?> map) throws Exception {
            DescribePortConnsListResponseBodyConnsList self = new DescribePortConnsListResponseBodyConnsList();
            return TeaModel.build(map, self);
        }

        public DescribePortConnsListResponseBodyConnsList setActConns(Long actConns) {
            this.actConns = actConns;
            return this;
        }
        public Long getActConns() {
            return this.actConns;
        }

        public DescribePortConnsListResponseBodyConnsList setInActConns(Long inActConns) {
            this.inActConns = inActConns;
            return this;
        }
        public Long getInActConns() {
            return this.inActConns;
        }

        public DescribePortConnsListResponseBodyConnsList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribePortConnsListResponseBodyConnsList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribePortConnsListResponseBodyConnsList setCps(Long cps) {
            this.cps = cps;
            return this;
        }
        public Long getCps() {
            return this.cps;
        }

        public DescribePortConnsListResponseBodyConnsList setConns(Long conns) {
            this.conns = conns;
            return this;
        }
        public Long getConns() {
            return this.conns;
        }

    }

}
