// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("AppList")
    public java.util.List<DescribeAppListResponseBodyAppList> appList;

    public static DescribeAppListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppListResponseBody self = new DescribeAppListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeAppListResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeAppListResponseBody setAppList(java.util.List<DescribeAppListResponseBodyAppList> appList) {
        this.appList = appList;
        return this;
    }
    public java.util.List<DescribeAppListResponseBodyAppList> getAppList() {
        return this.appList;
    }

    public static class DescribeAppListResponseBodyAppList extends TeaModel {
        @NameInMap("OldAppKey")
        public String oldAppKey;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("HasOldAppKey")
        public Boolean hasOldAppKey;

        @NameInMap("SdkVersion")
        public String sdkVersion;

        @NameInMap("BizNum")
        public Integer bizNum;

        @NameInMap("GroupNum")
        public Integer groupNum;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        public static DescribeAppListResponseBodyAppList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppListResponseBodyAppList self = new DescribeAppListResponseBodyAppList();
            return TeaModel.build(map, self);
        }

        public DescribeAppListResponseBodyAppList setOldAppKey(String oldAppKey) {
            this.oldAppKey = oldAppKey;
            return this;
        }
        public String getOldAppKey() {
            return this.oldAppKey;
        }

        public DescribeAppListResponseBodyAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppListResponseBodyAppList setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public DescribeAppListResponseBodyAppList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppListResponseBodyAppList setHasOldAppKey(Boolean hasOldAppKey) {
            this.hasOldAppKey = hasOldAppKey;
            return this;
        }
        public Boolean getHasOldAppKey() {
            return this.hasOldAppKey;
        }

        public DescribeAppListResponseBodyAppList setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeAppListResponseBodyAppList setBizNum(Integer bizNum) {
            this.bizNum = bizNum;
            return this;
        }
        public Integer getBizNum() {
            return this.bizNum;
        }

        public DescribeAppListResponseBodyAppList setGroupNum(Integer groupNum) {
            this.groupNum = groupNum;
            return this;
        }
        public Integer getGroupNum() {
            return this.groupNum;
        }

        public DescribeAppListResponseBodyAppList setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

    }

}
