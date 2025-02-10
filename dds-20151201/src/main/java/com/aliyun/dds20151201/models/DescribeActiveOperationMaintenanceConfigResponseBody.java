// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintenanceConfigResponseBody extends TeaModel {
    /**
     * <p>The description of the configuration.</p>
     */
    @NameInMap("Config")
    public DescribeActiveOperationMaintenanceConfigResponseBodyConfig config;

    /**
     * <p>Indicates whether the O\&amp;M task is configured. Valid values:</p>
     * <ul>
     * <li>1: The O\&amp;M task is configured.</li>
     * <li>0: The O\&amp;M task is not configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HasConfig")
    public Integer hasConfig;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>72651AF9-7897-41A7-8B67-6C15C7F26A0A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActiveOperationMaintenanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintenanceConfigResponseBody self = new DescribeActiveOperationMaintenanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setConfig(DescribeActiveOperationMaintenanceConfigResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeActiveOperationMaintenanceConfigResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setHasConfig(Integer hasConfig) {
        this.hasConfig = hasConfig;
        return this;
    }
    public Integer getHasConfig() {
        return this.hasConfig;
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeActiveOperationMaintenanceConfigResponseBodyConfig extends TeaModel {
        /**
         * <p>The time when the O\&amp;M task was created. The timefollows the <em>yyyy-mm-dd</em>t<em>hh:mm:ss</em>z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-20T00:05:54+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The start time of the O\&amp;M period. The time follows the <em>hh:mm</em> z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("CycleTime")
        public String cycleTime;

        /**
         * <p>The cyclical type of the O\&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The end time of the maintenance window. The time follows the <em>hh:mm</em>z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>04:00:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window. The time follows the <em>hh:mm</em>z format.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The time when the O\&amp;M task was modified. The time follows the <em>yyyy-mm-dd</em>t<em>hh:mm:ss</em>z format. The time is displayed in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-26T05:50:34.000+00:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The state of the O\&amp;M task. Valid values: <strong>0</strong>: The O\&amp;M task is in the starting state. <strong>1</strong>: The O\&amp;M task is in the running state. <strong>2</strong>: The O\&amp;M task is in the stopped state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeActiveOperationMaintenanceConfigResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationMaintenanceConfigResponseBodyConfig self = new DescribeActiveOperationMaintenanceConfigResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCycleTime(String cycleTime) {
            this.cycleTime = cycleTime;
            return this;
        }
        public String getCycleTime() {
            return this.cycleTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
