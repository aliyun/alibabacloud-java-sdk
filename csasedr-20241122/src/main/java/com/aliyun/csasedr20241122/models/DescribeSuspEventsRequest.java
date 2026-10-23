// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsRequest extends TeaModel {
    /**
     * <p>The name of the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>Trojan</p>
     */
    @NameInMap("AlarmEventName")
    public String alarmEventName;

    /**
     * <p>The unique ID of the alert event.</p>
     * <p>To query the exception event information of a single alert event, you must provide the unique ID of the alert event. You can call the DescribeSuspEvents operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8df914418f4211fb****</p>
     */
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    /**
     * <p>The collection of asset types. Not supported by SASE-EDR.</p>
     */
    @NameInMap("AssetsTypeList")
    public java.util.List<String> assetsTypeList;

    /**
     * <p>The ID of the cluster for which you want to query alert events.</p>
     * 
     * <strong>example:</strong>
     * <p>c4af4fdf38a98496a9b63c2be5dae****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The container search field. Not supported by SASE-EDR.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the container search field. Not supported by SASE-EDR.</p>
     * 
     * <strong>example:</strong>
     * <p>ccf9769c22b844ff9b8d57417683b****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The page number of the returned page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Filters alerts by processing group. Valid values:</p>
     * <ul>
     * <li><code>N</code>: Pending.</li>
     * <li><code>Y</code>: Processed.</li>
     * <li><code>A</code>: All.</li>
     * </ul>
     * <p>If this parameter is not specified, all groups are queried. The Status parameter further filters alerts within the selected group. If the specified status does not match the group, an empty result is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The department to which the user belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>Supplier Operations Team</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The internal subtype identifiers of the alerts. Separate multiple subtypes with commas (,). This parameter is used to match event names. The valid values must belong to the alert configurations visible to the current account and are not the alert names displayed to users.</p>
     * 
     * <strong>example:</strong>
     * <p>SASE non-whitelisted startup interception_PC</p>
     */
    @NameInMap("EventNames")
    public String eventNames;

    /**
     * <p>The ID of the group to which the asset affected by the alert event belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>18768</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name of the endpoint device.</p>
     * 
     * <strong>example:</strong>
     * <p>qin-ubuntu</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The unique ID of the recorded alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The private IP address of the endpoint device.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XXX.XXX</p>
     */
    @NameInMap("InnerIp")
    public String innerIp;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The urgency levels of the alert events to query. Separate multiple urgency levels with commas (,). The urgency levels are listed in descending order. Valid values:</p>
     * <ul>
     * <li><strong>serious</strong>: Urgent.</li>
     * <li><strong>suspicious</strong>: Suspicious.</li>
     * <li><strong>remind</strong>: Reminder.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The name of the asset affected by the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-xxx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The collection of alert event processing result codes.</p>
     */
    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    /**
     * <p>The end time of the alert processing time. Specify a datetime string in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-06 13:50:38</p>
     */
    @NameInMap("OperateTimeEnd")
    public String operateTimeEnd;

    /**
     * <p>The start time of the alert processing time. Specify a datetime string in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-05 13:50:38</p>
     */
    @NameInMap("OperateTimeStart")
    public String operateTimeStart;

    /**
     * <p>The number of alert events to return on each page in a paging query. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The internal type identifiers of the alerts. Separate multiple types with commas (,). The valid values are derived from the current alert configurations. You can call the DescribeNsasSuspEventType operation to query the Type field in EventTypes. The Name field is the display name and is not used as a fixed enumeration list.</p>
     * 
     * <strong>example:</strong>
     * <p>Precision defense</p>
     */
    @NameInMap("ParentEventTypes")
    public String parentEventTypes;

    /**
     * <p>The alert name or asset information to query.</p>
     * <p>Note: Fuzzy match is supported. Asset information includes the asset name, public IP address, and private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The custom sort field. Default value: <strong>operateTime</strong>. Valid values:</p>
     * <ul>
     * <li><strong>lastTime</strong>: Latest occurrence time.</li>
     * <li><strong>operateTime</strong>: Processing time.</li>
     * </ul>
     * <blockquote>
     * <p>This field takes effect only when Dealed is set to Y.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>operateTime</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The custom sort order. Default value: <strong>desc</strong>. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: Ascending order.</li>
     * <li><strong>desc</strong>: Descending order.</li>
     * </ul>
     * <blockquote>
     * <p>This field takes effect only when Dealed is set to Y.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The compatibility source classification parameter. This parameter is not used to specify the alert data source. You do not need to specify this parameter for common alert list queries.</p>
     * 
     * <strong>example:</strong>
     * <p>virus</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The IP address of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>111.55.XXX.XXX</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>Further filters alerts by individual alert status within the processing group specified by the Dealed parameter. Status descriptions:</p>
     * <ul>
     * <li><code>0</code>: No further status restriction. The alerts are still subject to the Dealed group.</li>
     * <li><code>1</code>: Pending.</li>
     * <li><code>2</code>: Ignored.</li>
     * <li><code>4</code>: Manually processed.</li>
     * <li><code>8</code>: Whitelisted (marked as false positive).</li>
     * <li><code>32</code>: Processed. For example, automatic defense interception succeeded.</li>
     * <li><code>64</code>: Expired.</li>
     * </ul>
     * <p>Unprocessed alerts are automatically marked as expired if more than 31 days have passed since the last occurrence.</p>
     * <p>Deleted alerts cannot be queried. If the specified status does not belong to the group specified by Dealed, an empty result is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether the alert is in strict mode. Not supported by SASE-EDR.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("StrictMode")
    public String strictMode;

    /**
     * <p>The ATT&amp;CK tactic ID.</p>
     * 
     * <strong>example:</strong>
     * <p>TA0001</p>
     */
    @NameInMap("TacticId")
    public String tacticId;

    /**
     * <p>The container search target type. Not supported by SASE-EDR.</p>
     * 
     * <strong>example:</strong>
     * <p>containerId</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The end time of the latest occurrence. Specify a datetime string in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-06 13:50:38</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <p>The start time of the latest occurrence. Specify a datetime string in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-05 13:50:38</p>
     */
    @NameInMap("TimeStart")
    public String timeStart;

    /**
     * <p>The unique key of the security alert.</p>
     * 
     * <strong>example:</strong>
     * <p>73fc06fb175a7405697e402f52864****</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The username of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The UUIDs of the servers for which you want to query alerts. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>bb5d2484-f10e-450d-8917-3e79667e****,0e7c2fcd-7100-42c7-a21a-db6e4f32****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeSuspEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsRequest self = new DescribeSuspEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsRequest setAlarmEventName(String alarmEventName) {
        this.alarmEventName = alarmEventName;
        return this;
    }
    public String getAlarmEventName() {
        return this.alarmEventName;
    }

    public DescribeSuspEventsRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    public DescribeSuspEventsRequest setAssetsTypeList(java.util.List<String> assetsTypeList) {
        this.assetsTypeList = assetsTypeList;
        return this;
    }
    public java.util.List<String> getAssetsTypeList() {
        return this.assetsTypeList;
    }

    public DescribeSuspEventsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeSuspEventsRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeSuspEventsRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeSuspEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeSuspEventsRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public DescribeSuspEventsRequest setEventNames(String eventNames) {
        this.eventNames = eventNames;
        return this;
    }
    public String getEventNames() {
        return this.eventNames;
    }

    public DescribeSuspEventsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeSuspEventsRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeSuspEventsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeSuspEventsRequest setInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }
    public String getInnerIp() {
        return this.innerIp;
    }

    public DescribeSuspEventsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventsRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeSuspEventsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSuspEventsRequest setOperateErrorCodeList(java.util.List<String> operateErrorCodeList) {
        this.operateErrorCodeList = operateErrorCodeList;
        return this;
    }
    public java.util.List<String> getOperateErrorCodeList() {
        return this.operateErrorCodeList;
    }

    public DescribeSuspEventsRequest setOperateTimeEnd(String operateTimeEnd) {
        this.operateTimeEnd = operateTimeEnd;
        return this;
    }
    public String getOperateTimeEnd() {
        return this.operateTimeEnd;
    }

    public DescribeSuspEventsRequest setOperateTimeStart(String operateTimeStart) {
        this.operateTimeStart = operateTimeStart;
        return this;
    }
    public String getOperateTimeStart() {
        return this.operateTimeStart;
    }

    public DescribeSuspEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventsRequest setParentEventTypes(String parentEventTypes) {
        this.parentEventTypes = parentEventTypes;
        return this;
    }
    public String getParentEventTypes() {
        return this.parentEventTypes;
    }

    public DescribeSuspEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeSuspEventsRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeSuspEventsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeSuspEventsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeSuspEventsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSuspEventsRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public DescribeSuspEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSuspEventsRequest setStrictMode(String strictMode) {
        this.strictMode = strictMode;
        return this;
    }
    public String getStrictMode() {
        return this.strictMode;
    }

    public DescribeSuspEventsRequest setTacticId(String tacticId) {
        this.tacticId = tacticId;
        return this;
    }
    public String getTacticId() {
        return this.tacticId;
    }

    public DescribeSuspEventsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeSuspEventsRequest setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public String getTimeEnd() {
        return this.timeEnd;
    }

    public DescribeSuspEventsRequest setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public String getTimeStart() {
        return this.timeStart;
    }

    public DescribeSuspEventsRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public DescribeSuspEventsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeSuspEventsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
