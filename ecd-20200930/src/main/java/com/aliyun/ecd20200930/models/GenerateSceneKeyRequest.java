// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GenerateSceneKeyRequest extends TeaModel {
    /**
     * <p>The cloud desktop ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The validity period of the key, in hours. A value of 0 indicates that the key never expires. If this parameter is not specified, the default server value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scenario name.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentGateway</p>
     */
    @NameInMap("Scene")
    public String scene;

    public static GenerateSceneKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateSceneKeyRequest self = new GenerateSceneKeyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateSceneKeyRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public GenerateSceneKeyRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public GenerateSceneKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateSceneKeyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
