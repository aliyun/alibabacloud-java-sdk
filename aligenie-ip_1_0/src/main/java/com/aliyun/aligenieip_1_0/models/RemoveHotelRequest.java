// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class RemoveHotelRequest extends TeaModel {
    /**
     * <p>appkey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30193305</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e6dd44fd16084db8a60d69fd625d9f0f</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAEVK***UE3d3Z2ETwh</p>
     */
    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static RemoveHotelRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveHotelRequest self = new RemoveHotelRequest();
        return TeaModel.build(map, self);
    }

    public RemoveHotelRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RemoveHotelRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public RemoveHotelRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
