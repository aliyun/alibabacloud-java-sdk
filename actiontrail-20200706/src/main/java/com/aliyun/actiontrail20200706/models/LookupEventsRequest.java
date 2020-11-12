// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupEventsRequest extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("LookupAttribute")
    public java.util.List<LookupEventsRequestLookupAttribute> lookupAttribute;

    @NameInMap("Direction")
    public String direction;

    public static LookupEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupEventsRequest self = new LookupEventsRequest();
        return TeaModel.build(map, self);
    }

    public LookupEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupEventsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public LookupEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
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

    public LookupEventsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public static class LookupEventsRequestLookupAttribute extends TeaModel {
        @NameInMap("Key")
        public String key;

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
