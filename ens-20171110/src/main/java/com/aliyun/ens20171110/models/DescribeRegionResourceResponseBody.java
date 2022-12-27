// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeRegionResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeRegionResourceResponseBodyData> data;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Pager")
    public DescribeRegionResourceResponseBodyPager pager;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionResourceResponseBody self = new DescribeRegionResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionResourceResponseBody setData(java.util.List<DescribeRegionResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRegionResourceResponseBodyData> getData() {
        return this.data;
    }

    public DescribeRegionResourceResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DescribeRegionResourceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeRegionResourceResponseBody setPager(DescribeRegionResourceResponseBodyPager pager) {
        this.pager = pager;
        return this;
    }
    public DescribeRegionResourceResponseBodyPager getPager() {
        return this.pager;
    }

    public DescribeRegionResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionResourceResponseBodyDataArmCard extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataArmCard build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataArmCard self = new DescribeRegionResourceResponseBodyDataArmCard();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataArmCard setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataArmCard setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataBandwidth extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataBandwidth build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataBandwidth self = new DescribeRegionResourceResponseBodyDataBandwidth();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataBandwidth setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataBlockStorage extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataBlockStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataBlockStorage self = new DescribeRegionResourceResponseBodyDataBlockStorage();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataBlockStorage setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataCpu extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataCpu self = new DescribeRegionResourceResponseBodyDataCpu();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataCpu setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataCpu setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataCpu setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataCpu setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataCpu setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataCpu setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataCpu setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataCpu setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataCpu setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataCpu setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataCpu setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataCpu setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataGpu extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataGpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataGpu self = new DescribeRegionResourceResponseBodyDataGpu();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataGpu setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataGpu setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataGpu setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataGpu setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataGpu setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataGpu setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataGpu setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataGpu setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataGpu setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataGpu setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataGpu setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataGpu setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataHdd extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataHdd build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataHdd self = new DescribeRegionResourceResponseBodyDataHdd();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataHdd setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataHdd setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataHdd setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataHdd setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataHdd setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataHdd setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataHdd setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataHdd setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataHdd setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataHdd setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataHdd setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataHdd setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataIpv4s extends TeaModel {
        @NameInMap("Display")
        public String display;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        @NameInMap("Vlan")
        public String vlan;

        public static DescribeRegionResourceResponseBodyDataIpv4s build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataIpv4s self = new DescribeRegionResourceResponseBodyDataIpv4s();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public DescribeRegionResourceResponseBodyDataIpv4s setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataIpv6s extends TeaModel {
        @NameInMap("Display")
        public String display;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        @NameInMap("Vlan")
        public String vlan;

        public static DescribeRegionResourceResponseBodyDataIpv6s build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataIpv6s self = new DescribeRegionResourceResponseBodyDataIpv6s();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

        public DescribeRegionResourceResponseBodyDataIpv6s setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataMemory extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataMemory self = new DescribeRegionResourceResponseBodyDataMemory();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataMemory setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataMemory setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataMemory setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataMemory setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataMemory setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataMemory setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataMemory setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataMemory setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataMemory setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataMemory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataMemory setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataMemory setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataNvme extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataNvme build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataNvme self = new DescribeRegionResourceResponseBodyDataNvme();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataNvme setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataNvme setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataNvme setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataNvme setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataNvme setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataNvme setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataNvme setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataNvme setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataNvme setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataNvme setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataNvme setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataNvme setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataOssStorage extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataOssStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataOssStorage self = new DescribeRegionResourceResponseBodyDataOssStorage();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataOssStorage setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataPangu extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataPangu build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataPangu self = new DescribeRegionResourceResponseBodyDataPangu();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataPangu setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataPangu setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataPangu setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataPangu setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataPangu setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataPangu setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataPangu setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataPangu setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataPangu setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataPangu setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataPangu setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataPangu setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataPcfarmNum extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataPcfarmNum build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataPcfarmNum self = new DescribeRegionResourceResponseBodyDataPcfarmNum();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataPcfarmNum setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyDataSsd extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        @NameInMap("OversellRatio")
        public Long oversellRatio;

        @NameInMap("Remain")
        public Long remain;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("ReserveDisableTotal")
        public Long reserveDisableTotal;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("StatusDisableTotal")
        public Long statusDisableTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Type")
        public String type;

        @NameInMap("Used")
        public Long used;

        @NameInMap("UsedRatio")
        public Long usedRatio;

        public static DescribeRegionResourceResponseBodyDataSsd build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyDataSsd self = new DescribeRegionResourceResponseBodyDataSsd();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyDataSsd setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeRegionResourceResponseBodyDataSsd setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeRegionResourceResponseBodyDataSsd setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeRegionResourceResponseBodyDataSsd setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyDataSsd setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataSsd setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeRegionResourceResponseBodyDataSsd setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyDataSsd setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeRegionResourceResponseBodyDataSsd setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeRegionResourceResponseBodyDataSsd setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyDataSsd setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeRegionResourceResponseBodyDataSsd setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeRegionResourceResponseBodyData extends TeaModel {
        @NameInMap("AreaCode")
        public String areaCode;

        @NameInMap("AreaName")
        public String areaName;

        @NameInMap("ArmCard")
        public DescribeRegionResourceResponseBodyDataArmCard armCard;

        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        @NameInMap("Bandwidth")
        public DescribeRegionResourceResponseBodyDataBandwidth bandwidth;

        @NameInMap("BlockStorage")
        public DescribeRegionResourceResponseBodyDataBlockStorage blockStorage;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("CountryName")
        public String countryName;

        @NameInMap("Cpu")
        public DescribeRegionResourceResponseBodyDataCpu cpu;

        @NameInMap("Gpu")
        public DescribeRegionResourceResponseBodyDataGpu gpu;

        @NameInMap("Hdd")
        public DescribeRegionResourceResponseBodyDataHdd hdd;

        @NameInMap("HouseId")
        public String houseId;

        @NameInMap("Ipv4s")
        public java.util.List<DescribeRegionResourceResponseBodyDataIpv4s> ipv4s;

        @NameInMap("Ipv6s")
        public java.util.List<DescribeRegionResourceResponseBodyDataIpv6s> ipv6s;

        @NameInMap("IspTypes")
        public java.util.List<String> ispTypes;

        @NameInMap("Memory")
        public DescribeRegionResourceResponseBodyDataMemory memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nvme")
        public DescribeRegionResourceResponseBodyDataNvme nvme;

        @NameInMap("OssStorage")
        public DescribeRegionResourceResponseBodyDataOssStorage ossStorage;

        @NameInMap("Pangu")
        public DescribeRegionResourceResponseBodyDataPangu pangu;

        @NameInMap("PcfarmNum")
        public DescribeRegionResourceResponseBodyDataPcfarmNum pcfarmNum;

        @NameInMap("Poc")
        public Boolean poc;

        @NameInMap("ProvinceCode")
        public String provinceCode;

        @NameInMap("ProvinceName")
        public String provinceName;

        @NameInMap("ReserveDisable")
        public Boolean reserveDisable;

        @NameInMap("Ssd")
        public DescribeRegionResourceResponseBodyDataSsd ssd;

        @NameInMap("StatusDisable")
        public Boolean statusDisable;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Virtual")
        public String virtual;

        public static DescribeRegionResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyData self = new DescribeRegionResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyData setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public DescribeRegionResourceResponseBodyData setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public DescribeRegionResourceResponseBodyData setArmCard(DescribeRegionResourceResponseBodyDataArmCard armCard) {
            this.armCard = armCard;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataArmCard getArmCard() {
            return this.armCard;
        }

        public DescribeRegionResourceResponseBodyData setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public DescribeRegionResourceResponseBodyData setBandwidth(DescribeRegionResourceResponseBodyDataBandwidth bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataBandwidth getBandwidth() {
            return this.bandwidth;
        }

        public DescribeRegionResourceResponseBodyData setBlockStorage(DescribeRegionResourceResponseBodyDataBlockStorage blockStorage) {
            this.blockStorage = blockStorage;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataBlockStorage getBlockStorage() {
            return this.blockStorage;
        }

        public DescribeRegionResourceResponseBodyData setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeRegionResourceResponseBodyData setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeRegionResourceResponseBodyData setCpu(DescribeRegionResourceResponseBodyDataCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataCpu getCpu() {
            return this.cpu;
        }

        public DescribeRegionResourceResponseBodyData setGpu(DescribeRegionResourceResponseBodyDataGpu gpu) {
            this.gpu = gpu;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataGpu getGpu() {
            return this.gpu;
        }

        public DescribeRegionResourceResponseBodyData setHdd(DescribeRegionResourceResponseBodyDataHdd hdd) {
            this.hdd = hdd;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataHdd getHdd() {
            return this.hdd;
        }

        public DescribeRegionResourceResponseBodyData setHouseId(String houseId) {
            this.houseId = houseId;
            return this;
        }
        public String getHouseId() {
            return this.houseId;
        }

        public DescribeRegionResourceResponseBodyData setIpv4s(java.util.List<DescribeRegionResourceResponseBodyDataIpv4s> ipv4s) {
            this.ipv4s = ipv4s;
            return this;
        }
        public java.util.List<DescribeRegionResourceResponseBodyDataIpv4s> getIpv4s() {
            return this.ipv4s;
        }

        public DescribeRegionResourceResponseBodyData setIpv6s(java.util.List<DescribeRegionResourceResponseBodyDataIpv6s> ipv6s) {
            this.ipv6s = ipv6s;
            return this;
        }
        public java.util.List<DescribeRegionResourceResponseBodyDataIpv6s> getIpv6s() {
            return this.ipv6s;
        }

        public DescribeRegionResourceResponseBodyData setIspTypes(java.util.List<String> ispTypes) {
            this.ispTypes = ispTypes;
            return this;
        }
        public java.util.List<String> getIspTypes() {
            return this.ispTypes;
        }

        public DescribeRegionResourceResponseBodyData setMemory(DescribeRegionResourceResponseBodyDataMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataMemory getMemory() {
            return this.memory;
        }

        public DescribeRegionResourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRegionResourceResponseBodyData setNvme(DescribeRegionResourceResponseBodyDataNvme nvme) {
            this.nvme = nvme;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataNvme getNvme() {
            return this.nvme;
        }

        public DescribeRegionResourceResponseBodyData setOssStorage(DescribeRegionResourceResponseBodyDataOssStorage ossStorage) {
            this.ossStorage = ossStorage;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataOssStorage getOssStorage() {
            return this.ossStorage;
        }

        public DescribeRegionResourceResponseBodyData setPangu(DescribeRegionResourceResponseBodyDataPangu pangu) {
            this.pangu = pangu;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataPangu getPangu() {
            return this.pangu;
        }

        public DescribeRegionResourceResponseBodyData setPcfarmNum(DescribeRegionResourceResponseBodyDataPcfarmNum pcfarmNum) {
            this.pcfarmNum = pcfarmNum;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataPcfarmNum getPcfarmNum() {
            return this.pcfarmNum;
        }

        public DescribeRegionResourceResponseBodyData setPoc(Boolean poc) {
            this.poc = poc;
            return this;
        }
        public Boolean getPoc() {
            return this.poc;
        }

        public DescribeRegionResourceResponseBodyData setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public DescribeRegionResourceResponseBodyData setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public DescribeRegionResourceResponseBodyData setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeRegionResourceResponseBodyData setSsd(DescribeRegionResourceResponseBodyDataSsd ssd) {
            this.ssd = ssd;
            return this;
        }
        public DescribeRegionResourceResponseBodyDataSsd getSsd() {
            return this.ssd;
        }

        public DescribeRegionResourceResponseBodyData setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeRegionResourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionResourceResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeRegionResourceResponseBodyData setVirtual(String virtual) {
            this.virtual = virtual;
            return this;
        }
        public String getVirtual() {
            return this.virtual;
        }

    }

    public static class DescribeRegionResourceResponseBodyPager extends TeaModel {
        @NameInMap("Page")
        public Long page;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Total")
        public Long total;

        public static DescribeRegionResourceResponseBodyPager build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResourceResponseBodyPager self = new DescribeRegionResourceResponseBodyPager();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResourceResponseBodyPager setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public DescribeRegionResourceResponseBodyPager setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeRegionResourceResponseBodyPager setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
