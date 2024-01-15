// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceForCreateDesktopOversoldGroupRequest extends TeaModel {
    @NameInMap("ConcurrenceCount")
    public Integer concurrenceCount;

    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    @NameInMap("DesktopType")
    public String desktopType;

    @NameInMap("OversoldUserCount")
    public Integer oversoldUserCount;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    public static DescribePriceForCreateDesktopOversoldGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceForCreateDesktopOversoldGroupRequest self = new DescribePriceForCreateDesktopOversoldGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceForCreateDesktopOversoldGroupRequest setConcurrenceCount(Integer concurrenceCount) {
        this.concurrenceCount = concurrenceCount;
        return this;
    }
    public Integer getConcurrenceCount() {
        return this.concurrenceCount;
    }

    public DescribePriceForCreateDesktopOversoldGroupRequest setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public DescribePriceForCreateDesktopOversoldGroupRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public DescribePriceForCreateDesktopOversoldGroupRequest setOversoldUserCount(Integer oversoldUserCount) {
        this.oversoldUserCount = oversoldUserCount;
        return this;
    }
    public Integer getOversoldUserCount() {
        return this.oversoldUserCount;
    }

    public DescribePriceForCreateDesktopOversoldGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribePriceForCreateDesktopOversoldGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribePriceForCreateDesktopOversoldGroupRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
