// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateInstanceNetworkRequest extends TeaModel {
    /**
     * <p>Specifies the retention period of the classic network endpoint. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ClassicExpiredDays")
    public Integer classicExpiredDays;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds******</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>Specifies whether to retain the classic network endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RetainClassic")
    public Boolean retainClassic;

    /**
     * <p>The network type of the PolarDB-X 1.0 instance. Valid values:</p>
     * <ul>
     * <li>vpc: Virtual Private Cloud (VPC)</li>
     * <li>classic: classic network</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>classic</p>
     */
    @NameInMap("SrcInstanceNetworkType")
    public String srcInstanceNetworkType;

    public static UpdateInstanceNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNetworkRequest self = new UpdateInstanceNetworkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNetworkRequest setClassicExpiredDays(Integer classicExpiredDays) {
        this.classicExpiredDays = classicExpiredDays;
        return this;
    }
    public Integer getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    public UpdateInstanceNetworkRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public UpdateInstanceNetworkRequest setRetainClassic(Boolean retainClassic) {
        this.retainClassic = retainClassic;
        return this;
    }
    public Boolean getRetainClassic() {
        return this.retainClassic;
    }

    public UpdateInstanceNetworkRequest setSrcInstanceNetworkType(String srcInstanceNetworkType) {
        this.srcInstanceNetworkType = srcInstanceNetworkType;
        return this;
    }
    public String getSrcInstanceNetworkType() {
        return this.srcInstanceNetworkType;
    }

}
