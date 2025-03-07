// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListChannelAlertsResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The alerts.</p>
     */
    @NameInMap("ProgramAlerts")
    public java.util.List<ListChannelAlertsResponseBodyProgramAlerts> programAlerts;

    /**
     * <p><strong>Request ID</strong></p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of alerts returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListChannelAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChannelAlertsResponseBody self = new ListChannelAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChannelAlertsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChannelAlertsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChannelAlertsResponseBody setProgramAlerts(java.util.List<ListChannelAlertsResponseBodyProgramAlerts> programAlerts) {
        this.programAlerts = programAlerts;
        return this;
    }
    public java.util.List<ListChannelAlertsResponseBodyProgramAlerts> getProgramAlerts() {
        return this.programAlerts;
    }

    public ListChannelAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChannelAlertsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListChannelAlertsResponseBodyProgramAlerts extends TeaModel {
        /**
         * <p>The ARN of the program.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ims:mediaweaver:<regionId>:<userId>:program/myChannel/MyProgram</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The alert type.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time when the alert was last modified in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-16T10:03Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The name of the program.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name</p>
         */
        @NameInMap("ProgramName")
        public String programName;

        public static ListChannelAlertsResponseBodyProgramAlerts build(java.util.Map<String, ?> map) throws Exception {
            ListChannelAlertsResponseBodyProgramAlerts self = new ListChannelAlertsResponseBodyProgramAlerts();
            return TeaModel.build(map, self);
        }

        public ListChannelAlertsResponseBodyProgramAlerts setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListChannelAlertsResponseBodyProgramAlerts setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListChannelAlertsResponseBodyProgramAlerts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListChannelAlertsResponseBodyProgramAlerts setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListChannelAlertsResponseBodyProgramAlerts setProgramName(String programName) {
            this.programName = programName;
            return this;
        }
        public String getProgramName() {
            return this.programName;
        }

    }

}
