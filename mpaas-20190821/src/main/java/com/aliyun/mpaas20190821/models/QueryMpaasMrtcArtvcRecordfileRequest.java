// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMpaasMrtcArtvcRecordfileRequest extends TeaModel {
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

    public static QueryMpaasMrtcArtvcRecordfileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMpaasMrtcArtvcRecordfileRequest self = new QueryMpaasMrtcArtvcRecordfileRequest();
        return TeaModel.build(map, self);
    }

}
