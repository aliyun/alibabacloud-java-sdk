// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomRulesRequest extends TeaModel {
    /**
     * <p>Optional. The rule name, which can be used to query a specific bypass rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

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
     * <p>The ID of the waiting room to be bypassed, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWatingRooms</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6a51d5bc6460887abd129****</p>
     */
    @NameInMap("WaitingRoomId")
    public String waitingRoomId;

    /**
     * <p>Optional. The rule ID, which can be used to query a specific rule.</p>
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
