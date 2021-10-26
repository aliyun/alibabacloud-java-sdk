// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsSignRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SignFileList")
    public java.util.List<ModifySmsSignRequestSignFileList> signFileList;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignSource")
    public Integer signSource;

    public static ModifySmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySmsSignRequest self = new ModifySmsSignRequest();
        return TeaModel.build(map, self);
    }

    public ModifySmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySmsSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifySmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySmsSignRequest setSignFileList(java.util.List<ModifySmsSignRequestSignFileList> signFileList) {
        this.signFileList = signFileList;
        return this;
    }
    public java.util.List<ModifySmsSignRequestSignFileList> getSignFileList() {
        return this.signFileList;
    }

    public ModifySmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public ModifySmsSignRequest setSignSource(Integer signSource) {
        this.signSource = signSource;
        return this;
    }
    public Integer getSignSource() {
        return this.signSource;
    }

    public static class ModifySmsSignRequestSignFileList extends TeaModel {
        @NameInMap("FileContents")
        public String fileContents;

        @NameInMap("FileSuffix")
        public String fileSuffix;

        public static ModifySmsSignRequestSignFileList build(java.util.Map<String, ?> map) throws Exception {
            ModifySmsSignRequestSignFileList self = new ModifySmsSignRequestSignFileList();
            return TeaModel.build(map, self);
        }

        public ModifySmsSignRequestSignFileList setFileContents(String fileContents) {
            this.fileContents = fileContents;
            return this;
        }
        public String getFileContents() {
            return this.fileContents;
        }

        public ModifySmsSignRequestSignFileList setFileSuffix(String fileSuffix) {
            this.fileSuffix = fileSuffix;
            return this;
        }
        public String getFileSuffix() {
            return this.fileSuffix;
        }

    }

}
