// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeCorpSubmissionRequest extends TeaModel {
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

    public static GetMeCorpSubmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMeCorpSubmissionRequest self = new GetMeCorpSubmissionRequest();
        return TeaModel.build(map, self);
    }

    public GetMeCorpSubmissionRequest setAppTypes(String appTypes) {
        this.appTypes = appTypes;
        return this;
    }
    public String getAppTypes() {
        return this.appTypes;
    }

    public GetMeCorpSubmissionRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetMeCorpSubmissionRequest setCreateFromTimeGMT(Long createFromTimeGMT) {
        this.createFromTimeGMT = createFromTimeGMT;
        return this;
    }
    public Long getCreateFromTimeGMT() {
        return this.createFromTimeGMT;
    }

    public GetMeCorpSubmissionRequest setCreateToTimeGMT(Long createToTimeGMT) {
        this.createToTimeGMT = createToTimeGMT;
        return this;
    }
    public Long getCreateToTimeGMT() {
        return this.createToTimeGMT;
    }

    public GetMeCorpSubmissionRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetMeCorpSubmissionRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetMeCorpSubmissionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetMeCorpSubmissionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMeCorpSubmissionRequest setProcessCodes(String processCodes) {
        this.processCodes = processCodes;
        return this;
    }
    public String getProcessCodes() {
        return this.processCodes;
    }

    public GetMeCorpSubmissionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
