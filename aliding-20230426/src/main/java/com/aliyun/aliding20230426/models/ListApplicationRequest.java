// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListApplicationRequest extends TeaModel {
    @NameInMap("AppFilter")
    public String appFilter;

    @NameInMap("AppNameSearchKeyword")
    public String appNameSearchKeyword;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Token")
    public String token;

    public static ListApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRequest self = new ListApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationRequest setAppFilter(String appFilter) {
        this.appFilter = appFilter;
        return this;
    }
    public String getAppFilter() {
        return this.appFilter;
    }

    public ListApplicationRequest setAppNameSearchKeyword(String appNameSearchKeyword) {
        this.appNameSearchKeyword = appNameSearchKeyword;
        return this;
    }
    public String getAppNameSearchKeyword() {
        return this.appNameSearchKeyword;
    }

    public ListApplicationRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListApplicationRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
