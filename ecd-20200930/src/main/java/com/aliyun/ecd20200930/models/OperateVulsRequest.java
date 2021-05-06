// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class OperateVulsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("VulName")
    @Validation(required = true)
    public java.util.List<String> vulName;

    @NameInMap("DesktopId")
    @Validation(required = true)
    public java.util.List<String> desktopId;

    @NameInMap("OperateType")
    @Validation(required = true)
    public String operateType;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Precondition")
    @Validation(required = true)
    public Integer precondition;

    public static OperateVulsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsRequest self = new OperateVulsRequest();
        return TeaModel.build(map, self);
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

    public OperateVulsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public OperateVulsRequest setPrecondition(Integer precondition) {
        this.precondition = precondition;
        return this;
    }
    public Integer getPrecondition() {
        return this.precondition;
    }

}
