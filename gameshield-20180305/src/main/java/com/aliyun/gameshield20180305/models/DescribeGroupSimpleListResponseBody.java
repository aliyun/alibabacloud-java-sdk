// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeGroupSimpleListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupList")
    public java.util.List<DescribeGroupSimpleListResponseBodyGroupList> groupList;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeGroupSimpleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupSimpleListResponseBody self = new DescribeGroupSimpleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupSimpleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupSimpleListResponseBody setGroupList(java.util.List<DescribeGroupSimpleListResponseBodyGroupList> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<DescribeGroupSimpleListResponseBodyGroupList> getGroupList() {
        return this.groupList;
    }

    public DescribeGroupSimpleListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeGroupSimpleListResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeGroupSimpleListResponseBodyGroupList extends TeaModel {
        @NameInMap("IsDnsEnabled")
        public Boolean isDnsEnabled;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("IsDisabled")
        public Boolean isDisabled;

        public static DescribeGroupSimpleListResponseBodyGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupSimpleListResponseBodyGroupList self = new DescribeGroupSimpleListResponseBodyGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeGroupSimpleListResponseBodyGroupList setIsDnsEnabled(Boolean isDnsEnabled) {
            this.isDnsEnabled = isDnsEnabled;
            return this;
        }
        public Boolean getIsDnsEnabled() {
            return this.isDnsEnabled;
        }

        public DescribeGroupSimpleListResponseBodyGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeGroupSimpleListResponseBodyGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGroupSimpleListResponseBodyGroupList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeGroupSimpleListResponseBodyGroupList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeGroupSimpleListResponseBodyGroupList setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

    }

}
