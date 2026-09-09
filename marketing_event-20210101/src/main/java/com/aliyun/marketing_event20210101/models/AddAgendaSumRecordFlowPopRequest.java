// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class AddAgendaSumRecordFlowPopRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ActiveNum")
    public Integer activeNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("AgendaId")
    public Long agendaId;

    /**
     * <strong>example:</strong>
     * <p>90.81</p>
     */
    @NameInMap("AttendancePercent")
    public String attendancePercent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1784443333333</p>
     */
    @NameInMap("FlowTime")
    public Long flowTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>云栖大会主论坛</p>
     */
    @NameInMap("SessionName")
    public String sessionName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPv")
    public Integer totalPv;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalUv")
    public Integer totalUv;

    public static AddAgendaSumRecordFlowPopRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAgendaSumRecordFlowPopRequest self = new AddAgendaSumRecordFlowPopRequest();
        return TeaModel.build(map, self);
    }

    public AddAgendaSumRecordFlowPopRequest setActiveNum(Integer activeNum) {
        this.activeNum = activeNum;
        return this;
    }
    public Integer getActiveNum() {
        return this.activeNum;
    }

    public AddAgendaSumRecordFlowPopRequest setAgendaId(Long agendaId) {
        this.agendaId = agendaId;
        return this;
    }
    public Long getAgendaId() {
        return this.agendaId;
    }

    public AddAgendaSumRecordFlowPopRequest setAttendancePercent(String attendancePercent) {
        this.attendancePercent = attendancePercent;
        return this;
    }
    public String getAttendancePercent() {
        return this.attendancePercent;
    }

    public AddAgendaSumRecordFlowPopRequest setFlowTime(Long flowTime) {
        this.flowTime = flowTime;
        return this;
    }
    public Long getFlowTime() {
        return this.flowTime;
    }

    public AddAgendaSumRecordFlowPopRequest setSessionName(String sessionName) {
        this.sessionName = sessionName;
        return this;
    }
    public String getSessionName() {
        return this.sessionName;
    }

    public AddAgendaSumRecordFlowPopRequest setTotalPv(Integer totalPv) {
        this.totalPv = totalPv;
        return this;
    }
    public Integer getTotalPv() {
        return this.totalPv;
    }

    public AddAgendaSumRecordFlowPopRequest setTotalUv(Integer totalUv) {
        this.totalUv = totalUv;
        return this;
    }
    public Integer getTotalUv() {
        return this.totalUv;
    }

}
