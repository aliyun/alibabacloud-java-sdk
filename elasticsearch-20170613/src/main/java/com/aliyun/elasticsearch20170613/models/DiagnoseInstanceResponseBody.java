// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DiagnoseInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public DiagnoseInstanceResponseBodyResult result;

    public static DiagnoseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseInstanceResponseBody self = new DiagnoseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DiagnoseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiagnoseInstanceResponseBody setResult(DiagnoseInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DiagnoseInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class DiagnoseInstanceResponseBodyResultItems extends TeaModel {
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

        public static DiagnoseInstanceResponseBodyResultItems build(java.util.Map<String, ?> map) throws Exception {
            DiagnoseInstanceResponseBodyResultItems self = new DiagnoseInstanceResponseBodyResultItems();
            return TeaModel.build(map, self);
        }

        public DiagnoseInstanceResponseBodyResultItems setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DiagnoseInstanceResponseBodyResultItems setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public DiagnoseInstanceResponseBodyResultItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DiagnoseInstanceResponseBodyResultItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DiagnoseInstanceResponseBodyResultItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DiagnoseInstanceResponseBodyResultItems setSuggest(String suggest) {
            this.suggest = suggest;
            return this;
        }
        public String getSuggest() {
            return this.suggest;
        }

    }

    public static class DiagnoseInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The timestamp when the diagnostic report was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1535745731000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("diagnosisMode")
        public String diagnosisMode;

        /**
         * <p>The instance ID of the diagnosed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("items")
        public java.util.List<DiagnoseInstanceResponseBodyResultItems> items;

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
         * <p>RUNNING</p>
         */
        @NameInMap("state")
        public String state;

        public static DiagnoseInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DiagnoseInstanceResponseBodyResult self = new DiagnoseInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DiagnoseInstanceResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DiagnoseInstanceResponseBodyResult setDiagnosisMode(String diagnosisMode) {
            this.diagnosisMode = diagnosisMode;
            return this;
        }
        public String getDiagnosisMode() {
            return this.diagnosisMode;
        }

        public DiagnoseInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DiagnoseInstanceResponseBodyResult setItems(java.util.List<DiagnoseInstanceResponseBodyResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DiagnoseInstanceResponseBodyResultItems> getItems() {
            return this.items;
        }

        public DiagnoseInstanceResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DiagnoseInstanceResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
