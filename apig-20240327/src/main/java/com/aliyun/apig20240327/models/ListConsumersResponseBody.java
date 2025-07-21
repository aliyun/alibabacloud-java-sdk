// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListConsumersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9BDD6A7C-CBA7-504F-B8C5-51B9F16590F7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListConsumersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumersResponseBody self = new ListConsumersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumersResponseBody setData(ListConsumersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConsumersResponseBodyData getData() {
        return this.data;
    }

    public ListConsumersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConsumersResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cs-csheiftlhtgmp0j0hp4g</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <strong>example:</strong>
         * <p>1721097861050</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

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
         * <p>user-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1721123855214</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static ListConsumersResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListConsumersResponseBodyDataItems self = new ListConsumersResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListConsumersResponseBodyDataItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListConsumersResponseBodyDataItems setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListConsumersResponseBodyDataItems setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ListConsumersResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConsumersResponseBodyDataItems setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListConsumersResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConsumersResponseBodyDataItems setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListConsumersResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListConsumersResponseBodyDataItems> items;

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
         * <p>18</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListConsumersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumersResponseBodyData self = new ListConsumersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumersResponseBodyData setItems(java.util.List<ListConsumersResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListConsumersResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListConsumersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConsumersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConsumersResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
