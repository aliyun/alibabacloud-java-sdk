// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintainConfResponseBody extends TeaModel {
    /**
     * <p>The proactive maintenance configuration.</p>
     */
    @NameInMap("Config")
    public DescribeActiveOperationMaintainConfResponseBodyConfig config;

    /**
     * <p>Indicates whether proactive maintenance is configured. Valid values:</p>
     * <ul>
     * <li>1: Configured.</li>
     * <li>0: Not configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HasConfig")
    public Integer hasConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActiveOperationMaintainConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintainConfResponseBody self = new DescribeActiveOperationMaintainConfResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintainConfResponseBody setConfig(DescribeActiveOperationMaintainConfResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeActiveOperationMaintainConfResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeActiveOperationMaintainConfResponseBody setHasConfig(Integer hasConfig) {
        this.hasConfig = hasConfig;
        return this;
    }
    public Integer getHasConfig() {
        return this.hasConfig;
    }

    public DescribeActiveOperationMaintainConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeActiveOperationMaintainConfResponseBodyConfig extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-18T06:51:11+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The cycle time.</p>
         * <ul>
         * <li>If CycleType is set to Month, the return value is a number from 1 to 28, which indicates the day of the month. Multiple values are separated by commas (,).</li>
         * <li>If CycleType is set to Week, the return value is a number from 1 to 7, which indicates the day of the week. Multiple values are separated by commas (,).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleTime")
        public String cycleTime;

        /**
         * <p>The cycle type. Valid values:</p>
         * <ul>
         * <li>Month: Monthly.</li>
         * <li>Week: Weekly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Week</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The end time of the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>22:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-27T07:12:53Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>Indicates whether the configuration takes effect. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>2: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeActiveOperationMaintainConfResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationMaintainConfResponseBodyConfig self = new DescribeActiveOperationMaintainConfResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCycleTime(String cycleTime) {
            this.cycleTime = cycleTime;
            return this;
        }
        public String getCycleTime() {
            return this.cycleTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
