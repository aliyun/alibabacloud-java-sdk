// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNCInformationResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<DescribeNCInformationResponseBodyData> data;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Pager")
    public DescribeNCInformationResponseBodyPager pager;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNCInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNCInformationResponseBody self = new DescribeNCInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNCInformationResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNCInformationResponseBody setData(java.util.List<DescribeNCInformationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeNCInformationResponseBodyData> getData() {
        return this.data;
    }

    public DescribeNCInformationResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DescribeNCInformationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeNCInformationResponseBody setPager(DescribeNCInformationResponseBodyPager pager) {
        this.pager = pager;
        return this;
    }
    public DescribeNCInformationResponseBodyPager getPager() {
        return this.pager;
    }

    public DescribeNCInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNCInformationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNCInformationResponseBodyDataCpu extends TeaModel {
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

        public static DescribeNCInformationResponseBodyDataCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyDataCpu self = new DescribeNCInformationResponseBodyDataCpu();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyDataCpu setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeNCInformationResponseBodyDataCpu setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeNCInformationResponseBodyDataCpu setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeNCInformationResponseBodyDataCpu setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeNCInformationResponseBodyDataCpu setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataCpu setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeNCInformationResponseBodyDataCpu setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeNCInformationResponseBodyDataCpu setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataCpu setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeNCInformationResponseBodyDataCpu setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNCInformationResponseBodyDataCpu setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeNCInformationResponseBodyDataCpu setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeNCInformationResponseBodyDataGpu extends TeaModel {
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

        public static DescribeNCInformationResponseBodyDataGpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyDataGpu self = new DescribeNCInformationResponseBodyDataGpu();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyDataGpu setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeNCInformationResponseBodyDataGpu setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeNCInformationResponseBodyDataGpu setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeNCInformationResponseBodyDataGpu setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeNCInformationResponseBodyDataGpu setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataGpu setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeNCInformationResponseBodyDataGpu setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeNCInformationResponseBodyDataGpu setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataGpu setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeNCInformationResponseBodyDataGpu setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNCInformationResponseBodyDataGpu setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeNCInformationResponseBodyDataGpu setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeNCInformationResponseBodyDataHdd extends TeaModel {
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

        public static DescribeNCInformationResponseBodyDataHdd build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyDataHdd self = new DescribeNCInformationResponseBodyDataHdd();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyDataHdd setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeNCInformationResponseBodyDataHdd setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeNCInformationResponseBodyDataHdd setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeNCInformationResponseBodyDataHdd setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeNCInformationResponseBodyDataHdd setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataHdd setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeNCInformationResponseBodyDataHdd setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeNCInformationResponseBodyDataHdd setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataHdd setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeNCInformationResponseBodyDataHdd setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNCInformationResponseBodyDataHdd setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeNCInformationResponseBodyDataHdd setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeNCInformationResponseBodyDataInfo extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Name")
        public String name;

        @NameInMap("Tag")
        public java.util.List<String> tag;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeNCInformationResponseBodyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyDataInfo self = new DescribeNCInformationResponseBodyDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyDataInfo setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeNCInformationResponseBodyDataInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNCInformationResponseBodyDataInfo setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

        public DescribeNCInformationResponseBodyDataInfo setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeNCInformationResponseBodyDataMemory extends TeaModel {
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

        public static DescribeNCInformationResponseBodyDataMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyDataMemory self = new DescribeNCInformationResponseBodyDataMemory();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyDataMemory setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeNCInformationResponseBodyDataMemory setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeNCInformationResponseBodyDataMemory setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeNCInformationResponseBodyDataMemory setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeNCInformationResponseBodyDataMemory setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataMemory setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeNCInformationResponseBodyDataMemory setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeNCInformationResponseBodyDataMemory setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataMemory setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeNCInformationResponseBodyDataMemory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNCInformationResponseBodyDataMemory setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeNCInformationResponseBodyDataMemory setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeNCInformationResponseBodyDataNvme extends TeaModel {
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

        public static DescribeNCInformationResponseBodyDataNvme build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyDataNvme self = new DescribeNCInformationResponseBodyDataNvme();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyDataNvme setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeNCInformationResponseBodyDataNvme setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeNCInformationResponseBodyDataNvme setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeNCInformationResponseBodyDataNvme setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeNCInformationResponseBodyDataNvme setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataNvme setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeNCInformationResponseBodyDataNvme setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeNCInformationResponseBodyDataNvme setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataNvme setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeNCInformationResponseBodyDataNvme setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNCInformationResponseBodyDataNvme setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeNCInformationResponseBodyDataNvme setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeNCInformationResponseBodyDataSsd extends TeaModel {
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

        public static DescribeNCInformationResponseBodyDataSsd build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyDataSsd self = new DescribeNCInformationResponseBodyDataSsd();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyDataSsd setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public DescribeNCInformationResponseBodyDataSsd setOversellRatio(Long oversellRatio) {
            this.oversellRatio = oversellRatio;
            return this;
        }
        public Long getOversellRatio() {
            return this.oversellRatio;
        }

        public DescribeNCInformationResponseBodyDataSsd setRemain(Long remain) {
            this.remain = remain;
            return this;
        }
        public Long getRemain() {
            return this.remain;
        }

        public DescribeNCInformationResponseBodyDataSsd setReserveDisable(Boolean reserveDisable) {
            this.reserveDisable = reserveDisable;
            return this;
        }
        public Boolean getReserveDisable() {
            return this.reserveDisable;
        }

        public DescribeNCInformationResponseBodyDataSsd setReserveDisableTotal(Long reserveDisableTotal) {
            this.reserveDisableTotal = reserveDisableTotal;
            return this;
        }
        public Long getReserveDisableTotal() {
            return this.reserveDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataSsd setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public DescribeNCInformationResponseBodyDataSsd setStatusDisable(Boolean statusDisable) {
            this.statusDisable = statusDisable;
            return this;
        }
        public Boolean getStatusDisable() {
            return this.statusDisable;
        }

        public DescribeNCInformationResponseBodyDataSsd setStatusDisableTotal(Long statusDisableTotal) {
            this.statusDisableTotal = statusDisableTotal;
            return this;
        }
        public Long getStatusDisableTotal() {
            return this.statusDisableTotal;
        }

        public DescribeNCInformationResponseBodyDataSsd setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeNCInformationResponseBodyDataSsd setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNCInformationResponseBodyDataSsd setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

        public DescribeNCInformationResponseBodyDataSsd setUsedRatio(Long usedRatio) {
            this.usedRatio = usedRatio;
            return this;
        }
        public Long getUsedRatio() {
            return this.usedRatio;
        }

    }

    public static class DescribeNCInformationResponseBodyData extends TeaModel {
        @NameInMap("Cpu")
        public DescribeNCInformationResponseBodyDataCpu cpu;

        @NameInMap("Gpu")
        public DescribeNCInformationResponseBodyDataGpu gpu;

        @NameInMap("Hdd")
        public DescribeNCInformationResponseBodyDataHdd hdd;

        @NameInMap("Info")
        public DescribeNCInformationResponseBodyDataInfo info;

        @NameInMap("Memory")
        public DescribeNCInformationResponseBodyDataMemory memory;

        @NameInMap("Nvme")
        public DescribeNCInformationResponseBodyDataNvme nvme;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("Region")
        public String region;

        @NameInMap("Ssd")
        public DescribeNCInformationResponseBodyDataSsd ssd;

        @NameInMap("Virtual")
        public String virtual;

        public static DescribeNCInformationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyData self = new DescribeNCInformationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyData setCpu(DescribeNCInformationResponseBodyDataCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeNCInformationResponseBodyDataCpu getCpu() {
            return this.cpu;
        }

        public DescribeNCInformationResponseBodyData setGpu(DescribeNCInformationResponseBodyDataGpu gpu) {
            this.gpu = gpu;
            return this;
        }
        public DescribeNCInformationResponseBodyDataGpu getGpu() {
            return this.gpu;
        }

        public DescribeNCInformationResponseBodyData setHdd(DescribeNCInformationResponseBodyDataHdd hdd) {
            this.hdd = hdd;
            return this;
        }
        public DescribeNCInformationResponseBodyDataHdd getHdd() {
            return this.hdd;
        }

        public DescribeNCInformationResponseBodyData setInfo(DescribeNCInformationResponseBodyDataInfo info) {
            this.info = info;
            return this;
        }
        public DescribeNCInformationResponseBodyDataInfo getInfo() {
            return this.info;
        }

        public DescribeNCInformationResponseBodyData setMemory(DescribeNCInformationResponseBodyDataMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeNCInformationResponseBodyDataMemory getMemory() {
            return this.memory;
        }

        public DescribeNCInformationResponseBodyData setNvme(DescribeNCInformationResponseBodyDataNvme nvme) {
            this.nvme = nvme;
            return this;
        }
        public DescribeNCInformationResponseBodyDataNvme getNvme() {
            return this.nvme;
        }

        public DescribeNCInformationResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeNCInformationResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeNCInformationResponseBodyData setSsd(DescribeNCInformationResponseBodyDataSsd ssd) {
            this.ssd = ssd;
            return this;
        }
        public DescribeNCInformationResponseBodyDataSsd getSsd() {
            return this.ssd;
        }

        public DescribeNCInformationResponseBodyData setVirtual(String virtual) {
            this.virtual = virtual;
            return this;
        }
        public String getVirtual() {
            return this.virtual;
        }

    }

    public static class DescribeNCInformationResponseBodyPager extends TeaModel {
        @NameInMap("Page")
        public Long page;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Total")
        public Long total;

        public static DescribeNCInformationResponseBodyPager build(java.util.Map<String, ?> map) throws Exception {
            DescribeNCInformationResponseBodyPager self = new DescribeNCInformationResponseBodyPager();
            return TeaModel.build(map, self);
        }

        public DescribeNCInformationResponseBodyPager setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public DescribeNCInformationResponseBodyPager setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeNCInformationResponseBodyPager setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
