// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListConfigResponseBody extends TeaModel {
    @NameInMap("ConfigItems")
    public ListConfigResponseBodyConfigItems configItems;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigResponseBody self = new ListConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigResponseBody setConfigItems(ListConfigResponseBodyConfigItems configItems) {
        this.configItems = configItems;
        return this;
    }
    public ListConfigResponseBodyConfigItems getConfigItems() {
        return this.configItems;
    }

    public ListConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListConfigResponseBodyConfigItemsConfigItem extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static ListConfigResponseBodyConfigItemsConfigItem build(java.util.Map<String, ?> map) throws Exception {
            ListConfigResponseBodyConfigItemsConfigItem self = new ListConfigResponseBodyConfigItemsConfigItem();
            return TeaModel.build(map, self);
        }

        public ListConfigResponseBodyConfigItemsConfigItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListConfigResponseBodyConfigItemsConfigItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListConfigResponseBodyConfigItems extends TeaModel {
        @NameInMap("ConfigItem")
        public java.util.List<ListConfigResponseBodyConfigItemsConfigItem> configItem;

        public static ListConfigResponseBodyConfigItems build(java.util.Map<String, ?> map) throws Exception {
            ListConfigResponseBodyConfigItems self = new ListConfigResponseBodyConfigItems();
            return TeaModel.build(map, self);
        }

        public ListConfigResponseBodyConfigItems setConfigItem(java.util.List<ListConfigResponseBodyConfigItemsConfigItem> configItem) {
            this.configItem = configItem;
            return this;
        }
        public java.util.List<ListConfigResponseBodyConfigItemsConfigItem> getConfigItem() {
            return this.configItem;
        }

    }

}
