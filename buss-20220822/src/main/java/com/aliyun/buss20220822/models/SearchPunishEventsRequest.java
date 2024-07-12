// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishEventsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BussinessCodes")
    public java.util.List<String> bussinessCodes;

    @NameInMap("CaseCodes")
    public java.util.List<String> caseCodes;

    @NameInMap("EventCodes")
    public java.util.List<String> eventCodes;

    @NameInMap("ResourceId")
    public String resourceId;

    public static SearchPunishEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishEventsRequest self = new SearchPunishEventsRequest();
        return TeaModel.build(map, self);
    }

    public SearchPunishEventsRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public SearchPunishEventsRequest setBussinessCodes(java.util.List<String> bussinessCodes) {
        this.bussinessCodes = bussinessCodes;
        return this;
    }
    public java.util.List<String> getBussinessCodes() {
        return this.bussinessCodes;
    }

    public SearchPunishEventsRequest setCaseCodes(java.util.List<String> caseCodes) {
        this.caseCodes = caseCodes;
        return this;
    }
    public java.util.List<String> getCaseCodes() {
        return this.caseCodes;
    }

    public SearchPunishEventsRequest setEventCodes(java.util.List<String> eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    public SearchPunishEventsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
