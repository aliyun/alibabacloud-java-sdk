// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventListResponseBody extends TeaModel {
    // 事件列表
    @NameInMap("EventList")
    public java.util.List<DescribeInvadeEventListResponseBodyEventList> eventList;

    // 高风险等级比例
    @NameInMap("HighLevelPercent")
    public Integer highLevelPercent;

    // 低风险等级比例
    @NameInMap("LowLevelPercent")
    public Integer lowLevelPercent;

    // 中风险等级比例
    @NameInMap("MiddleLevelPercent")
    public Integer middleLevelPercent;

    // 分页信息
    @NameInMap("PageInfo")
    public DescribeInvadeEventListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvadeEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventListResponseBody self = new DescribeInvadeEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventListResponseBody setEventList(java.util.List<DescribeInvadeEventListResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<DescribeInvadeEventListResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public DescribeInvadeEventListResponseBody setHighLevelPercent(Integer highLevelPercent) {
        this.highLevelPercent = highLevelPercent;
        return this;
    }
    public Integer getHighLevelPercent() {
        return this.highLevelPercent;
    }

    public DescribeInvadeEventListResponseBody setLowLevelPercent(Integer lowLevelPercent) {
        this.lowLevelPercent = lowLevelPercent;
        return this;
    }
    public Integer getLowLevelPercent() {
        return this.lowLevelPercent;
    }

    public DescribeInvadeEventListResponseBody setMiddleLevelPercent(Integer middleLevelPercent) {
        this.middleLevelPercent = middleLevelPercent;
        return this;
    }
    public Integer getMiddleLevelPercent() {
        return this.middleLevelPercent;
    }

    public DescribeInvadeEventListResponseBody setPageInfo(DescribeInvadeEventListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInvadeEventListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInvadeEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInvadeEventListResponseBodyEventList extends TeaModel {
        // 资产实例ID
        @NameInMap("AssetsInstanceId")
        public String assetsInstanceId;

        // 资产名称
        @NameInMap("AssetsInstanceName")
        public String assetsInstanceName;

        // 资产类型
        @NameInMap("AssetsType")
        public String assetsType;

        // CVE编号
        @NameInMap("EventKey")
        public String eventKey;

        // 事件名称
        @NameInMap("EventName")
        public String eventName;

        // 事件来源
        @NameInMap("EventSrc")
        public String eventSrc;

        // 事件UUID
        @NameInMap("EventUuid")
        public String eventUuid;

        // 首次出现时间
        @NameInMap("FirstTime")
        public Integer firstTime;

        // 是否忽略
        @NameInMap("IsIgnore")
        public Boolean isIgnore;

        // 最近一次时间
        @NameInMap("LastTime")
        public Integer lastTime;

        // 成员账号UID
        @NameInMap("MemberUid")
        public String memberUid;

        // 私网IP
        @NameInMap("PrivateIP")
        public String privateIP;

        // 处理状态
        @NameInMap("ProcessStatus")
        public Integer processStatus;

        // 公网IP
        @NameInMap("PublicIP")
        public String publicIP;

        // 公开类型
        @NameInMap("PublicIpType")
        public String publicIpType;

        // 风险等级
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static DescribeInvadeEventListResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvadeEventListResponseBodyEventList self = new DescribeInvadeEventListResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public DescribeInvadeEventListResponseBodyEventList setAssetsInstanceId(String assetsInstanceId) {
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }
        public String getAssetsInstanceId() {
            return this.assetsInstanceId;
        }

        public DescribeInvadeEventListResponseBodyEventList setAssetsInstanceName(String assetsInstanceName) {
            this.assetsInstanceName = assetsInstanceName;
            return this;
        }
        public String getAssetsInstanceName() {
            return this.assetsInstanceName;
        }

        public DescribeInvadeEventListResponseBodyEventList setAssetsType(String assetsType) {
            this.assetsType = assetsType;
            return this;
        }
        public String getAssetsType() {
            return this.assetsType;
        }

        public DescribeInvadeEventListResponseBodyEventList setEventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }
        public String getEventKey() {
            return this.eventKey;
        }

        public DescribeInvadeEventListResponseBodyEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeInvadeEventListResponseBodyEventList setEventSrc(String eventSrc) {
            this.eventSrc = eventSrc;
            return this;
        }
        public String getEventSrc() {
            return this.eventSrc;
        }

        public DescribeInvadeEventListResponseBodyEventList setEventUuid(String eventUuid) {
            this.eventUuid = eventUuid;
            return this;
        }
        public String getEventUuid() {
            return this.eventUuid;
        }

        public DescribeInvadeEventListResponseBodyEventList setFirstTime(Integer firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Integer getFirstTime() {
            return this.firstTime;
        }

        public DescribeInvadeEventListResponseBodyEventList setIsIgnore(Boolean isIgnore) {
            this.isIgnore = isIgnore;
            return this;
        }
        public Boolean getIsIgnore() {
            return this.isIgnore;
        }

        public DescribeInvadeEventListResponseBodyEventList setLastTime(Integer lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Integer getLastTime() {
            return this.lastTime;
        }

        public DescribeInvadeEventListResponseBodyEventList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeInvadeEventListResponseBodyEventList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public DescribeInvadeEventListResponseBodyEventList setProcessStatus(Integer processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Integer getProcessStatus() {
            return this.processStatus;
        }

        public DescribeInvadeEventListResponseBodyEventList setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public DescribeInvadeEventListResponseBodyEventList setPublicIpType(String publicIpType) {
            this.publicIpType = publicIpType;
            return this;
        }
        public String getPublicIpType() {
            return this.publicIpType;
        }

        public DescribeInvadeEventListResponseBodyEventList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeInvadeEventListResponseBodyPageInfo extends TeaModel {
        // 当前页
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // 每页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总数
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInvadeEventListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvadeEventListResponseBodyPageInfo self = new DescribeInvadeEventListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInvadeEventListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInvadeEventListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInvadeEventListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
