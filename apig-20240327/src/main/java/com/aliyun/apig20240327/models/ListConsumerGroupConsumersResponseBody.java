// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerGroupConsumersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListConsumerGroupConsumersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListConsumerGroupConsumersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupConsumersResponseBody self = new ListConsumerGroupConsumersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupConsumersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumerGroupConsumersResponseBody setData(ListConsumerGroupConsumersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConsumerGroupConsumersResponseBodyData getData() {
        return this.data;
    }

    public ListConsumerGroupConsumersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumerGroupConsumersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConsumerGroupConsumersResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cs-8c13d2b4f8a1</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        /**
         * <strong>example:</strong>
         * <p>线上 API 调用方</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>1715769600000</p>
         */
        @NameInMap("joinTimestamp")
        public Long joinTimestamp;

        /**
         * <strong>example:</strong>
         * <p>api-consumer</p>
         */
        @NameInMap("name")
        public String name;

        public static ListConsumerGroupConsumersResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerGroupConsumersResponseBodyDataItems self = new ListConsumerGroupConsumersResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListConsumerGroupConsumersResponseBodyDataItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListConsumerGroupConsumersResponseBodyDataItems setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ListConsumerGroupConsumersResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConsumerGroupConsumersResponseBodyDataItems setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListConsumerGroupConsumersResponseBodyDataItems setJoinTimestamp(Long joinTimestamp) {
            this.joinTimestamp = joinTimestamp;
            return this;
        }
        public Long getJoinTimestamp() {
            return this.joinTimestamp;
        }

        public ListConsumerGroupConsumersResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListConsumerGroupConsumersResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListConsumerGroupConsumersResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListConsumerGroupConsumersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerGroupConsumersResponseBodyData self = new ListConsumerGroupConsumersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumerGroupConsumersResponseBodyData setItems(java.util.List<ListConsumerGroupConsumersResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListConsumerGroupConsumersResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListConsumerGroupConsumersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConsumerGroupConsumersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConsumerGroupConsumersResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
