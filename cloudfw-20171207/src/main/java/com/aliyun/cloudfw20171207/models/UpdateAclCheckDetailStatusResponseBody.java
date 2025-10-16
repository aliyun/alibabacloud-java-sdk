// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateAclCheckDetailStatusResponseBody extends TeaModel {
    @NameInMap("CheckRecord")
    public UpdateAclCheckDetailStatusResponseBodyCheckRecord checkRecord;

    /**
     * <strong>example:</strong>
     * <p>850A84D6************00090125EEB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAclCheckDetailStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclCheckDetailStatusResponseBody self = new UpdateAclCheckDetailStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAclCheckDetailStatusResponseBody setCheckRecord(UpdateAclCheckDetailStatusResponseBodyCheckRecord checkRecord) {
        this.checkRecord = checkRecord;
        return this;
    }
    public UpdateAclCheckDetailStatusResponseBodyCheckRecord getCheckRecord() {
        return this.checkRecord;
    }

    public UpdateAclCheckDetailStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>produce</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>tfTestAcc0</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList self = new UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList();
            return TeaModel.build(map, self);
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>log</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <strong>example:</strong>
         * <p>1e8ed1b2-cebc-4b95-a9cc-0cb7ce2c0c2c</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        @NameInMap("AddressList")
        public java.util.List<String> addressList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AddressListCount")
        public Integer addressListCount;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        /**
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>test_policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        @NameInMap("DestPortGroup")
        public String destPortGroup;

        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <strong>example:</strong>
         * <p>kms.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.1/32</p>
         */
        @NameInMap("DnsResult")
        public String dnsResult;

        /**
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        /**
         * <strong>example:</strong>
         * <p>1752754426</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>subscribe</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <strong>example:</strong>
         * <p>5a96a798-9b73-47f7-831e-1d7aa3c987a9</p>
         */
        @NameInMap("GroupUuid")
        public String groupUuid;

        /**
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>ngw-gw85zno51npz7lgc04z89</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <strong>example:</strong>
         * <p>10.71.94.24</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

        /**
         * <strong>example:</strong>
         * <p>1736130347</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TagList")
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList> tagList;

        /**
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("TagRelation")
        public String tagRelation;

        /**
         * <strong>example:</strong>
         * <p>cen-cw4z051hr8x53qniv5</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        public static UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl build(java.util.Map<String, ?> map) throws Exception {
            UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl self = new UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl();
            return TeaModel.build(map, self);
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAddressList(java.util.List<String> addressList) {
            this.addressList = addressList;
            return this;
        }
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAddressListCount(Integer addressListCount) {
            this.addressListCount = addressListCount;
            return this;
        }
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setAutoAddTagEcs(Integer autoAddTagEcs) {
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }
        public Integer getAutoAddTagEcs() {
            return this.autoAddTagEcs;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestPortGroupPorts(java.util.List<String> destPortGroupPorts) {
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDnsResult(String dnsResult) {
            this.dnsResult = dnsResult;
            return this;
        }
        public String getDnsResult() {
            return this.dnsResult;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDnsResultTime(Long dnsResultTime) {
            this.dnsResultTime = dnsResultTime;
            return this;
        }
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setDomainResolveType(Integer domainResolveType) {
            this.domainResolveType = domainResolveType;
            return this;
        }
        public Integer getDomainResolveType() {
            return this.domainResolveType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setGroupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }
        public String getGroupUuid() {
            return this.groupUuid;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRepeatDays(java.util.List<Long> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<Long> getRepeatDays() {
            return this.repeatDays;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRepeatEndTime(String repeatEndTime) {
            this.repeatEndTime = repeatEndTime;
            return this;
        }
        public String getRepeatEndTime() {
            return this.repeatEndTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRepeatStartTime(String repeatStartTime) {
            this.repeatStartTime = repeatStartTime;
            return this;
        }
        public String getRepeatStartTime() {
            return this.repeatStartTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setRepeatType(String repeatType) {
            this.repeatType = repeatType;
            return this;
        }
        public String getRepeatType() {
            return this.repeatType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setSpreadCnt(Integer spreadCnt) {
            this.spreadCnt = spreadCnt;
            return this;
        }
        public Integer getSpreadCnt() {
            return this.spreadCnt;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setTagList(java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAclTagList> getTagList() {
            return this.tagList;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setTagRelation(String tagRelation) {
            this.tagRelation = tagRelation;
            return this;
        }
        public String getTagRelation() {
            return this.tagRelation;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

    }

    public static class UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls extends TeaModel {
        @NameInMap("Acl")
        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl acl;

        @NameInMap("AclAssessmentDetail")
        public String aclAssessmentDetail;

        /**
         * <strong>example:</strong>
         * <p>configuring</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        public static UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls build(java.util.Map<String, ?> map) throws Exception {
            UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls self = new UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls();
            return TeaModel.build(map, self);
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls setAcl(UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl acl) {
            this.acl = acl;
            return this;
        }
        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAclsAcl getAcl() {
            return this.acl;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls setAclAssessmentDetail(String aclAssessmentDetail) {
            this.aclAssessmentDetail = aclAssessmentDetail;
            return this;
        }
        public String getAclAssessmentDetail() {
            return this.aclAssessmentDetail;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

    }

    public static class UpdateAclCheckDetailStatusResponseBodyCheckRecord extends TeaModel {
        @NameInMap("Acls")
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls> acls;

        /**
         * <strong>example:</strong>
         * <p>PolicyHitCountZero</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <strong>example:</strong>
         * <p>dwd_mysql_lingwan_faxing_chat_config_di</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1724982259</p>
         */
        @NameInMap("LastCheckTime")
        public String lastCheckTime;

        /**
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PolicyTotalCount")
        public Long policyTotalCount;

        @NameInMap("RecordAssessmentDetail")
        public String recordAssessmentDetail;

        /**
         * <strong>example:</strong>
         * <p>task-c92d4544ef7b6a42</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateAclCheckDetailStatusResponseBodyCheckRecord build(java.util.Map<String, ?> map) throws Exception {
            UpdateAclCheckDetailStatusResponseBodyCheckRecord self = new UpdateAclCheckDetailStatusResponseBodyCheckRecord();
            return TeaModel.build(map, self);
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setAcls(java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls> acls) {
            this.acls = acls;
            return this;
        }
        public java.util.List<UpdateAclCheckDetailStatusResponseBodyCheckRecordAcls> getAcls() {
            return this.acls;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setPolicyTotalCount(Long policyTotalCount) {
            this.policyTotalCount = policyTotalCount;
            return this;
        }
        public Long getPolicyTotalCount() {
            return this.policyTotalCount;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setRecordAssessmentDetail(String recordAssessmentDetail) {
            this.recordAssessmentDetail = recordAssessmentDetail;
            return this;
        }
        public String getRecordAssessmentDetail() {
            return this.recordAssessmentDetail;
        }

        public UpdateAclCheckDetailStatusResponseBodyCheckRecord setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
