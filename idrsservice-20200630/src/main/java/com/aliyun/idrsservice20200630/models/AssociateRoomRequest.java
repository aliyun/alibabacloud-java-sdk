// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AssociateRoomRequest extends TeaModel {
    // 质检应用id
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientBaseParam")
    public String clientBaseParam;

    @NameInMap("ClientVersion")
    public String clientVersion;

    // 部门id
    @NameInMap("DepartmentId")
    public String departmentId;

    // Mrtc房间id
    @NameInMap("RoomId")
    public String roomId;

    public static AssociateRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateRoomRequest self = new AssociateRoomRequest();
        return TeaModel.build(map, self);
    }

    public AssociateRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AssociateRoomRequest setClientBaseParam(String clientBaseParam) {
        this.clientBaseParam = clientBaseParam;
        return this;
    }
    public String getClientBaseParam() {
        return this.clientBaseParam;
    }

    public AssociateRoomRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public AssociateRoomRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public AssociateRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
