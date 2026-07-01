// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsSignRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the SMS signature scenario. The description cannot exceed 200 characters in length.</p>
     * <p>This is reference information for signature review. Providing a complete application description helps reviewers understand your business scenario and improves review efficiency. Guidelines for filling in:</p>
     * <ul>
     * <li><p>You can provide the use cases of a business that has been launched.</p>
     * </li>
     * <li><p>You can provide real-world SMS message examples to reflect your business scenarios.</p>
     * </li>
     * <li><p>You can provide the parameter values passed to variables and describe the business use cases and the reasons for choosing these variable attributes in detail.</p>
     * </li>
     * <li><p>You can provide the website links, registered domain names, or app store download links of your actual business.</p>
     * </li>
     * <li><p>For login scenarios, you can provide a test account and password.</p>
     * </li>
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
    public java.util.List<AddSmsSignRequestSignFileList> signFileList;

    /**
     * <p>The signature name. The signature name must comply with the <a href="~~108076#section-0p8-qn8-mmy~~">Signature specifications</a>.</p>
     * <blockquote>
     * <ul>
     * <li>Signature names are case-insensitive. For example, [Aliyun Communication] and [aliyun communication] are considered the same name.</li>
     * <li>When your verification code signature and general-purpose signature have the same name, the system uses the general-purpose signature to send SMS messages by default.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The source of the signature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Full name or abbreviation of an enterprise or public institution.</li>
     * <li><strong>1</strong>: Full name or abbreviation of a website registered with the Ministry of Industry and Information Technology (MIIT).</li>
     * <li><strong>2</strong>: Full name or abbreviation of an app.</li>
     * <li><strong>3</strong>: Full name or abbreviation of an official account or mini program.</li>
     * <li><strong>4</strong>: Full name or abbreviation of an e-commerce platform store name.</li>
     * <li><strong>5</strong>: Full name or abbreviation of a trademark name.</li>
     * </ul>
     * <p>For detailed descriptions of signature sources, see <a href="https://help.aliyun.com/en/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.0.4f9710fder2gR7#section-xup-k46-yi4">Signature source</a>.</p>
     * <blockquote>
     * <p>This API does not support applying for signatures whose signature source is <strong>Test or learning</strong> or <strong>Online trial</strong>. If you need to apply for signatures with these two sources, go to the <a href="https://dysms.console.aliyun.com/domestic/text/sign/add/qualification">Short Message Service (SMS) console</a> to submit your application.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignSource")
    public Integer signSource;

    /**
     * <p>The type of the signature.</p>
     * <ul>
     * <li><strong>0</strong>: Verification code</li>
     * <li><strong>1</strong>: General-purpose</li>
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
         * <p>The Base64-encoded string of the qualification certificate file for the signature. The image size cannot exceed 2 MB. In some scenarios, you need to upload a certificate file when you apply for a signature.</p>
         * <p>For detailed specifications, see <a href="https://help.aliyun.com/document_detail/463316.html">File upload specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R0lGODlhHAAmAKIHAKqqqsvLy0hISObm5vf394uL****</p>
         */
        @NameInMap("FileContents")
        public String fileContents;

        /**
         * <p>The format of the signature certificate file. Multiple images can be uploaded. Currently, JPG, PNG, GIF, and JPEG formats are supported. In some scenarios, you need to upload a certificate file when you apply for a signature.</p>
         * <blockquote>
         * <p>If the signature is for third-party use or if you are an individual-certified user whose self-use signature source is an enterprise or public institution name, you also need to upload a certificate file and a power of attorney. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Certificate file</a> and <a href="https://help.aliyun.com/document_detail/56741.html">Power of attorney</a>.</p>
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
