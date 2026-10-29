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
        /**
         * <p>The currently available quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("AvailableLimit")
        public Double availableLimit;

        /**
         * <p>The end time of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1792476000001</p>
         */
        @NameInMap("CycleEndTime")
        public Long cycleEndTime;

        /**
         * <p>The start time of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1792476000000</p>
         */
        @NameInMap("CycleStartTime")
        public Long cycleStartTime;

        /**
         * <p>The frozen quota.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FrozenCredits")
        public Double frozenCredits;

        /**
         * <p>Indicates whether a quota limit exists for the shared usage package.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("HasShareLimit")
        public Boolean hasShareLimit;

        /**
         * <p>Indicates whether the quota is currently available.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        /**
         * <p>The time when the quota limit configuration was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1792476000000</p>
         */
        @NameInMap("LastConfirmedTime")
        public Long lastConfirmedTime;

        /**
         * <p>The upper limit of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("UpperLimit")
        public Double upperLimit;

        /**
         * <p>The used quota.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The start time of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1792476000001</p>
         */
        @NameInMap("CycleEndTime")
        public Long cycleEndTime;

        /**
         * <p>The start time of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1792476000000</p>
         */
        @NameInMap("CycleStartTime")
        public Long cycleStartTime;

        /**
         * <p>The remaining entitlement quota for the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>32259</p>
         */
        @NameInMap("CycleSurplusValue")
        public Double cycleSurplusValue;

        /**
         * <p>The total entitlement quota for the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>250000</p>
         */
        @NameInMap("CycleTotalValue")
        public Double cycleTotalValue;

        /**
         * <p>The entitlement type.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDITS</p>
         */
        @NameInMap("EquityType")
        public String equityType;

        /**
         * <p>The unit of measurement for the entitlement.</p>
         * 
         * <strong>example:</strong>
         * <p>Credit</p>
         */
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
        /**
         * <p>The end time of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>1792476000002</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The list of subscription entitlements.</p>
         */
        @NameInMap("EquityList")
        public java.util.List<ListOrganizationMembersResponseBodyDataSubscriptionInfoEquityList> equityList;

        /**
         * <p>The code of the subscription instance.</p>
         * 
         * <strong>example:</strong>
         * <p>subs-1234567</p>
         */
        @NameInMap("InstanceCode")
        public String instanceCode;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>total</p>
         */
        @NameInMap("PayMode")
        public String payMode;

        /**
         * <p>The code of the subscription product.</p>
         * 
         * <strong>example:</strong>
         * <p>sfm_tokenplanteams_dp_cn</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The specification type of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The start time of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>1792476000000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The subscription status.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
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
         * <p>The business ID of the member.</p>
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
         * <p>The email address of the member.</p>
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
         * <p>The ID of the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>org_123456789</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The upper limit information for the shared usage package available to the member.</p>
         */
        @NameInMap("PackLimitInfo")
        public ListOrganizationMembersResponseBodyDataPackLimitInfo packLimitInfo;

        /**
         * <p>The list of roles for the member.</p>
         */
        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <p>The resource allocation ID of the seat.</p>
         * 
         * <strong>example:</strong>
         * <p>seat_123456</p>
         */
        @NameInMap("SeatId")
        public String seatId;

        /**
         * <p>The specification type of the seat. Valid values:</p>
         * <ul>
         * <li>standard: Standard seat.</li>
         * <li>pro: Pro seat.</li>
         * <li>max: Premium seat.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The status of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The subscription information of the member.</p>
         */
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
