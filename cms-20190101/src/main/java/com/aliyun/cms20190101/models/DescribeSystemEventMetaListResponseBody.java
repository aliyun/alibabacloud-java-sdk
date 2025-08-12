// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventMetaListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The queried meta information.</p>
     */
    @NameInMap("Data")
    public DescribeSystemEventMetaListResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A6582C8B-E67C-4A19-BC15-EAEFEBDC7995</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSystemEventMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventMetaListResponseBody self = new DescribeSystemEventMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventMetaListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSystemEventMetaListResponseBody setData(DescribeSystemEventMetaListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSystemEventMetaListResponseBodyData getData() {
        return this.data;
    }

    public DescribeSystemEventMetaListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSystemEventMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemEventMetaListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSystemEventMetaListResponseBodyDataResource extends TeaModel {
        /**
         * <p>The type of the system event. Valid values:</p>
         * <ul>
         * <li>StatusNotification: fault notifications</li>
         * <li>Exception: exceptions</li>
         * <li>Maintenance: O\&amp;M</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li>CRITICAL</li>
         * <li>WARN</li>
         * <li>INFO</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The name of the system event.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectFailureRate</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the event name.</p>
         * 
         * <strong>example:</strong>
         * <p>High query failure rate</p>
         */
        @NameInMap("NameDesc")
        public String nameDesc;

        @NameInMap("NameDesc.En")
        public String nameDesc_en;

        /**
         * <p>The abbreviation of the service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ADS</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The status of the system event.</p>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the event status.</p>
         * 
         * <strong>example:</strong>
         * <p>Operation Failed</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static DescribeSystemEventMetaListResponseBodyDataResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventMetaListResponseBodyDataResource self = new DescribeSystemEventMetaListResponseBodyDataResource();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setNameDesc(String nameDesc) {
            this.nameDesc = nameDesc;
            return this;
        }
        public String getNameDesc() {
            return this.nameDesc;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setNameDesc_en(String nameDesc_en) {
            this.nameDesc_en = nameDesc_en;
            return this;
        }
        public String getNameDesc_en() {
            return this.nameDesc_en;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

    public static class DescribeSystemEventMetaListResponseBodyData extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeSystemEventMetaListResponseBodyDataResource> resource;

        public static DescribeSystemEventMetaListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventMetaListResponseBodyData self = new DescribeSystemEventMetaListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventMetaListResponseBodyData setResource(java.util.List<DescribeSystemEventMetaListResponseBodyDataResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeSystemEventMetaListResponseBodyDataResource> getResource() {
            return this.resource;
        }

    }

}
