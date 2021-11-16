// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIncidentRequest extends TeaModel {
    // 分派的用户ID
    @NameInMap("assignUserId")
    public Long assignUserId;

    // 通知渠道     SMS 短信   EMAIL 邮件   PHONE  电话  WEIXIN_GROUP企微群 DING_GROUP 钉钉群
    @NameInMap("channels")
    public java.util.List<String> channels;

    // 幂等UUID
    @NameInMap("clientToken")
    public String clientToken;

    // 影响等级 高：HIGH 低 LOW
    @NameInMap("effect")
    public String effect;

    // 事件描述
    @NameInMap("incidentDescription")
    public String incidentDescription;

    // P1	事件级别 P1 P2 P3 P4
    @NameInMap("incidentLevel")
    public String incidentLevel;

    // 事件标题
    @NameInMap("incidentTitle")
    public String incidentTitle;

    // 关联服务ID
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    // 服务组Id
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static CreateIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIncidentRequest self = new CreateIncidentRequest();
        return TeaModel.build(map, self);
    }

    public CreateIncidentRequest setAssignUserId(Long assignUserId) {
        this.assignUserId = assignUserId;
        return this;
    }
    public Long getAssignUserId() {
        return this.assignUserId;
    }

    public CreateIncidentRequest setChannels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    public CreateIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIncidentRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public CreateIncidentRequest setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
        return this;
    }
    public String getIncidentDescription() {
        return this.incidentDescription;
    }

    public CreateIncidentRequest setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    public CreateIncidentRequest setIncidentTitle(String incidentTitle) {
        this.incidentTitle = incidentTitle;
        return this;
    }
    public String getIncidentTitle() {
        return this.incidentTitle;
    }

    public CreateIncidentRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public CreateIncidentRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
