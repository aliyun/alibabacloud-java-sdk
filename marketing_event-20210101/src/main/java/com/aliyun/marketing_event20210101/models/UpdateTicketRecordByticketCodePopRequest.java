// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class UpdateTicketRecordByticketCodePopRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3402</p>
     */
    @NameInMap("AgendaId")
    public String agendaId;

    /**
     * <strong>example:</strong>
     * <p>4546-100000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>boarding</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <strong>example:</strong>
     * <p>2024-09-25 14:11</p>
     */
    @NameInMap("Time")
    public String time;

    public static UpdateTicketRecordByticketCodePopRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketRecordByticketCodePopRequest self = new UpdateTicketRecordByticketCodePopRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTicketRecordByticketCodePopRequest setAgendaId(String agendaId) {
        this.agendaId = agendaId;
        return this;
    }
    public String getAgendaId() {
        return this.agendaId;
    }

    public UpdateTicketRecordByticketCodePopRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTicketRecordByticketCodePopRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public UpdateTicketRecordByticketCodePopRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateTicketRecordByticketCodePopRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
