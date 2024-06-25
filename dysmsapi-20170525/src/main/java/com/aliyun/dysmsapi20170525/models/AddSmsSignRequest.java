// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsSignRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the signature application. The description cannot exceed 200 characters in length. The description is one of the reference information for signature review. We recommend that you describe the use scenarios of your services in detail, and provide information that can verify the services, such as a website URL, a domain name with an ICP filing, an app download URL, an official account name, or a mini program name. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the abbreviation of our company.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature files.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignFileList")
    public java.util.List<AddSmsSignRequestSignFileList> signFileList;

    /**
     * <p>The name of the signature.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The signature name is not case-sensitive. For example, [Alibaba Cloud Communication] and [alibaba cloud communication] are considered as the same name.</p>
     * </li>
     * <li><p>If your verification code signature and general-purpose signature have the same name, the system uses the general-purpose signature to send messages by default.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The source of the signature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the full name or abbreviation of an enterprise or institution</li>
     * <li><strong>1</strong>: the full name or abbreviation of a website that has obtained an ICP filing from the Ministry of Industry and Information Technology (MIIT) of China</li>
     * <li><strong>2</strong>: the full name or abbreviation of an app</li>
     * <li><strong>3</strong>: the full name or abbreviation of an official account or mini-program</li>
     * <li><strong>4</strong>: the full name or abbreviation of an e-commerce store</li>
     * <li><strong>5</strong>: the full name or abbreviation of a trademark</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignSource")
    public Integer signSource;

    /**
     * <p>The type of the signature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: verification code</li>
     * <li><strong>1</strong>: general-purpose</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignType")
    public Integer signType;

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

    public AddSmsSignRequest setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public static class AddSmsSignRequestSignFileList extends TeaModel {
        /**
         * <p>The Base64-encoded string of the qualification document. An image cannot exceed 2 MB in size. In some scenarios, you must upload supporting documents to apply for signatures. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">SMS signature specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R0lGODlhHAAmAKIHAKqqqsvLy0hISObm5vf394uL****</p>
         */
        @NameInMap("FileContents")
        public String fileContents;

        /**
         * <p>The format of the qualification document. You can upload multiple images. Images in JPG, PNG, GIF, or JPEG format are supported.</p>
         * <p>In some scenarios, you must upload supporting documents to apply for signatures. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">SMS signature specifications</a>.</p>
         * <blockquote>
         * <p>If you apply for a signature for other users or if the signature source is the name of an enterprise or public institution, you must upload a certificate and a letter of authorization. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Certificate</a> and <a href="https://help.aliyun.com/document_detail/56741.html">Letter of authorization</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
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
