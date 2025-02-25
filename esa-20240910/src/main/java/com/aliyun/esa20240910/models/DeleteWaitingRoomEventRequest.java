// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteWaitingRoomEventRequest extends TeaModel {
    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The ID of the waiting room event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>302909890***</p>
     */
    @NameInMap("WaitingRoomEventId")
    public Long waitingRoomEventId;

    public static DeleteWaitingRoomEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaitingRoomEventRequest self = new DeleteWaitingRoomEventRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWaitingRoomEventRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DeleteWaitingRoomEventRequest setWaitingRoomEventId(Long waitingRoomEventId) {
        this.waitingRoomEventId = waitingRoomEventId;
        return this;
    }
    public Long getWaitingRoomEventId() {
        return this.waitingRoomEventId;
    }

}
