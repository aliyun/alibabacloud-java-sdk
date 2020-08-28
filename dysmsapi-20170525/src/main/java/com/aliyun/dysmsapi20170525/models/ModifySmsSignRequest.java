// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsSignRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SignName")
    @Validation(required = true)
    public String signName;

    @NameInMap("SignSource")
    @Validation(required = true)
    public Integer signSource;

    @NameInMap("SignFileList")
    @Validation(required = true)
    public java.util.List<ModifySmsSignRequestSignFileList> signFileList;

    @NameInMap("Remark")
    @Validation(required = true)
    public String remark;

    public static ModifySmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySmsSignRequest self = new ModifySmsSignRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifySmsSignRequestSignFileList extends TeaModel {
        @NameInMap("FileSuffix")
        @Validation(required = true)
        public String fileSuffix;

        @NameInMap("FileContents")
        @Validation(required = true)
        public String fileContents;

        public static ModifySmsSignRequestSignFileList build(java.util.Map<String, ?> map) throws Exception {
            ModifySmsSignRequestSignFileList self = new ModifySmsSignRequestSignFileList();
            return TeaModel.build(map, self);
        }

    }

}
