// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistActionDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<ListAssistActionDetailsResponseBodyResults> results;

    public static ListAssistActionDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssistActionDetailsResponseBody self = new ListAssistActionDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssistActionDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssistActionDetailsResponseBody setResults(java.util.List<ListAssistActionDetailsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListAssistActionDetailsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class ListAssistActionDetailsResponseBodyResults extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Action")
        public String action;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Type")
        public String type;

        @NameInMap("Data")
        public String data;

        @NameInMap("ID")
        public String ID;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static ListAssistActionDetailsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListAssistActionDetailsResponseBodyResults self = new ListAssistActionDetailsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListAssistActionDetailsResponseBodyResults setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListAssistActionDetailsResponseBodyResults setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListAssistActionDetailsResponseBodyResults setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ListAssistActionDetailsResponseBodyResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAssistActionDetailsResponseBodyResults setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAssistActionDetailsResponseBodyResults setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public ListAssistActionDetailsResponseBodyResults setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListAssistActionDetailsResponseBodyResults setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
