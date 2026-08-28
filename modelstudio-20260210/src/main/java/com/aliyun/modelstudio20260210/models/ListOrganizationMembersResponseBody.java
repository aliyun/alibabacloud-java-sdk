// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListOrganizationMembersResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOrganizationMembersResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListOrganizationMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationMembersResponseBody self = new ListOrganizationMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOrganizationMembersResponseBody setData(java.util.List<ListOrganizationMembersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOrganizationMembersResponseBodyData> getData() {
        return this.data;
    }

    public ListOrganizationMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOrganizationMembersResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListOrganizationMembersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrganizationMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOrganizationMembersResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOrganizationMembersResponseBodyDataPackLimitInfo extends TeaModel {
        @NameInMap("AvailableLimit")
        public Double availableLimit;

        @NameInMap("CycleEndTime")
        public Long cycleEndTime;

        @NameInMap("CycleStartTime")
        public Long cycleStartTime;

        @NameInMap("FrozenCredits")
        public Double frozenCredits;

        @NameInMap("HasShareLimit")
        public Boolean hasShareLimit;

        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        @NameInMap("LastConfirmedTime")
        public Long lastConfirmedTime;

        @NameInMap("UpperLimit")
        public Double upperLimit;

        @NameInMap("UsedCredits")
        public Double usedCredits;

        public static ListOrganizationMembersResponseBodyDataPackLimitInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationMembersResponseBodyDataPackLimitInfo self = new ListOrganizationMembersResponseBodyDataPackLimitInfo();
            return TeaModel.build(map, self);
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setAvailableLimit(Double availableLimit) {
            this.availableLimit = availableLimit;
            return this;
        }
        public Double getAvailableLimit() {
            return this.availableLimit;
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setCycleEndTime(Long cycleEndTime) {
            this.cycleEndTime = cycleEndTime;
            return this;
        }
        public Long getCycleEndTime() {
            return this.cycleEndTime;
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setCycleStartTime(Long cycleStartTime) {
            this.cycleStartTime = cycleStartTime;
            return this;
        }
        public Long getCycleStartTime() {
            return this.cycleStartTime;
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setFrozenCredits(Double frozenCredits) {
            this.frozenCredits = frozenCredits;
            return this;
        }
        public Double getFrozenCredits() {
            return this.frozenCredits;
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setHasShareLimit(Boolean hasShareLimit) {
            this.hasShareLimit = hasShareLimit;
            return this;
        }
        public Boolean getHasShareLimit() {
            return this.hasShareLimit;
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setLastConfirmedTime(Long lastConfirmedTime) {
            this.lastConfirmedTime = lastConfirmedTime;
            return this;
        }
        public Long getLastConfirmedTime() {
            return this.lastConfirmedTime;
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setUpperLimit(Double upperLimit) {
            this.upperLimit = upperLimit;
            return this;
        }
        public Double getUpperLimit() {
            return this.upperLimit;
        }

        public ListOrganizationMembersResponseBodyDataPackLimitInfo setUsedCredits(Double usedCredits) {
            this.usedCredits = usedCredits;
            return this;
        }
        public Double getUsedCredits() {
            return this.usedCredits;
        }

    }

    public static class ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList extends TeaModel {
        @NameInMap("CycleEndTime")
        public Long cycleEndTime;

        @NameInMap("CycleStartTime")
        public Long cycleStartTime;

        @NameInMap("CycleSurplusValue")
        public Double cycleSurplusValue;

        @NameInMap("CycleTotalValue")
        public Double cycleTotalValue;

        @NameInMap("EquityType")
        public String equityType;

        @NameInMap("EquityUnit")
        public String equityUnit;

        public static ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList self = new ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList();
            return TeaModel.build(map, self);
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList setCycleEndTime(Long cycleEndTime) {
            this.cycleEndTime = cycleEndTime;
            return this;
        }
        public Long getCycleEndTime() {
            return this.cycleEndTime;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList setCycleStartTime(Long cycleStartTime) {
            this.cycleStartTime = cycleStartTime;
            return this;
        }
        public Long getCycleStartTime() {
            return this.cycleStartTime;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList setCycleSurplusValue(Double cycleSurplusValue) {
            this.cycleSurplusValue = cycleSurplusValue;
            return this;
        }
        public Double getCycleSurplusValue() {
            return this.cycleSurplusValue;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList setCycleTotalValue(Double cycleTotalValue) {
            this.cycleTotalValue = cycleTotalValue;
            return this;
        }
        public Double getCycleTotalValue() {
            return this.cycleTotalValue;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList setEquityType(String equityType) {
            this.equityType = equityType;
            return this;
        }
        public String getEquityType() {
            return this.equityType;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList setEquityUnit(String equityUnit) {
            this.equityUnit = equityUnit;
            return this;
        }
        public String getEquityUnit() {
            return this.equityUnit;
        }

    }

    public static class ListOrganizationMembersResponseBodyDataSubscriptionInfo extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EquityList")
        public java.util.List<ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList> equityList;

        @NameInMap("InstanceCode")
        public String instanceCode;

        @NameInMap("PayMode")
        public String payMode;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static ListOrganizationMembersResponseBodyDataSubscriptionInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationMembersResponseBodyDataSubscriptionInfo self = new ListOrganizationMembersResponseBodyDataSubscriptionInfo();
            return TeaModel.build(map, self);
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfo setEquityList(java.util.List<ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList> equityList) {
            this.equityList = equityList;
            return this;
        }
        public java.util.List<ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList> getEquityList() {
            return this.equityList;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfo setInstanceCode(String instanceCode) {
            this.instanceCode = instanceCode;
            return this;
        }
        public String getInstanceCode() {
            return this.instanceCode;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfo setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfo setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListOrganizationMembersResponseBodyDataSubscriptionInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListOrganizationMembersResponseBodyData extends TeaModel {
        /**
         * <p>The member business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112233</p>
         */
        @NameInMap("AccountBizId")
        public String accountBizId;

        /**
         * <p>The ID of the member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_123456789</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>test_001</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>API Key ID</p>
         * 
         * <strong>example:</strong>
         * <p>key_123456789</p>
         */
        @NameInMap("ApiKeyId")
        public String apiKeyId;

        /**
         * <p>The member email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@email.com">test@email.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The time when the member joined.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-10T11:57:42.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The masked API key.</p>
         * 
         * <strong>example:</strong>
         * <p>prefix.abc****456</p>
         */
        @NameInMap("MaskedApiKey")
        public String maskedApiKey;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org_123456789</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("PackLimitInfo")
        public ListOrganizationMembersResponseBodyDataPackLimitInfo packLimitInfo;

        /**
         * <p>The list of member roles.</p>
         */
        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <p>The seat resource allocate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>seat_123456</p>
         */
        @NameInMap("SeatId")
        public String seatId;

        /**
         * <p>The seat specification type. Valid values:</p>
         * <ul>
         * <li>standard: Standard seat.</li>
         * <li>pro: Pro seat.</li>
         * <li>max: Max seat.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The member status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubscriptionInfo")
        public ListOrganizationMembersResponseBodyDataSubscriptionInfo subscriptionInfo;

        public static ListOrganizationMembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationMembersResponseBodyData self = new ListOrganizationMembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOrganizationMembersResponseBodyData setAccountBizId(String accountBizId) {
            this.accountBizId = accountBizId;
            return this;
        }
        public String getAccountBizId() {
            return this.accountBizId;
        }

        public ListOrganizationMembersResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListOrganizationMembersResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListOrganizationMembersResponseBodyData setApiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        public ListOrganizationMembersResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListOrganizationMembersResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOrganizationMembersResponseBodyData setMaskedApiKey(String maskedApiKey) {
            this.maskedApiKey = maskedApiKey;
            return this;
        }
        public String getMaskedApiKey() {
            return this.maskedApiKey;
        }

        public ListOrganizationMembersResponseBodyData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public ListOrganizationMembersResponseBodyData setPackLimitInfo(ListOrganizationMembersResponseBodyDataPackLimitInfo packLimitInfo) {
            this.packLimitInfo = packLimitInfo;
            return this;
        }
        public ListOrganizationMembersResponseBodyDataPackLimitInfo getPackLimitInfo() {
            return this.packLimitInfo;
        }

        public ListOrganizationMembersResponseBodyData setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public ListOrganizationMembersResponseBodyData setSeatId(String seatId) {
            this.seatId = seatId;
            return this;
        }
        public String getSeatId() {
            return this.seatId;
        }

        public ListOrganizationMembersResponseBodyData setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public ListOrganizationMembersResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOrganizationMembersResponseBodyData setSubscriptionInfo(ListOrganizationMembersResponseBodyDataSubscriptionInfo subscriptionInfo) {
            this.subscriptionInfo = subscriptionInfo;
            return this;
        }
        public ListOrganizationMembersResponseBodyDataSubscriptionInfo getSubscriptionInfo() {
            return this.subscriptionInfo;
        }

    }

}
