// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ExportOASRequest extends TeaModel {
    /**
     * <p>The APIs that you want to export.</p>
     */
    @NameInMap("ApiIdList")
    public java.util.List<String> apiIdList;

    /**
     * <p>The exported format:</p>
     * <ul>
     * <li>json</li>
     * <li>yaml</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yaml</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>The API group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>42925e7f5209438186d5560239af5xxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The OAS version. Valid values:</p>
     * <ul>
     * <li><strong>oas2</strong></li>
     * <li><strong>oas3</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oas2</p>
     */
    @NameInMap("OasVersion")
    public String oasVersion;

    /**
     * <p>The number of pages in which you want to export the APIs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment to which the API is published. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong>: the production environment</li>
     * <li><strong>PRE</strong>: the pre-release environment</li>
     * <li><strong>TEST</strong>: the test environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>Specifies whether to export API Gateway extensions at the same time.</p>
     * 
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
