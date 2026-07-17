// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListBotInstancesResponseBody extends TeaModel {
    /**
     * <p>The instances that match the specified conditions under the current account.</p>
     */
    @NameInMap("InstanceInfo")
    public java.util.List<ListBotInstancesResponseBodyInstanceInfo> instanceInfo;

    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>509FD5AF-AB5B-55A9-9568-38D98668E3AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListBotInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBotInstancesResponseBody self = new ListBotInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBotInstancesResponseBody setInstanceInfo(java.util.List<ListBotInstancesResponseBodyInstanceInfo> instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public java.util.List<ListBotInstancesResponseBodyInstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
    }

    public ListBotInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBotInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBotInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBotInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListBotInstancesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListBotInstancesResponseBodyInstanceInfo extends TeaModel {
        /**
         * <p>The Bot protection instance level. If this parameter is empty, the plan does not include a Bot protection instance. If a value is returned, the plan includes a Bot protection instance. Valid values:</p>
         * <ul>
         * <li><p>enterprise_bot: web edition.</p>
         * </li>
         * <li><p>enterprise_bot_with_app: app edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise_bot</p>
         */
        @NameInMap("BotInstanceLevel")
        public String botInstanceLevel;

        /**
         * <p>The time when the instance was purchased. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-12T05:41:51Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The scheduled release time. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-25T16:00:00Z</p>
         */
        @NameInMap("ReserveReleaseTime")
        public String reserveReleaseTime;

        /**
         * <p>The ID of the associated site plan instance.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-b0s6kmx0r0n4</p>
         */
        @NameInMap("SiteInstanceId")
        public String siteInstanceId;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: The instance is running normally.</li>
         * <li><strong>offline</strong>: The instance has expired but has not exceeded the retention period and is unavailable.</li>
         * <li><strong>disable</strong>: The instance has been released.</li>
         * <li><strong>overdue</strong>: The instance has been stopped due to an overdue payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListBotInstancesResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListBotInstancesResponseBodyInstanceInfo self = new ListBotInstancesResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListBotInstancesResponseBodyInstanceInfo setBotInstanceLevel(String botInstanceLevel) {
            this.botInstanceLevel = botInstanceLevel;
            return this;
        }
        public String getBotInstanceLevel() {
            return this.botInstanceLevel;
        }

        public ListBotInstancesResponseBodyInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBotInstancesResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListBotInstancesResponseBodyInstanceInfo setReserveReleaseTime(String reserveReleaseTime) {
            this.reserveReleaseTime = reserveReleaseTime;
            return this;
        }
        public String getReserveReleaseTime() {
            return this.reserveReleaseTime;
        }

        public ListBotInstancesResponseBodyInstanceInfo setSiteInstanceId(String siteInstanceId) {
            this.siteInstanceId = siteInstanceId;
            return this;
        }
        public String getSiteInstanceId() {
            return this.siteInstanceId;
        }

        public ListBotInstancesResponseBodyInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
