// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListCertRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-05-13 12:59:45</p>
     */
    @NameInMap("AfterDate")
    public String afterDate;

    /**
     * <strong>example:</strong>
     * <p>2025-09-04</p>
     */
    @NameInMap("BeforeDate")
    public String beforeDate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>1ef79512-569b-6a4e-9105-9b91473562f7</p>
     */
    @NameInMap("InstanceUuid")
    public String instanceUuid;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <strong>example:</strong>
     * <p>ISSUE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>CLIENT</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCertRequest self = new ListCertRequest();
        return TeaModel.build(map, self);
    }

    public ListCertRequest setAfterDate(String afterDate) {
        this.afterDate = afterDate;
        return this;
    }
    public String getAfterDate() {
        return this.afterDate;
    }

    public ListCertRequest setBeforeDate(String beforeDate) {
        this.beforeDate = beforeDate;
        return this;
    }
    public String getBeforeDate() {
        return this.beforeDate;
    }

    public ListCertRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCertRequest setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public ListCertRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCertRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCertRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public ListCertRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListCertRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCertRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
