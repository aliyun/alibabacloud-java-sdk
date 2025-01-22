// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAlertsResponseBody extends TeaModel {
    @NameInMap("Alerts")
    public java.util.List<ListAlertsResponseBodyAlerts> alerts;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsResponseBody self = new ListAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertsResponseBody setAlerts(java.util.List<ListAlertsResponseBodyAlerts> alerts) {
        this.alerts = alerts;
        return this;
    }
    public java.util.List<ListAlertsResponseBodyAlerts> getAlerts() {
        return this.alerts;
    }

    public ListAlertsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAlertsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlertsResponseBodyAlerts extends TeaModel {
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>ScheduleError</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2024-07-16T10:03Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-07-16T10:03Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>acs:ims:mediaweaver:<regionId>:<userId>:vodSource/mySourceLocation/MySource</p>
         */
        @NameInMap("RelatedResourceArns")
        public String relatedResourceArns;

        /**
         * <strong>example:</strong>
         * <p>acs:ims:mediaweaver:<regionId>:<userId>:vodSource/mySourceLocation/MySource</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        public static ListAlertsResponseBodyAlerts build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyAlerts self = new ListAlertsResponseBodyAlerts();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyAlerts setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListAlertsResponseBodyAlerts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAlertsResponseBodyAlerts setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAlertsResponseBodyAlerts setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAlertsResponseBodyAlerts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAlertsResponseBodyAlerts setRelatedResourceArns(String relatedResourceArns) {
            this.relatedResourceArns = relatedResourceArns;
            return this;
        }
        public String getRelatedResourceArns() {
            return this.relatedResourceArns;
        }

        public ListAlertsResponseBodyAlerts setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

    }

}
