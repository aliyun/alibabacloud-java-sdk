// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleOutApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to scale out. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-4413*****************</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group where the application you want to scale out is deployed. You can call the QueryApplicationStatus operation to query the group ID. For more information, see <a href="https://help.aliyun.com/document_detail/149394.html">QueryApplicationStatus</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4f1fb6f5-6769-4bd6******************</p>
     */
    @NameInMap("DeployGroup")
    public String deployGroup;

    /**
     * <p>The ID of the elastic compute unit (ECU) that corresponds to the Elastic Compute Service (ECS) instance to be added to the instance group for scale-out. You can call the ListScaleOutEcu operation to query the ECU ID. For more information, see <a href="https://help.aliyun.com/document_detail/149371.html">ListScaleOutEcu</a>. Separate multiple ECU IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8123db90-880f-486f-b***************</p>
     */
    @NameInMap("EcuInfo")
    public String ecuInfo;

    public static ScaleOutApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutApplicationRequest self = new ScaleOutApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ScaleOutApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ScaleOutApplicationRequest setDeployGroup(String deployGroup) {
        this.deployGroup = deployGroup;
        return this;
    }
    public String getDeployGroup() {
        return this.deployGroup;
    }

    public ScaleOutApplicationRequest setEcuInfo(String ecuInfo) {
        this.ecuInfo = ecuInfo;
        return this;
    }
    public String getEcuInfo() {
        return this.ecuInfo;
    }

}
