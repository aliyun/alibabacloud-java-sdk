// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSSearchEnhanceRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("CustomConfigInfo")
    public java.util.Map<String, ?> customConfigInfo;

    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Fields")
    public java.util.List<String> fields;

    @NameInMap("Filters")
    public String filters;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Queries")
    public String queries;

    @NameInMap("RankModelInfo")
    public java.util.Map<String, ?> rankModelInfo;

    @NameInMap("Rows")
    public Integer rows;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("Sort")
    public java.util.List<String> sort;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uq")
    public String uq;

    public static PostMSSearchEnhanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PostMSSearchEnhanceRequest self = new PostMSSearchEnhanceRequest();
        return TeaModel.build(map, self);
    }

    public PostMSSearchEnhanceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PostMSSearchEnhanceRequest setCustomConfigInfo(java.util.Map<String, ?> customConfigInfo) {
        this.customConfigInfo = customConfigInfo;
        return this;
    }
    public java.util.Map<String, ?> getCustomConfigInfo() {
        return this.customConfigInfo;
    }

    public PostMSSearchEnhanceRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public PostMSSearchEnhanceRequest setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public PostMSSearchEnhanceRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public PostMSSearchEnhanceRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public PostMSSearchEnhanceRequest setQueries(String queries) {
        this.queries = queries;
        return this;
    }
    public String getQueries() {
        return this.queries;
    }

    public PostMSSearchEnhanceRequest setRankModelInfo(java.util.Map<String, ?> rankModelInfo) {
        this.rankModelInfo = rankModelInfo;
        return this;
    }
    public java.util.Map<String, ?> getRankModelInfo() {
        return this.rankModelInfo;
    }

    public PostMSSearchEnhanceRequest setRows(Integer rows) {
        this.rows = rows;
        return this;
    }
    public Integer getRows() {
        return this.rows;
    }

    public PostMSSearchEnhanceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public PostMSSearchEnhanceRequest setSort(java.util.List<String> sort) {
        this.sort = sort;
        return this;
    }
    public java.util.List<String> getSort() {
        return this.sort;
    }

    public PostMSSearchEnhanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PostMSSearchEnhanceRequest setUq(String uq) {
        this.uq = uq;
        return this;
    }
    public String getUq() {
        return this.uq;
    }

}
