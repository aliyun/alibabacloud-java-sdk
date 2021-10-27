// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeInstanceNetworkRequest extends TeaModel {
    @NameInMap("ClassicExpiredDays")
    public Integer classicExpiredDays;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RetainClassic")
    public Boolean retainClassic;

    @NameInMap("SrcInstanceNetworkType")
    public String srcInstanceNetworkType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    public static ChangeInstanceNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeInstanceNetworkRequest self = new ChangeInstanceNetworkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeInstanceNetworkRequest setClassicExpiredDays(Integer classicExpiredDays) {
        this.classicExpiredDays = classicExpiredDays;
        return this;
    }
    public Integer getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    public ChangeInstanceNetworkRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ChangeInstanceNetworkRequest setRetainClassic(Boolean retainClassic) {
        this.retainClassic = retainClassic;
        return this;
    }
    public Boolean getRetainClassic() {
        return this.retainClassic;
    }

    public ChangeInstanceNetworkRequest setSrcInstanceNetworkType(String srcInstanceNetworkType) {
        this.srcInstanceNetworkType = srcInstanceNetworkType;
        return this;
    }
    public String getSrcInstanceNetworkType() {
        return this.srcInstanceNetworkType;
    }

    public ChangeInstanceNetworkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ChangeInstanceNetworkRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
