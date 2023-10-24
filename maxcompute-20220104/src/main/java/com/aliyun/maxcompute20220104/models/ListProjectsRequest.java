// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    @NameInMap("marker")
    public String marker;

    @NameInMap("maxItem")
    public Integer maxItem;

    @NameInMap("prefix")
    public String prefix;

    @NameInMap("quotaName")
    public String quotaName;

    @NameInMap("quotaNickName")
    public String quotaNickName;

    @NameInMap("region")
    public String region;

    @NameInMap("saleTags")
    public String saleTags;

    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("type")
    public String type;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListProjectsRequest setMaxItem(Integer maxItem) {
        this.maxItem = maxItem;
        return this;
    }
    public Integer getMaxItem() {
        return this.maxItem;
    }

    public ListProjectsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListProjectsRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public ListProjectsRequest setQuotaNickName(String quotaNickName) {
        this.quotaNickName = quotaNickName;
        return this;
    }
    public String getQuotaNickName() {
        return this.quotaNickName;
    }

    public ListProjectsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListProjectsRequest setSaleTags(String saleTags) {
        this.saleTags = saleTags;
        return this;
    }
    public String getSaleTags() {
        return this.saleTags;
    }

    public ListProjectsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListProjectsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
