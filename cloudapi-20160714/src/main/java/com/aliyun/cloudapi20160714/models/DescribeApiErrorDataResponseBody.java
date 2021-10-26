// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiErrorDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClientErrors")
    public DescribeApiErrorDataResponseBodyClientErrors clientErrors;

    @NameInMap("ServerErrors")
    public DescribeApiErrorDataResponseBodyServerErrors serverErrors;

    public static DescribeApiErrorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiErrorDataResponseBody self = new DescribeApiErrorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiErrorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiErrorDataResponseBody setClientErrors(DescribeApiErrorDataResponseBodyClientErrors clientErrors) {
        this.clientErrors = clientErrors;
        return this;
    }
    public DescribeApiErrorDataResponseBodyClientErrors getClientErrors() {
        return this.clientErrors;
    }

    public DescribeApiErrorDataResponseBody setServerErrors(DescribeApiErrorDataResponseBodyServerErrors serverErrors) {
        this.serverErrors = serverErrors;
        return this;
    }
    public DescribeApiErrorDataResponseBodyServerErrors getServerErrors() {
        return this.serverErrors;
    }

    public static class DescribeApiErrorDataResponseBodyClientErrorsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeApiErrorDataResponseBodyClientErrorsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiErrorDataResponseBodyClientErrorsMonitorItem self = new DescribeApiErrorDataResponseBodyClientErrorsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiErrorDataResponseBodyClientErrorsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeApiErrorDataResponseBodyClientErrorsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

    }

    public static class DescribeApiErrorDataResponseBodyClientErrors extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeApiErrorDataResponseBodyClientErrorsMonitorItem> monitorItem;

        public static DescribeApiErrorDataResponseBodyClientErrors build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiErrorDataResponseBodyClientErrors self = new DescribeApiErrorDataResponseBodyClientErrors();
            return TeaModel.build(map, self);
        }

        public DescribeApiErrorDataResponseBodyClientErrors setMonitorItem(java.util.List<DescribeApiErrorDataResponseBodyClientErrorsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeApiErrorDataResponseBodyClientErrorsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

    public static class DescribeApiErrorDataResponseBodyServerErrorsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeApiErrorDataResponseBodyServerErrorsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiErrorDataResponseBodyServerErrorsMonitorItem self = new DescribeApiErrorDataResponseBodyServerErrorsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiErrorDataResponseBodyServerErrorsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeApiErrorDataResponseBodyServerErrorsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

    }

    public static class DescribeApiErrorDataResponseBodyServerErrors extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeApiErrorDataResponseBodyServerErrorsMonitorItem> monitorItem;

        public static DescribeApiErrorDataResponseBodyServerErrors build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiErrorDataResponseBodyServerErrors self = new DescribeApiErrorDataResponseBodyServerErrors();
            return TeaModel.build(map, self);
        }

        public DescribeApiErrorDataResponseBodyServerErrors setMonitorItem(java.util.List<DescribeApiErrorDataResponseBodyServerErrorsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeApiErrorDataResponseBodyServerErrorsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
