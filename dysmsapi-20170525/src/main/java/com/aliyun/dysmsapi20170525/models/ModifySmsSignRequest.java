// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsSignRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The scenario description of your released services. Provide the information of your services, such as a website URL, a domain name with an ICP filing, an app download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</p>
     * <blockquote>
     * <p>The description can be up to 200 characters in length.</p>
     * </blockquote>
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
     * <p>The list of signature files.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignFileList")
    public java.util.List<ModifySmsSignRequestSignFileList> signFileList;

    /**
     * <p>The signature.</p>
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
     * <li><strong>0</strong>: full name or abbreviation of an enterprise or institution.</li>
     * <li><strong>1</strong>: full name or abbreviation of a website with Ministry of Industry and Information Technology (MIIT) filing.</li>
     * <li><strong>2</strong>: full name or abbreviation of an app.</li>
     * <li><strong>3</strong>: full name or abbreviation of a WeChat official account or applet.</li>
     * <li><strong>4</strong>: full name or abbreviation of an e-commerce store.</li>
     * <li><strong>5</strong>: full name or abbreviation of a trademark.</li>
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
     * <li><strong>0</strong>: verification-code signature</li>
     * <li><strong>1</strong>: general-purpose signature</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignType")
    public Integer signType;

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

    public ModifySmsSignRequest setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public static class ModifySmsSignRequestSignFileList extends TeaModel {
        /**
         * <p>The base64-encoded string of the signed files. The size of the image cannot exceed 2 MB.</p>
         * <p>In some scenarios, documents are required to prove your identity. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Signature specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R0lGODlhHAAmAKIHAKqqqsvLy0hISObm5vf394uLiwAA</p>
         */
        @NameInMap("FileContents")
        public String fileContents;

        /**
         * <p>The format of the documents. You can upload multiple images. JPG, PNG, GIF, and JPEG are supported.</p>
         * <p>In some scenarios, documents are required to prove your identity. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Signature specifications</a>.</p>
         * <blockquote>
         * <p>If the signature is used for other purposes or the signature source is an enterprise or public institution, you must upload some documents and an authorization letter. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Documents</a> and <a href="https://help.aliyun.com/document_detail/56741.html">Letter of authorization</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
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
