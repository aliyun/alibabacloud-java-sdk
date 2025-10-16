// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclCheckResponseBody extends TeaModel {
    @NameInMap("CheckRecord")
    public DescribeAclCheckResponseBodyCheckRecord checkRecord;

    /**
     * <strong>example:</strong>
     * <p>25E655B0-CAED-53D4-8054-F983126****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAclCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclCheckResponseBody self = new DescribeAclCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclCheckResponseBody setCheckRecord(DescribeAclCheckResponseBodyCheckRecord checkRecord) {
        this.checkRecord = checkRecord;
        return this;
    }
    public DescribeAclCheckResponseBodyCheckRecord getCheckRecord() {
        return this.checkRecord;
    }

    public DescribeAclCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.0.XX.XX/32</p>
         */
        @NameInMap("Address")
        public String address;

        @NameInMap("Note")
        public String note;

        public static DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses self = new DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsAclTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ss</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>tfTestAcc0</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeAclCheckResponseBodyCheckRecordAclsAclTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsAclTagList self = new DescribeAclCheckResponseBodyCheckRecordAclsAclTagList();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAclTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAclTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAclsAcl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>log</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <strong>example:</strong>
         * <p>997b38e0-01fa-4db7-8d30-02ebf6fdb747</p>
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

        @NameInMap("Addresses")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses> addresses;

        /**
         * <strong>example:</strong>
         * <p>plugin_idp4_ciam</p>
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
         * <p>80/80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <strong>example:</strong>
         * <p>my_port_group</p>
         */
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
         * <p>domain</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <strong>example:</strong>
         * <p>out</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
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
         * <p>FQDN</p>
         */
        @NameInMap("DomainResolveType")
        public Integer domainResolveType;

        /**
         * <strong>example:</strong>
         * <p>1758334822</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <strong>example:</strong>
         * <p>b91d86c3-2b52-4534-aae9-8d0339b12a48</p>
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
         * <p>ngw-2ze4w62zbdkwjmoqeokgl</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
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
         * <p>Permanent</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <strong>example:</strong>
         * <p>172.28.7.167</p>
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
         * <p>group</p>
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
         * <p>1730318400</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TagList")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclTagList> tagList;

        /**
         * <strong>example:</strong>
         * <p>or</p>
         */
        @NameInMap("TagRelation")
        public String tagRelation;

        /**
         * <strong>example:</strong>
         * <p>vfw-925514970c2c4bcab222</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        public static DescribeAclCheckResponseBodyCheckRecordAclsAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAclsAcl self = new DescribeAclCheckResponseBodyCheckRecordAclsAcl();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAddressList(java.util.List<String> addressList) {
            this.addressList = addressList;
            return this;
        }
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAddressListCount(Integer addressListCount) {
            this.addressListCount = addressListCount;
            return this;
        }
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAddresses(java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclAddresses> getAddresses() {
            return this.addresses;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setAutoAddTagEcs(Integer autoAddTagEcs) {
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }
        public Integer getAutoAddTagEcs() {
            return this.autoAddTagEcs;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestPortGroupPorts(java.util.List<String> destPortGroupPorts) {
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDnsResult(String dnsResult) {
            this.dnsResult = dnsResult;
            return this;
        }
        public String getDnsResult() {
            return this.dnsResult;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDnsResultTime(Long dnsResultTime) {
            this.dnsResultTime = dnsResultTime;
            return this;
        }
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setDomainResolveType(Integer domainResolveType) {
            this.domainResolveType = domainResolveType;
            return this;
        }
        public Integer getDomainResolveType() {
            return this.domainResolveType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setGroupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }
        public String getGroupUuid() {
            return this.groupUuid;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRepeatDays(java.util.List<Long> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<Long> getRepeatDays() {
            return this.repeatDays;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRepeatEndTime(String repeatEndTime) {
            this.repeatEndTime = repeatEndTime;
            return this;
        }
        public String getRepeatEndTime() {
            return this.repeatEndTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRepeatStartTime(String repeatStartTime) {
            this.repeatStartTime = repeatStartTime;
            return this;
        }
        public String getRepeatStartTime() {
            return this.repeatStartTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setRepeatType(String repeatType) {
            this.repeatType = repeatType;
            return this;
        }
        public String getRepeatType() {
            return this.repeatType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setSpreadCnt(Integer spreadCnt) {
            this.spreadCnt = spreadCnt;
            return this;
        }
        public Integer getSpreadCnt() {
            return this.spreadCnt;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setTagList(java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAclsAclTagList> getTagList() {
            return this.tagList;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setTagRelation(String tagRelation) {
            this.tagRelation = tagRelation;
            return this;
        }
        public String getTagRelation() {
            return this.tagRelation;
        }

        public DescribeAclCheckResponseBodyCheckRecordAclsAcl setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecordAcls extends TeaModel {
        @NameInMap("Acl")
        public DescribeAclCheckResponseBodyCheckRecordAclsAcl acl;

        @NameInMap("AclAssessmentDetail")
        public String aclAssessmentDetail;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        public static DescribeAclCheckResponseBodyCheckRecordAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecordAcls self = new DescribeAclCheckResponseBodyCheckRecordAcls();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setAcl(DescribeAclCheckResponseBodyCheckRecordAclsAcl acl) {
            this.acl = acl;
            return this;
        }
        public DescribeAclCheckResponseBodyCheckRecordAclsAcl getAcl() {
            return this.acl;
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setAclAssessmentDetail(String aclAssessmentDetail) {
            this.aclAssessmentDetail = aclAssessmentDetail;
            return this;
        }
        public String getAclAssessmentDetail() {
            return this.aclAssessmentDetail;
        }

        public DescribeAclCheckResponseBodyCheckRecordAcls setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

    }

    public static class DescribeAclCheckResponseBodyCheckRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AclTotalCount")
        public Long aclTotalCount;

        @NameInMap("Acls")
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAcls> acls;

        /**
         * <strong>example:</strong>
         * <p>PolicyHitCountZero</p>
         */
        @NameInMap("CheckName")
        public String checkName;

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

        @NameInMap("RecordAssessmentDetail")
        public String recordAssessmentDetail;

        /**
         * <strong>example:</strong>
         * <p>task-c92d4544ef7b6a42</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeAclCheckResponseBodyCheckRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckResponseBodyCheckRecord self = new DescribeAclCheckResponseBodyCheckRecord();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckResponseBodyCheckRecord setAclTotalCount(Long aclTotalCount) {
            this.aclTotalCount = aclTotalCount;
            return this;
        }
        public Long getAclTotalCount() {
            return this.aclTotalCount;
        }

        public DescribeAclCheckResponseBodyCheckRecord setAcls(java.util.List<DescribeAclCheckResponseBodyCheckRecordAcls> acls) {
            this.acls = acls;
            return this;
        }
        public java.util.List<DescribeAclCheckResponseBodyCheckRecordAcls> getAcls() {
            return this.acls;
        }

        public DescribeAclCheckResponseBodyCheckRecord setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public DescribeAclCheckResponseBodyCheckRecord setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAclCheckResponseBodyCheckRecord setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public DescribeAclCheckResponseBodyCheckRecord setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAclCheckResponseBodyCheckRecord setRecordAssessmentDetail(String recordAssessmentDetail) {
            this.recordAssessmentDetail = recordAssessmentDetail;
            return this;
        }
        public String getRecordAssessmentDetail() {
            return this.recordAssessmentDetail;
        }

        public DescribeAclCheckResponseBodyCheckRecord setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
