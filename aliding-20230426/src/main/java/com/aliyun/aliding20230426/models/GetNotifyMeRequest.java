// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNotifyMeRequest extends TeaModel {
    @NameInMap("AppTypes")
    public String appTypes;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("CreateFromTimeGMT")
    public Long createFromTimeGMT;

    @NameInMap("CreateToTimeGMT")
    public Long createToTimeGMT;

    @NameInMap("InstanceCreateFromTimeGMT")
    public Long instanceCreateFromTimeGMT;

    @NameInMap("InstanceCreateToTimeGMT")
    public Long instanceCreateToTimeGMT;

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

    public static GetNotifyMeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNotifyMeRequest self = new GetNotifyMeRequest();
        return TeaModel.build(map, self);
    }

    public GetNotifyMeRequest setAppTypes(String appTypes) {
        this.appTypes = appTypes;
        return this;
    }
    public String getAppTypes() {
        return this.appTypes;
    }

    public GetNotifyMeRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetNotifyMeRequest setCreateFromTimeGMT(Long createFromTimeGMT) {
        this.createFromTimeGMT = createFromTimeGMT;
        return this;
    }
    public Long getCreateFromTimeGMT() {
        return this.createFromTimeGMT;
    }

    public GetNotifyMeRequest setCreateToTimeGMT(Long createToTimeGMT) {
        this.createToTimeGMT = createToTimeGMT;
        return this;
    }
    public Long getCreateToTimeGMT() {
        return this.createToTimeGMT;
    }

    public GetNotifyMeRequest setInstanceCreateFromTimeGMT(Long instanceCreateFromTimeGMT) {
        this.instanceCreateFromTimeGMT = instanceCreateFromTimeGMT;
        return this;
    }
    public Long getInstanceCreateFromTimeGMT() {
        return this.instanceCreateFromTimeGMT;
    }

    public GetNotifyMeRequest setInstanceCreateToTimeGMT(Long instanceCreateToTimeGMT) {
        this.instanceCreateToTimeGMT = instanceCreateToTimeGMT;
        return this;
    }
    public Long getInstanceCreateToTimeGMT() {
        return this.instanceCreateToTimeGMT;
    }

    public GetNotifyMeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetNotifyMeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetNotifyMeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetNotifyMeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetNotifyMeRequest setProcessCodes(String processCodes) {
        this.processCodes = processCodes;
        return this;
    }
    public String getProcessCodes() {
        return this.processCodes;
    }

    public GetNotifyMeRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
