// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateInstanceNetworkRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("SrcInstanceNetworkType")
    public String srcInstanceNetworkType;

    @NameInMap("RetainClassic")
    public Boolean retainClassic;

    @NameInMap("ClassicExpiredDays")
    public Integer classicExpiredDays;

    public static UpdateInstanceNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNetworkRequest self = new UpdateInstanceNetworkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNetworkRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public UpdateInstanceNetworkRequest setSrcInstanceNetworkType(String srcInstanceNetworkType) {
        this.srcInstanceNetworkType = srcInstanceNetworkType;
        return this;
    }
    public String getSrcInstanceNetworkType() {
        return this.srcInstanceNetworkType;
    }

    public UpdateInstanceNetworkRequest setRetainClassic(Boolean retainClassic) {
        this.retainClassic = retainClassic;
        return this;
    }
    public Boolean getRetainClassic() {
        return this.retainClassic;
    }

    public UpdateInstanceNetworkRequest setClassicExpiredDays(Integer classicExpiredDays) {
        this.classicExpiredDays = classicExpiredDays;
        return this;
    }
    public Integer getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

}
