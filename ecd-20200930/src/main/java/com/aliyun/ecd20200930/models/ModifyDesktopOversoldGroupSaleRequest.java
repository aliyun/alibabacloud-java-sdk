// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldGroupSaleRequest extends TeaModel {
    @NameInMap("ConcurrenceCount")
    public Integer concurrenceCount;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("OversoldUserCount")
    public Integer oversoldUserCount;

    public static ModifyDesktopOversoldGroupSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldGroupSaleRequest self = new ModifyDesktopOversoldGroupSaleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldGroupSaleRequest setConcurrenceCount(Integer concurrenceCount) {
        this.concurrenceCount = concurrenceCount;
        return this;
    }
    public Integer getConcurrenceCount() {
        return this.concurrenceCount;
    }

    public ModifyDesktopOversoldGroupSaleRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public ModifyDesktopOversoldGroupSaleRequest setOversoldUserCount(Integer oversoldUserCount) {
        this.oversoldUserCount = oversoldUserCount;
        return this;
    }
    public Integer getOversoldUserCount() {
        return this.oversoldUserCount;
    }

}
