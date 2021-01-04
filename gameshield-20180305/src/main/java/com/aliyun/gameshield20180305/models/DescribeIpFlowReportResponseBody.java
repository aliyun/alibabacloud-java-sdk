// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeIpFlowReportResponseBody extends TeaModel {
    @NameInMap("IpFlowReportList")
    public java.util.List<DescribeIpFlowReportResponseBodyIpFlowReportList> ipFlowReportList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeIpFlowReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpFlowReportResponseBody self = new DescribeIpFlowReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpFlowReportResponseBody setIpFlowReportList(java.util.List<DescribeIpFlowReportResponseBodyIpFlowReportList> ipFlowReportList) {
        this.ipFlowReportList = ipFlowReportList;
        return this;
    }
    public java.util.List<DescribeIpFlowReportResponseBodyIpFlowReportList> getIpFlowReportList() {
        return this.ipFlowReportList;
    }

    public DescribeIpFlowReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpFlowReportResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeIpFlowReportResponseBodyIpFlowReportList extends TeaModel {
        @NameInMap("Outpps")
        public String outpps;

        @NameInMap("Cps")
        public String cps;

        @NameInMap("Inkbps")
        public String inkbps;

        @NameInMap("Inpps")
        public String inpps;

        @NameInMap("Inbps")
        public String inbps;

        @NameInMap("Conns")
        public Boolean conns;

        @NameInMap("Inpkts")
        public String inpkts;

        @NameInMap("Inbytes")
        public String inbytes;

        @NameInMap("Outbytes")
        public String outbytes;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Actconns")
        public String actconns;

        @NameInMap("Outbps")
        public String outbps;

        @NameInMap("Outpkts")
        public String outpkts;

        @NameInMap("Vip")
        public String vip;

        @NameInMap("Qtime")
        public String qtime;

        @NameInMap("Outkbps")
        public String outkbps;

        @NameInMap("Inactconns")
        public String inactconns;

        public static DescribeIpFlowReportResponseBodyIpFlowReportList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpFlowReportResponseBodyIpFlowReportList self = new DescribeIpFlowReportResponseBodyIpFlowReportList();
            return TeaModel.build(map, self);
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setOutpps(String outpps) {
            this.outpps = outpps;
            return this;
        }
        public String getOutpps() {
            return this.outpps;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setCps(String cps) {
            this.cps = cps;
            return this;
        }
        public String getCps() {
            return this.cps;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setInkbps(String inkbps) {
            this.inkbps = inkbps;
            return this;
        }
        public String getInkbps() {
            return this.inkbps;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setInpps(String inpps) {
            this.inpps = inpps;
            return this;
        }
        public String getInpps() {
            return this.inpps;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setInbps(String inbps) {
            this.inbps = inbps;
            return this;
        }
        public String getInbps() {
            return this.inbps;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setConns(Boolean conns) {
            this.conns = conns;
            return this;
        }
        public Boolean getConns() {
            return this.conns;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setInpkts(String inpkts) {
            this.inpkts = inpkts;
            return this;
        }
        public String getInpkts() {
            return this.inpkts;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setInbytes(String inbytes) {
            this.inbytes = inbytes;
            return this;
        }
        public String getInbytes() {
            return this.inbytes;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setOutbytes(String outbytes) {
            this.outbytes = outbytes;
            return this;
        }
        public String getOutbytes() {
            return this.outbytes;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setActconns(String actconns) {
            this.actconns = actconns;
            return this;
        }
        public String getActconns() {
            return this.actconns;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setOutbps(String outbps) {
            this.outbps = outbps;
            return this;
        }
        public String getOutbps() {
            return this.outbps;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setOutpkts(String outpkts) {
            this.outpkts = outpkts;
            return this;
        }
        public String getOutpkts() {
            return this.outpkts;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setQtime(String qtime) {
            this.qtime = qtime;
            return this;
        }
        public String getQtime() {
            return this.qtime;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setOutkbps(String outkbps) {
            this.outkbps = outkbps;
            return this;
        }
        public String getOutkbps() {
            return this.outkbps;
        }

        public DescribeIpFlowReportResponseBodyIpFlowReportList setInactconns(String inactconns) {
            this.inactconns = inactconns;
            return this;
        }
        public String getInactconns() {
            return this.inactconns;
        }

    }

}
