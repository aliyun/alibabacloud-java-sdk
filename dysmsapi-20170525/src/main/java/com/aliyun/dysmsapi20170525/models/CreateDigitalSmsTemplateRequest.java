// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateDigitalSmsTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SignName")
    public String signName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateContents")
    public java.util.List<CreateDigitalSmsTemplateRequestTemplateContents> templateContents;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateDigitalSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalSmsTemplateRequest self = new CreateDigitalSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalSmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDigitalSmsTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateDigitalSmsTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDigitalSmsTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDigitalSmsTemplateRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateDigitalSmsTemplateRequest setTemplateContents(java.util.List<CreateDigitalSmsTemplateRequestTemplateContents> templateContents) {
        this.templateContents = templateContents;
        return this;
    }
    public java.util.List<CreateDigitalSmsTemplateRequestTemplateContents> getTemplateContents() {
        return this.templateContents;
    }

    public CreateDigitalSmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class CreateDigitalSmsTemplateRequestTemplateContents extends TeaModel {
        @NameInMap("FileContents")
        public String fileContents;

        /**
         * <strong>example:</strong>
         * <p>file-1</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>1840901</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("FileSuffix")
        public String fileSuffix;

        public static CreateDigitalSmsTemplateRequestTemplateContents build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalSmsTemplateRequestTemplateContents self = new CreateDigitalSmsTemplateRequestTemplateContents();
            return TeaModel.build(map, self);
        }

        public CreateDigitalSmsTemplateRequestTemplateContents setFileContents(String fileContents) {
            this.fileContents = fileContents;
            return this;
        }
        public String getFileContents() {
            return this.fileContents;
        }

        public CreateDigitalSmsTemplateRequestTemplateContents setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateDigitalSmsTemplateRequestTemplateContents setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public CreateDigitalSmsTemplateRequestTemplateContents setFileSuffix(String fileSuffix) {
            this.fileSuffix = fileSuffix;
            return this;
        }
        public String getFileSuffix() {
            return this.fileSuffix;
        }

    }

}
