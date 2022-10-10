// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListShopResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("List")
    public java.util.List<ListShopResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("VersionName")
    public String versionName;

    public static ListShopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShopResponseBody self = new ListShopResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShopResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListShopResponseBody setList(java.util.List<ListShopResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListShopResponseBodyList> getList() {
        return this.list;
    }

    public ListShopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListShopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListShopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListShopResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class ListShopResponseBodyList extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("ValidateEndTime")
        public Long validateEndTime;

        public static ListShopResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListShopResponseBodyList self = new ListShopResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListShopResponseBodyList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListShopResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListShopResponseBodyList setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public ListShopResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListShopResponseBodyList setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public ListShopResponseBodyList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListShopResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListShopResponseBodyList setValidateEndTime(Long validateEndTime) {
            this.validateEndTime = validateEndTime;
            return this;
        }
        public Long getValidateEndTime() {
            return this.validateEndTime;
        }

    }

}
