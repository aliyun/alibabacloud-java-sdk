// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetAntStaStatusByMacRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4fcb82c0-ee83-11ea-88b6-02420b0f63f4</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ISV_ALIYUN_IOT</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BA:5F:40:45:63:89</p>
     */
    @NameInMap("StaMac")
    public String staMac;

    public static GetAntStaStatusByMacRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntStaStatusByMacRequest self = new GetAntStaStatusByMacRequest();
        return TeaModel.build(map, self);
    }

    public GetAntStaStatusByMacRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetAntStaStatusByMacRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAntStaStatusByMacRequest setStaMac(String staMac) {
        this.staMac = staMac;
        return this;
    }
    public String getStaMac() {
        return this.staMac;
    }

}
