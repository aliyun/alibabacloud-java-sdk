// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPermanentTopologyResourcessResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPermanentTopologyResourcessResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPermanentTopologyResourcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermanentTopologyResourcessResponseBody self = new ListPermanentTopologyResourcessResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermanentTopologyResourcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPermanentTopologyResourcessResponseBody setData(java.util.List<ListPermanentTopologyResourcessResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPermanentTopologyResourcessResponseBodyData> getData() {
        return this.data;
    }

    public ListPermanentTopologyResourcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPermanentTopologyResourcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPermanentTopologyResourcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        public static ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader build(java.util.Map<String, ?> map) throws Exception {
            ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader self = new ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader();
            return TeaModel.build(map, self);
        }

        public ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListPermanentTopologyResourcessResponseBodyDataResult extends TeaModel {
        @NameInMap("EffectHeader")
        public java.util.List<ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader> effectHeader;

        @NameInMap("EffectRows")
        public java.util.List<java.util.Map<String, ?>> effectRows;

        public static ListPermanentTopologyResourcessResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListPermanentTopologyResourcessResponseBodyDataResult self = new ListPermanentTopologyResourcessResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListPermanentTopologyResourcessResponseBodyDataResult setEffectHeader(java.util.List<ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader> effectHeader) {
            this.effectHeader = effectHeader;
            return this;
        }
        public java.util.List<ListPermanentTopologyResourcessResponseBodyDataResultEffectHeader> getEffectHeader() {
            return this.effectHeader;
        }

        public ListPermanentTopologyResourcessResponseBodyDataResult setEffectRows(java.util.List<java.util.Map<String, ?>> effectRows) {
            this.effectRows = effectRows;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getEffectRows() {
            return this.effectRows;
        }

    }

    public static class ListPermanentTopologyResourcessResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListPermanentTopologyResourcessResponseBodyDataResult> result;

        @NameInMap("TotalItem")
        public Integer totalItem;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListPermanentTopologyResourcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPermanentTopologyResourcessResponseBodyData self = new ListPermanentTopologyResourcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPermanentTopologyResourcessResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListPermanentTopologyResourcessResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPermanentTopologyResourcessResponseBodyData setResult(java.util.List<ListPermanentTopologyResourcessResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListPermanentTopologyResourcessResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListPermanentTopologyResourcessResponseBodyData setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

        public ListPermanentTopologyResourcessResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
