// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAccessWhiteListSlbListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlbList")
    public java.util.List<DescribeAccessWhiteListSlbListResponseBodySlbList> slbList;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("module")
    public String module;

    public static DescribeAccessWhiteListSlbListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessWhiteListSlbListResponseBody self = new DescribeAccessWhiteListSlbListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessWhiteListSlbListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessWhiteListSlbListResponseBody setSlbList(java.util.List<DescribeAccessWhiteListSlbListResponseBodySlbList> slbList) {
        this.slbList = slbList;
        return this;
    }
    public java.util.List<DescribeAccessWhiteListSlbListResponseBodySlbList> getSlbList() {
        return this.slbList;
    }

    public DescribeAccessWhiteListSlbListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessWhiteListSlbListResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public static class DescribeAccessWhiteListSlbListResponseBodySlbList extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ItemSign")
        public String itemSign;

        @NameInMap("Region")
        public String region;

        public static DescribeAccessWhiteListSlbListResponseBodySlbList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessWhiteListSlbListResponseBodySlbList self = new DescribeAccessWhiteListSlbListResponseBodySlbList();
            return TeaModel.build(map, self);
        }

        public DescribeAccessWhiteListSlbListResponseBodySlbList setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeAccessWhiteListSlbListResponseBodySlbList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAccessWhiteListSlbListResponseBodySlbList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAccessWhiteListSlbListResponseBodySlbList setItemSign(String itemSign) {
            this.itemSign = itemSign;
            return this;
        }
        public String getItemSign() {
            return this.itemSign;
        }

        public DescribeAccessWhiteListSlbListResponseBodySlbList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
