// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LogInfos")
    public DescribeLogConfigResponseBodyLogInfos logInfos;

    public static DescribeLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogConfigResponseBody self = new DescribeLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogConfigResponseBody setLogInfos(DescribeLogConfigResponseBodyLogInfos logInfos) {
        this.logInfos = logInfos;
        return this;
    }
    public DescribeLogConfigResponseBodyLogInfos getLogInfos() {
        return this.logInfos;
    }

    public static class DescribeLogConfigResponseBodyLogInfosLogInfo extends TeaModel {
        @NameInMap("SlsLogStore")
        public String slsLogStore;

        @NameInMap("LogType")
        public String logType;

        @NameInMap("SlsProject")
        public String slsProject;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeLogConfigResponseBodyLogInfosLogInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogConfigResponseBodyLogInfosLogInfo self = new DescribeLogConfigResponseBodyLogInfosLogInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogConfigResponseBodyLogInfosLogInfo setSlsLogStore(String slsLogStore) {
            this.slsLogStore = slsLogStore;
            return this;
        }
        public String getSlsLogStore() {
            return this.slsLogStore;
        }

        public DescribeLogConfigResponseBodyLogInfosLogInfo setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public DescribeLogConfigResponseBodyLogInfosLogInfo setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public DescribeLogConfigResponseBodyLogInfosLogInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeLogConfigResponseBodyLogInfos extends TeaModel {
        @NameInMap("LogInfo")
        public java.util.List<DescribeLogConfigResponseBodyLogInfosLogInfo> logInfo;

        public static DescribeLogConfigResponseBodyLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogConfigResponseBodyLogInfos self = new DescribeLogConfigResponseBodyLogInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLogConfigResponseBodyLogInfos setLogInfo(java.util.List<DescribeLogConfigResponseBodyLogInfosLogInfo> logInfo) {
            this.logInfo = logInfo;
            return this;
        }
        public java.util.List<DescribeLogConfigResponseBodyLogInfosLogInfo> getLogInfo() {
            return this.logInfo;
        }

    }

}
