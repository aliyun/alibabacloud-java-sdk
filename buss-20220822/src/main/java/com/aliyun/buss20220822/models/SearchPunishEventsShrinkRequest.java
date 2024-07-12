// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishEventsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BussinessCodes")
    public String bussinessCodesShrink;

    @NameInMap("CaseCodes")
    public String caseCodesShrink;

    @NameInMap("EventCodes")
    public String eventCodesShrink;

    @NameInMap("ResourceId")
    public String resourceId;

    public static SearchPunishEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishEventsShrinkRequest self = new SearchPunishEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchPunishEventsShrinkRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public SearchPunishEventsShrinkRequest setBussinessCodesShrink(String bussinessCodesShrink) {
        this.bussinessCodesShrink = bussinessCodesShrink;
        return this;
    }
    public String getBussinessCodesShrink() {
        return this.bussinessCodesShrink;
    }

    public SearchPunishEventsShrinkRequest setCaseCodesShrink(String caseCodesShrink) {
        this.caseCodesShrink = caseCodesShrink;
        return this;
    }
    public String getCaseCodesShrink() {
        return this.caseCodesShrink;
    }

    public SearchPunishEventsShrinkRequest setEventCodesShrink(String eventCodesShrink) {
        this.eventCodesShrink = eventCodesShrink;
        return this;
    }
    public String getEventCodesShrink() {
        return this.eventCodesShrink;
    }

    public SearchPunishEventsShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
