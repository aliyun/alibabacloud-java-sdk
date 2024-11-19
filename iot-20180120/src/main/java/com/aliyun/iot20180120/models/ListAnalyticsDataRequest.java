// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListAnalyticsDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiPath")
    public String apiPath;

    @NameInMap("Condition")
    public java.util.List<ListAnalyticsDataRequestCondition> condition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-npk1u******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>oxs_iso_id</p>
     */
    @NameInMap("IsoId")
    public String isoId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAnalyticsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnalyticsDataRequest self = new ListAnalyticsDataRequest();
        return TeaModel.build(map, self);
    }

    public ListAnalyticsDataRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public ListAnalyticsDataRequest setCondition(java.util.List<ListAnalyticsDataRequestCondition> condition) {
        this.condition = condition;
        return this;
    }
    public java.util.List<ListAnalyticsDataRequestCondition> getCondition() {
        return this.condition;
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

    public ListAnalyticsDataRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAnalyticsDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListAnalyticsDataRequestCondition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BetweenEnd")
        public String betweenEnd;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BetweenStart")
        public String betweenStart;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testCode</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAnalyticsDataRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            ListAnalyticsDataRequestCondition self = new ListAnalyticsDataRequestCondition();
            return TeaModel.build(map, self);
        }

        public ListAnalyticsDataRequestCondition setBetweenEnd(String betweenEnd) {
            this.betweenEnd = betweenEnd;
            return this;
        }
        public String getBetweenEnd() {
            return this.betweenEnd;
        }

        public ListAnalyticsDataRequestCondition setBetweenStart(String betweenStart) {
            this.betweenStart = betweenStart;
            return this;
        }
        public String getBetweenStart() {
            return this.betweenStart;
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

    }

}
