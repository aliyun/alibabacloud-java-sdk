// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertRobotsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("robots")
    public java.util.List<ListAlertRobotsResponseBodyRobots> robots;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAlertRobotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertRobotsResponseBody self = new ListAlertRobotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertRobotsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertRobotsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertRobotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertRobotsResponseBody setRobots(java.util.List<ListAlertRobotsResponseBodyRobots> robots) {
        this.robots = robots;
        return this;
    }
    public java.util.List<ListAlertRobotsResponseBodyRobots> getRobots() {
        return this.robots;
    }

    public ListAlertRobotsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAlertRobotsResponseBodyRobots extends TeaModel {
        @NameInMap("digitalEmployeeName")
        public String digitalEmployeeName;

        /**
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        @NameInMap("lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("robotId")
        public String robotId;

        /**
         * <strong>example:</strong>
         * <p>DING</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>*******</p>
         */
        @NameInMap("url")
        public String url;

        @NameInMap("workspace")
        public String workspace;

        public static ListAlertRobotsResponseBodyRobots build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRobotsResponseBodyRobots self = new ListAlertRobotsResponseBodyRobots();
            return TeaModel.build(map, self);
        }

        public ListAlertRobotsResponseBodyRobots setDigitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        public ListAlertRobotsResponseBodyRobots setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListAlertRobotsResponseBodyRobots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertRobotsResponseBodyRobots setRobotId(String robotId) {
            this.robotId = robotId;
            return this;
        }
        public String getRobotId() {
            return this.robotId;
        }

        public ListAlertRobotsResponseBodyRobots setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertRobotsResponseBodyRobots setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListAlertRobotsResponseBodyRobots setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
