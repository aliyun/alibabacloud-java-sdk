// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateOpenGlobalDataRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("AppMaxVersion")
    public String appMaxVersion;

    @NameInMap("AppMinVersion")
    public String appMinVersion;

    @NameInMap("BizType")
    @Validation(required = true)
    public String bizType;

    @NameInMap("ExtAttrStr")
    public String extAttrStr;

    @NameInMap("MaxUid")
    public Long maxUid;

    @NameInMap("MinUid")
    public Long minUid;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("Payload")
    @Validation(required = true)
    public String payload;

    @NameInMap("ThirdMsgId")
    @Validation(required = true)
    public String thirdMsgId;

    @NameInMap("Uids")
    public String uids;

    @NameInMap("ValidTimeEnd")
    public Long validTimeEnd;

    @NameInMap("ValidTimeStart")
    public Long validTimeStart;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static CreateOpenGlobalDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenGlobalDataRequest self = new CreateOpenGlobalDataRequest();
        return TeaModel.build(map, self);
    }

}
