// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListDialogueTemplateRequest extends TeaModel {
    /**
     * <p>hotelId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    public static ListDialogueTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDialogueTemplateRequest self = new ListDialogueTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListDialogueTemplateRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
