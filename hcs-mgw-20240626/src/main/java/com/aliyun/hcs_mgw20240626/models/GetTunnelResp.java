// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetTunnelResp extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-08-03T07:09:25.000Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2025-08-04T07:09:26.000Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>1<em>5</em>**<em><strong>7</strong>43</em></p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>33f-</strong></strong>-4740-<strong><strong>-bc4f</strong></strong>332b3</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    @NameInMap("TunnelQos")
    public TunnelQos tunnelQos;

    public static GetTunnelResp build(java.util.Map<String, ?> map) throws Exception {
        GetTunnelResp self = new GetTunnelResp();
        return TeaModel.build(map, self);
    }

    public GetTunnelResp setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTunnelResp setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetTunnelResp setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetTunnelResp setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public GetTunnelResp setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public GetTunnelResp setTunnelQos(TunnelQos tunnelQos) {
        this.tunnelQos = tunnelQos;
        return this;
    }
    public TunnelQos getTunnelQos() {
        return this.tunnelQos;
    }

}
