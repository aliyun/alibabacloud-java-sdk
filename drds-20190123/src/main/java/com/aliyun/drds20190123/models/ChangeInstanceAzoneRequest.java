// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeInstanceAzoneRequest extends TeaModel {
    @NameInMap("ChangeVSwitch")
    public Boolean changeVSwitch;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("DrdsRegionId")
    public String drdsRegionId;

    @NameInMap("NewVSwitch")
    public String newVSwitch;

    /**
     * <p>The source zone of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("OriginAzoneId")
    public String originAzoneId;

    /**
     * <p>The destination zone to which you want to modify</p>
     */
    @NameInMap("TargetAzoneId")
    public String targetAzoneId;

    public static ChangeInstanceAzoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeInstanceAzoneRequest self = new ChangeInstanceAzoneRequest();
        return TeaModel.build(map, self);
    }

    public ChangeInstanceAzoneRequest setChangeVSwitch(Boolean changeVSwitch) {
        this.changeVSwitch = changeVSwitch;
        return this;
    }
    public Boolean getChangeVSwitch() {
        return this.changeVSwitch;
    }

    public ChangeInstanceAzoneRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ChangeInstanceAzoneRequest setDrdsRegionId(String drdsRegionId) {
        this.drdsRegionId = drdsRegionId;
        return this;
    }
    public String getDrdsRegionId() {
        return this.drdsRegionId;
    }

    public ChangeInstanceAzoneRequest setNewVSwitch(String newVSwitch) {
        this.newVSwitch = newVSwitch;
        return this;
    }
    public String getNewVSwitch() {
        return this.newVSwitch;
    }

    public ChangeInstanceAzoneRequest setOriginAzoneId(String originAzoneId) {
        this.originAzoneId = originAzoneId;
        return this;
    }
    public String getOriginAzoneId() {
        return this.originAzoneId;
    }

    public ChangeInstanceAzoneRequest setTargetAzoneId(String targetAzoneId) {
        this.targetAzoneId = targetAzoneId;
        return this;
    }
    public String getTargetAzoneId() {
        return this.targetAzoneId;
    }

}
