// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetTunnelResp extends TeaModel {
    /**
     * <p>The time when the tunnel was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the tunnel was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The tunnel owner.</p>
     * 
     * <strong>example:</strong>
     * <p>test_owner</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>key1:value1,key2:value2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The tunnel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tunnel_id</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    /**
     * <p>The throttling settings of the tunnel.</p>
     */
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
