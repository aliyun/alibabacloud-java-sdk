// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsSignRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the SMS signature application. The description cannot exceed 200 characters in length.</p>
     * <p>The description is used as a reference for signature review. A complete description helps reviewers understand your business scenario and improves review efficiency. Guidelines:</p>
     * <ul>
     * <li>Provide the use case of a service that is already online.</li>
     * <li>Provide an SMS example from a real scenario to illustrate your business scenario.</li>
     * <li>Provide the values passed for variables, and describe the business scenario in detail and the reason for choosing the variable attributes.</li>
     * <li>Provide the website URL of the actual service, a filed domain name, or an app store download link.</li>
     * <li>For logon scenarios, provide a test account and password.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>当前的短信签名应用于双11大促推广营销</p>
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
     * <p>The signature name.</p>
     * <blockquote>
     * <p>You can modify a signature that has been approved, but you cannot change its name. The modified signature must be reviewed and approved before it can be used. The original signature cannot be used until the review is complete.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The signature source. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: full name or abbreviation of an enterprise or public institution.</li>
     * <li><strong>1</strong>: full name or abbreviation of a website filed with the Ministry of Industry and Information Technology (MIIT).</li>
     * <li><strong>2</strong>: full name or abbreviation of an app.</li>
     * <li><strong>3</strong>: full name or abbreviation of an official account or mini program.</li>
     * <li><strong>4</strong>: full name or abbreviation of a store on an e-commerce platform.</li>
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
     * <p>The signature type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: verification code.</p>
     * </li>
     * <li><p><strong>1</strong>: general.</p>
     * </li>
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
         * <p>签名的纸质证明文件经base64编码后的字符串。图片不超过2 MB。</p>
         * <p>个别场景下，申请签名需要上传证明文件。详细说明，请参见<a href="https://help.aliyun.com/document_detail/108076.html">短信签名规范</a>。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R0lGODlhHAAmAKIHAKqqqsvLy0hISObm5vf394uLiwAA</p>
         */
        @NameInMap("FileContents")
        public String fileContents;

        /**
         * <p>签名的证明文件格式，支持上传多张图片。当前支持JPG、PNG、GIF或JPEG格式的图片。</p>
         * <p>个别场景下，申请签名需要上传证明文件。详细说明，请参见<a href="https://help.aliyun.com/document_detail/108076.html">短信签名规范</a>。</p>
         * <blockquote>
         * <p>如果签名用途为他用或个人认证用户的自用签名来源为企事业单位名时，还需上传证明文件和委托授权书，详情请参见<a href="https://help.aliyun.com/document_detail/108076.html">证明文件</a>和<a href="https://help.aliyun.com/document_detail/56741.html">授权委托书</a>。</p>
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
