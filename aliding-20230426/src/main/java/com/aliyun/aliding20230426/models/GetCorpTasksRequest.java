// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCorpTasksRequest extends TeaModel {
    @NameInMap("AppTypes")
    public String appTypes;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("CreateFromTimeGMT")
    public Long createFromTimeGMT;

    @NameInMap("CreateToTimeGMT")
    public Long createToTimeGMT;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Language")
    public String language;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProcessCodes")
    public String processCodes;

    @NameInMap("Token")
    public String token;

    public static GetCorpTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCorpTasksRequest self = new GetCorpTasksRequest();
        return TeaModel.build(map, self);
    }

    public GetCorpTasksRequest setAppTypes(String appTypes) {
        this.appTypes = appTypes;
        return this;
    }
    public String getAppTypes() {
        return this.appTypes;
    }

    public GetCorpTasksRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetCorpTasksRequest setCreateFromTimeGMT(Long createFromTimeGMT) {
        this.createFromTimeGMT = createFromTimeGMT;
        return this;
    }
    public Long getCreateFromTimeGMT() {
        return this.createFromTimeGMT;
    }

    public GetCorpTasksRequest setCreateToTimeGMT(Long createToTimeGMT) {
        this.createToTimeGMT = createToTimeGMT;
        return this;
    }
    public Long getCreateToTimeGMT() {
        return this.createToTimeGMT;
    }

    public GetCorpTasksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetCorpTasksRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetCorpTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetCorpTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCorpTasksRequest setProcessCodes(String processCodes) {
        this.processCodes = processCodes;
        return this;
    }
    public String getProcessCodes() {
        return this.processCodes;
    }

    public GetCorpTasksRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
