// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsSignRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SignFileList")
    public java.util.List<AddSmsSignRequestSignFileList> signFileList;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignSource")
    public Integer signSource;

    public static AddSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSmsSignRequest self = new AddSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public AddSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddSmsSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddSmsSignRequest setSignFileList(java.util.List<AddSmsSignRequestSignFileList> signFileList) {
        this.signFileList = signFileList;
        return this;
    }
    public java.util.List<AddSmsSignRequestSignFileList> getSignFileList() {
        return this.signFileList;
    }

    public AddSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public AddSmsSignRequest setSignSource(Integer signSource) {
        this.signSource = signSource;
        return this;
    }
    public Integer getSignSource() {
        return this.signSource;
    }

    public static class AddSmsSignRequestSignFileList extends TeaModel {
        @NameInMap("FileContents")
        public String fileContents;

        @NameInMap("FileSuffix")
        public String fileSuffix;

        public static AddSmsSignRequestSignFileList build(java.util.Map<String, ?> map) throws Exception {
            AddSmsSignRequestSignFileList self = new AddSmsSignRequestSignFileList();
            return TeaModel.build(map, self);
        }

        public AddSmsSignRequestSignFileList setFileContents(String fileContents) {
            this.fileContents = fileContents;
            return this;
        }
        public String getFileContents() {
            return this.fileContents;
        }

        public AddSmsSignRequestSignFileList setFileSuffix(String fileSuffix) {
            this.fileSuffix = fileSuffix;
            return this;
        }
        public String getFileSuffix() {
            return this.fileSuffix;
        }

    }

}
