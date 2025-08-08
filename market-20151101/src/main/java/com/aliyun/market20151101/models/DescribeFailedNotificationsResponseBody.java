// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeFailedNotificationsResponseBody extends TeaModel {
    @NameInMap("NotificationList")
    public java.util.List<DescribeFailedNotificationsResponseBodyNotificationList> notificationList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFailedNotificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFailedNotificationsResponseBody self = new DescribeFailedNotificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFailedNotificationsResponseBody setNotificationList(java.util.List<DescribeFailedNotificationsResponseBodyNotificationList> notificationList) {
        this.notificationList = notificationList;
        return this;
    }
    public java.util.List<DescribeFailedNotificationsResponseBodyNotificationList> getNotificationList() {
        return this.notificationList;
    }

    public DescribeFailedNotificationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFailedNotificationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFailedNotificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFailedNotificationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFailedNotificationsResponseBodyNotificationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>orderPay</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>1665988512000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>{&quot;productCode&quot;:&quot;cmgj00001&quot;,&quot;orderId&quot;:&quot;123456&quot;,&quot;orderBizId&quot;:&quot;111222&quot;,&quot;action&quot;:&quot;orderPay&quot;,&quot;aliUid&quot;:&quot;12211222211&quot;,&quot;skuId&quot;:&quot;cmgj00001-prepay&quot;}</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>deab3673236843a3b378c7d8d25c5f01</p>
         */
        @NameInMap("NotificationRequestId")
        public String notificationRequestId;

        public static DescribeFailedNotificationsResponseBodyNotificationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFailedNotificationsResponseBodyNotificationList self = new DescribeFailedNotificationsResponseBodyNotificationList();
            return TeaModel.build(map, self);
        }

        public DescribeFailedNotificationsResponseBodyNotificationList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeFailedNotificationsResponseBodyNotificationList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeFailedNotificationsResponseBodyNotificationList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeFailedNotificationsResponseBodyNotificationList setNotificationRequestId(String notificationRequestId) {
            this.notificationRequestId = notificationRequestId;
            return this;
        }
        public String getNotificationRequestId() {
            return this.notificationRequestId;
        }

    }

}
