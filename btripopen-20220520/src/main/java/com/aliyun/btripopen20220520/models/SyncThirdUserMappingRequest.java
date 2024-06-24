// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class SyncThirdUserMappingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>weCom</p>
     */
    @NameInMap("third_channel_type")
    public String thirdChannelType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("third_user_id")
    public String thirdUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static SyncThirdUserMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncThirdUserMappingRequest self = new SyncThirdUserMappingRequest();
        return TeaModel.build(map, self);
    }

    public SyncThirdUserMappingRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SyncThirdUserMappingRequest setThirdChannelType(String thirdChannelType) {
        this.thirdChannelType = thirdChannelType;
        return this;
    }
    public String getThirdChannelType() {
        return this.thirdChannelType;
    }

    public SyncThirdUserMappingRequest setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
        return this;
    }
    public String getThirdUserId() {
        return this.thirdUserId;
    }

    public SyncThirdUserMappingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
