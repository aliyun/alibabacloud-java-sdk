// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeIMRobotsResponseBody extends TeaModel {
    /**
     * <p>Paging object.</p>
     */
    @NameInMap("PageBean")
    public DescribeIMRobotsResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIMRobotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIMRobotsResponseBody self = new DescribeIMRobotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIMRobotsResponseBody setPageBean(DescribeIMRobotsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public DescribeIMRobotsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public DescribeIMRobotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules self = new DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules();
            return TeaModel.build(map, self);
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeIMRobotsResponseBodyPageBeanAlertIMRobots extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Specifies whether to send daily statistics.</p>
         * <br>
         * <p>*   `false` (default): does not send statistics.</p>
         * <p>*   `true`: sends statistics.</p>
         */
        @NameInMap("DailyNoc")
        public Boolean dailyNoc;

        /**
         * <p>The time when the daily statistics are sent. ARMS Alert Management sends the total number of alerts generated today, the number of resolved alerts, and the number of pending alerts at the specified time point.</p>
         */
        @NameInMap("DailyNocTime")
        public String dailyNocTime;

        /**
         * <p>The signature key of DingTalk. If you specify a signature key, DingTalk authentication is performed with the key. Otherwise, a whitelist is used for authentication by default. The keyword of the whitelist is **Alert**.</p>
         */
        @NameInMap("DingSignKey")
        public String dingSignKey;

        @NameInMap("DispatchRules")
        public java.util.List<DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules> dispatchRules;

        /**
         * <p>The webhook address of the IM bot.</p>
         */
        @NameInMap("RobotAddr")
        public String robotAddr;

        /**
         * <p>The ID of the IM bot.</p>
         */
        @NameInMap("RobotId")
        public Float robotId;

        /**
         * <p>The name of the IM robot.</p>
         */
        @NameInMap("RobotName")
        public String robotName;

        /**
         * <p>IM Robot Type:</p>
         * <br>
         * <p>*   `dingding`: DingTalk robot.</p>
         * <p>*   `wechat`: Enterprise WeChat Robot.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeIMRobotsResponseBodyPageBeanAlertIMRobots build(java.util.Map<String, ?> map) throws Exception {
            DescribeIMRobotsResponseBodyPageBeanAlertIMRobots self = new DescribeIMRobotsResponseBodyPageBeanAlertIMRobots();
            return TeaModel.build(map, self);
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setDailyNoc(Boolean dailyNoc) {
            this.dailyNoc = dailyNoc;
            return this;
        }
        public Boolean getDailyNoc() {
            return this.dailyNoc;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setDailyNocTime(String dailyNocTime) {
            this.dailyNocTime = dailyNocTime;
            return this;
        }
        public String getDailyNocTime() {
            return this.dailyNocTime;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setDingSignKey(String dingSignKey) {
            this.dingSignKey = dingSignKey;
            return this;
        }
        public String getDingSignKey() {
            return this.dingSignKey;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setDispatchRules(java.util.List<DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules> dispatchRules) {
            this.dispatchRules = dispatchRules;
            return this;
        }
        public java.util.List<DescribeIMRobotsResponseBodyPageBeanAlertIMRobotsDispatchRules> getDispatchRules() {
            return this.dispatchRules;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setRobotAddr(String robotAddr) {
            this.robotAddr = robotAddr;
            return this;
        }
        public String getRobotAddr() {
            return this.robotAddr;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setRobotId(Float robotId) {
            this.robotId = robotId;
            return this;
        }
        public Float getRobotId() {
            return this.robotId;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setRobotName(String robotName) {
            this.robotName = robotName;
            return this;
        }
        public String getRobotName() {
            return this.robotName;
        }

        public DescribeIMRobotsResponseBodyPageBeanAlertIMRobots setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeIMRobotsResponseBodyPageBean extends TeaModel {
        /**
         * <p>The details of the IM robot.</p>
         */
        @NameInMap("AlertIMRobots")
        public java.util.List<DescribeIMRobotsResponseBodyPageBeanAlertIMRobots> alertIMRobots;

        /**
         * <p>The number of pages to query.</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>Number of IM robots per page.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of IM robots queried.</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeIMRobotsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            DescribeIMRobotsResponseBodyPageBean self = new DescribeIMRobotsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public DescribeIMRobotsResponseBodyPageBean setAlertIMRobots(java.util.List<DescribeIMRobotsResponseBodyPageBeanAlertIMRobots> alertIMRobots) {
            this.alertIMRobots = alertIMRobots;
            return this;
        }
        public java.util.List<DescribeIMRobotsResponseBodyPageBeanAlertIMRobots> getAlertIMRobots() {
            return this.alertIMRobots;
        }

        public DescribeIMRobotsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public DescribeIMRobotsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeIMRobotsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
