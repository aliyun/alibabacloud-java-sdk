// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class UpdateDomainToDomainGroupRequest extends TeaModel {
    /**
     * <p>The data source for the domain names. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: custom input.</p>
     * </li>
     * <li><p><strong>2</strong>: file upload.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSource")
    public Integer dataSource;

    /**
     * <p>The ID of the domain name group. Call the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> API to get this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <p>An array of domain names. This parameter is required when DataSource is set to 1 (custom input).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <p>The Base64-encoded content of a file. This parameter is required if you set DataSource to 2. The file must be in <strong>.xls</strong> or <strong>.xlsx</strong> format, contain one domain name per line, and not exceed 2 MB.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("FileToUpload")
    public String fileToUpload;

    /**
     * <p>The language of API error messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to replace the existing domain names in the group. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: Adds the new domain names to the group.</p>
     * </li>
     * <li><p><strong>true</strong>: Replaces all existing domain names in the group with the new ones.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Replace")
    public Boolean replace;

    /**
     * <p>The user IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static UpdateDomainToDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainToDomainGroupRequest self = new UpdateDomainToDomainGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainToDomainGroupRequest setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public Integer getDataSource() {
        return this.dataSource;
    }

    public UpdateDomainToDomainGroupRequest setDomainGroupId(Long domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    public UpdateDomainToDomainGroupRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public UpdateDomainToDomainGroupRequest setFileToUpload(String fileToUpload) {
        this.fileToUpload = fileToUpload;
        return this;
    }
    public String getFileToUpload() {
        return this.fileToUpload;
    }

    public UpdateDomainToDomainGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDomainToDomainGroupRequest setReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }
    public Boolean getReplace() {
        return this.replace;
    }

    public UpdateDomainToDomainGroupRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
