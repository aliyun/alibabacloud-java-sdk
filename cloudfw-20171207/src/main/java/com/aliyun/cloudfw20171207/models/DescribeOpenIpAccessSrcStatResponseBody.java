// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOpenIpAccessSrcStatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0DC783F1-B3A7-578D-8A63-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatList")
    public java.util.List<DescribeOpenIpAccessSrcStatResponseBodyStatList> statList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOpenIpAccessSrcStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenIpAccessSrcStatResponseBody self = new DescribeOpenIpAccessSrcStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenIpAccessSrcStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOpenIpAccessSrcStatResponseBody setStatList(java.util.List<DescribeOpenIpAccessSrcStatResponseBodyStatList> statList) {
        this.statList = statList;
        return this;
    }
    public java.util.List<DescribeOpenIpAccessSrcStatResponseBodyStatList> getStatList() {
        return this.statList;
    }

    public DescribeOpenIpAccessSrcStatResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOpenIpAccessSrcStatResponseBodyStatList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("AbnormalSrcIp")
        public Long abnormalSrcIp;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("NormalSrcIp")
        public Long normalSrcIp;

        /**
         * <strong>example:</strong>
         * <p>6163</p>
         */
        @NameInMap("Port")
        public String port;

        public static DescribeOpenIpAccessSrcStatResponseBodyStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenIpAccessSrcStatResponseBodyStatList self = new DescribeOpenIpAccessSrcStatResponseBodyStatList();
            return TeaModel.build(map, self);
        }

        public DescribeOpenIpAccessSrcStatResponseBodyStatList setAbnormalSrcIp(Long abnormalSrcIp) {
            this.abnormalSrcIp = abnormalSrcIp;
            return this;
        }
        public Long getAbnormalSrcIp() {
            return this.abnormalSrcIp;
        }

        public DescribeOpenIpAccessSrcStatResponseBodyStatList setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeOpenIpAccessSrcStatResponseBodyStatList setNormalSrcIp(Long normalSrcIp) {
            this.normalSrcIp = normalSrcIp;
            return this;
        }
        public Long getNormalSrcIp() {
            return this.normalSrcIp;
        }

        public DescribeOpenIpAccessSrcStatResponseBodyStatList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
