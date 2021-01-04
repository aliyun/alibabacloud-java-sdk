// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeGroupListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupList")
    public java.util.List<DescribeGroupListResponseBodyGroupList> groupList;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupListResponseBody self = new DescribeGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupListResponseBody setGroupList(java.util.List<DescribeGroupListResponseBodyGroupList> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<DescribeGroupListResponseBodyGroupList> getGroupList() {
        return this.groupList;
    }

    public DescribeGroupListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeGroupListResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeGroupListResponseBodyGroupList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("IsDnsEnabled")
        public Boolean isDnsEnabled;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("BlackIp")
        public Integer blackIp;

        @NameInMap("NormalIp")
        public Integer normalIp;

        @NameInMap("CleanIp")
        public Integer cleanIp;

        @NameInMap("TotalIp")
        public Integer totalIp;

        @NameInMap("IsDisabled")
        public Boolean isDisabled;

        @NameInMap("DnsStatus")
        public String dnsStatus;

        @NameInMap("GroupDesc")
        public String groupDesc;

        public static DescribeGroupListResponseBodyGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupListResponseBodyGroupList self = new DescribeGroupListResponseBodyGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeGroupListResponseBodyGroupList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGroupListResponseBodyGroupList setIsDnsEnabled(Boolean isDnsEnabled) {
            this.isDnsEnabled = isDnsEnabled;
            return this;
        }
        public Boolean getIsDnsEnabled() {
            return this.isDnsEnabled;
        }

        public DescribeGroupListResponseBodyGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeGroupListResponseBodyGroupList setBlackIp(Integer blackIp) {
            this.blackIp = blackIp;
            return this;
        }
        public Integer getBlackIp() {
            return this.blackIp;
        }

        public DescribeGroupListResponseBodyGroupList setNormalIp(Integer normalIp) {
            this.normalIp = normalIp;
            return this;
        }
        public Integer getNormalIp() {
            return this.normalIp;
        }

        public DescribeGroupListResponseBodyGroupList setCleanIp(Integer cleanIp) {
            this.cleanIp = cleanIp;
            return this;
        }
        public Integer getCleanIp() {
            return this.cleanIp;
        }

        public DescribeGroupListResponseBodyGroupList setTotalIp(Integer totalIp) {
            this.totalIp = totalIp;
            return this;
        }
        public Integer getTotalIp() {
            return this.totalIp;
        }

        public DescribeGroupListResponseBodyGroupList setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public DescribeGroupListResponseBodyGroupList setDnsStatus(String dnsStatus) {
            this.dnsStatus = dnsStatus;
            return this;
        }
        public String getDnsStatus() {
            return this.dnsStatus;
        }

        public DescribeGroupListResponseBodyGroupList setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

    }

}
