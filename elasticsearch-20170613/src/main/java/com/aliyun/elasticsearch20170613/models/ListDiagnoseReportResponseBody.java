// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportResponseBody extends TeaModel {
    /**
     * <p>The response headers.</p>
     */
    @NameInMap("Headers")
    public ListDiagnoseReportResponseBodyHeaders headers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListDiagnoseReportResponseBodyResult> result;

    public static ListDiagnoseReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseReportResponseBody self = new ListDiagnoseReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseReportResponseBody setHeaders(ListDiagnoseReportResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListDiagnoseReportResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListDiagnoseReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiagnoseReportResponseBody setResult(java.util.List<ListDiagnoseReportResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDiagnoseReportResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDiagnoseReportResponseBodyHeaders extends TeaModel {
        /**
         * <p>The total number of records returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListDiagnoseReportResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnoseReportResponseBodyHeaders self = new ListDiagnoseReportResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListDiagnoseReportResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail extends TeaModel {
        /**
         * <p>The description of the diagnostic item.</p>
         * 
         * <strong>example:</strong>
         * <p>Check whether the number of replica shards is optimal and easy to maintain</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>The full name of the diagnostic item.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of Replica Shards</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The diagnostic result.</p>
         * 
         * <strong>example:</strong>
         * <p>You may need to adjust the numbers of replica shards of some indices as follows:  [geoname08 : 0 -&gt; 1][geoname09 : 0 -&gt; 1][geonametest01 : 0 -&gt; 1]</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The diagnostic suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>You can call the following function in the Elasticsearch API....</p>
         */
        @NameInMap("suggest")
        public String suggest;

        /**
         * <p>The type of the diagnostic result. Valid values:</p>
         * <ul>
         * <li>TEXT: text description</li>
         * <li>CONSOLE_API: console-triggered</li>
         * <li>ES_API: API-triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ES_API</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail self = new ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail();
            return TeaModel.build(map, self);
        }

        public ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail setSuggest(String suggest) {
            this.suggest = suggest;
            return this;
        }
        public String getSuggest() {
            return this.suggest;
        }

        public ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDiagnoseReportResponseBodyResultDiagnoseItems extends TeaModel {
        /**
         * <p>The details of the diagnostic item.</p>
         */
        @NameInMap("detail")
        public ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail detail;

        /**
         * <p>The health status of the diagnostic item. Valid values: GREEN, YELLOW, RED, and UNKNOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>YELLOW</p>
         */
        @NameInMap("health")
        public String health;

        /**
         * <p>The name of the diagnostic item.</p>
         * 
         * <strong>example:</strong>
         * <p>IndexAliasUseDiagnostic</p>
         */
        @NameInMap("item")
        public String item;

        public static ListDiagnoseReportResponseBodyResultDiagnoseItems build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnoseReportResponseBodyResultDiagnoseItems self = new ListDiagnoseReportResponseBodyResultDiagnoseItems();
            return TeaModel.build(map, self);
        }

        public ListDiagnoseReportResponseBodyResultDiagnoseItems setDetail(ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail detail) {
            this.detail = detail;
            return this;
        }
        public ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail getDetail() {
            return this.detail;
        }

        public ListDiagnoseReportResponseBodyResultDiagnoseItems setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListDiagnoseReportResponseBodyResultDiagnoseItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class ListDiagnoseReportResponseBodyResultItems extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("detail")
        public java.util.Map<String, ?> detail;

        @NameInMap("item")
        public String item;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("suggest")
        public String suggest;

        public static ListDiagnoseReportResponseBodyResultItems build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnoseReportResponseBodyResultItems self = new ListDiagnoseReportResponseBodyResultItems();
            return TeaModel.build(map, self);
        }

        public ListDiagnoseReportResponseBodyResultItems setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListDiagnoseReportResponseBodyResultItems setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public ListDiagnoseReportResponseBodyResultItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public ListDiagnoseReportResponseBodyResultItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDiagnoseReportResponseBodyResultItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListDiagnoseReportResponseBodyResultItems setSuggest(String suggest) {
            this.suggest = suggest;
            return this;
        }
        public String getSuggest() {
            return this.suggest;
        }

    }

    public static class ListDiagnoseReportResponseBodyResult extends TeaModel {
        /**
         * <p>The timestamp when the report was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1535745731000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The list of diagnostic items in the report.</p>
         */
        @NameInMap("diagnoseItems")
        public java.util.List<ListDiagnoseReportResponseBodyResultDiagnoseItems> diagnoseItems;

        @NameInMap("diagnosisMode")
        public String diagnosisMode;

        /**
         * <p>The overall health status of the cluster in the report. Valid values: GREEN, YELLOW, RED, and UNKNOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>YELLOW</p>
         */
        @NameInMap("health")
        public String health;

        /**
         * <p>The instance ID of the diagnosed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-abc</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("items")
        public java.util.List<ListDiagnoseReportResponseBodyResultItems> items;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>trigger__2020-08-17T17:09:02f</p>
         */
        @NameInMap("reportId")
        public String reportId;

        /**
         * <p>The diagnostic status. Valid values: SUCCESS, FAILED, and RUNNING.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The trigger method of the health diagnostics. Valid values:</p>
         * <ul>
         * <li>SYSTEM: automatically triggered by the system</li>
         * <li>INNER: internally triggered</li>
         * <li>USER: manually triggered by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("trigger")
        public String trigger;

        public static ListDiagnoseReportResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnoseReportResponseBodyResult self = new ListDiagnoseReportResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDiagnoseReportResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDiagnoseReportResponseBodyResult setDiagnoseItems(java.util.List<ListDiagnoseReportResponseBodyResultDiagnoseItems> diagnoseItems) {
            this.diagnoseItems = diagnoseItems;
            return this;
        }
        public java.util.List<ListDiagnoseReportResponseBodyResultDiagnoseItems> getDiagnoseItems() {
            return this.diagnoseItems;
        }

        public ListDiagnoseReportResponseBodyResult setDiagnosisMode(String diagnosisMode) {
            this.diagnosisMode = diagnosisMode;
            return this;
        }
        public String getDiagnosisMode() {
            return this.diagnosisMode;
        }

        public ListDiagnoseReportResponseBodyResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListDiagnoseReportResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDiagnoseReportResponseBodyResult setItems(java.util.List<ListDiagnoseReportResponseBodyResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDiagnoseReportResponseBodyResultItems> getItems() {
            return this.items;
        }

        public ListDiagnoseReportResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListDiagnoseReportResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListDiagnoseReportResponseBodyResult setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

    }

}
