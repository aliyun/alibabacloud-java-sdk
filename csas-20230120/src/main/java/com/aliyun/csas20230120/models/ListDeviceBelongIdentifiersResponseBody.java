// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDeviceBelongIdentifiersResponseBody extends TeaModel {
    /**
     * <p>The device ownership identifier records on the current page. An empty list is returned if no matching records are found.</p>
     */
    @NameInMap("Identifiers")
    public java.util.List<ListDeviceBelongIdentifiersResponseBodyIdentifiers> identifiers;

    /**
     * <p>A reserved pagination field. No valid value is returned in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A reserved pagination cursor. No valid value is returned in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>d9fbd0d1ac24be90</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A92B549-EC82-5F79-8301-63711AFC9DCE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match the filter conditions for the current tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDeviceBelongIdentifiersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBelongIdentifiersResponseBody self = new ListDeviceBelongIdentifiersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceBelongIdentifiersResponseBody setIdentifiers(java.util.List<ListDeviceBelongIdentifiersResponseBodyIdentifiers> identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public java.util.List<ListDeviceBelongIdentifiersResponseBodyIdentifiers> getIdentifiers() {
        return this.identifiers;
    }

    public ListDeviceBelongIdentifiersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeviceBelongIdentifiersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeviceBelongIdentifiersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceBelongIdentifiersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeviceBelongIdentifiersResponseBodyIdentifiers extends TeaModel {
        /**
         * <p>The time when the record was created. The time is in RFC 3339 format and includes time zone information.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-24T10:30:00+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the identifier record, returned as a decimal string. You can use the ID to query or remove the record.</p>
         * 
         * <strong>example:</strong>
         * <p>482731</p>
         */
        @NameInMap("IdentifierId")
        public String identifierId;

        /**
         * <p>The identifier type. MAC indicates the MAC address of the network interface controller (NIC), SystemSN indicates the system serial number, and BIOSSN indicates the BIOS serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>MAC</p>
         */
        @NameInMap("IdentifierType")
        public String identifierType;

        /**
         * <p>The identifier value in the record. MAC addresses are in the lowercase colon-separated format. System serial numbers and BIOS serial numbers are returned as recorded.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00:00:00:00:01</p>
         */
        @NameInMap("IdentifierValue")
        public String identifierValue;

        public static ListDeviceBelongIdentifiersResponseBodyIdentifiers build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceBelongIdentifiersResponseBodyIdentifiers self = new ListDeviceBelongIdentifiersResponseBodyIdentifiers();
            return TeaModel.build(map, self);
        }

        public ListDeviceBelongIdentifiersResponseBodyIdentifiers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDeviceBelongIdentifiersResponseBodyIdentifiers setIdentifierId(String identifierId) {
            this.identifierId = identifierId;
            return this;
        }
        public String getIdentifierId() {
            return this.identifierId;
        }

        public ListDeviceBelongIdentifiersResponseBodyIdentifiers setIdentifierType(String identifierType) {
            this.identifierType = identifierType;
            return this;
        }
        public String getIdentifierType() {
            return this.identifierType;
        }

        public ListDeviceBelongIdentifiersResponseBodyIdentifiers setIdentifierValue(String identifierValue) {
            this.identifierValue = identifierValue;
            return this;
        }
        public String getIdentifierValue() {
            return this.identifierValue;
        }

    }

}
