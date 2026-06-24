// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public DescribeDiagnoseReportResponseBodyResult result;

    public static DescribeDiagnoseReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseReportResponseBody self = new DescribeDiagnoseReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnoseReportResponseBody setResult(DescribeDiagnoseReportResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDiagnoseReportResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail extends TeaModel {
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
         * <p>You may need to adjust the numbers of replica shards of some indices as follows: [geoname08 : 0 -&gt; 1][geoname09 : 0 -&gt; 1][geonametest01 : 0 -&gt; 1]</p>
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
         * <p>The type of the diagnostic result. Valid values: TEXT (text description), CONSOLE_API (console-triggered), and ES_API (API-triggered).</p>
         * 
         * <strong>example:</strong>
         * <p>ES_API</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail self = new DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setSuggest(String suggest) {
            this.suggest = suggest;
            return this;
        }
        public String getSuggest() {
            return this.suggest;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDiagnoseReportResponseBodyResultDiagnoseItems extends TeaModel {
        /**
         * <p>The details of the diagnostic item.</p>
         */
        @NameInMap("detail")
        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail detail;

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

        public static DescribeDiagnoseReportResponseBodyResultDiagnoseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyResultDiagnoseItems self = new DescribeDiagnoseReportResponseBodyResultDiagnoseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItems setDetail(DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeDiagnoseReportResponseBodyResultDiagnoseItemsDetail getDetail() {
            return this.detail;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItems setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public DescribeDiagnoseReportResponseBodyResultDiagnoseItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class DescribeDiagnoseReportResponseBodyResultItems extends TeaModel {
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

        public static DescribeDiagnoseReportResponseBodyResultItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyResultItems self = new DescribeDiagnoseReportResponseBodyResultItems();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyResultItems setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeDiagnoseReportResponseBodyResultItems setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public DescribeDiagnoseReportResponseBodyResultItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeDiagnoseReportResponseBodyResultItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDiagnoseReportResponseBodyResultItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDiagnoseReportResponseBodyResultItems setSuggest(String suggest) {
            this.suggest = suggest;
            return this;
        }
        public String getSuggest() {
            return this.suggest;
        }

    }

    public static class DescribeDiagnoseReportResponseBodyResult extends TeaModel {
        /**
         * <p>The timestamp when the report was created. Unit: ms.</p>
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
        public java.util.List<DescribeDiagnoseReportResponseBodyResultDiagnoseItems> diagnoseItems;

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
         * <p>The ID of the diagnosed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-abc</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("items")
        public java.util.List<DescribeDiagnoseReportResponseBodyResultItems> items;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>trigger__2020-08-17T17:09:02</p>
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
         * <p>The method used to trigger the health diagnosis. Valid values: SYSTEM (automatically triggered by the system), INNER (internally triggered), and USER (manually triggered by the user).</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("trigger")
        public String trigger;

        public static DescribeDiagnoseReportResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnoseReportResponseBodyResult self = new DescribeDiagnoseReportResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnoseReportResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDiagnoseReportResponseBodyResult setDiagnoseItems(java.util.List<DescribeDiagnoseReportResponseBodyResultDiagnoseItems> diagnoseItems) {
            this.diagnoseItems = diagnoseItems;
            return this;
        }
        public java.util.List<DescribeDiagnoseReportResponseBodyResultDiagnoseItems> getDiagnoseItems() {
            return this.diagnoseItems;
        }

        public DescribeDiagnoseReportResponseBodyResult setDiagnosisMode(String diagnosisMode) {
            this.diagnosisMode = diagnosisMode;
            return this;
        }
        public String getDiagnosisMode() {
            return this.diagnosisMode;
        }

        public DescribeDiagnoseReportResponseBodyResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public DescribeDiagnoseReportResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDiagnoseReportResponseBodyResult setItems(java.util.List<DescribeDiagnoseReportResponseBodyResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeDiagnoseReportResponseBodyResultItems> getItems() {
            return this.items;
        }

        public DescribeDiagnoseReportResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DescribeDiagnoseReportResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDiagnoseReportResponseBodyResult setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

    }

}
