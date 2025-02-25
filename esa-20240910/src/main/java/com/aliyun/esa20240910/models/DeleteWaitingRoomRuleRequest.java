// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteWaitingRoomRuleRequest extends TeaModel {
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
     * <p>The ID of the waiting room bypass rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3672886****</p>
     */
    @NameInMap("WaitingRoomRuleId")
    public Long waitingRoomRuleId;

    public static DeleteWaitingRoomRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaitingRoomRuleRequest self = new DeleteWaitingRoomRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWaitingRoomRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DeleteWaitingRoomRuleRequest setWaitingRoomRuleId(Long waitingRoomRuleId) {
        this.waitingRoomRuleId = waitingRoomRuleId;
        return this;
    }
    public Long getWaitingRoomRuleId() {
        return this.waitingRoomRuleId;
    }

}
