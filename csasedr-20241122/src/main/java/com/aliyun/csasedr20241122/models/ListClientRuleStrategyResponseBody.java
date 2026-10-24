// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class ListClientRuleStrategyResponseBody extends TeaModel {
    /**
     * <p>The list of policies.</p>
     */
    @NameInMap("List")
    public java.util.List<ListClientRuleStrategyResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListClientRuleStrategyResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>45B2D3AF-0E5F-5D67-944C-2AD5E354B5C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClientRuleStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientRuleStrategyResponseBody self = new ListClientRuleStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientRuleStrategyResponseBody setList(java.util.List<ListClientRuleStrategyResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListClientRuleStrategyResponseBodyList> getList() {
        return this.list;
    }

    public ListClientRuleStrategyResponseBody setPageInfo(ListClientRuleStrategyResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListClientRuleStrategyResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListClientRuleStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClientRuleStrategyResponseBodyList extends TeaModel {
        /**
         * <p>The policy action. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Monitor mode.</li>
         * <li><strong>1</strong>: Block startup.</li>
         * <li><strong>2</strong>: Block mode.</li>
         * </ul>
         * <p>Valid values for custom rules of proactive defense (PolicyType=2):</p>
         * <ul>
         * <li><strong>0</strong>: Allow.</li>
         * <li><strong>1</strong>: Block.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ActionType")
        public Integer actionType;

        /**
         * <p>Specifies whether the policy applies to all user groups. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AllGroup")
        public Integer allGroup;

        /**
         * <p>The instance ID of the approval.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-3f9bcedb9643b956</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>The timestamp when the policy was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792627200000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of usernames to which the policy does not apply.</p>
         */
        @NameInMap("ExcludeUserNameList")
        public java.util.List<String> excludeUserNameList;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1938</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The switch for inbound network traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InSwitch")
        public Boolean inSwitch;

        /**
         * <p>The list of targets in the effective scope.</p>
         */
        @NameInMap("IncludeGroupIdList")
        public java.util.List<String> includeGroupIdList;

        /**
         * <p>The text of the primary button in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MainButtonTextCh")
        public String mainButtonTextCh;

        /**
         * <p>The text of the primary button in English.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MainButtonTextEn")
        public String mainButtonTextEn;

        /**
         * <p>The effective scope mode. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: All user groups.</li>
         * <li><strong>UserGroupNormal</strong>: Specified user groups.</li>
         * <li><strong>DeviceGroupNormal</strong>: Specified device groups.</li>
         * <li><strong>DevTagNormal</strong>: Specified device tags.</li>
         * </ul>
         * <p>The meaning of MatchTargetIds is determined by this field.</p>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The list of targets in the effective scope. UserGroupNormal corresponds to user group IDs, DeviceGroupNormal corresponds to device group IDs, and DevTagNormal corresponds to device tags. If MatchMode is set to UserGroupAll, you do not need to specify targets.</p>
         */
        @NameInMap("MatchTargetIds")
        public java.util.List<String> matchTargetIds;

        /**
         * <p>The text of the secondary button in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MinorButtonTextCh")
        public String minorButtonTextCh;

        /**
         * <p>The text of the secondary button in English.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MinorButtonTextEn")
        public String minorButtonTextEn;

        /**
         * <p>The Policy Name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The switch for outbound network traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OutSwitch")
        public Boolean outSwitch;

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Software hardening.</li>
         * <li><strong>1</strong>: Firewall.</li>
         * <li><strong>2</strong>: Proactive defense.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PolicyType")
        public Integer policyType;

        /**
         * <p>The list of enabled ports.</p>
         */
        @NameInMap("PortOnList")
        public java.util.List<String> portOnList;

        /**
         * <p>The policy priority. A smaller value indicates a higher priority. Valid values: greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The association key of the policy configuration, which is used to associate the policy with its process or switch configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>a8d64565-ab8b-41a6-bd3d-14d0fc639285</p>
         */
        @NameInMap("SelectionKey")
        public String selectionKey;

        /**
         * <p>The list of main process names of the software for which integrity check is enabled. The elements correspond to the Process field returned by GetSwitchInfoListByType.</p>
         */
        @NameInMap("SoftWareOnList")
        public java.util.List<String> softWareOnList;

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The source of the rule for proactive defense (PolicyType=2). Valid values:</p>
         * <ul>
         * <li><strong>SYSTEM</strong>: System rule.</li>
         * <li><strong>CUSTOM</strong>: Custom rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("StrategySourceType")
        public String strategySourceType;

        /**
         * <p>Specifies whether reporting and approval are supported. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not supported.</li>
         * <li><strong>1</strong>: Supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SupportsApproval")
        public Integer supportsApproval;

        /**
         * <p>The content of the pop-up prompt in English.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UsContent")
        public String usContent;

        /**
         * <p>The title of the pop-up prompt in English.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UsTitle")
        public String usTitle;

        /**
         * <p>The content of the pop-up prompt in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ZhContent")
        public String zhContent;

        /**
         * <p>The title of the pop-up prompt in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ZhTitle")
        public String zhTitle;

        public static ListClientRuleStrategyResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListClientRuleStrategyResponseBodyList self = new ListClientRuleStrategyResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListClientRuleStrategyResponseBodyList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public ListClientRuleStrategyResponseBodyList setAllGroup(Integer allGroup) {
            this.allGroup = allGroup;
            return this;
        }
        public Integer getAllGroup() {
            return this.allGroup;
        }

        public ListClientRuleStrategyResponseBodyList setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public ListClientRuleStrategyResponseBodyList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClientRuleStrategyResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClientRuleStrategyResponseBodyList setExcludeUserNameList(java.util.List<String> excludeUserNameList) {
            this.excludeUserNameList = excludeUserNameList;
            return this;
        }
        public java.util.List<String> getExcludeUserNameList() {
            return this.excludeUserNameList;
        }

        public ListClientRuleStrategyResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClientRuleStrategyResponseBodyList setInSwitch(Boolean inSwitch) {
            this.inSwitch = inSwitch;
            return this;
        }
        public Boolean getInSwitch() {
            return this.inSwitch;
        }

        public ListClientRuleStrategyResponseBodyList setIncludeGroupIdList(java.util.List<String> includeGroupIdList) {
            this.includeGroupIdList = includeGroupIdList;
            return this;
        }
        public java.util.List<String> getIncludeGroupIdList() {
            return this.includeGroupIdList;
        }

        public ListClientRuleStrategyResponseBodyList setMainButtonTextCh(String mainButtonTextCh) {
            this.mainButtonTextCh = mainButtonTextCh;
            return this;
        }
        public String getMainButtonTextCh() {
            return this.mainButtonTextCh;
        }

        public ListClientRuleStrategyResponseBodyList setMainButtonTextEn(String mainButtonTextEn) {
            this.mainButtonTextEn = mainButtonTextEn;
            return this;
        }
        public String getMainButtonTextEn() {
            return this.mainButtonTextEn;
        }

        public ListClientRuleStrategyResponseBodyList setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListClientRuleStrategyResponseBodyList setMatchTargetIds(java.util.List<String> matchTargetIds) {
            this.matchTargetIds = matchTargetIds;
            return this;
        }
        public java.util.List<String> getMatchTargetIds() {
            return this.matchTargetIds;
        }

        public ListClientRuleStrategyResponseBodyList setMinorButtonTextCh(String minorButtonTextCh) {
            this.minorButtonTextCh = minorButtonTextCh;
            return this;
        }
        public String getMinorButtonTextCh() {
            return this.minorButtonTextCh;
        }

        public ListClientRuleStrategyResponseBodyList setMinorButtonTextEn(String minorButtonTextEn) {
            this.minorButtonTextEn = minorButtonTextEn;
            return this;
        }
        public String getMinorButtonTextEn() {
            return this.minorButtonTextEn;
        }

        public ListClientRuleStrategyResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClientRuleStrategyResponseBodyList setOutSwitch(Boolean outSwitch) {
            this.outSwitch = outSwitch;
            return this;
        }
        public Boolean getOutSwitch() {
            return this.outSwitch;
        }

        public ListClientRuleStrategyResponseBodyList setPolicyType(Integer policyType) {
            this.policyType = policyType;
            return this;
        }
        public Integer getPolicyType() {
            return this.policyType;
        }

        public ListClientRuleStrategyResponseBodyList setPortOnList(java.util.List<String> portOnList) {
            this.portOnList = portOnList;
            return this;
        }
        public java.util.List<String> getPortOnList() {
            return this.portOnList;
        }

        public ListClientRuleStrategyResponseBodyList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListClientRuleStrategyResponseBodyList setSelectionKey(String selectionKey) {
            this.selectionKey = selectionKey;
            return this;
        }
        public String getSelectionKey() {
            return this.selectionKey;
        }

        public ListClientRuleStrategyResponseBodyList setSoftWareOnList(java.util.List<String> softWareOnList) {
            this.softWareOnList = softWareOnList;
            return this;
        }
        public java.util.List<String> getSoftWareOnList() {
            return this.softWareOnList;
        }

        public ListClientRuleStrategyResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListClientRuleStrategyResponseBodyList setStrategySourceType(String strategySourceType) {
            this.strategySourceType = strategySourceType;
            return this;
        }
        public String getStrategySourceType() {
            return this.strategySourceType;
        }

        public ListClientRuleStrategyResponseBodyList setSupportsApproval(Integer supportsApproval) {
            this.supportsApproval = supportsApproval;
            return this;
        }
        public Integer getSupportsApproval() {
            return this.supportsApproval;
        }

        public ListClientRuleStrategyResponseBodyList setUsContent(String usContent) {
            this.usContent = usContent;
            return this;
        }
        public String getUsContent() {
            return this.usContent;
        }

        public ListClientRuleStrategyResponseBodyList setUsTitle(String usTitle) {
            this.usTitle = usTitle;
            return this;
        }
        public String getUsTitle() {
            return this.usTitle;
        }

        public ListClientRuleStrategyResponseBodyList setZhContent(String zhContent) {
            this.zhContent = zhContent;
            return this;
        }
        public String getZhContent() {
            return this.zhContent;
        }

        public ListClientRuleStrategyResponseBodyList setZhTitle(String zhTitle) {
            this.zhTitle = zhTitle;
            return this;
        }
        public String getZhTitle() {
            return this.zhTitle;
        }

    }

    public static class ListClientRuleStrategyResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the current page for the paged query with paging.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of entries returned per page for the paged query with paging.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListClientRuleStrategyResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClientRuleStrategyResponseBodyPageInfo self = new ListClientRuleStrategyResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListClientRuleStrategyResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListClientRuleStrategyResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClientRuleStrategyResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
