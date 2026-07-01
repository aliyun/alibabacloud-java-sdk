// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateDigitalSmsTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The application description. Describe your business use case for the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>***业务需要</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature.</p>
     * 
     * <strong>example:</strong>
     * <p>签名</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>An array of objects that define the template content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateContents")
    public java.util.List<CreateDigitalSmsTemplateRequestTemplateContents> templateContents;

    /**
     * <p>The template name. The name can contain up to 20 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****模板</p>
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
        /**
         * <p>The file content, converted to a Base64 string. The file must be UTF-8 encoded before the Base64 conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>字符</p>
         */
        @NameInMap("FileContents")
        public String fileContents;

        /**
         * <p>The file name without the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>file-1</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1840901</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>The file suffix. Supported formats are <code>txt</code> for text; <code>gif</code>, <code>jpg</code>, and <code>png</code> for images; <code>mp3</code> for audio; and <code>mp4</code> for video. You can upload only one video file per template.</p>
         * 
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
