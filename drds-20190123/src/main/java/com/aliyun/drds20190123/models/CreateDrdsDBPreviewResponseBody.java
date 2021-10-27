// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsDBPreviewResponseBody extends TeaModel {
    @NameInMap("Items")
    public CreateDrdsDBPreviewResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDrdsDBPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBPreviewResponseBody self = new CreateDrdsDBPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBPreviewResponseBody setItems(CreateDrdsDBPreviewResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public CreateDrdsDBPreviewResponseBodyItems getItems() {
        return this.items;
    }

    public CreateDrdsDBPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDrdsDBPreviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDrdsDBPreviewResponseBodyItemsItemDbNames extends TeaModel {
        @NameInMap("DbName")
        public java.util.List<String> dbName;

        public static CreateDrdsDBPreviewResponseBodyItemsItemDbNames build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBPreviewResponseBodyItemsItemDbNames self = new CreateDrdsDBPreviewResponseBodyItemsItemDbNames();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBPreviewResponseBodyItemsItemDbNames setDbName(java.util.List<String> dbName) {
            this.dbName = dbName;
            return this;
        }
        public java.util.List<String> getDbName() {
            return this.dbName;
        }

    }

    public static class CreateDrdsDBPreviewResponseBodyItemsItem extends TeaModel {
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DbNames")
        public CreateDrdsDBPreviewResponseBodyItemsItemDbNames dbNames;

        public static CreateDrdsDBPreviewResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBPreviewResponseBodyItemsItem self = new CreateDrdsDBPreviewResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBPreviewResponseBodyItemsItem setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateDrdsDBPreviewResponseBodyItemsItem setDbNames(CreateDrdsDBPreviewResponseBodyItemsItemDbNames dbNames) {
            this.dbNames = dbNames;
            return this;
        }
        public CreateDrdsDBPreviewResponseBodyItemsItemDbNames getDbNames() {
            return this.dbNames;
        }

    }

    public static class CreateDrdsDBPreviewResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<CreateDrdsDBPreviewResponseBodyItemsItem> item;

        public static CreateDrdsDBPreviewResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBPreviewResponseBodyItems self = new CreateDrdsDBPreviewResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBPreviewResponseBodyItems setItem(java.util.List<CreateDrdsDBPreviewResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<CreateDrdsDBPreviewResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
