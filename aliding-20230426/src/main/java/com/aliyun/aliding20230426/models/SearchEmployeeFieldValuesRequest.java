// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchEmployeeFieldValuesRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("CreateFromTimeGMT")
    public String createFromTimeGMT;

    @NameInMap("CreateToTimeGMT")
    public String createToTimeGMT;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("Language")
    public String language;

    @NameInMap("ModifiedFromTimeGMT")
    public String modifiedFromTimeGMT;

    @NameInMap("ModifiedToTimeGMT")
    public String modifiedToTimeGMT;

    @NameInMap("OriginatorId")
    public String originatorId;

    @NameInMap("SearchFieldJson")
    public String searchFieldJson;

    @NameInMap("SystemToken")
    public String systemToken;

    @NameInMap("TargetFieldJson")
    public String targetFieldJson;

    public static SearchEmployeeFieldValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchEmployeeFieldValuesRequest self = new SearchEmployeeFieldValuesRequest();
        return TeaModel.build(map, self);
    }

    public SearchEmployeeFieldValuesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SearchEmployeeFieldValuesRequest setCreateFromTimeGMT(String createFromTimeGMT) {
        this.createFromTimeGMT = createFromTimeGMT;
        return this;
    }
    public String getCreateFromTimeGMT() {
        return this.createFromTimeGMT;
    }

    public SearchEmployeeFieldValuesRequest setCreateToTimeGMT(String createToTimeGMT) {
        this.createToTimeGMT = createToTimeGMT;
        return this;
    }
    public String getCreateToTimeGMT() {
        return this.createToTimeGMT;
    }

    public SearchEmployeeFieldValuesRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public SearchEmployeeFieldValuesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SearchEmployeeFieldValuesRequest setModifiedFromTimeGMT(String modifiedFromTimeGMT) {
        this.modifiedFromTimeGMT = modifiedFromTimeGMT;
        return this;
    }
    public String getModifiedFromTimeGMT() {
        return this.modifiedFromTimeGMT;
    }

    public SearchEmployeeFieldValuesRequest setModifiedToTimeGMT(String modifiedToTimeGMT) {
        this.modifiedToTimeGMT = modifiedToTimeGMT;
        return this;
    }
    public String getModifiedToTimeGMT() {
        return this.modifiedToTimeGMT;
    }

    public SearchEmployeeFieldValuesRequest setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
        return this;
    }
    public String getOriginatorId() {
        return this.originatorId;
    }

    public SearchEmployeeFieldValuesRequest setSearchFieldJson(String searchFieldJson) {
        this.searchFieldJson = searchFieldJson;
        return this;
    }
    public String getSearchFieldJson() {
        return this.searchFieldJson;
    }

    public SearchEmployeeFieldValuesRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public SearchEmployeeFieldValuesRequest setTargetFieldJson(String targetFieldJson) {
        this.targetFieldJson = targetFieldJson;
        return this;
    }
    public String getTargetFieldJson() {
        return this.targetFieldJson;
    }

}
