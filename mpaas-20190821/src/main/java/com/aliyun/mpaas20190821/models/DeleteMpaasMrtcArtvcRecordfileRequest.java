// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class DeleteMpaasMrtcArtvcRecordfileRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BizAppCode")
    public String bizAppCode;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("BizRequestId")
    public String bizRequestId;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("S")
    public String s;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMpaasMrtcArtvcRecordfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMpaasMrtcArtvcRecordfileRequest self = new DeleteMpaasMrtcArtvcRecordfileRequest();
        return TeaModel.build(map, self);
    }

}
