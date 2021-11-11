// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListDiagnoseReportResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("desc")
        public String desc;

        @NameInMap("name")
        public String name;

        @NameInMap("result")
        public String result;

        @NameInMap("suggest")
        public String suggest;

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
        @NameInMap("detail")
        public ListDiagnoseReportResponseBodyResultDiagnoseItemsDetail detail;

        @NameInMap("health")
        public String health;

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

    public static class ListDiagnoseReportResponseBodyResult extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("diagnoseItems")
        public java.util.List<ListDiagnoseReportResponseBodyResultDiagnoseItems> diagnoseItems;

        @NameInMap("health")
        public String health;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("reportId")
        public String reportId;

        @NameInMap("state")
        public String state;

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
