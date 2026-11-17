// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumersRequest extends TeaModel {
    /**
     * <p>The validity status filter. Valid values: Permanent, InEffect, AboutToExpire, and Expired. You can specify multiple values separated by commas to form a union. If this parameter is not specified, all statuses are included and intersected with the name and display status filters.</p>
     * 
     * <strong>example:</strong>
     * <p>Expired,AboutToExpire</p>
     */
    @NameInMap("expireStatus")
    public String expireStatus;

    /**
     * <p>The gateway type used for filtering. Currently, <strong>AI</strong> and <strong>API</strong> gateway types are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>Specifies whether to return the full expiration reminder count. Default value: false. The statistical scope is limited only by the current account and gatewayType.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includeExpirationSummary")
    public Boolean includeExpirationSummary;

    /**
     * <p>The keyword used for fuzzy search by API name.</p>
     * 
     * <strong>example:</strong>
     * <p>UI-test</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The display status filter. Valid values: Enabled (enabled and not expired), Disabled (disabled regardless of expiration), and Expired (enabled and expired). If this parameter is not specified, all statuses are included and intersected with other filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("status")
    public String status;

    public static ListConsumersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumersRequest self = new ListConsumersRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumersRequest setExpireStatus(String expireStatus) {
        this.expireStatus = expireStatus;
        return this;
    }
    public String getExpireStatus() {
        return this.expireStatus;
    }

    public ListConsumersRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListConsumersRequest setIncludeExpirationSummary(Boolean includeExpirationSummary) {
        this.includeExpirationSummary = includeExpirationSummary;
        return this;
    }
    public Boolean getIncludeExpirationSummary() {
        return this.includeExpirationSummary;
    }

    public ListConsumersRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListConsumersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConsumersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
