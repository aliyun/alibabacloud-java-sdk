// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ExportOASShrinkRequest extends TeaModel {
    @NameInMap("ApiIdList")
    public String apiIdListShrink;

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

    public static ExportOASShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportOASShrinkRequest self = new ExportOASShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportOASShrinkRequest setApiIdListShrink(String apiIdListShrink) {
        this.apiIdListShrink = apiIdListShrink;
        return this;
    }
    public String getApiIdListShrink() {
        return this.apiIdListShrink;
    }

    public ExportOASShrinkRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ExportOASShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExportOASShrinkRequest setOasVersion(String oasVersion) {
        this.oasVersion = oasVersion;
        return this;
    }
    public String getOasVersion() {
        return this.oasVersion;
    }

    public ExportOASShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ExportOASShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ExportOASShrinkRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public ExportOASShrinkRequest setWithXExtensions(Boolean withXExtensions) {
        this.withXExtensions = withXExtensions;
        return this;
    }
    public Boolean getWithXExtensions() {
        return this.withXExtensions;
    }

}
