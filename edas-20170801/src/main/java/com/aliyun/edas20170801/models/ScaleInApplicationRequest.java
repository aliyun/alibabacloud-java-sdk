// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleInApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the elastic compute container (ECC) that corresponds to the Elastic Compute Service (ECS) instance to be removed for the application. Separate multiple ECC IDs with commas (,). You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see [QueryApplicationStatus](https://help.aliyun.com/document_detail/149394.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EccInfo")
    public String eccInfo;

    /**
     * <p>Specifies whether to forcibly unpublish the application from the ECS instance. You need to set this parameter to true only if the ECS instance expires. In normal cases, you do not need to set this parameter to true.</p>
     */
    @NameInMap("ForceStatus")
    public Boolean forceStatus;

    public static ScaleInApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleInApplicationRequest self = new ScaleInApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ScaleInApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ScaleInApplicationRequest setEccInfo(String eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public String getEccInfo() {
        return this.eccInfo;
    }

    public ScaleInApplicationRequest setForceStatus(Boolean forceStatus) {
        this.forceStatus = forceStatus;
        return this;
    }
    public Boolean getForceStatus() {
        return this.forceStatus;
    }

}
