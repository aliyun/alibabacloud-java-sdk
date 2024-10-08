// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120876698010528</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>6a51d5bc6460887abd1291dc7d4d****</p>
     */
    @NameInMap("WaitingRoomId")
    public String waitingRoomId;

    public static ListWaitingRoomsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingRoomsRequest self = new ListWaitingRoomsRequest();
        return TeaModel.build(map, self);
    }

    public ListWaitingRoomsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListWaitingRoomsRequest setWaitingRoomId(String waitingRoomId) {
        this.waitingRoomId = waitingRoomId;
        return this;
    }
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

}
