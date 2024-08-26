// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDSRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Algorithm")
    public Integer algorithm;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f58fa917424383934c7b0cf1a90f61d692745680fa06f5ecdbe0924e86de9598</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DigestType")
    public Integer digestType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KeyTag")
    public Integer keyTag;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForModifyingDSRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForModifyingDSRecordRequest self = new SaveSingleTaskForModifyingDSRecordRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForModifyingDSRecordRequest setAlgorithm(Integer algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public Integer getAlgorithm() {
        return this.algorithm;
    }

    public SaveSingleTaskForModifyingDSRecordRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public SaveSingleTaskForModifyingDSRecordRequest setDigestType(Integer digestType) {
        this.digestType = digestType;
        return this;
    }
    public Integer getDigestType() {
        return this.digestType;
    }

    public SaveSingleTaskForModifyingDSRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForModifyingDSRecordRequest setKeyTag(Integer keyTag) {
        this.keyTag = keyTag;
        return this;
    }
    public Integer getKeyTag() {
        return this.keyTag;
    }

    public SaveSingleTaskForModifyingDSRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForModifyingDSRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
