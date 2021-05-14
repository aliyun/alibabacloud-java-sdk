// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceDbMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<DescribeDrdsInstanceDbMonitorResponseData> data;

    public static DescribeDrdsInstanceDbMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceDbMonitorResponse self = new DescribeDrdsInstanceDbMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceDbMonitorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceDbMonitorResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsInstanceDbMonitorResponse setData(java.util.List<DescribeDrdsInstanceDbMonitorResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDrdsInstanceDbMonitorResponseData> getData() {
        return this.data;
    }

    public static class DescribeDrdsInstanceDbMonitorResponseDataValues extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public Long date;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDrdsInstanceDbMonitorResponseDataValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceDbMonitorResponseDataValues self = new DescribeDrdsInstanceDbMonitorResponseDataValues();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceDbMonitorResponseDataValues setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public DescribeDrdsInstanceDbMonitorResponseDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDrdsInstanceDbMonitorResponseData extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<DescribeDrdsInstanceDbMonitorResponseDataValues> values;

        public static DescribeDrdsInstanceDbMonitorResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceDbMonitorResponseData self = new DescribeDrdsInstanceDbMonitorResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceDbMonitorResponseData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDrdsInstanceDbMonitorResponseData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDrdsInstanceDbMonitorResponseData setValues(java.util.List<DescribeDrdsInstanceDbMonitorResponseDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceDbMonitorResponseDataValues> getValues() {
            return this.values;
        }

    }

}
