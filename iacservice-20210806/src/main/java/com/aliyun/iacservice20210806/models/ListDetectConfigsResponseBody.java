// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListDetectConfigsResponseBody extends TeaModel {
    @NameInMap("detectConfigs")
    public java.util.List<ListDetectConfigsResponseBodyDetectConfigs> detectConfigs;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>30BaZ9ekYWXJdqshYecA++coNg7qT1Zbm3RfLyFIZeY=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>79284133-D4BA-56B3-954C-D538256F7EAA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>82</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDetectConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDetectConfigsResponseBody self = new ListDetectConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDetectConfigsResponseBody setDetectConfigs(java.util.List<ListDetectConfigsResponseBodyDetectConfigs> detectConfigs) {
        this.detectConfigs = detectConfigs;
        return this;
    }
    public java.util.List<ListDetectConfigsResponseBodyDetectConfigs> getDetectConfigs() {
        return this.detectConfigs;
    }

    public ListDetectConfigsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDetectConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDetectConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDetectConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://metrichub-cms-cn-hangzhou.aliyuncs.com/event/notify?xxxxx">https://metrichub-cms-cn-hangzhou.aliyuncs.com/event/notify?xxxxx</a></p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs self = new ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs();
            return TeaModel.build(map, self);
        }

        public ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDetectConfigsResponseBodyDetectConfigs extends TeaModel {
        @NameInMap("alarmConfigs")
        public java.util.List<ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs> alarmConfigs;

        /**
         * <strong>example:</strong>
         * <p>2026-04-10T02:30:04Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1</p>
         */
        @NameInMap("cronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>this is a description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>dc-xxxx</p>
         */
        @NameInMap("detectConfigId")
        public String detectConfigId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("detectConfigName")
        public String detectConfigName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>Cron</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static ListDetectConfigsResponseBodyDetectConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDetectConfigsResponseBodyDetectConfigs self = new ListDetectConfigsResponseBodyDetectConfigs();
            return TeaModel.build(map, self);
        }

        public ListDetectConfigsResponseBodyDetectConfigs setAlarmConfigs(java.util.List<ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs> alarmConfigs) {
            this.alarmConfigs = alarmConfigs;
            return this;
        }
        public java.util.List<ListDetectConfigsResponseBodyDetectConfigsAlarmConfigs> getAlarmConfigs() {
            return this.alarmConfigs;
        }

        public ListDetectConfigsResponseBodyDetectConfigs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDetectConfigsResponseBodyDetectConfigs setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListDetectConfigsResponseBodyDetectConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDetectConfigsResponseBodyDetectConfigs setDetectConfigId(String detectConfigId) {
            this.detectConfigId = detectConfigId;
            return this;
        }
        public String getDetectConfigId() {
            return this.detectConfigId;
        }

        public ListDetectConfigsResponseBodyDetectConfigs setDetectConfigName(String detectConfigName) {
            this.detectConfigName = detectConfigName;
            return this;
        }
        public String getDetectConfigName() {
            return this.detectConfigName;
        }

        public ListDetectConfigsResponseBodyDetectConfigs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListDetectConfigsResponseBodyDetectConfigs setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
