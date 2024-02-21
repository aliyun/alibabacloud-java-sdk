// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupEventsRequest extends TeaModel {
    /**
     * <p>The order in which details of events are to be retrieved. Valid values:</p>
     * <br>
     * <p>*   FORWARD: ascending order.</p>
     * <p>*   BACKWARD: descending order. This is the default value.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. The default time is the current time. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Query conditions.</p>
     */
    @NameInMap("LookupAttribute")
    public java.util.List<LookupEventsRequestLookupAttribute> lookupAttribute;

    /**
     * <p>The maximum number of entries to be returned.</p>
     * <br>
     * <p>Valid values: 0 to 50.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The token used to request the next page of query results.</p>
     * <br>
     * <p>> The request parameters must be the same as those of the last request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The beginning of the time range to query. The default time is seven days prior to the current time. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static LookupEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupEventsRequest self = new LookupEventsRequest();
        return TeaModel.build(map, self);
    }

    public LookupEventsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public LookupEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LookupEventsRequest setLookupAttribute(java.util.List<LookupEventsRequestLookupAttribute> lookupAttribute) {
        this.lookupAttribute = lookupAttribute;
        return this;
    }
    public java.util.List<LookupEventsRequestLookupAttribute> getLookupAttribute() {
        return this.lookupAttribute;
    }

    public LookupEventsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public LookupEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class LookupEventsRequestLookupAttribute extends TeaModel {
        /**
         * <p>The key of the query condition. Valid values:</p>
         * <br>
         * <p>*  ServiceName: the name of a specific Alibaba Cloud service.</p>
         * <p>*  EventName: the name of a specific event.</p>
         * <p>*  User: the name of the RAM user who calls a specific operation.</p>
         * <p>*  EventId: the ID of a specific event.</p>
         * <p>*  ResourceType: the type of resources.</p>
         * <p>*   ResourceName: the name of a specific resource.</p>
         * <p>*   EventRW: the read/write type of events.</p>
         * <p>*  EventAccessKeyId: the AccessKey ID used in events.</p>
         * <br>
         * <p>> You can use only one query condition for each query.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query condition. Valid values:</p>
         * <br>
         * <p>*   When the LookupAttribute.N.Key parameter is set to ServiceName, you can set this parameter to a value such as `Ecs`.</p>
         * <p>*   When the LookupAttribute.N.Key parameter is set to EventName, you can set this parameter to a value such as `ConsoleSignin`.</p>
         * <p>*   When the LookupAttribute.N.Key parameter is set to User, you can set this parameter to a value such as `Alice`.</p>
         * <p>*   When the LookupAttribute.N.Key parameter is set to EventId, you can set this parameter to a value such as `B702AFA3-FD4B-40E3-88E4-C0752FAA****`.</p>
         * <p>*   When the LookupAttribute.N.Key parameter is set to ResourceType, you can set this parameter to a value such as `ACS::ECS::Instance`.</p>
         * <p>*   When the LookupAttribute.N.Key parameter is set to ResourceName, you can set this parameter to a value such as `i-bp14664y88udkt45****`.</p>
         * <p>*   When the LookupAttribute.N.Key parameter is set to EventRW, you can set this parameter to `Read` or `Write`.</p>
         * <p>*   When the LookupAttribute.N.Key parameter is set to EventAccessKeyId, you can set this parameter to a value such as `LTAI4FoDkCf4DU1bic1V****`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static LookupEventsRequestLookupAttribute build(java.util.Map<String, ?> map) throws Exception {
            LookupEventsRequestLookupAttribute self = new LookupEventsRequestLookupAttribute();
            return TeaModel.build(map, self);
        }

        public LookupEventsRequestLookupAttribute setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public LookupEventsRequestLookupAttribute setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
