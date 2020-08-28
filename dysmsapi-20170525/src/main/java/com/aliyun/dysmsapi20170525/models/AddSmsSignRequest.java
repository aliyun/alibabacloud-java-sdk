// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsSignRequest extends TeaModel {
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
    public java.util.List<AddSmsSignRequestSignFileList> signFileList;

    @NameInMap("Remark")
    @Validation(required = true)
    public String remark;

    public static AddSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSmsSignRequest self = new AddSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public static class AddSmsSignRequestSignFileList extends TeaModel {
        @NameInMap("FileSuffix")
        @Validation(required = true)
        public String fileSuffix;

        @NameInMap("FileContents")
        @Validation(required = true)
        public String fileContents;

        public static AddSmsSignRequestSignFileList build(java.util.Map<String, ?> map) throws Exception {
            AddSmsSignRequestSignFileList self = new AddSmsSignRequestSignFileList();
            return TeaModel.build(map, self);
        }

    }

}
