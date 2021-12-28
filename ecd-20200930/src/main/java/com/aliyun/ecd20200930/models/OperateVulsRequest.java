// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class OperateVulsRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Precondition")
    public Integer precondition;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("VulName")
    public java.util.List<String> vulName;

    public static OperateVulsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsRequest self = new OperateVulsRequest();
        return TeaModel.build(map, self);
    }

    public OperateVulsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public OperateVulsRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateVulsRequest setPrecondition(Integer precondition) {
        this.precondition = precondition;
        return this;
    }
    public Integer getPrecondition() {
        return this.precondition;
    }

    public OperateVulsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public OperateVulsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OperateVulsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OperateVulsRequest setVulName(java.util.List<String> vulName) {
        this.vulName = vulName;
        return this;
    }
    public java.util.List<String> getVulName() {
        return this.vulName;
    }

}
