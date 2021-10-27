// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeInstanceAzoneRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("DrdsRegionId")
    public String drdsRegionId;

    @NameInMap("OriginAzoneId")
    public String originAzoneId;

    @NameInMap("TargetAzoneId")
    public String targetAzoneId;

    public static ChangeInstanceAzoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeInstanceAzoneRequest self = new ChangeInstanceAzoneRequest();
        return TeaModel.build(map, self);
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
