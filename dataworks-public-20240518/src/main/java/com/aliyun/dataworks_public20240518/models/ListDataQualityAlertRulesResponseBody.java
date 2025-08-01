// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityAlertRulesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListDataQualityAlertRulesResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityAlertRulesResponseBody self = new ListDataQualityAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityAlertRulesResponseBody setPageInfo(ListDataQualityAlertRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListDataQualityAlertRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListDataQualityAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:true}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>AliUid</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers self = new ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<String> channels;

        @NameInMap("Receivers")
        public java.util.List<ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers> receivers;

        public static ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification self = new ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification();
            return TeaModel.build(map, self);
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification setReceivers(java.util.List<ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotificationReceivers> getReceivers() {
            return this.receivers;
        }

    }

    public static class ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget extends TeaModel {
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <strong>example:</strong>
         * <p>DataQualityScan</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget self = new ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget();
            return TeaModel.build(map, self);
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>results.any { r -&gt; r.status == \&quot;fail\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <strong>example:</strong>
         * <p>26433</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Notification")
        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification notification;

        /**
         * <strong>example:</strong>
         * <p>59094</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Target")
        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget target;

        public static ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules self = new ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules();
            return TeaModel.build(map, self);
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules setNotification(ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification notification) {
            this.notification = notification;
            return this;
        }
        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesNotification getNotification() {
            return this.notification;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules setTarget(ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget target) {
            this.target = target;
            return this;
        }
        public ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRulesTarget getTarget() {
            return this.target;
        }

    }

    public static class ListDataQualityAlertRulesResponseBodyPageInfo extends TeaModel {
        @NameInMap("DataQualityAlertRules")
        public java.util.List<ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules> dataQualityAlertRules;

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
         * <strong>example:</strong>
         * <p>335</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityAlertRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityAlertRulesResponseBodyPageInfo self = new ListDataQualityAlertRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityAlertRulesResponseBodyPageInfo setDataQualityAlertRules(java.util.List<ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules> dataQualityAlertRules) {
            this.dataQualityAlertRules = dataQualityAlertRules;
            return this;
        }
        public java.util.List<ListDataQualityAlertRulesResponseBodyPageInfoDataQualityAlertRules> getDataQualityAlertRules() {
            return this.dataQualityAlertRules;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityAlertRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
