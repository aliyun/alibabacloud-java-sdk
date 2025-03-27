// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomRulesRequest extends TeaModel {
    /**
     * <p>Rule name, optional, used for querying by the name of the waiting room bypass rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The ID of the waiting room to bypass, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRooms</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6a51d5bc6460887abd129****</p>
     */
    @NameInMap("WaitingRoomId")
    public String waitingRoomId;

    /**
     * <p>The ID of the waiting room bypass rule to update, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRoomRules</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>37286782688****</p>
     */
    @NameInMap("WaitingRoomRuleId")
    public Long waitingRoomRuleId;

    public static ListWaitingRoomRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingRoomRulesRequest self = new ListWaitingRoomRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListWaitingRoomRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListWaitingRoomRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListWaitingRoomRulesRequest setWaitingRoomId(String waitingRoomId) {
        this.waitingRoomId = waitingRoomId;
        return this;
    }
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

    public ListWaitingRoomRulesRequest setWaitingRoomRuleId(Long waitingRoomRuleId) {
        this.waitingRoomRuleId = waitingRoomRuleId;
        return this;
    }
    public Long getWaitingRoomRuleId() {
        return this.waitingRoomRuleId;
    }

}
