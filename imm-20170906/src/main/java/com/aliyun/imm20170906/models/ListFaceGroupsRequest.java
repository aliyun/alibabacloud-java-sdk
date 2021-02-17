// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListFaceGroupsRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("RemarksAQuery")
    public String remarksAQuery;

    @NameInMap("RemarksBQuery")
    public String remarksBQuery;

    @NameInMap("RemarksCQuery")
    public String remarksCQuery;

    @NameInMap("RemarksDQuery")
    public String remarksDQuery;

    @NameInMap("RemarksArrayAQuery")
    public String remarksArrayAQuery;

    @NameInMap("RemarksArrayBQuery")
    public String remarksArrayBQuery;

    @NameInMap("ExternalId")
    public String externalId;

    public static ListFaceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFaceGroupsRequest self = new ListFaceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListFaceGroupsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListFaceGroupsRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public ListFaceGroupsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListFaceGroupsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFaceGroupsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFaceGroupsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListFaceGroupsRequest setRemarksAQuery(String remarksAQuery) {
        this.remarksAQuery = remarksAQuery;
        return this;
    }
    public String getRemarksAQuery() {
        return this.remarksAQuery;
    }

    public ListFaceGroupsRequest setRemarksBQuery(String remarksBQuery) {
        this.remarksBQuery = remarksBQuery;
        return this;
    }
    public String getRemarksBQuery() {
        return this.remarksBQuery;
    }

    public ListFaceGroupsRequest setRemarksCQuery(String remarksCQuery) {
        this.remarksCQuery = remarksCQuery;
        return this;
    }
    public String getRemarksCQuery() {
        return this.remarksCQuery;
    }

    public ListFaceGroupsRequest setRemarksDQuery(String remarksDQuery) {
        this.remarksDQuery = remarksDQuery;
        return this;
    }
    public String getRemarksDQuery() {
        return this.remarksDQuery;
    }

    public ListFaceGroupsRequest setRemarksArrayAQuery(String remarksArrayAQuery) {
        this.remarksArrayAQuery = remarksArrayAQuery;
        return this;
    }
    public String getRemarksArrayAQuery() {
        return this.remarksArrayAQuery;
    }

    public ListFaceGroupsRequest setRemarksArrayBQuery(String remarksArrayBQuery) {
        this.remarksArrayBQuery = remarksArrayBQuery;
        return this;
    }
    public String getRemarksArrayBQuery() {
        return this.remarksArrayBQuery;
    }

    public ListFaceGroupsRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
