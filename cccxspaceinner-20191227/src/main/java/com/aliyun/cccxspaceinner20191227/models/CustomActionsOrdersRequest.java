// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CustomActionsOrdersRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("CmsId")
    public Long cmsId;

    @NameInMap("ActorName")
    public String actorName;

    @NameInMap("CaseId")
    public Long caseId;

    @NameInMap("ActivityCode")
    public String activityCode;

    @NameInMap("From")
    public String from;

    @NameInMap("FormData")
    public String formData;

    public static CustomActionsOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomActionsOrdersRequest self = new CustomActionsOrdersRequest();
        return TeaModel.build(map, self);
    }

    public CustomActionsOrdersRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public CustomActionsOrdersRequest setCmsId(Long cmsId) {
        this.cmsId = cmsId;
        return this;
    }
    public Long getCmsId() {
        return this.cmsId;
    }

    public CustomActionsOrdersRequest setActorName(String actorName) {
        this.actorName = actorName;
        return this;
    }
    public String getActorName() {
        return this.actorName;
    }

    public CustomActionsOrdersRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public CustomActionsOrdersRequest setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public CustomActionsOrdersRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public CustomActionsOrdersRequest setFormData(String formData) {
        this.formData = formData;
        return this;
    }
    public String getFormData() {
        return this.formData;
    }

}
