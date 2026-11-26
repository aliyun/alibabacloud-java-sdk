// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDeviceBelongIdentifiersRequest extends TeaModel {
    /**
     * <p>The current page number. Valid values: 1 to 2147483647.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of record IDs to query. You can specify 1 to 100 positive integer decimal strings at a time. If this parameter is specified along with other filter parameters, the records that meet all the conditions are returned.</p>
     */
    @NameInMap("IdentifierIds")
    public java.util.List<String> identifierIds;

    /**
     * <p>The identifier type. MAC indicates the MAC address of the network interface controller (NIC), SystemSN indicates the system serial number, and BIOSSN indicates the BIOS serial number. This parameter is required when IdentifierValues is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>MAC</p>
     */
    @NameInMap("IdentifierType")
    public String identifierType;

    /**
     * <p>The list of identifier values for exact match. You can specify 1 to 100 items at a time, and each item can contain 1 to 128 characters. You must specify IdentifierType at the same time. Records that match any value in the array are returned. MAC addresses are uniformly converted to the lowercase colon-separated format. System serial numbers and BIOS serial numbers are case-sensitive and space-sensitive.</p>
     */
    @NameInMap("IdentifierValues")
    public java.util.List<String> identifierValues;

    /**
     * <p>A reserved pagination parameter. This value is not used in the current version. Use PageSize to specify the number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A reserved pagination cursor. This value is not used in the current version. Use CurrentPage to specify the page number.</p>
     * 
     * <strong>example:</strong>
     * <p>d9fbd0d1ac24be90</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The maximum number of records to return per page. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDeviceBelongIdentifiersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBelongIdentifiersRequest self = new ListDeviceBelongIdentifiersRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceBelongIdentifiersRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDeviceBelongIdentifiersRequest setIdentifierIds(java.util.List<String> identifierIds) {
        this.identifierIds = identifierIds;
        return this;
    }
    public java.util.List<String> getIdentifierIds() {
        return this.identifierIds;
    }

    public ListDeviceBelongIdentifiersRequest setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
        return this;
    }
    public String getIdentifierType() {
        return this.identifierType;
    }

    public ListDeviceBelongIdentifiersRequest setIdentifierValues(java.util.List<String> identifierValues) {
        this.identifierValues = identifierValues;
        return this;
    }
    public java.util.List<String> getIdentifierValues() {
        return this.identifierValues;
    }

    public ListDeviceBelongIdentifiersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeviceBelongIdentifiersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeviceBelongIdentifiersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
