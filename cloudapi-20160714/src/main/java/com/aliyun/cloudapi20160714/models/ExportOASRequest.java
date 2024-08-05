// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ExportOASRequest extends TeaModel {
    @NameInMap("ApiIdList")
    public java.util.List<String> apiIdList;

    /**
     * <strong>example:</strong>
     * <p>yaml</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <strong>example:</strong>
     * <p>42925e7f5209438186d5560239af5xxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>oas2</p>
     */
    @NameInMap("OasVersion")
    public String oasVersion;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithXExtensions")
    public Boolean withXExtensions;

    public static ExportOASRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportOASRequest self = new ExportOASRequest();
        return TeaModel.build(map, self);
    }

    public ExportOASRequest setApiIdList(java.util.List<String> apiIdList) {
        this.apiIdList = apiIdList;
        return this;
    }
    public java.util.List<String> getApiIdList() {
        return this.apiIdList;
    }

    public ExportOASRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ExportOASRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExportOASRequest setOasVersion(String oasVersion) {
        this.oasVersion = oasVersion;
        return this;
    }
    public String getOasVersion() {
        return this.oasVersion;
    }

    public ExportOASRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ExportOASRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ExportOASRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public ExportOASRequest setWithXExtensions(Boolean withXExtensions) {
        this.withXExtensions = withXExtensions;
        return this;
    }
    public Boolean getWithXExtensions() {
        return this.withXExtensions;
    }

}
