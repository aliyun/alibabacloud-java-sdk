// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeIMRobotsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    public DescribeIMRobotsResponseBodyPageBean pageBean;

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

    public static class DescribeIMRobotsResponseBodyPageBeanAlertIMRobots extends TeaModel {
        @NameInMap("DailyNoc")
        public Boolean dailyNoc;

        @NameInMap("DailyNocTime")
        public String dailyNocTime;

        @NameInMap("DingSignKey")
        public String dingSignKey;

        @NameInMap("RobotAddr")
        public String robotAddr;

        @NameInMap("RobotId")
        public Float robotId;

        @NameInMap("RobotName")
        public String robotName;

        @NameInMap("Type")
        public String type;

        public static DescribeIMRobotsResponseBodyPageBeanAlertIMRobots build(java.util.Map<String, ?> map) throws Exception {
            DescribeIMRobotsResponseBodyPageBeanAlertIMRobots self = new DescribeIMRobotsResponseBodyPageBeanAlertIMRobots();
            return TeaModel.build(map, self);
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
        @NameInMap("AlertIMRobots")
        public java.util.List<DescribeIMRobotsResponseBodyPageBeanAlertIMRobots> alertIMRobots;

        @NameInMap("Page")
        public Long page;

        @NameInMap("Size")
        public Long size;

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
