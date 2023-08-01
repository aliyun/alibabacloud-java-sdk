// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ResetApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the elastic compute container (ECC) for which you want to reset the application. Separate multiple ECC IDs with commas (,). You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see [QueryApplicationStatus](~~149394~~).</p>
     */
    @NameInMap("EccInfo")
    public String eccInfo;

    public static ResetApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetApplicationRequest self = new ResetApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ResetApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ResetApplicationRequest setEccInfo(String eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public String getEccInfo() {
        return this.eccInfo;
    }

}
