// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeLogConfigResponseBody extends TeaModel {
    /**
     * <p>Info of the log config.</p>
     */
    @NameInMap("LogInfos")
    public DescribeLogConfigResponseBodyLogInfos logInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E3BC2706-ABDB-5B64-A12F-08DFD9E3F339</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogConfigResponseBody self = new DescribeLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogConfigResponseBody setLogInfos(DescribeLogConfigResponseBodyLogInfos logInfos) {
        this.logInfos = logInfos;
        return this;
    }
    public DescribeLogConfigResponseBodyLogInfos getLogInfos() {
        return this.logInfos;
    }

    public DescribeLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLogConfigResponseBodyLogInfosLogInfo extends TeaModel {
        /**
         * <p>The log type.</p>
         * 
         * <strong>example:</strong>
         * <p>PROVIDER</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <p>The region ID of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the Logstore in Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>slsstore</p>
         */
        @NameInMap("SlsLogStore")
        public String slsLogStore;

        /**
         * <p>The name of the Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>slsproject</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        public static DescribeLogConfigResponseBodyLogInfosLogInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogConfigResponseBodyLogInfosLogInfo self = new DescribeLogConfigResponseBodyLogInfosLogInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogConfigResponseBodyLogInfosLogInfo setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public DescribeLogConfigResponseBodyLogInfosLogInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLogConfigResponseBodyLogInfosLogInfo setSlsLogStore(String slsLogStore) {
            this.slsLogStore = slsLogStore;
            return this;
        }
        public String getSlsLogStore() {
            return this.slsLogStore;
        }

        public DescribeLogConfigResponseBodyLogInfosLogInfo setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
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
