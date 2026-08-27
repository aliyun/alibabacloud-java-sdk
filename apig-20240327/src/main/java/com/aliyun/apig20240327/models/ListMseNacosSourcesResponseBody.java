// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMseNacosSourcesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListMseNacosSourcesResponseBodyData data;

    /**
     * <p>The response message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1994B10-C6A8-58FA-8347-6A08B0D4EFDE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMseNacosSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMseNacosSourcesResponseBody self = new ListMseNacosSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMseNacosSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMseNacosSourcesResponseBody setData(ListMseNacosSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMseNacosSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListMseNacosSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMseNacosSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMseNacosSourcesResponseBodyDataItems extends TeaModel {
        /**
         * <p>The Nacos instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-84a***</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The Nacos instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>商品中心Nacos注册中心</p>
         */
        @NameInMap("name")
        public String name;

        public static ListMseNacosSourcesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListMseNacosSourcesResponseBodyDataItems self = new ListMseNacosSourcesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListMseNacosSourcesResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMseNacosSourcesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMseNacosSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The list of Nacos instances that can be added.</p>
         */
        @NameInMap("items")
        public java.util.List<ListMseNacosSourcesResponseBodyDataItems> items;

        public static ListMseNacosSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMseNacosSourcesResponseBodyData self = new ListMseNacosSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMseNacosSourcesResponseBodyData setItems(java.util.List<ListMseNacosSourcesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListMseNacosSourcesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
