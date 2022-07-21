// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class UpdateDomainToDomainGroupRequest extends TeaModel {
    @NameInMap("DataSource")
    public Integer dataSource;

    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    @NameInMap("FileToUpload")
    public String fileToUpload;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Replace")
    public Boolean replace;

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
