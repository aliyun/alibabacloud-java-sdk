// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListAnalyticsDataRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IsoId")
    public String isoId;

    @NameInMap("ApiPath")
    public String apiPath;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Condition")
    public java.util.List<ListAnalyticsDataRequestCondition> condition;

    @NameInMap("PageNum")
    public Integer pageNum;

    public static ListAnalyticsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnalyticsDataRequest self = new ListAnalyticsDataRequest();
        return TeaModel.build(map, self);
    }

    public ListAnalyticsDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListAnalyticsDataRequest setIsoId(String isoId) {
        this.isoId = isoId;
        return this;
    }
    public String getIsoId() {
        return this.isoId;
    }

    public ListAnalyticsDataRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public ListAnalyticsDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAnalyticsDataRequest setCondition(java.util.List<ListAnalyticsDataRequestCondition> condition) {
        this.condition = condition;
        return this;
    }
    public java.util.List<ListAnalyticsDataRequestCondition> getCondition() {
        return this.condition;
    }

    public ListAnalyticsDataRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public static class ListAnalyticsDataRequestCondition extends TeaModel {
        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("Operate")
        public String operate;

        @NameInMap("Value")
        public String value;

        @NameInMap("BetweenStart")
        public String betweenStart;

        @NameInMap("BetweenEnd")
        public String betweenEnd;

        public static ListAnalyticsDataRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            ListAnalyticsDataRequestCondition self = new ListAnalyticsDataRequestCondition();
            return TeaModel.build(map, self);
        }

        public ListAnalyticsDataRequestCondition setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ListAnalyticsDataRequestCondition setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public ListAnalyticsDataRequestCondition setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListAnalyticsDataRequestCondition setBetweenStart(String betweenStart) {
            this.betweenStart = betweenStart;
            return this;
        }
        public String getBetweenStart() {
            return this.betweenStart;
        }

        public ListAnalyticsDataRequestCondition setBetweenEnd(String betweenEnd) {
            this.betweenEnd = betweenEnd;
            return this;
        }
        public String getBetweenEnd() {
            return this.betweenEnd;
        }

    }

}
