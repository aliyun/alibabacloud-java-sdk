// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateOpenSingleDataRequest extends TeaModel {
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

    @NameInMap("CheckOnline")
    public Boolean checkOnline;

    @NameInMap("ExtAttrStr")
    public String extAttrStr;

    @NameInMap("LinkToken")
    @Validation(required = true)
    public String linkToken;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("Payload")
    @Validation(required = true)
    public String payload;

    @NameInMap("ThirdMsgId")
    @Validation(required = true)
    public String thirdMsgId;

    @NameInMap("ValidTimeEnd")
    public Long validTimeEnd;

    @NameInMap("ValidTimeStart")
    public Long validTimeStart;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static CreateOpenSingleDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSingleDataRequest self = new CreateOpenSingleDataRequest();
        return TeaModel.build(map, self);
    }

}
