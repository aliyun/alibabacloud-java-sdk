// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppWarningByPageResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The extension field.</p>
     */
    @NameInMap("Ext")
    public ListAiAppWarningByPageResponseBodyExt ext;

    /**
     * <p>The data on the current page.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListAiAppWarningByPageResponseBodyItems> items;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAiAppWarningByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppWarningByPageResponseBody self = new ListAiAppWarningByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAiAppWarningByPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAiAppWarningByPageResponseBody setExt(ListAiAppWarningByPageResponseBodyExt ext) {
        this.ext = ext;
        return this;
    }
    public ListAiAppWarningByPageResponseBodyExt getExt() {
        return this.ext;
    }

    public ListAiAppWarningByPageResponseBody setItems(java.util.List<ListAiAppWarningByPageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAiAppWarningByPageResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAiAppWarningByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAiAppWarningByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAiAppWarningByPageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAiAppWarningByPageResponseBodyExt extends TeaModel {
        /**
         * <p>The option.</p>
         */
        @NameInMap("Option")
        public java.util.Map<String, ?> option;

        public static ListAiAppWarningByPageResponseBodyExt build(java.util.Map<String, ?> map) throws Exception {
            ListAiAppWarningByPageResponseBodyExt self = new ListAiAppWarningByPageResponseBodyExt();
            return TeaModel.build(map, self);
        }

        public ListAiAppWarningByPageResponseBodyExt setOption(java.util.Map<String, ?> option) {
            this.option = option;
            return this;
        }
        public java.util.Map<String, ?> getOption() {
            return this.option;
        }

    }

    public static class ListAiAppWarningByPageResponseBodyItemsLabels extends TeaModel {
        /**
         * <p>The count.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The label description.</p>
         * 
         * <strong>example:</strong>
         * <p>desc-xxx</p>
         */
        @NameInMap("LabelDesc")
        public String labelDesc;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>promptAttack</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAiAppWarningByPageResponseBodyItemsLabels build(java.util.Map<String, ?> map) throws Exception {
            ListAiAppWarningByPageResponseBodyItemsLabels self = new ListAiAppWarningByPageResponseBodyItemsLabels();
            return TeaModel.build(map, self);
        }

        public ListAiAppWarningByPageResponseBodyItemsLabels setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListAiAppWarningByPageResponseBodyItemsLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAiAppWarningByPageResponseBodyItemsLabels setLabelDesc(String labelDesc) {
            this.labelDesc = labelDesc;
            return this;
        }
        public String getLabelDesc() {
            return this.labelDesc;
        }

        public ListAiAppWarningByPageResponseBodyItemsLabels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAiAppWarningByPageResponseBodyItems extends TeaModel {
        /**
         * <p>appId。</p>
         * 
         * <strong>example:</strong>
         * <p>id-xxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>name-xxx</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The list of labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<ListAiAppWarningByPageResponseBodyItemsLabels> labels;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck_01</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The trace ID used to correlate and trace alert events.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc3b4b0********516098843e19bc</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WarningCount")
        public Long warningCount;

        /**
         * <p>The time when the alert was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        @NameInMap("WarningTime")
        public String warningTime;

        public static ListAiAppWarningByPageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAiAppWarningByPageResponseBodyItems self = new ListAiAppWarningByPageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAiAppWarningByPageResponseBodyItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAiAppWarningByPageResponseBodyItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAiAppWarningByPageResponseBodyItems setLabels(java.util.List<ListAiAppWarningByPageResponseBodyItemsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListAiAppWarningByPageResponseBodyItemsLabels> getLabels() {
            return this.labels;
        }

        public ListAiAppWarningByPageResponseBodyItems setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListAiAppWarningByPageResponseBodyItems setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ListAiAppWarningByPageResponseBodyItems setWarningCount(Long warningCount) {
            this.warningCount = warningCount;
            return this;
        }
        public Long getWarningCount() {
            return this.warningCount;
        }

        public ListAiAppWarningByPageResponseBodyItems setWarningTime(String warningTime) {
            this.warningTime = warningTime;
            return this;
        }
        public String getWarningTime() {
            return this.warningTime;
        }

    }

}
