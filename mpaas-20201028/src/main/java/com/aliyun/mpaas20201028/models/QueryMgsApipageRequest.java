// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsApipageRequest extends TeaModel {
    @NameInMap("ApiStatus")
    public String apiStatus;

    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Format")
    public String format;

    @NameInMap("Host")
    public String host;

    @NameInMap("NeedEncrypt")
    public String needEncrypt;

    @NameInMap("NeedEtag")
    public String needEtag;

    @NameInMap("NeedSign")
    public String needSign;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OptFuzzy")
    public String optFuzzy;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SysId")
    public Long sysId;

    @NameInMap("SysName")
    public String sysName;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryMgsApipageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApipageRequest self = new QueryMgsApipageRequest();
        return TeaModel.build(map, self);
    }

    public QueryMgsApipageRequest setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }
    public String getApiStatus() {
        return this.apiStatus;
    }

    public QueryMgsApipageRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public QueryMgsApipageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryMgsApipageRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public QueryMgsApipageRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public QueryMgsApipageRequest setNeedEncrypt(String needEncrypt) {
        this.needEncrypt = needEncrypt;
        return this;
    }
    public String getNeedEncrypt() {
        return this.needEncrypt;
    }

    public QueryMgsApipageRequest setNeedEtag(String needEtag) {
        this.needEtag = needEtag;
        return this;
    }
    public String getNeedEtag() {
        return this.needEtag;
    }

    public QueryMgsApipageRequest setNeedSign(String needSign) {
        this.needSign = needSign;
        return this;
    }
    public String getNeedSign() {
        return this.needSign;
    }

    public QueryMgsApipageRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public QueryMgsApipageRequest setOptFuzzy(String optFuzzy) {
        this.optFuzzy = optFuzzy;
        return this;
    }
    public String getOptFuzzy() {
        return this.optFuzzy;
    }

    public QueryMgsApipageRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryMgsApipageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMgsApipageRequest setSysId(Long sysId) {
        this.sysId = sysId;
        return this;
    }
    public Long getSysId() {
        return this.sysId;
    }

    public QueryMgsApipageRequest setSysName(String sysName) {
        this.sysName = sysName;
        return this;
    }
    public String getSysName() {
        return this.sysName;
    }

    public QueryMgsApipageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMgsApipageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
