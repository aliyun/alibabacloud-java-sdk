// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UploadRobotTaskCalledFileRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    @NameInMap("CalledNumber")
    @Validation(required = true)
    public String calledNumber;

    @NameInMap("TtsParam")
    public String ttsParam;

    @NameInMap("TtsParamHead")
    public String ttsParamHead;

    public static UploadRobotTaskCalledFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRobotTaskCalledFileRequest self = new UploadRobotTaskCalledFileRequest();
        return TeaModel.build(map, self);
    }

}
