// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListAppReleaseStageExecutionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    @NameInMap("data")
    public java.util.List<ListAppReleaseStageExecutionsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>vxc2341gfssad12</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pages")
    public Long pages;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("perPage")
    public Long perPage;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAppReleaseStageExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppReleaseStageExecutionsResponseBody self = new ListAppReleaseStageExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppReleaseStageExecutionsResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListAppReleaseStageExecutionsResponseBody setData(java.util.List<ListAppReleaseStageExecutionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppReleaseStageExecutionsResponseBodyData> getData() {
        return this.data;
    }

    public ListAppReleaseStageExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppReleaseStageExecutionsResponseBody setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public ListAppReleaseStageExecutionsResponseBody setPerPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
    public Long getPerPage() {
        return this.perPage;
    }

    public ListAppReleaseStageExecutionsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAppReleaseStageExecutionsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-06-25T07:26:18.000+00:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("number")
        public String number;

        /**
         * <strong>example:</strong>
         * <p>2024-06-25T07:25:54.000+00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("triggerMode")
        public String triggerMode;

        public static ListAppReleaseStageExecutionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppReleaseStageExecutionsResponseBodyData self = new ListAppReleaseStageExecutionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppReleaseStageExecutionsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAppReleaseStageExecutionsResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListAppReleaseStageExecutionsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAppReleaseStageExecutionsResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAppReleaseStageExecutionsResponseBodyData setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

    }

}
